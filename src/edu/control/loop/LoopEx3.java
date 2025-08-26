package edu.control.loop;

// 루프 기능용 클래스
// 문자열 / while문 기능 작성

import java.util.Scanner;

public class LoopEx3 {
    Scanner sc = new Scanner(System.in);

    /*
    문자열.charAt(인덱스) : 인덱스 번째 문자 하나를 얻어와서 반환하는 메서드
    문자열.length()     : 문자열의 길이 반환하는 메서드

    문자열 (String) = 문자 + 나열
     */
    // 문자열을 한 글자씩 출력하기
    public void Exam1(){
        String str = "Hello World!!";

        // str 문자열의 총 길이를 length() 메서드로 활용하여 가져와서
        // 문자열의 문자 하나씩 charAt으로 출력하는 기능
        for (int i = 0; i < str.length(); i++){
            System.out.print("%d 인덱스의 값 : ");
            System.out.println(str.charAt(i));
        }
    }
    // -1 입력될 때까지 정수를 계속 입력 받아서 합계 구하기
    public void Exam2(){
        int num = 0;
        int sum = 0;

        System.out.println("-1을 입력하면 종료됩니다.");

        while (num != -1) {
            System.out.print("숫자를 입력하시오 : ");
            num = sc.nextInt();
            if (num != -1) {
                sum += num;
            }
        }
        System.out.println("합계: " + sum);
    }
    // 0 입력될 때까지 정수를 계속 입력 받아서 합계 구하기
    public void Exam3(){
        int sum = 0;

        System.out.println("0 입력하면 종료됩니다.");

        while(true){
            System.out.print("숫자를 입력하시오 : ");
            int num = sc.nextInt();

            if (num == 0) break;
            else sum += num;
        }
        System.out.println("합계 : " + sum);
    }
    /*
    do while문
    조건식이 뒤에 작성된 while문
    최소 1회 이상은 반복을 무조건 보장
    while문이 false라도 최초 1회는 무조건 코드 실행
     */
    // 0 입력될 때까지 정수를 입력 받고, 합계 출력
    public void Exam4(){
        int sum = 0;
        int num = 0;

        do {    // 입력 값이 0 아닐 때 반복
            System.out.print("숫자를 입력하시오 : ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0); // 반복문 진행하는 조건 (false 되기 전까지 위 코드 수행)
        System.out.println("합계 : " + sum);
    }
    // 문자열을 입력 받아서 i-- 사용, 거꾸로 출력하도록 작성하기
    public void Exam5(){
        System.out.print("문자열을 입력하시오 : ");
        String str = sc.nextLine();

        for (int i = str.length(); i > 0; i--){
            System.out.print(str.charAt(i-1) + " ");
        }
    }
    /*
    Math.random()               0.0 <= x < 1.0
    Math.random() * 10          0.0 <= x < 10.0
    Math.random() * 10 + 1      1.0 <= x < 10.0

    (정수)(= 소수점 이하 제거)
    (int)(Math.random() * 10) + 1     1 <= x < 10
    (int)(Math.random() * 10 + 1)     1 <= x < 10
     */
    // 1~10 사이 랜덤 숫자를 입력해서 맞추는 게임 만들기
    public void Exam6(){
        int random = (int)(Math.random() * 10) + 1;
        int count = 0;
        // System.out.println("정답 : " + random);

        System.out.println("1부터 10 사이의 숫자를 맞추십시오.");
        while (true){
            ++count;
            System.out.printf("%d try - 숫자를 입력하시오 : ", count);
            int num = sc.nextInt();

            if (num < 1 || num > 10) System.out.println("1부터 10 사이의 숫자를 입력하세요");
            else {
                if (num == random){
                    System.out.printf("Correct!!\n정답 : %d\n시도 : %d", random, count);
                    break;
                }
                if (num > random) System.out.println("DOWN");
                if (num < random) System.out.println("UP");
            }
        }
    }
}
