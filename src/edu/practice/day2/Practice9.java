package edu.practice.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice9 {
    public void Exam9(){
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 크기를 입력하시오 (1~10) : ");
        int num = sc.nextInt();

        int[] original = new int[num];
        int[] reversed = new int[num];


        for (int i = 0; i < num; i++ ){
            System.out.printf("%d번째 숫자 : ", i);
            original[i] = sc.nextInt();
            reversed[num - 1 - i] = original[i];
        }
        System.out.printf("원본 배열 : %s\n뒤집힌 배열 : %s", Arrays.toString(original),  Arrays.toString(reversed));
    }
}