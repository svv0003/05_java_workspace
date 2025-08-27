package edu.variable;

public class VariableEx2 {
    // main method (= 기능 행동) : 프로그램 실행 구문
    public static void main(String[] args) {
        /* 컴퓨터 값 처리 원칙
        *   같은 자료형끼리 연산, 결과도 같은 자료형
        *
        *   형변환
        *   - 다른 자료형끼리 연산하는 경우 자료형을 맞게 변환한다.
        *
        *   자동 형변환
        *   - 연산 시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 맞춰 변환한다.
        *   ex) (int) + (long) = (long)
        **/

        // 자동 형변환 확인 1
        int num1 = 9;
        long num2 = 100_000_000_000L;      // 백억
        long result1 = num1 + num2;
        System.out.println("result : " + result1);
        // int result2 = num1 + num2;
        // 필요한 타입   : int
        // 제공된 타입   : long
        // 자동으로 형변환 되어 result2는 long 값을 지니지만 int형 크기의 바구니에 long 크기를 넣으려고 해서 오류 발생한다.


        // 자동 형변환 확인 2
        int num3 = 300;
        double num4 = 12.34;
        double result2 = num3 + num4;
        System.out.println("result2 : " + result2);     // 312.34로 하여 형변환 계산 가능

        // 자동 형변환 확인 3
        long num5 = 20L;
        float num6 = 3.14f;
        double result3 = num5 + num6;
        System.out.println("result3 : " + result3);     // (참고) double, float는 실수를 근사치로 표현하는 자료형
                                                        // 소수점 문제로 인하여 정확하지 않은 숫자 계산 전달 -> 은행, 숫자 민감한 프로젝트에는 사용 지양

    }
}
