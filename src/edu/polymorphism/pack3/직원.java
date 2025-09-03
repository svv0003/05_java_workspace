package edu.polymorphism.pack3;

// 부모 클래스

public class 직원 {

    // 필드
    protected String name;
    protected String position;
    protected int salary;

    // 생성자
    public 직원(String name, String 매니저, int salary, String 프로그래밍언어) {
    }
    public 직원(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // getter / setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "이름='" + name + '\'' +
                ", 직급='" + position + '\'' +
                ", 연봉=" + salary + "원";
    }
}
