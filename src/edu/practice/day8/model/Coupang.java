package edu.practice.day8.model;

public class Coupang implements OnlineShopping {

    // 필드
    private String item;

    // 생성자
    public Coupang(String item) {
        this.item = item;
    }

    @Override
    public void browse() {
        System.out.printf("쿠팡에서 {%s}을(를) 둘러봅니다.\n", item);
    }

    @Override
    public void addToCart() {
        System.out.printf("{%s}을(를) 쿠팡 장바구니에 쏙!\n", item);
    }

    @Override
    public void purchase() {
        System.out.printf("쿠팡에서 {%s} 주문! 로켓배송으로 내일 도착!\n",  item);
    }
}
