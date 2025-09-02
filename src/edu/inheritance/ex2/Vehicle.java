package edu.inheritance.ex2;

public class Vehicle {
    //필드 속성 인스턴스 변수
    private String brand;
    private String model;
    private int year;
    private String color;

    // 메서드
    // 기본 생성자
    public Vehicle() {

    }
    // 매개변수가 4가지 존재하는 생성자
    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    // 게터와 세터
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setColor(String color) { this.color = color; }


    // 추후 재사용할 메서드들 -> 만약 재사용할 때 변경될 사항이 없으면
    // 자식 메서드에서 작성하지 않고 사용할 수 있음
    public void start() {
        System.out.println(brand + " " + model + "이(가) 시작합니다.");
    }

    public void stop() {
        System.out.println(brand + " " + model + "이(가) 정지합니다.");
    }


    public void accelerate() {
        System.out.println("가속합니다.");
    }

    public void brake() {
        System.out.println("감속합니다.");
    }
    public void showInfo() {
        System.out.println("=== 교통수단 정보 ===");
        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("연도: " + year + "년");
        System.out.println("색상: " + color);
        System.out.println("==================");
    }
}