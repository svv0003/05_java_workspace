package edu.practice.day1;

import java.util.Scanner;

public class Exercise4 {
    // 변수명을 선언하거나 변수명에 데이터를 넣는 것은 메서스 내부에 작성하지 않고,
    // 보통은 class 파일명 바로 아래에 작성한다.
    public void Exam4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        int korean = sc.nextInt();
        System.out.print("수학 점수 : ");
        int math = sc.nextInt();
        System.out.print("영어 점수 : ");
        int english = sc.nextInt();

        double average =  (double)(korean + math + english) / 3;
        char grade;

        if (average > 90) grade = 'A';
        else if (average > 80) grade = 'B';
        else if (average > 70) grade = 'C';
        else if (average > 60) grade = 'D';
        else grade = 'F';

        System.out.printf("평균 : %.2f\n학점 : %c",  average, grade);
    }
}
