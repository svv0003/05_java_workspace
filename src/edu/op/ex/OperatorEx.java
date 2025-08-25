package edu.op.ex;

// 폴더위치 + 파일이름 생성 방법
// . 활용해서 폴더 구분 후 파일명칭 작성
// edu.op.ex.OperatorEx

// 기능 작성용 클래스

import java.util.Scanner;

public class OperatorEx {
    // 자바에서는 모든 기능을 class 내부에 작성하기 때문에 대부분의 기능을 메서드 형태로 사용한다.
    // 파일명.기능명() 형태
    public void test() {
        System.out.println("test");
    }
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        boolean isTrue = (num1 % 3 == 0);

        // %d = decimal
        // %b = boolean
        System.out.printf("%d는 3의 배수입니다. : %b", num1, isTrue);
    }
    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        if (num1 % 3 == 0){
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
    // void : 반환할 값이 존재하지 않고, 단순 출력만 진행하는 기능을 뜻한다.
    /*
    자바라는 언어는
    (변수) 바구니 속 데이터가 숫자, 문자, 사람이 만든 크기, 실수 등 데이터를 담을 변수명의 종류부터

    기능을 실행할 때 기능을 실행만 하면 되는 것인지?
        public void 기능명칭 (매개변수, 파라미터) {
            수행할 기능 작성
        }
    실행 결과를 어딘가에 전달하는 기능인지?
        public 전달할자료형 기능명칭 (매개변수, 파라미터) {
        수행할 기능 작성
        return 전달할데이터;
    }
    프로그램을 수행하기 전에 정의해야 할 사항이 많다.
     */
    public void method3() {
        // Scanner 처럼 동일한 클래스는 최초 1회만 호출 후 여러 번 사용 가능하다.
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자 : ");
        int input1 = sc.nextInt();
        System.out.println("두 번째 숫자 : ");
        int input2 = sc.nextInt();
        boolean isTrue = (input1 % input2 == 0);
        System.out.printf("%d는 %d의 배수가 맞는가? %b",  input1, input2, isTrue);
    }
    public void method4() {
        // void : return 없이 오직 실행만 한다.
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int input = sc.nextInt();

        // 삼항 연산자
        // 조건식 ? (참) : (거짓);
        // isTrue의 변수값이 True라면 (참) 기능 설정
        //                False라면 (거짓) 기능 설정

        // if (조건식) {
        //   조건식이 true라면 실행
        // } else {
        //   조건식이 false라면 실행
        // }

        // 에서 if와 (), {}를 생략하여 = ? : 으로 표현한 연산식
        boolean isTrue = input % 2 == 0;

        String result = isTrue ? "짝수" : "홀수";
        System.out.printf("%d는 %s입니다.", input, result);
    }
}
