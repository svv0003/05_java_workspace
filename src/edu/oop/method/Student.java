package edu.oop.method;

public class Student {

    // 속성 = 필드 (=변수)

    public static String schoolName = "더조은대학교";
    public static final int MIN_VALUE = 0;          // 스킬 역량 최소
    public static final int MAX_VALUE = 100;        // 스킬 역량 최대
    // static을 사용하는 목적이 여러 객체에서 공용 사용하기 위함이기 때문에
    // 일반적으로 static 앞엔 public을 작성해서 접근 가능하도록 설정한다.

    private String name;            // 이름
    private String studentNumber;   // 학번
    private char gender;            // 성별
    private int java;               // 자바 역량
    private int html;               // html 역량

    // 메서드
    // 메서드 (기능)와 변수 (필드)의 차이는?
    // 이름 명칭 뒤에 소괄호 ()가 붙느냐, 붙지 않느냐

    // (기본)생성자
    // 원래 자동적으로 생성되기 때문에 굳이 작성할 필요 없지만
    // 필수생성자를 작성하면 기본생성자가 사라지기 때문에 별도로 작성해야 한다.
    public Student() { /* 추가적으로 동작해야 하는 행동을 작성한다. */ }

    // (필수)생성자
    public Student(String name, String studentNumber, char gender) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.gender = gender;
    }
    // 메서드명은 Student로 동일하지만 매개변수의 유무, 자료형의 타입, 자료형의 순서 등의 차이로 인해 개별젹으로 사용 가능하다.
    // -> 오버로딩


    // setter
    // 사용자에게 전달받은 데이터 값을 (일시적으로) 간접적으로 저장하는 기능
    // 직접적으로 저장 (초기화)하는 방식 -> 클래스명.name = 10;
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setJava(int java) {
        this.java = java;
    }
    public void setHtml(int html) {
        this.html = html;
    }

    // getter
    // setter에 저장되어 있는 데이터 값을 사용하기 위해 간접적으로 전달받는 기능


    public String getName() {
        return name;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public char getGender() {
        return gender;
    }
    public int getJava() {
        return java;
    }
    public int getHtml() {
        return html;
    }
}
