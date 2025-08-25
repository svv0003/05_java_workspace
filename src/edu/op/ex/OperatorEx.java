package edu.op.ex;

// 폴더위치 + 파일이름 생성 방법
// . 활용해서 폴더 구분 후 파일명칭 작성
// edu.op.ex.OperatorEx

// 기능 작성용 클래스

import java.util.Scanner;

public class OperatorEx {
    // 자바에서는 모든 기능을 class 내부에 작성하기 때문에 대부분의 기능을 메서드 형태로 사용한다.
    // 파일명.기능명() 형태
    public void test() {
        System.out.println("test");
    }
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        boolean isTrue = (num1 % 3 == 0);

        // %d = decimal
        // %b = boolean
        System.out.printf("%d는 3의 배수입니다. : %b", num1, isTrue);
    }
    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        if (num1 % 3 == 0){
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}
