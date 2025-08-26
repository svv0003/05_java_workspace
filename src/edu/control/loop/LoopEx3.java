package edu.control.loop;

// 루프 기능용 클래스
// 문자열 / while문 기능 작성

import java.util.Scanner;

public class LoopEx3 {
    Scanner sc = new Scanner(System.in);

    /*
    문자열.charAt(인덱스) : 인덱스 번째 문자 하나를 얻어와서 반환하는 메서드
    문자열.length()     : 문자열의 길이 반환하는 메서드

    문자열 (String) = 문자 + 나열
     */
    // 문자열을 한 글자씩 출력하기
    public void Exam1(){
        String str = "Hello World!!";

        // str 문자열의 총 길이를 length() 메서드로 활용하여 가져와서
        // 문자열의 문자 하나씩 charAt으로 출력하는 기능
        for (int i = 0; i < str.length(); i++){
            System.out.printf("%d 인덱스의 값 : ", i);
            System.out.println((int)str.charAt(i));
        }
    }
}
