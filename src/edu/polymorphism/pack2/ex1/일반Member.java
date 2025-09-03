package edu.polymorphism.pack2.ex1;

// 자식 클래스

public class 일반Member extends Member {


    // 필수 메서드
    // 상속받은 필드만 매개변수로 사용하여 재정의 할 수 있다.
    public 일반Member(String memberId, String memberName, String memberEmail) {
        super(memberId, memberName, memberEmail);
    }

    // 추상 메서드
    @Override
    public double 할인율() {
        // 일반 회원은 5% 할인
        return 0.05;
    }

    @Override
    public void 쿠폰과혜택(){
        System.out.println("보유하고 있는 쿠폰과 혜택이 존재하지 않습니다.\n구독 서비스에 따라 쿠폰과 혜택을 받으실 수 있습니다.");
    }




}
