package edu.practice.day7;

public class KakaoPay extends KakaoService{

    // 필드
    private int balance;
    private String bankAccount;

    // 생성자 / getter / setter
    public KakaoPay() {
    }
    public KakaoPay(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        super(serviceName, userId, userNickname, isLoggedIn);
    }
    public KakaoPay(String serviceName, String userId, String userNickname, boolean isLoggedIn, int balance, String bankAccount) {
        super(serviceName, userId, userNickname, isLoggedIn);
        this.balance = balance;
        this.bankAccount = bankAccount;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }


    // 추상 메서드
    public void startService(){
        System.out.println("카카오페이를 시작합니다. 간편결제 서비스가 준비되었습니다!");
        System.out.println("현재 잔액: " + balance + "원");
    }
    public void stopService(){
        System.out.println("카카오페이를 종료합니다. 결제 내역을 저장했습니다.");
    }
    public String getServiceType(){
        return "PAYMENT";
    }
    public void performSpecialAction() {
    }


    // 메서드 오버라이딩
    @Override
    public void sendNotification(String message){
        System.out.println("[카카오페이 알림] " + message);
    }


    // 고유 메서드
    public void chargeBalance(int amount){
        balance += amount;
        System.out.println(amount + "원 충전 완료. 잔액: " + balance + "원");
    }
    public boolean processPayment(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 결제 완료. 잔액: " + balance + "원");
            return true;
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
            return false;
        }
    }
    public void transferMoney(String recipient, int amount){
        if (processPayment(amount)) {
            System.out.println(recipient + "에게 " + amount + "원 송금 완료");
        }
    }
    public void refund(int amount) {
        balance += amount;
        System.out.println(amount + "원 환불 완료. 잔액: " + balance + "원");
    }
    public int getBalance(){
        return balance;
    }










}
