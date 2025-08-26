package edu.control.loop;

// 루프 기능 설정용 클래스

import java.util.Scanner;

public class LoopEx {   // <html>과 같이 페이지 내 코드 시작을 나타내는 구문
    // 1~10 출력하기
    public void Exam1(){
        /*
        for문
        초기식 : 최초 1회 변수명 데이터를 설정하는 구문
        조건식 : 최초 1회 변수명 데이터를 기반으로 참/거짓 판별하는 구문
                참이라면 중괄호 내에 존재하는 코드 구문 수행하고,
                거짓이라면 중괄호 탈출한다.
        증감식 : 중괄호 내에 존재하는 구문을 수행하고 조건식을 판별하기 전에 변수명 데이터를 증가하거나 감소하는 구문
         */
        //   초기식     조건식  증감식
        for (int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // 첫 번째 입력부터 두 번째 입력까지 1씩 증가하며 출력하기
    public void Exam2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2개 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i=num1; i<=num2; i++) {
            System.out.print(i + " ");
        }
    }
    /* (코드에 대한 설명을 작성할 때 사용하는 주석)
    * 두 수를 입력 받아서 1씩 증가하며 반복 출력하기
    * 작은 값이 초기식, 큰 값이 조건식에 사용한다.
    * */
    public void Exam3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2개 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1<num2){
            for (int i=num1; i<=num2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i=num2; i<=num1; i++) {
                System.out.print(i + " ");
            }
        }
    }
    /*
    * 최대, 최소값 구하기 (Math)
    * - Java API 활용 방법
    *
    * Math.min(a,b) : 수를 비교하여 최소값을 찾는 기능
    * Math.max(a,b) : 수를 비교하여 최대값을 찾는 기능
    *
    * 두 수를 입력 받아서 두 수를 비교하고,
    * 최소값부터 최대값까지 for문으로 출력하기
    * */
    public void Exam4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1번 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2번 : ");
        int num2 = sc.nextInt();

        for (int i=Math.max(num1,num2); i<=Math.min(num1,num2); i++) {
            System.out.print(i + " ");
        }
    }
}   // </html>과 같이 페이지 내 코드 종료를 나타내는 구문
/*
주의할 점

html 코드는 오류 최소화를 기반으로 작성하는 코드이기 때문에
html 코드를 벗어난 상태에서 태그를 작성하거나 텍스트를 작성하더라도 문제 발생하지 않는다.

BUT
자바는 코드 규칙을 준수하는 언어이기 때문에
public class 파일명 {

}
*/
