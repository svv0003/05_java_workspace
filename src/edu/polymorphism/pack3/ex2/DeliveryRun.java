package edu.polymorphism.pack3.ex2;

public class DeliveryRun {
    public static void main(String[] args) {

        BaeminApp baemin = new BaeminApp("김배달");
        baemin.showAccount();
        baemin.orderFood();
        baemin.trackOrder("B001");
        baemin.payMoney(20000);
        System.out.println();

        CoupangApp coupang = new CoupangApp("박주문");
        coupang.showAccount();
        coupang.orderFood();
        coupang.trackOrder("C001");
        coupang.payMoney(25000);
        System.out.println();


    }
}
