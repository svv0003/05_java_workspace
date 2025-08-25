package edu.practice.day1;

import java.util.Scanner;

public class Exercise1 {
    public void Exercise1(){
        Scanner sc = new Scanner(System.in);
        String name = "김자바";
        int age = 25;
        double height = 175.5;
        char gender = 'M';
        String hobby = "프로그래밍";
        System.out.printf("===개인정보===\n이름 : %s\n나이 : %d\n신장 : %.1f\n성별 : %c\n취미 : %s", name, age, height, gender, hobby);
    }
}
