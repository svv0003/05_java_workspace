package edu.exception.pack1.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeException1 {

    /*
기능명     method1
기능       두 수를 입력받고, 두 수의 나눈 몫을 구하기
정수(1)
정수(2)

System.out.println( );로 입력받은 정수의 나눈 몫을 구하는 식을 출력하고,
정수(2)를 0을 입력했을 때 발생하는 예외를 catch 처리한 후
"0으로 나눌 수 없습니다." 출력하기
예외 발생 여부와 관계 없이 "프로그램을 종료합니다." 출력하기
     */

    /*
단축키
윈도우     ctrl + alt + T
맥북       command + option + T

코드 블록을 드래그 한 후 단축키를 누르면 if문부터 try-catch, while문 등 코드 블록에 대한 상황을 설정할 수 있는
     */
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수의 나눈 몫을 구하기");
        System.out.print("정수(1) : ");
        int input1 = sc.nextInt();
        System.out.print("정수(2) : ");
        int input2 = sc.nextInt();
        System.out.println(input1/input2);

    }
    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수의 나눈 몫을 구하기");
        System.out.print("정수(1) : ");
        int input1 = sc.nextInt();
        System.out.print("정수(2) : ");
        int input2 = sc.nextInt();

        try {
            // 모든 코드를 작성할 필요 없다.
            // 에러가 발생할 가능성이 있는 코드만 작성하고,
            // 발생 여부에 따른 결과를 catch에 코드 작성한다.
            System.out.println("나눈 몫 : " + (input1 / input2));
        } catch (ArithmeticException e) {
            System.out.println("정수(1) : " + input1);
            System.out.println("정수(2) : " + input2);
            System.out.println("0으로 나눌 수 없습니다.");
            // 다른 방법을 시도하시겠습니까? 와 같은 행동을 유도할 수 있다.
        } catch (InputMismatchException e) {
            System.out.println("숫자 데이터만 가능합니다.");
        } catch (Exception e) {
            System.out.println("개발자가 예기치 못한 문제가 발생했습니다.");
            System.out.println("회사로 문제에 대해 보고하시겠습니까? Yes/No");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
