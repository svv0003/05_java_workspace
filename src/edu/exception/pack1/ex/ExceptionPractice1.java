package edu.exception.pack1.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice1 {

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

코드 블록을 드래그 한 후 단축키를 누르면 if문부터 try-catch, while문 등
코드 블록에 대한 상황을 설정할 수 있는 블록 목록이 표시된다.
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

    /**
     * 문제 2: method2()
     * 기능명칭 : 배열 값 조회
     * 크기가 5인 정수 배열을 생성하고 {10, 20, 30, 40, 50} 으로 초기화
     * 사용자에게 "조회할 인덱스 번호 입력 : " 메시지 출력 후 입력받기
     *
     * System.out.println("배열의 " + 인덱스 + "번째 값 : " + arr[인덱스]);
     * 에 대해 수행하고,
     * 배열 범위를 벗어난 인덱스 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("배열의 범위를 벗어났습니다. (0~4 사이의 숫자를 입력하세요)");
     *
     * 성공 실패 관계 없이 "배열 조회를 완료했습니다." 출력
     */
    public void method3() {
        // 여기에 코드 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 조회하기");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("조회할 idx : ");

        try {
            int input = sc.nextInt();
            System.out.println("배열의 " + input + "번째 값 : " + arr[input]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났습니다. (0~4 사이의 숫자를 입력하세요)");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("배열 조회를 완료했습니다.");
        }
    }

    /**
     * 문제 3: method3()
     * 기능명칭 : 문자열을 숫자로 변환
     * 사용자에게 "숫자 형태의 문자열 입력 : " 메시지 출력 후 입력받기
     *
     * int number = Integer.parseInt(입력받은문자열);
     * System.out.println("변환된 숫자 : " + number);
     * System.out.println("변환된 숫자 * 2 = " + (number * 2));
     * 에 대해 수행하고,
     * 숫자가 아닌 문자열 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("숫자 형태가 아닙니다. 올바른 숫자를 입력해주세요.");
     *
     * 성공 실패 관계 없이 "문자열 변환 작업을 종료합니다." 출력
     */
    public void method4() {
        // 여기에 코드 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 형태의 문자열을 숫자로 변환하기");
        System.out.print("변환할 숫자 문자열 : ");

        try {
            String input = sc.nextLine();
            // (숫자)문자열을 숫자로 변환하는 방법
            // 문자열에 숫자가 아닌 문자를 사용하면 NumberFormatException 에러 발생한다.
            // 문자 (char)를 ASCII 코드 값으로 변환하는 강제 형변환과 다르다.
            int number = Integer.parseInt(input);
            System.out.println("변환된 숫자 : " + number);
            System.out.println("변환된 숫자 * 2 = " + (number * 2));
        } catch (NumberFormatException e) {
            System.out.println("숫자 형태가 아닙니다. 올바른 숫자를 입력해주세요.");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("문자열 변환 작업을 종료합니다.");
        }
    }

    /**
     * 문제 4: method4()
     * 기능명칭 : Scanner로 정수 입력받기
     * 사용자에게 "나이를 입력하세요 : " 메시지 출력 후 정수로 입력받기
     *
     * int age = sc.nextInt();
     * System.out.println("입력된 나이 : " + age + "세");
     * System.out.println("10년 후 나이 : " + (age + 10) + "세");
     * 에 대해 수행하고,
     * 정수가 아닌 값(문자, 실수 등) 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("정수만 입력 가능합니다. 다시 실행해주세요.");
     *
     * 성공 실패 관계 없이 "나이 입력 프로그램을 종료합니다." 출력
     */
    public void method5() {
        // 여기에 코드 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("Scanner 정수 입력받기");
        System.out.print("나이를 입력하세요 : ");

        try {
            int input = sc.nextInt();
            System.out.println("입력된 나이 : " + input + "세");
            System.out.println("10년 후 나이 : " + (input + 10) + "세");
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력 가능합니다. 다시 실행해주세요.");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("나이 입력 프로그램을 종료합니다.");
        }
    }

    /**
     * 문제 5: method5()
     * 기능명칭 : 문자열 길이 체크
     * 사용자에게 "문자열을 입력하세요 : " 메시지 출력 후 입력받기
     * 만약 입력값이 null이면 강제로 NullPointerException 발생시키기
     * (입력받은 후 inputStr = null; 로 설정)
     *
     * System.out.println("입력된 문자열 : " + inputStr);
     * System.out.println("문자열의 길이 : " + inputStr.length());
     * 에 대해 수행하고,
     * NullPointerException 발생 시
     * catch 처리 한 후
     * System.out.println("문자열이 null입니다. 처리할 수 없습니다.");
     *
     * 성공 실패 관계 없이 "문자열 길이 체크를 완료합니다." 출력
     */
    public void method6() {
        // 여기에 코드 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 길이 체크");
        System.out.print("문자열을 입력하세요 : ");

        try {
            String input = sc.nextLine();
            // 입력받은 값에 null 설정해서 덮어쓰기
            input = null;
            System.out.println("입력된 문자열 : " + input);
            System.out.println("문자열의 길이 : " + input.length());
        } catch (NullPointerException e) {
            System.out.println("문자열이 null입니다. 처리할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("문자열 길이 체크를 완료합니다.");
        }
    }

    /**
     * 문제 6: method6()
     * 기능명칭 : 파일명 확장자 추출
     * 사용자에게 "파일명을 입력하세요 (예: test.txt) : " 메시지 출력 후 입력받기
     *
     * String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
     * System.out.println("파일명 : " + fileName);
     * System.out.println("확장자 : " + extension);
     * 에 대해 수행하고,
     * '.'이 없는 파일명 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("올바른 파일명이 아닙니다. 확장자가 포함된 파일명을 입력하세요.");
     *
     * 성공 실패 관계 없이 "파일명 처리를 완료했습니다." 출력
     */
    public void method7() {
        // 여기에 코드 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명 확장자 추출");
        System.out.print("파일명을 입력하세요. (예: example.txt) : ");
        String input = sc.nextLine();
        // String extension = input.substring(input.lastIndexOf(".") + 1);
        // input.lastIndexOf(".") == -1
        int dotIndex = input.lastIndexOf(".");
        System.out.println("dotIndex : " + dotIndex);

        // 만약에 . 없거나 마지막 문자가 . 인 경우
        // -> 확장자 없다?
        // -> 아래 기능 실행하지 못하도록 강제로 예외 상황 발생시키기.
        if (dotIndex == -1) {
             // 에러 문구 출력하는 기능?
            throw new StringIndexOutOfBoundsException("확장자가 존재하지 않습니다.");
        }


        String extension = input.substring(dotIndex + 1);
        // 점이 없으면 dotIndex의 반환값은 -1
        // charAt(0)에서 빈 문자열 발생해서 예외 유도한다.
        extension.charAt(0);
        System.out.println("파일명 : " + input);
        System.out.println("확장자 : " + extension);
        System.out.println("올바른 파일명이 아닙니다. 확장자가 포함된 파일명을 입력하세요.");
        System.out.println("파일명 처리를 완료했습니다.");


    }
    public void method8() {
        // 여기에 코드 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명 확장자 추출");
        System.out.print("파일명을 입력하세요. (예: example.txt) : ");
        try {
            String input = sc.nextLine();
            int dotIndex = input.lastIndexOf(".");
            System.out.println("dotIndex : " + dotIndex);
            if (dotIndex == -1) {
                throw new StringIndexOutOfBoundsException("확장자가 존재하지 않습니다.");
            }
            String extension = input.substring(dotIndex + 1);
            extension.charAt(0);
            System.out.println("파일명 : " + input);
            System.out.println("확장자 : " + extension);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("올바른 파일명이 아닙니다. 확장자가 포함된 파일명을 입력하세요.");
        } catch (Exception e) {
            System.out.println("파일명 처리를 완료했습니다.");
        } finally {
            System.out.println("파일명 처리를 종료합니다.");
        }


    }



}
