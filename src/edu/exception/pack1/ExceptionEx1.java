package edu.exception.pack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {

    /*
Exception
코드 처리 가능한 에러 (예외)

Exception Handling
Exception 발생 시 처리하는 구문 (예외처리)
     */

    public void method1(){
        int[] arr = {10, 20, 30, 40};

        // for (int i = 0; i < arr.length; i++){
        for (int i = 0; i <= arr.length; i++){
            System.out.println(arr[i]);
        }

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // 프로그램 실행 중 위와 같은 예외 상황이 발생하는 경우
        // 예외 상황에 맞는 코드가 수행되며, 자바 개발자가 만들어 놓은 예외 출력문을 던진 후 실행 종료된다.

        // 자바 개발자가 만든 폴더 위치와 폴더 내 존재하는 파일 (java.lang.ArrayIndexOutOfBoundsException)
        // 배열과 숫자 관련하여 문제가 발생하면 Index 숫자 out of bounds for length 숫자로
        // 어떤 상황인지 개발자한테 문제 내용을 전달할 수 있도록 만들어 놓은 것이다.
    }

    /*
예외 발생 구문을 try-catch로 처리한다. (예외 처리)

try {}
문제가 발생할 것 같은 (가능성이 있는) 코드들을 시도하는 구문

catch(예외) {}
try 구문 시도 중 예외가 발생되어 던져진 경우
catch(예외)에 작성된 예외와 던져진 예외가 같으면 잡아서 중괄호 {} 내 구문을 수행한다.
-> 발생된 예외를 잡아서 처리했기 때문에 프로그램이 멈추지 않고 정상 수행된다.

catch는 여러 번 작성 가능하다.
     */

    public void method2(){
        int[] arr = {10, 20, 30, 40};

        try {
            // 문제가 발생할 것 같은 코드를 넣는다.
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // try에서 작성한 코드 중에 개발자가 예상했을 때
            // 배열에서 index보다 더 큰 자리값을 요구할 때 발생하는 문제가 생길 것 같으면
            // 위와 같은 문제를 catch (잡아서)
            // catch (ArrayIndexOutOfBoundsException e) {}의 중괄호 {} 내에서
            // 개발자가 생각한 문제가 발행했고, 그 문제가 어떻게 발생했는지에 대해 출력한다.
            System.out.println("개발자가 예상한 문제 발생 : " + e);
            // 개발자가 예상한 문제 발생 : java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        } catch (Exception e) {
            // Exception 문서는 모든 문제들의 조상님이다.
            // 개발자가 생각하지 못한 문제까지 잡아내고, 문제에 대해 출력하는 공간이다.
            System.out.println("개발자가 예상치 못한 예외 상황 발생 : " + e);
        }
    }

    public void method3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 스캐너에 문자를 작성한 경우에 발생하는 에러");
        System.out.print("정수 입력 (1) : ");
        int input1 = sc.nextInt();
        System.out.print("정수 입력 (2) : ");
        int input2 = sc.nextInt();
        System.out.println("숫자 (1)의 결과 : " + input1 + "\n숫자 (2)의 결과 : " + input2);
        // Exception in thread "main" java.util.InputMismatchException
    }
    public void method4(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 스캐너에 문자를 작성한 경우에 발생하는 에러");
            System.out.print("정수 입력 (1) : ");
            int input1 = sc.nextInt();
            System.out.print("정수 입력 (2) : ");
            int input2 = sc.nextInt();
            System.out.println("숫자 (1)의 결과 : " + input1 + "\n숫자 (2)의 결과 : " + input2);
        } catch (InputMismatchException e) {
            // input 변수에 할당되는 자료형이 Mismatch된다.
            System.out.println("숫자만 입력하는 공간입니다.\n다시 작성해주세요");
        } catch (Exception e) {
            System.out.println("개발자가 예기치 못한 문제가 발생했습니다.");
        }
        // 숫자만 입력하는 공간입니다.
        // 다시 작성해주세요
    }

    /*
예외 발생 구문을 try-catch로 처리한다. (예외 처리)

try {}
문제가 발생할 것 같은 (가능성이 있는) 코드들을 시도하는 구문

catch(예외) {}
try 구문 시도 중 예외가 발생되어 던져진 경우
catch(예외)에 작성된 예외와 던져진 예외가 같으면 잡아서 중괄호 {} 내 구문을 수행한다.
-> 발생된 예외를 잡아서 처리했기 때문에 프로그램이 멈추지 않고 정상 수행된다.

catch는 여러 번 작성 가능하다.

finally
마지막에 반드시 수행되어야 하는 구문
try 구문에서의 예외 발생 여부와 관계 없이 무조건 수행한다.
필수가 아닌 선택에 따라 finally 구문을 사용한다.
 */

    public void method5(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 스캐너에 문자를 작성한 경우에 발생하는 에러");
            System.out.print("정수 입력 (1) : ");
            int input1 = sc.nextInt();
            System.out.print("정수 입력 (2) : ");
            int input2 = sc.nextInt();
            System.out.println("숫자 (1)의 결과 : " + input1 + "\n숫자 (2)의 결과 : " + input2);
        } catch (InputMismatchException e) {
            // input 변수에 할당되는 자료형이 Mismatch된다.
            System.out.println("숫자만 입력하는 공간입니다.\n다시 작성해주세요");
        } catch (Exception e) {
            System.out.println("개발자가 예기치 못한 문제가 발생했습니다.");
            System.out.println("회사로 오류에 대한 보고서 보내기 Yes/No");
        } finally {
            // try 작성 코드의 성공/실패에 관계 없이 마지막에 무조건 실행하는 코드
            System.out.println("예기치 못한 문제로 프로그램을 종료합니다.");
        }
        // 숫자 (1)의 결과 : 1
        // 숫자 (2)의 결과 : 2
        // 예기치 못한 문제로 프로그램을 종료합니다.

        // 숫자만 입력하는 공간입니다.
        // 다시 작성해주세요
        // 예기치 못한 문제로 프로그램을 종료합니다.
    }


}
