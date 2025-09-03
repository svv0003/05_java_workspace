package edu.polymorphism.pack2.ex1;

public class MemberService {

    // public static void main(){} 이외에 객체 생성은 모두 class 아래에 작성한다.
    // 왜?   다른 메서드에도 객체 할당한 변수명을 사용하는 경우
    //       메서드명 내부에 new 클래스명;을 작성하는 건 문제 없지만
    //       동일한 코드를 지속적으로 작성할 수 있기 때문에 개발자의 편의를 위해 class 아래에 작성한다.
    //       -> 전역 변수로 설정한 것

    일반Member 일반회원 = new 일반Member("M001", "김일반", "kim@email.com");
    단골Member 단골회원 = new 단골Member("M002", "박단골", "park@email.com", "배송비할인쿠폰");
    VIPMember VIP회원 = new VIPMember("M003", "최뷔희", "choi@email.com", "배송비무료쿠폰","무료반품");


    // 추후 html에서 작성해야 할 내용
    // html과 연결하기 전이기 때문에 Java에서 임의적으로 System 출력문을 통해 진행한다.
    public void display() {
        System.out.println("===회원 시스템===");
        System.out.println("프리미엄 회원은 [배송비 할인 쿠폰]과 [반품비 할인 쿠폰] 중에서 선택할 수 있습니다.");
        System.out.println("VIP회원은 [배송비 무료 쿠폰]과 [반품비 무료 쿠폰] 중에서 선택할 수 있으며,\n혜택으로는 [무료 반품]과 [1만 포인트 적립]이 제공됩니다.");
        System.out.println();


        // 다형성을 활용해서 Member 배열을 생성하고, 각 멤버별로 순차적 순회하기
        // 배열로 순회할 때 자식 클래스의 공통 상속 클래스인 부모 클래스로 배열 생성한다.
        // 부모클래스[] 부모클래스변수명 = {자식클래스1, 자식클래스2, ...}
        Member[] 회원들 = {일반회원, 단골회원, VIP회원};

        // 향상된 for문을 활용해서 모든 회원을 순차적으로 개발자가 원하는 기능을 실행하기
        // 회원들 배열에 작성된 모든 회원들을 회원이라는 변수명에 하나씩 넣어서 기능을 실행한다.
        for (Member 회원 : 회원들) {
            // 지역 변수
            double 원래가격 = 10000;
            double 할인가격 = 원래가격 * (1 - 회원.할인율());

            회원.login();

            // 물건 구매
            System.out.println("할인율 : " + (int)(회원.할인율() * 100) + "%");
            System.out.println("정  가 : " + (int)원래가격 + "원");
            System.out.println("할인가 : " + (int)할인가격 + "원");

            // 단골, VIP회원만 존재하는 변수
            회원.쿠폰과혜택();

            회원.logout();
            System.out.println();
        }


    }


}
