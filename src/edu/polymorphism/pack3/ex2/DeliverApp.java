package edu.polymorphism.pack3.ex2;

/**
 * 추상없는 부모 클래스 공통된 필드 + 공통된 메서드
 */
public class DeliverApp {
    protected String appName; // 어플이름
    protected String userName;// 유저이름


    public DeliverApp() {
    }

    public DeliverApp(String appName, String userName) {
        this.appName = appName;
        this.userName = userName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // 공통 메서드
    public void showAccount(){
        System.out.println("[" + getAppName() + "] " + getUserName() + " 님의 계정입니다.");
    }

    public void payMoney(int amount) { // DB에서 가져오거나 저장할 데이터가 아니기 때문에 우선 get 아님
        System.out.println("[" + getAppName() + "]" + amount + "원을 결제했습니다.");
    }
}