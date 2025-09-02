package edu.polymorphism.pack1.service;

import edu.polymorphism.pack1.model.Galaxy;
import edu.polymorphism.pack1.model.Iphone;
import edu.polymorphism.pack1.model.SmartPhone;

public class PolyService {

    // 필드
    // 자료형 객체명 = 공간을 설정할 때 공간 내에 들어올 수 있는 데이터를 Iphone 형태만 가능하도록 설정한다.

    // 아이폰(집) (집)이름 = 아이폰이 살고 있는 것
    Iphone iphone1 = new Iphone();
    // 갤럭시(집) (집)이름 = 갤럭시가 살고 있는 것
    Galaxy galaxy1 = new Galaxy();
    // 스마트폰(집) (집)이름 = 각 공간에 아이폰/갤럭시가 살고 있는 것
    SmartPhone s1 = new Iphone();
    SmartPhone s2 = new Galaxy();

    // 즉, 부모가 만든 공간에서 자식이 살거나 자식이 만든 공간에서 본인이 사는 것은 가능하지만
    //     자식이 만든 공간에서 부모가 사는 것은 불가능하다.
    // 왜? 자식 상속자의 크기가 더 크기 때문이다.
    // 아래는 예시

    int 인트변수 = (int) 100L;
    // int 공간은 숫자이므로 숫자를 int로 강제 형변환해서 가능하다.
    // 가능한 이유는 둘 다 숫자임을 자바가 알고 있기 때문이다.

    // SmartPhone과 Iphone, Galaxy는 자바가 아는 형태가 아닌 개발자가 만든 형태이기 때문에 형변환 어렵다.
    //    ?상자      ?상자   ?상자

    // 아래처럼 형변환하면 사용 가능하지만 데이터가 변경되고 손실이 일어난다.
    // Iphone iphone3 = new SmartPhone();
    // Iphone iphone3 = (Iphone) new SmartPhone();
        // Exception in thread "main" java.lang.ClassCastException: class edu.polymorphism.pack1.model.SmartPhone cannot be cast to class edu.polymorphism.pack1.model.Iphone (edu.polymorphism.pack1.model.SmartPhone and edu.polymorphism.pack1.model.Iphone are in unnamed module of loader 'app')
        //	at edu.polymorphism.pack1.service.PolyService.<init>(PolyService.java:34)
        //	at edu.polymorphism.pack1.run.PolyRun.main(PolyRun.java:8)

    // 현재 코드에선 문제가 일어나지 않지만 코드 실행하면 ClassCastException 클래스가 일치하지 않다며
    // 데이터 변환 시 데이터가 손실되어 문제가 발생한다.
    // SmartPhone을 상속받는 Galaxy와 같은 데이터가 잘못 들어올 수 있기 때문에
    // 부모 변수명 = new 자식(); 은 가능하지만
    // 자식 변수명 = new 부모(); 는 불가능하다.
    // 부모가 갤럭시를 참조해서 사용할 수 있기 때문!


    // 메서드
    public void method1() {
        s1.setDisplay("레티나 디스플레이");
        s2.setDisplay("AMOLED");                // 전류를 받으면 스스로 빛을 내는 기술

        // s1.setIosVersion();
        // SmartPhone 공간이기 때문에 자식인 Iphone에 작성된 필드는 사용 불가!!

        System.out.println("S1 display: " + s1.getDisplay());
        System.out.println("S2 display: " + s2.getDisplay());
    }

    public void method2() {
        // 동일하게 만들어진 정보에 대해서 확인할 때 주로 사용한다.
        // 부모 타입으로 이루어진 객체를 생성한다.
        // 부모 타입에 해당하는 정보를 출력할 수 있다.

        SmartPhone 스마트폰1 = new SmartPhone();
        SmartPhone 스마트폰2 = new SmartPhone();
        SmartPhone 스마트폰3 = new SmartPhone();

        // 위처럼 하나씩 작성하는 것이 아닌 배열 형태로 작성 가능하다.
        // 스마트폰 4대에 대한 정보를 스마트폰공장 공간에 한 번에 넣어줄 수 있다.
        // 그리고 각각의 인덱스에 스마트폰 1대의 정보를 저장한다.
        SmartPhone[] 스마트폰공장 = new SmartPhone[3];
        스마트폰공장[0] = 스마트폰1;
        스마트폰공장[1] = 스마트폰2;
        // 스마트폰공장[1] = 스마트폰3;
        스마트폰공장[2] = 스마트폰3;

        스마트폰공장[0].setDisplay("아이폰14 디스플레이");
        스마트폰공장[1].setDisplay("갤럭시S23 디스플레이");
        스마트폰공장[2].setDisplay("파이폰 디스플레이");

        /*
        SmartPhone[] 스마트폰공장 = new SmartPhone[4];
        스마트폰공장[0] = 스마트폰1;
        스마트폰공장[1] = 스마트폰2;
        스마트폰공장[2] = 스마트폰3;

        스마트폰공장[0].setDisplay("아이폰14 디스플레이");
        스마트폰공장[1].setDisplay("갤럭시S23 디스플레이");
        스마트폰공장[2].setDisplay("파이폰 디스플레이");

        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "edu.polymorphism.pack1.model.SmartPhone.getDisplay()" because "기기확인" is null
        at edu.polymorphism.pack1.service.PolyService.method2(PolyService.java:83)
        at edu.polymorphism.pack1.run.PolyRun.main(PolyRun.java:10)

        스마트폰공장[2]에 대한 객체 정보가 존재하지 않아서 (= null) 발생하는 에러
         */


        // 향상된 for문으로 위 형식을 출력하기
        for(SmartPhone 기기확인 : 스마트폰공장){
            System.out.println("공장 내 기기들의 디스플레이 확인 : " + 기기확인.getDisplay());
        }
        // 반복적으로 출력했던 기능들을 for문을 활용해서 한 번에 출력 가능하다.





    }
}
