package edu.variable;

public class VariableEx3 {
    public static void main(String[] args) {
        /*
        강제 형변환
        1. 값의 범위가 큰 자료형은 작은 자료형으로 강제 변환
        -> 데이터 손실 고려
        2. 의도적으로 자료형을 다른 자료형으로 변환시킬 때

            [작성법]
            (자료형) 변수명 || 값;     // 지정된 자료형으로 변경된다.

        */

        // 강제 형변환 확인 1      -> 자료형 변환 + 데이터 손실
        int num1 = 290;

        // byte  :  -128 ~ 127 (0 포함)
        byte result1 = (byte)num1;
        System.out.println("num1 : " + num1);            // 290
        System.out.println("result1 : " + result1);      // 34


        // 강제 형변환 확인 2      -> 실수를 정수로 변환해서 소수점 없애기 (데이터 손실 활용)
        double num2 = 123.123456789;
        int result2 = (int)num2;
        System.out.println("num2 : " + num2);           // 123.123456789
        System.out.println("result2 : " + result2);     // 123        -> 정수로 강제 형변환해서 소수점 이하 제거

        // 난수 + 강제 형변환
        // 난수 : Math.random();
        // 0.0 <= X < 1.0
        // 1 ~ 10 사이의 난수는?
        int random = (int)(Math.random() * 10 + 1);     // 0 ~ 9 까지의 숫자 (+ 1) -> 1 ~ 10으로 변경


        // 강제 형변환 확인 3
        // 문자 (char) <-> 유니코드 (int)
        System.out.println("컴퓨터 상에서 각 문자의 숫자 번호");
        System.out.println("A의 번호 : " + (int)'A');
        System.out.println("B의 번호 : " + (int)'B');
        System.out.println("Z의 번호 : " + (int)'Z');
        System.out.println("a의 번호 : " + (int)'a');
        System.out.println("b의 번호 : " + (int)'b');
        System.out.println("가의 번호 : " + (int)'가');
        System.out.println("91의 문자 : " + (char)91);

        /*
        ========== 출력 구문 ==========
        A의 번호 : 65
        B의 번호 : 66
        Z의 번호 : 90
        a의 번호 : 97
        b의 번호 : 98
        가의 번호 : 44032
        91의 문자 : [
        */

        /*
        ASCII 코드 값
        문자와 숫자 기호 제어문자를 숫자로 표현하는 표준 구분 표

        1 ~ 31  : 제어 문자 (출력 X)
        32      : 스페이스 (= 공백)
        33 ~ 64 : 특수문자 및 숫자 일부
        */



    }
}
