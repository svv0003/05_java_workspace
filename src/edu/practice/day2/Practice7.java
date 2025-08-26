package edu.practice.day2;

import java.util.Scanner;

public class Practice7 {
    public void Exam7(){
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        // 위와 같이 클래스 파일을 가져올 때 매번 파일 경로를 작성하기 번거롭기 때문에
        // import를 사용하여 패키지 명칭 아래 맨 위에 작성한다.

        /*java.util.*/Scanner sc = /*java.util*/new Scanner(System.in);

        System.out.print("문자열을 숫자 포함해서 입력하세요 : ");
        String str = sc.nextLine();

        // int totalCount = str.length(), letterCount = 0, digitCount = 0;
        int totalCount = str.length();
        int letterCount = 0;                // 영문자 글자 개수
        int digitCount = 0;                 // 숫자 글자 개수
        int otherCount = 0;                 // 문자, 숫자 아닌 것의 개수

        for(int i = 0; i < totalCount; i++){
            char ch = str.charAt(i);        // 각 문자를 ch 변수명에 저장

            /*
            문자가 숫자인지 글자인지 boolean T/F 형태로 결과 확인
            Character.isDigit(ch)   = ch가 숫자라면 true
            Character.isLetter(ch)  = ch가 문자라면 true
             */
            if (Character.isDigit(ch)){             // ch에 저장된 문자가 숫자라면
                digitCount++;                       // 숫자 개수 증가
            } else if (Character.isLetter(ch)){     // ch에 저장된 문자가 글자라면
                letterCount++;                      // 글자 개수 증가
            } else {                                // ch에 저장된 문자가 기타라면
                otherCount++;                       // 개수 증가
            }
        }
            System.out.println("---고객이 작성한 문자열에서 숫자와 문자 개수 확인하기---");
            System.out.println("총 글자 수 : " + totalCount);
            System.out.println("영문자 : " + letterCount);
            System.out.println("숫자 : " + digitCount);
            System.out.println("기타 문자(공백, 기호) : " + otherCount);
    }
}