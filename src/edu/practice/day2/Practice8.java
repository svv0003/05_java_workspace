package edu.practice.day2;

import java.util.Scanner;

public class Practice8 {
    public void Exam8(){
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[5];
        int total = 0;

        System.out.print("5명의 성적을 입력하세요 : ");
        // 성적 입력받기
        for(int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 학생");
            scores[i] = sc.nextInt();
            total += scores[i];
        }
        double average = (double)total / scores.length;

        int max = scores[0];
        int min = scores[0];

        for(int i = 1; i < scores.length; i++) {
            max = Math.max(scores[i], max);
            min = Math.min(scores[i], min);
        }

        /*
        int max = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int min = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));
        int sum = num1 + num2 + num3 + num4 + num5;
        double average = (double) (num1 + num2 + num3 + num4 + num5) / 5;
        */

        System.out.printf("---성적 통계---\n총점 : %d\n평균 : %.1f\n최고점 : %d\n최저점 : %d", total, average, max, min);


    }
}