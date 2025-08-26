package edu.practice.day1;

import java.util.Scanner;

public class Exercise3 {
    public void Exam3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨를 입력하시오 : ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9) / 5 + 32;
        System.out.printf("섭씨 %.1f도는 화씨 %.1f도입니다.", celsius, fahrenheit);
    }
}
