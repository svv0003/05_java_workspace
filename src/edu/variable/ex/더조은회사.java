package edu.variable.ex;

public class 더조은회사 {

    // 클래스 변수
    public static final String 회사명 = "더조은회사";
    public static final String 회사주소 = "서울 종로구";
    public static int 사원수 = 5;

    // 인스턴스 변수
    private String 이름;
    private String 부서;
    private int 연봉;

    // 기본 생성자 메서드
    public 더조은회사() {
    }
    // 매개변수 생성자 메서드
    public 더조은회사(String 이름, String 부서, int 연봉) {
        this.이름 = 이름;
        this.부서 = 부서;
        this.연봉 = 연봉;
    }

    @Override
    public String toString() {
        return "더조은회사\n" +
                "이름 = " + 이름 +
                ", 부서 = " + 부서 +
                ", 연봉 = " + 연봉 + "만원";
    }
}
