package edu.practice.day2;

import java.util.Scanner;

public class Practice1 {
    public void Exam1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();

        for (int i = Math.min(num1, num2); i < Math.max(num1, num2); i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }
}

