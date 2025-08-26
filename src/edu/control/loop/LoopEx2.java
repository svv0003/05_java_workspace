package edu.control.loop;

// 루프 기능 설정용 클래스
// 중첩 반복문

import java.util.Scanner;

public class LoopEx2 {
    /*
    전역 변수와 지역 변수
    변수 선언 위치에 따라 접근 범위가 달라진다.
    전역 변수 (global variable) : 멤버 변수 or 필드 or 인스턴스 변수
                    인스턴스 변수 : 객체가 생성될 때 메모리에 올라간다.
                                 static 키워드 없이 선언되고,
                                 class 내에 중괄호 다음에 바로 작성하는 변수명

                      클래스 변수 : 프로그램 실행 시 한 번만 생성되고,
                                 main 내에 존재하지 않더라도 heap 아닌 static 내에 존재한다.

                                 static int 변수명 = 데이터 값;
     */

    // Scanner 변수명을 지역 변수가 아닌 전역 변수로 사용하기
    // 전역 변수로 Scanner를 작성 후 모든 메서드 내에서 sc 변수를 사용한다.
    Scanner sc = new Scanner(System.in);

    // 2단부터 9단까지 모두 출력하기
    public void Exam1() {
        for (int i=2; i<10; i++){
            System.out.printf("----%d단----\n", i);
            for (int j=1; j<10; j++){
                System.out.printf("%d X %d = %2d\n", i, j, (i*j));
            }
            System.out.println();
        }
    }
}
