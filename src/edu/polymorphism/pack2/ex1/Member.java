package edu.polymorphism.pack2.ex1;

// 부모 클래스
// 일반회원, vip회원으로 구분한다.
// 강제로 상속받는 자식 클래스는 각 회원 등급에 따라 할인율을 다르게 설정하고,
// 로그인, 로그아웃은 자식 클래스에서 굳이 추가적으로 구현하지 않아도 된다.

public abstract class Member {

    // 필드
    protected String memberId;
    protected String memberName;
    protected String memberEmail;

    // 메서드
    // 소괄호 () 붙으면 메서드!!
    // 생성자 메서드
    // 기본 (= 디폴트) 생성자 메서드
    public Member() {
    }
    // 필수 (= 매개변수 = 파라미터) 생성자 메서드
    public Member(String memberId, String memberName, String memberEmail) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
    }

    // getter / setter
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getMemberEmail() {
        return memberEmail;
    }
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }


    // 공통 실행 기능 메서드
    // 재활용할 필요 없이 사용하는 기능
    public void login(){
        System.out.println(getMemberName() + "님이 로그인하였습니다.");
    }

    public void logout(){
        System.out.println(getMemberName() + "님이 로그아웃하였습니다.");
    }

    // 추상 메서드
    public abstract double 할인율();

    public abstract void 쿠폰과혜택();






}
