package edu.variable;

public class VariableEx4 {
    // main method : 자바 프로그램을 실행하는 구문
    public static void main(String[] args) {
        // 상수       : 한 번 값을 기록하면 값을 바꿀 수 없는 메모리 공간 명칭
        // 상수 키워드  : final
        // 상수 명 규칙 : 대문자로 모두 작성, 연결 단어는 _로 구분한다. -> 개발자 간의 규칙

        final double PI = 3.14;
        final int MIN = 0;
        final int MAX = 100;
        System.out.println("최소값 : " + MIN);
        System.out.println("최대값 : " + MAX);
    }
}
