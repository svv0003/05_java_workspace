package edu.practice.day2;

import java.util.Scanner;

public class Practice6 {
    public void Exam6(){
        Scanner sc = new Scanner(System.in);

        int answer = (int)(Math.random() * 50) + 1;
        int count = 0;
        final int MAX_TRIES = 7;

        System.out.printf("1~50 사이 숫자 맞추기 : %d\n", answer);

        while (count < MAX_TRIES){
            ++count;

            System.out.printf("시도 %d/7 : ", count);
            int num = sc.nextInt();

            if (num < 1 || num > 50) {
                System.out.println("1~50 사이 정수를 입력하세요");
            } else {
                if (count == MAX_TRIES) {
                    if (num == answer) {
                        System.out.println("Correct!!!");
                        System.out.printf("정답 : %d  시도 횟수 : %d회", answer, count);
                        break;
                    } else {
                        System.out.printf("Fail...\n정답은 %d였습니다.", answer);
                        break;
                    }
                }
                if(num == answer){
                    System.out.println("Correct!!!");
                    System.out.printf("정답 : %d  시도 횟수 : %d회", answer, count);
                    break;
                } else if (num < answer){
                    System.out.println("Up~~~");
                } else {
                    System.out.println("Down~~~");
                }
            }
        }
    }
}