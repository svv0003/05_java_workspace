package edu.practice.day1;

import java.util.Scanner;

public class Exercise5 {
    public void Exam5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출생년도 : ");
        int birthyear = sc.nextInt();
        int age = 2025 -  birthyear;
        boolean isAdult = age > 19;


        String zodiac = "";
        int zodiacIndex = birthyear % 12;
        switch (zodiacIndex) {
            case 0: zodiac = "원숭이"; break;
            case 1: zodiac = "닭"; break;
            case 2: zodiac = "개"; break;
            case 3: zodiac = "돼"; break;
            case 4: zodiac = "쥐"; break;
            case 5: zodiac = "소"; break;
            case 6: zodiac = "호랑"; break;
            case 7: zodiac = "토끼"; break;
            case 8: zodiac = "용"; break;
            case 9: zodiac = "뱀"; break;
            case 10: zodiac = "말"; break;
            case 11: zodiac = "양"; break;
            default: break;
        }

        System.out.printf("=====나이 정보=====\n출생년도 : %d\nzodiac : %s\n현재 나이 : %d\n10년 후 : %d\n성인 여부 : %b", birthyear, zodiac, age, (age+10), isAdult);
    }
}
