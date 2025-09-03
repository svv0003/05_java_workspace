package edu.polymorphism.pack3;

// 자식 클래스
// 반드시 구현해야 하는 기능들을 추가해서 문서 작성을 완료하도록 설정하기

/*
extends 부모클래스           부모는 오직 하나!
implements 구현할기능들;     2개 이상 작성 가능하다.
                             작성법
                                반드시 extends 뒤에 작성해야 하는 것이 아니라
                                단독으로도 사용 가능하다.
                                상속을 받지 않아도 되는 문서에
                                필수적으로 작성해야 하는 기능들이 존재할 때 사용한다.
 */

public class 개발자 extends 직원 implements 업무수행기능들 {
    // class 개발자 implements 업무수행기능들로 상속이 필요하지 않은 경우
    // 필히 구현해야 하는 기능들에 대한 문서만 작성하는 것을 설정할 수 있다.

    private String 프로그래밍언어;



    /*
    public 개발자(String name, String position, int salary, String 프로그래밍언어) {
        super(name, position, salary, 프로그래밍언어);
    }

    사용자에게 반드시 전달받아야 하는 데이터를 매개변수명으로 설정하고,
    개발자가 직급 매개변수의 값을 임의로 설정하고, 나머지 매개변수만 입력받아서 객체 생성하도록 설정한다.
    -> 생성된 객체의 직급은 모두 임의의 값으로 설정된다.
     */
    public 개발자(String name, int salary, String 프로그래밍언어) {
        super(name, "매니저", salary);
        this.프로그래밍언어 = 프로그래밍언어;
        // this.프로그래밍언어 : 사용자가 작성한 데이터를 담을 변수
        // 프로그래밍언어      : 사용자가 작성한 데이터
    }


    public String get프로그래밍언어() {
        return 프로그래밍언어;
    }
    public void set프로그래밍언어(String 프로그래밍언어) {
        this.프로그래밍언어 = 프로그래밍언어;
    }



    @Override
    public void work() {
        System.out.printf("%s 개발자가 %s로 코딩하고 있습니다.\n", getName(), 프로그래밍언어);
    }

    @Override
    public void meeting() {
        System.out.printf("%s 개발자가 개발 회의에 참석합니다.\n", getName());
    }


    // 개발자 고유 기능
    public void 코딩(){
        System.out.printf("%s 개발자가 새로운 기능을 구현합니다.\n", getName());
    }
}
