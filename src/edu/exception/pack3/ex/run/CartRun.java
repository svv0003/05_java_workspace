package edu.exception.pack3.ex.run;

import edu.exception.pack3.ex.model.Cart;
import edu.exception.pack3.ex.service.CartService;

import java.util.Scanner;

public class CartRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사용자 아이디 입력 : ");
        String userId = sc.nextLine();

        // 입력된 데이터를 매개변수로 cart 객체 생성한다.
        Cart cart = new Cart(userId);

        // 생성된 객체의 정보로 메서드 불러오기
        CartService cartService = new CartService();
        // cartService.장바구니시간확인기능(userId);
        // html 대신 작성한 것이므로 나중에는 사용 불가!!
        cartService.장바구니시간확인기능(cart.getUserId());
        // 나중에 html에서 가져온 데이터 활용 방법

        // 둘 다 유저아이디로 불러오지만 html에서 데이터를 불러오는 getter를 사용할 것!
    }
}
