package edu.practice.day1;

import java.util.Scanner;

public class Exercise3 {
    public void Exam3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨를 입력하시오 : ");
        double celsius = sc.nextDouble();

        final double RATIO = 9.0 / 5.0;
        final int OFFSET = 32;
        double fahrenheit = celsius * RATIO + OFFSET;

        System.out.printf("섭씨 %.1f도는 화씨 %.1f도입니다.", celsius, fahrenheit);
    }
    // 클래스에서 변수명을 설정할 때를 제외하고 모두 메서드 형태로 작성한다!
}
