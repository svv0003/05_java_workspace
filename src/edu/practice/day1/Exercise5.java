package edu.practice.day1;

import java.util.Scanner;

public class Exercise5 {
    public void Exam5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출생년도 : ");
        int birthyear = sc.nextInt();
        int age = 2025 -  birthyear;
        boolean isAdult = age > 19;

        System.out.printf("=====나이 정보=====\n출생년도 : %d\n현재 나이 : %d\n10년 후 : %d\n성인 여부 : %b", birthyear, age, (age+10), isAdult);
    }
}
