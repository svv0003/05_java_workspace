package edu.practice.day2;

import java.util.Scanner;

public class Practice5 {
    public void Exam5() {
        /*
        === 구구단 프로그램 ===
1. 특정 단 출력
2. 전체 구구단 출력
0. 종료
선택: 1
몇 단을 출력하시겠습니까? 7
[7단]
7 × 1 = 7
7 × 2 = 14
...
7 × 9 = 63
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("1. 특정 단 출력");
        System.out.println("2. 전체 구구단 출력");
        System.out.print("0. 종료 : ");
        int select = sc.nextInt();

        switch (select) {
            case 1: System.out.print("몇 단을 출력하시겠습니까? : ");
                int dan =  sc.nextInt();

                System.out.printf("[%d단]", dan);
                for (int i = 1; i < 10; i++){
                    System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
                };
                break;
            case 2: for (int i = 1; i < 10; i++){
                System.out.printf("[%d단]\n", i);
                for (int j = 1; j < 10; j++){
                    System.out.printf("%d X %d = %d\n",  i, j, (j*i));
                }
                System.out.println();
            };
            break;
            case 0: break;
            default: break;
        }

    }
}
