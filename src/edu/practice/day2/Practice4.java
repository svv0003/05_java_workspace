package edu.practice.day2;

import java.util.Scanner;

public class Practice4 {
    public void Exam4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하시오 : ");
        int num = sc.nextInt();

        if (num > 0) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.printf("%d는 소수입니다.", num);
            else System.out.printf("%d는 소수가 아닙니다.", num);
        }
    }
}
