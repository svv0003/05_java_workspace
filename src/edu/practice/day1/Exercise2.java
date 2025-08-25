package edu.practice.day1;

import java.util.Scanner;

public class Exercise2 {
    public void Exercise2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int num2 = sc.nextInt();
        System.out.printf("=== 계산 결과 ===\n%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %.2f", num1, num2, (num1+num2), num1, num2, (num1-num2), num1, num2, (num1*num2), num1, num2, (float)(num1/num2));
    }
}
