package edu.oop.field.pack3.ex;

public class ShopptingMallTestRun {
    public static void main(String[] args) {

        /*
        자료형은                공간의         member1이라는 공간 내부에
        member1                명칭         작성될 수 있는 데이터와
        공간의 크기                           사용 가능한 기능을 member1에 넣어서 사용한다.
         */
        ShopptingMallMember member1 = new ShopptingMallMember();
        ShopptingMallMember member2 = new ShopptingMallMember();
        ShopptingMallMember member3 = new ShopptingMallMember();

        System.out.println("---회원가입---");
        member1.joinMember("user001","김쇼핑","kim@email.com");
        System.out.println();

        member2.joinMember("user002","박구매","park@email.com");
        System.out.println();

        member3.joinMember("user003","이주문","lee@email.com");
        System.out.println();

        System.out.println("---사이트 방문 & 장바구니 추가---");
        member1.visitSite();
        member1.addToCart(3);
        System.out.println();

        member2.visitSite();
        member2.addToCart(2);
        System.out.println();

        member3.visitSite();
        member3.addToCart(51);
        System.out.println();

        System.out.println("---개별 회원 정보---");
        member1.printMemberInfo();
        System.out.println();
        member2.printMemberInfo();
        System.out.println();
        member3.printMemberInfo();
        System.out.println();


        System.out.println("---회원가입 후 통계---");
        System.out.println("전체 회원 수 : " + ShopptingMallMember.totalMemberCount + "명");
        System.out.println("일일 방문자 수 : " + ShopptingMallMember.dailyVisitorCount + "명");
        System.out.println();
        System.out.println("---쇼핑몰 운영 정보---");
        System.out.println("쇼핑몰 이름 : " + ShopptingMallMember.SHOPPING_MALL_NAME);
        System.out.println("고객센터 전화번호 : " + ShopptingMallMember.SERVICE_CENTER_NUMBER);
        System.out.println("최대 장바구니 상품 수 : " + ShopptingMallMember.MAX_CART_ITEMS + "개");
        System.out.println("최소 비밀번호 길이 : " + ShopptingMallMember.MIN_PASSWORD_LENGTH + "자");
        System.out.println();



    }
}
/*
Q1. 왜 totalMemberCount를 작성하면 경고가 나타날까요?
                                자동완성이 안 될까요?
System.out.println("전체 회원 수 : " + member1.totalMemberCount + "명");
 */