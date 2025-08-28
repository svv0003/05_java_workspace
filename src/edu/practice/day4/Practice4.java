package edu.practice.day4;

public class Practice4 {

    /*

    - 메서드 오버로딩을 활용한 `calculate` 메서드들:
    - `calculate(int a, int b)`: 두 정수의 합
    - `calculate(double a, double b)`: 두 실수의 합
    - `calculate(int a, int b, String operation)`: 사칙연산 (+, -, *, /)
    - `calculate(int[] numbers)`: 배열의 모든 수 합계
    - `calculate()`: 매개변수 없이 호출 시 "계산기 실행" 메시지
    - static 메서드로 작성하여 객체 생성 없이 사용 가능
    - 나눗셈 시 0으로 나누는 경우 처리

    - 클래스명: `Calculator`
    - static 메서드: `public static int calculate(...)`
    - 사칙연산: `switch(operation.charAt(0))` 또는 `switch(operation)`
    - 0으로 나누기: `if(b == 0) return 0` 또는 예외 메시지
     */


    // 정수의 합
    public int calculate(int a, int b) {
        return a + b;
    }

    // 실수의 합
    public double calculate(double a, double b) {
        return a + b;
    }

    public int calculate(int a, int b, String operation) {
        String plus = "+";
        String minus = "-";
        String multiply = "*";
        String divide = "/";
        if (plus.equals(operation)) return (a + b);
        else if (minus.equals(operation)) return (a - b);
        else if (multiply.equals(operation)) return (a * b);
        else if (divide.equals(operation)) {
            if (b == 0) {
                System.out.println("분모가 0인 경우는 계산을 진행할 수 없습니다.");
                return a;
            }
            else return (a / b);
        }
        return a;
    }


    /*
    ===== 계산기 테스트 =====
    두 정수 합: 15
    두 실수 합: 10.7
    사칙연산 (10 + 5): 15
    사칙연산 (10 - 5): 5
    사칙연산 (10 * 5): 50
    사칙연산 (10 / 5): 2
    배열 합계: 55
    기본 실행: 계산기 실행
     */




}
