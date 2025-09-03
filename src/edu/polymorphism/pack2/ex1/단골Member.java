package edu.polymorphism.pack2.ex1;

// 자식 클래스

public class 단골Member extends Member {

    // 필드
    private String 쿠폰;

    // 기본 생성자
    public 단골Member() {
    }
    public 단골Member(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }

    // 필수 생성자
    // 상속받은 필드만 매개변수로 사용하여 재정의 할 수 있다.
    public 단골Member(String memberId, String memberName, String memberEmail) {
        super(memberId, memberName, memberEmail);
    }
    public 단골Member(String memberId, String memberName, String memberEmail, String 쿠폰) {
        super(memberId, memberName, memberEmail);
        this.쿠폰 = 쿠폰;
    }

    // getter / setter
    public String get쿠폰() {
        return 쿠폰;
    }
    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }

    // 추상 메서드
    @Override
    public double 할인율() {
        // 단골 회원은 15% 할인
        return 0.15;
    }

    @Override
    public void 쿠폰과혜택(){
        System.out.printf("현재 %s 쿠폰을 보유하고 있습니다.\n아쉽게도 혜택은 존재하지 않습니다.\nVIP로 구독 업그레이드하기\n", get쿠폰());
    }


}
