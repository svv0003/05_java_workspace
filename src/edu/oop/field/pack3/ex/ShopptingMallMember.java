package edu.oop.field.pack3.ex;

public class ShopptingMallMember {

    /*
    **공유 정보 (static)**

    - `totalMemberCount` : 전체 회원 수 (int)
    - `dailyVisitorCount` : 일일 방문자 수 (int)

    **공통 규정 (static final)**

    - `SHOPPING_MALL_NAME` : "더조은 온라인 쇼핑몰"
    - `SERVICE_CENTER_NUMBER` : "1588-1234"
    - `MAX_CART_ITEMS` : 최대 장바구니 상품 수 (50개)
    - `MIN_PASSWORD_LENGTH` : 최소 비밀번호 길이 (8자)

    **개인 정보 (인스턴스 변수)**

    - `memberId` : 회원 ID (String)
    - `memberName` : 회원명 (String)
    - `email` : 이메일 (String)
    - `cartItemCount` : 현재 장바구니 상품 수 (int)
     */

    public static int totalMemberCount = 0;
    public static int dailyVisitorCount = 0;

    public static final String SHOPPING_MALL_NAME = "더조은 온라인 쇼핑몰";
    public static final String SERVICE_CENTER_NUMBER = "1588-1234";
    public static final int MAX_CART_ITEMS = 50;
    public static final int MIN_PASSWORD_LENGTH = 8;

    private String memberId;
    private String memberName;
    private String email;
    private int cartItemCount;



    // (인스턴스) 초기화 블록    단일 변수보다 한 단계 늦게 시작

    {
        memberId = "guest123";
        memberName = "게스트";
        email = "guest@tjemall.com";
        cartItemCount = 0;
    }

    // static 초기화 블록

    static {
        totalMemberCount = 0;
        dailyVisitorCount = 0;
        System.out.println("=== " + SHOPPING_MALL_NAME + " 시스템 시작 ===");
    }

    public ShopptingMallMember() {
    }

    public ShopptingMallMember(String memberId, String memberName, String email, int cartItemCount) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
        this.cartItemCount = cartItemCount;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }

    public int getCartItemCount() {
        return cartItemCount;
    }

    /*
    - `joinMember()` : 회원가입 (전체 회원 수 +1)
    - `visitSite()` : 사이트 방문 (일일 방문자 수 +1)
    - `addToCart(int itemCount)` : 장바구니 추가
    - `printMemberInfo()` : 회원 정보 출력
     */

    public void joinMember(String memberId, String memberName, String email) {
        totalMemberCount++;
        dailyVisitorCount++;
        setMemberId(memberId);
        setMemberName(memberName);
        setEmail(email);
        System.out.printf("%s님이 회원가입하였습니다. (회원번호: %s)\n", getMemberName(), getMemberId());
    }

    public void visitSite(){
        dailyVisitorCount++;
        System.out.printf("%s님이 방문하였습니다. (회원번호: %s)\n", getMemberName(), getMemberId());
    }

    public void addToCart(int itemCount){
        // char String은 equals 사용한다.
        // static final에 관계없이 부등호는 숫자(정수,실수)만 가능하다.
        if(MAX_CART_ITEMS >= cartItemCount + itemCount){
            cartItemCount += itemCount;
            System.out.printf("%s님이 장바구니에 %d개의 상품을 추가하였습니다. (회원번호: %s)\n", getMemberName(), itemCount, getMemberId());
        } else {
            System.out.printf("장바구니 최대 수량 (%d개)를 초과할 수 없습니다.\n", MAX_CART_ITEMS);
        }
    }

    public void printMemberInfo(){
        System.out.println("회원 ID : " + getMemberId());
        System.out.println("회원 이름 : " + getMemberName());
        System.out.println("회원 email : " + getEmail());
        System.out.println("회원 장바구니 : " + getCartItemCount());
    }


}
