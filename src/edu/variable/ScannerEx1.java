package edu.variable;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        /*
        * Scanner 클래스
        * - 사용자로부터 입력을 받기 위해 Java에서 제공하는 클래스
        * - 추후에 추가된 기능
        * - java.util 패키지에 존재한다.
        * -> import 구문 작성해야 한다.
        * -> java.util 내부 폴더 안에 만들어진 Scanner class를 호출하여 사용 가능하다.
        *
        * 외부 라이브러리 > 자바 버전 폴더 > java.base 폴더 > 유틸 폴더 내부에 존재한다.
        *
        * Scanner.next()        : 단어 (String) 1개 입력
        *                           공백 문자 입력 시 입력 종료된다.
        * Scanner.nextLine()    : 문자열 (String) 1개 입력
        *                           엔터 (개행 문자) 입력 시 입력 종료된다.
        * Scanner.nextInt()     : int형 정수 1개 입력
        * Scanner.nextLong()    : long형 정수 1개 입력
        * Scanner.nextDouble()  : 실수 1개 입력
        *
        * */

        // Scanner 사용하기
        // 1. 클래스 위에 import 구문 작성한다.
        // 2. import한 Scanner 클래스를 이용해서 Scanner 객체 생성한다.
        // * System.in : 인텔리제이 실행창이나 CLI (cmd = 명령 프롬포트) 창에서 키보드로 입력한다.

        Scanner sc = new Scanner(System.in);

        /*
         * 자바스크립트에서는 변수 값의 구분 (문자열, 숫자, 논리형 등)이 존재하지 않았지만
         * 자바에서는 각 변수마다 메모리 할당을 측정하기 위해서 변수명 내부에 넣어줄 값의 종류를 작성하고,
         * 그 종류에 해당하는 값만 적성해야 한다.
         * 그렇지 않으면 Mismatch와 같은 Exception 예외 상황이 발생했다는 알림이 발생한다.
         * */


        System.out.print("정수 입력 1 : ");
        int num1 = sc.nextInt();         // 다음 입력된 정수를 얻어와서 num1에 대입하기
                                            // 컴퓨터에서 num1이라는 변수명에 사용자가 작성한 숫자 값이 들어있다.
        // 자바 print() 괄호 내에는 콤마(,)가 아닌 +를 이용해서 출력 구문 작성한다.
        // printf()만 예외적으로 콤마(,) 사용할 수 있다.
        // System.out.println("num1에 들어있는 숫자 : ", num1);
        System.out.println("num1에 들어있는 숫자 : " + num1);

        System.out.print("정수 입력 2 : ");
        int num2 = sc.nextInt();

        System.out.print("실수 입력 1 : ");
        double num3 = sc.nextDouble();

        System.out.print("단어 입력 (2개) : ");
        String word1 = sc.next();
        String word2 = sc.next();        // 공백의 엔터가 남아 있어서 다음 문장 입력에 공백이 입력된다.
                                            // 공백 처리를 위해 sc.nextLine();을 사용해서 공백 담아내는 기능 설정한다.

        /*
        * next() / nextInt() / nextDouble() 등을 작성한 이후에
        * nextLine()을 작성해야 하는 상황이 오면
        * nextLine()을 미리 한 번 작성하기
        * */

        sc.nextLine();

        System.out.print("문장 입력 : ");
        String str1 = sc.nextLine();

        System.out.println("num1에 들어있는 숫자 : " + num1);
        System.out.printf("%d, %d, %f, %s, %s, %s", num1, num2, num3, word1, word2, str1);








    }
}
