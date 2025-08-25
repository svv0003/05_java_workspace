package edu.control.condition;
// 폴더 위치 edu 폴더 > control 폴더 > condition 폴더에 위치해 있다.

// 조건문 기능용 클래스

import java.util.Scanner;

public class ConditionEx {
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하시오 : ");
        int age = sc.nextInt();

        if (age >= 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("성인이 아닙니다.");
        }
    }
    public void method2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하시오 : ");
        int age = sc.nextInt();

        String result;

        if (age <= 13) result = "어린이";
        else if (age <= 18) result = "청소년";
        else result = "성인";

        System.out.printf("%s입니다.", result);
    }
    public void method3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("달(월)을 입력하시오 : ");
        int month = sc.nextInt();
        String result;

        if (month >= 3 && month < 6) result = "봄";
        else if (month >= 6 && month < 9) result = "여름";
        else if (month >= 9 && month < 12) result = "가을";
        else if (month == 12 || month == 1 || month == 2) result = "겨울";
        else result = "입력을 확인하세요.";
        System.out.println(result);
    }
    // 한 클래스 내에서 동일한 명칭의 메서드를 사용하기 위해서는
    // 매개변수를 각각 다르게 설정하거나 void -> return 전달 받는 형식을 추가하는 방법 외에는
    // 에러 발생!!
    public void method4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("달(월)을 입력하시오 : ");
        int month = sc.nextInt();
        String result;

        // 입력 값이 잘못 되었을 경우 메서드 기능을 중간에 종료시킨다.
        if (month < 1 || month > 12){
            System.out.println("잘못 입력하였습니다.");
            return;
        }
        if (month >= 3 && month < 6) result = "봄";
        else if (month >= 6 && month < 9) result = "여름";
        else if (month >= 9 && month < 12) result = "가을";
        else result = "겨울";
        System.out.println(result);
    }
}
