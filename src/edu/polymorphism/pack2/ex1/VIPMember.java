package edu.polymorphism.pack2.ex1;

// 자식 클래스

public class VIPMember extends Member {

    // 필드
    private String 쿠폰;
    private String 혜택;

    // 기본 생성자
    public VIPMember() {
    }
    public VIPMember(String 쿠폰, String 혜택) {
        this.쿠폰 = 쿠폰;
        this.혜택 = 혜택;
    }

    // 필수 생성자
    public VIPMember(String memberId, String memberName, String memberEmail) {
        super(memberId, memberName, memberEmail);
    }
    public VIPMember(String memberId, String memberName, String memberEmail, String 쿠폰, String 혜택) {
        super(memberId, memberName, memberEmail);
        this.쿠폰 = 쿠폰;
        this.혜택 = 혜택;
    }

    // getter / setter
    public String get쿠폰() {
        return 쿠폰;
    }
    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }
    public String get혜택() {
        return 혜택;
    }
    public void set혜택(String 혜택) {
        this.혜택 = 혜택;
    }

    // 추상 메서드
    @Override
    public double 할인율() {
        // vip 회원은 25% 할인
        return 0.25;
    }

    @Override
    public void 쿠폰과혜택() {
        System.out.printf("현재 %s 쿠폰과 %s 혜택 이용 가능합니다.\n", get쿠폰(), get혜택());
    }



}
