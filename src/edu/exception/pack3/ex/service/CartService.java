package edu.exception.pack3.ex.service;

public class CartService {

    public void 장바구니시간확인기능(String userId){

        // 만약 장바구니 보관 시간이 최대 30분인데 초과했을 경우
        try {
            throw new CartTimeoutException("장바구니 보관 시간이 만료되었습니다.");
        } catch (CartTimeoutException e) {
            System.out.println("장바구니 보관 시간이 만료되었으니 백엔드에서 갖고 있던 장바구니 데이터 지우기");
            clear장바구니(userId);
        }
    }

    public void clear장바구니(String userId){
        System.out.println(userId + " 사용자 장바구니 초기화 작업 시작");

    }

}
