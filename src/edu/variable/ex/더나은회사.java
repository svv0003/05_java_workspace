package edu.variable.ex;

public class 더나은회사 {

    // 클래스 변수
    public static final String 회사명 = "더나은회사";
    public static final String 회사주소 = "서울 중구";
    public static int 사원수 = 20;

    // 인스턴스 변수
    private String 이름;
    private String 부서;
    private int 연봉;
    private String 취미;

    public 더나은회사() {
    }

    public 더나은회사(String 이름, String 부서, int 연봉, String 취미) {
        this.이름 = 이름;
        this.부서 = 부서;
        this.연봉 = 연봉;
        this.취미 = 취미;
    }

    @Override
    public String toString() {
        return "더나은회사\n" +
                "이름 = " + 이름 +
                ", 부서 = " + 부서 +
                ", 연봉 = " + 연봉 + "만원" +
                ", 취미 = " + 취미;
    }
}
