package edu.practice.day2;

import java.util.Scanner;

public class Practice8 {
    public void Exam8(){
        Scanner sc = new Scanner(System.in);

        System.out.println("5명의 성적을 입력하세요.");
        System.out.print("1번 학생 : ");
        int num1 = sc.nextInt();
        System.out.print("2번 학생 : ");
        int num2 = sc.nextInt();
        System.out.print("3번 학생 : ");
        int num3 = sc.nextInt();
        System.out.print("4번 학생 : ");
        int num4 = sc.nextInt();
        System.out.print("5번 학생 : ");
        int num5 = sc.nextInt();

        int max = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int min = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));
        int sum = num1 + num2 + num3 + num4 + num5;
        double average = (double) (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.printf("---성적 통계---\n총점 : %d\n평균 : %.1f\n최고점 : %d\n최저점 : %d", sum, average, max, min);


    }
}