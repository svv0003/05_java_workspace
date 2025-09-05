package edu.collection.pack4.run;

import edu.collection.pack4.model.멤버;
import edu.collection.pack4.service.멤버기능서비스;

import java.util.Scanner;

public class 멤버실행파일 {
    public static void main(String[] args) {

        // 멤버 기능 서비스와 다양한 모델을 활용해서 프로그램 실행하기

        // HTML 화면 대신 사용할 목적으로 Scanner 사용하기
        Scanner sc = new Scanner(System.in);


        System.out.println("우리와 함께 다같이 [멤버]가 되자!");
        System.out.println("=".repeat(20) + "[ 멤 버 회 사 ]" + "=".repeat(20));


        멤버 m1 = new 멤버();
        m1.set멤버이름("홍길동");
        m1.set멤버핸드폰번호("010-1234-1234");
        m1.set멤버이메일("hong@email.com");
        /*
new 멤버().set멤버이름("홍길동");
new 멤버().set멤버핸드폰번호("010-1234-1234");
new 멤버().set멤버이메일("hong@email.com");

공간을 생성하고, 공간 안에 홍길동을 멤버이름 필드의 데이터로 설정한다.
이 각각의 데이터를 어디서 어떻게 개발자가 갖고 오는가?
하여 사람이 알 수 있는 주소명을 붙여주는 것이고,
공간의 주소명을 변수명으로 설정한다.
공간마다 이름, 핸드폰번호, 이메일과 같은 데이터를 갖고 있는 상태

공간 => 객체
주소명 => 객체명
데이터 => 필드 값

객체를 만들고자 하는 클래스에 기본 생성자가 있고, 기본 생성자로 객체를 만들면
해당 필드만 존재할 뿐 필드 값은 없는 상태로 객체가 생성된다.

객체를 만들고자 하는 클래스에 파라미터 생성자가 있고, 파라미터 생성자로 객체를 만들면
파라미터로 사용된 자료형과 데이터에 맞게 설정하면 해당 필드에 맞는 필드 값을 갖고 객체가 생성된다.
         */

        멤버기능서비스 service = new 멤버기능서비스();

        // HTML에서 사용자가 입력한 회원 데이터
        System.out.println("회원가입을 진행합니다.");
        System.out.print("성함을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("핸드폰 번호를 입력하세요 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        String email = sc.nextLine();

        // 입력값을 담은 변수를 매개변수로 활용하여 객체 생성하기
        멤버 m2 = new 멤버(name, phoneNumber, email);

        // 입력값을 담은 변수를 매개변수로 활용하여 메서드를 호출하기
        service.멤버조회(name, phoneNumber, email);





    }
}
