package edu.practice.day2;

import java.util.Scanner;

public class Practice3 {
    public void Exam3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("양수를 입력하시오 : ");
        int num = sc.nextInt();

        int factorial = 1;

        System.out.printf("%d! = ", num);
        for (int i = num; i > 0; i--) {
            if (i > 1) {
                System.out.printf("%d X ", i);
                factorial *= i;
            }
            if (i == 1) {
                System.out.print(i);
            }

        }
        System.out.printf(" = %d", factorial);
    }
}
