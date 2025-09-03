package edu.practice.day8.model;

public class Amazon implements OnlineShopping {

    // 필드
    private String product;

    // 생성자
    public Amazon(String product) {
        this.product = product;
    }

    @Override
    public void browse() {
        System.out.printf("아마존에서 {%s}을(를) 검색합니다.\n", product);
    }

    @Override
    public void addToCart() {
        System.out.printf("{%s}을(를) 아마존 장바구니에 추가합니다.\n", product);
    }

    @Override
    public void purchase() {
        System.out.printf("아마존에서 {%s} 결제 완료! 내일 도착 예정!\n",  product);
    }
}
