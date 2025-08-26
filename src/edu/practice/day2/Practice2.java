package edu.practice.day2;

import java.util.Scanner;

public class Practice2 {
    public void Exam2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하시오 : ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
