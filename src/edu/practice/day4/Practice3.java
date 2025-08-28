package edu.practice.day4;

public class Practice3 {

    /*
    - static final 상수: `CAFE_NAME("코딩카페")`, `TAX_RATE(0.1)`
    - static 변수: `totalOrders(전체 주문 수)`, `totalSales(총 매출)`
    - private 필드: `customerName(String)`, `menuItem(String)`, `price(int)`, `orderNumber(int)`
    - static 초기화 블록으로 시스템 시작 메시지 출력
    - `placeOrder()` 메서드: 주문 처리, 주문번호 자동 증가, 총 매출 누적
    - `printReceipt()` 메서드: 영수증 출력 (세금 포함 최종 금액 계산)
     */

    public static final String CAFE_NAME = "코딩카페";
    public static final double TAX_RATE = 0.1;

    private static int totalOrders = 0;
    private static int totalSales = 0;

    private String customerName;
    private String menuItem;
    private int price;
    private static int orderNumber = 0;

    static {
        System.out.printf("===%s 시스템 시작 ===\n", CAFE_NAME);
    }

    public Practice3() {
    }

    public Practice3(String customerName, String menuItem, int price) {
        this.customerName = customerName;
        this.menuItem = menuItem;
        this.price = price;
    }

    public static void setTotalOrders(int totalOrders) {
        Practice3.totalOrders = totalOrders;
    }

    public static void setTotalSales(int totalSales) {
        Practice3.totalSales = totalSales;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }


    public static int getTotalOrders() {
        return totalOrders;
    }

    public static int getTotalSales() {
        return totalSales;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public int getPrice() {
        return price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void placeOrder() {
        orderNumber++;
        totalOrders++;
        totalSales += getPrice();
    }

    public void printReceipt() {
        int tax = (int)(getPrice() * TAX_RATE);
        System.out.printf("====%s 영수증===\n", CAFE_NAME);
        System.out.println("주문번호 : " + getOrderNumber() + "번");
        System.out.println("고객명 : " + getCustomerName());
        System.out.println("메뉴 : " + getMenuItem());
        System.out.println("금액 : " + getPrice() + "원");
        System.out.println("세금 : " + tax + "원");
        System.out.println("총액 : " + (getPrice()+tax) + "원");
        System.out.println("================");
        System.out.println("현재 총 주문수 : " + getTotalOrders() + "건");
        System.out.println("현재 총 매출 : " + getTotalSales() + "원");
    }

    public void method3() {
        placeOrder();
        printReceipt();
        System.out.println();
    }

















}
