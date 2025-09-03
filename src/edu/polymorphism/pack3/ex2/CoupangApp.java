package edu.polymorphism.pack3.ex2;
/*
작성 순서

부모클래스 다음에 구현해야하는기능들
부모클래스
구현해야하는기능들

은 가능하나
구현해야하는기능들 다음에 부모클래스가 올 수 없음!!!!!
 */
public class CoupangApp extends DeliverApp implements DeliveryService  {

    public CoupangApp( String userName) {
        super("쿠팡이츠", userName);
    }

    @Override
    public void orderFood() {
        System.out.println("쿠팡 주문완료! 배송으로 빠르게 이동하겠습니다.");
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("쿠팡 주문번호 : " + orderId + "GPS로 실시간 추적중입니다.");
    }
}