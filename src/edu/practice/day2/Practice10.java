package edu.practice.day2;

import java.util.Arrays;

public class Practice10 {
    public void Exam10() {
        /*
        === 간단 로또 번호 생성기 ===
        생성된 번호: 3 7 12 18 20
        다시 생성하시겠습니까? (y/n): y
        생성된 번호: 1 5 9 15 19
        다시 생성하시겠습니까? (y/n): n
        프로그램을 종료합니다.
         */


        int[] lottery = new int[6];

        for (int i = 0; i < lottery.length; i++) {
            while (true) {
                // 중복 검사
                int randomNum = (int) (Math.random() * 45) + 1;
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (lottery[j] == randomNum) {
                        isDuplicate = true;             // 랜덤 번호가 기존 번호에 있다면 break;
                        break;                          // 중복이 있으니까 for문 탈출하기
                    }
                }
                if (!isDuplicate) {
                    lottery[i] = randomNum;
                    break;
                }
            }
        }

        // 생성된 번호 출력
        System.out.println("생성된 번호 : " + Arrays.toString(lottery));
        System.out.println("프로그램을 종료합니다.");

    }
}