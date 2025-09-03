package edu.polymorphism.pack2.ex1;

// 오직 실행하는 클래스
// 모든 수행 코드는 main 메서드 내부에 작성한다.

// 나중에 프로그램에서 자동으로 만들어 준다.
// 프로젝트를 수행하기 위한 기능과 모델을 개발자가 작성한다!

public class MemberRun {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.display();
    }
}


/*
상속
부모 클래스에서 공통적으로 사용되는 변수, 생성자, 메서드를 작성하여
자식 클래스에서 각 자식별로 수정하여 사용한다.

일반 상속
상속받은 자식이 강제로 특정 메서드를 사용해야 할 이유가 없다.

추상 클래스 상속
필수로 작성해야 하는 메서드가 존재한다.
 */