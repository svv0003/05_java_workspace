package edu.practice.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice10 {
    public void Exam10() {
        Scanner sc = new Scanner(System.in);
        /*
        === 간단 로또 번호 생성기 ===
생성된 번호: 3 7 12 18 20
다시 생성하시겠습니까? (y/n): y
생성된 번호: 1 5 9 15 19
다시 생성하시겠습니까? (y/n): n
프로그램을 종료합니다.
         */


        String choice;
        int[] lottery = new int[6];

        do {
            System.out.printf("---간단한 로또 번호 생성기---\n생성된 번호 : %s\n다시 생성하시겠습니까? (Y/N) : ", Arrays.toString(lottery));
            choice = sc.nextLine();

            for (int i = 0; i < lottery.length; i++) {
                lottery[i] = (int) (Math.random() * 45) + 1;
            }

        } while (choice != "N");


    }
}