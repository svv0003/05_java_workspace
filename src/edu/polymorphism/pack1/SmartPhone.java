package edu.polymorphism.pack1;

// 부모 클래스 역할

public class SmartPhone {

    private String display;     // 화면
    private String newsAgency;  // 통신사
    private String ap;          // 스마트폰 cpu

    // 메서드 시작!!
    // 기본 생성자
    // 파라미터가 하나도 없는 생성자
    public SmartPhone() {
    }

    // 매개변수 생성자
    // 파라미터가 1개 이상 존재하는 생성자
    public SmartPhone(String display, String newsAgency, String ap) {
        this.display = display;
        this.newsAgency = newsAgency;
        this.ap = ap;
    }

    // 회원가입 HTML에서 사용자가 작성한 데이터를 DB에 저장하기 위해 Java를 통해 저장한다.
    // DB에 저장된 데이터를 확인한다.

    // getter
    // 1) 생성자를 이용해서 특정 데이터를 사용할 수 있도록 전달한다.
    // 2) set변수명 또는 변수 내에 저장되어 있는 데이터를
    // 3) 추후 main이나 service 메서드에서 객체로 생성한다.
    public String getDisplay() {
        return display;
    }

    public String getNewsAgency() {
        return newsAgency;
    }

    public String getAp() {
        return ap;
    }
}
