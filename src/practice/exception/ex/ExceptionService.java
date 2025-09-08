package practice.exception.ex;

import java.util.Scanner;

public class ExceptionService {

    public void method1() {

        int a = 10;
        int b = 0;
        try {
            // 문제가 발생할 수 있는 코드 구문 시작과 종료를 작성한다.
            System.out.println("a / b = " + (a / b));
        } catch (ArithmeticException e) {
            // 해당 문제가 발생했을 때 개발자가 프로젝트 취지에 맞도록 사용자의 행동을 유도한다.
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            // 개발자도 예기치 못한 문제에 대한 출력 구문을 작성한다.
            System.out.println("예기치 못한 문제가 발생했습니다.");
        }
    }

    public void method2() {

        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 목록은 " + arr.length + "개 존재합니다.");
            System.out.println("확인하고자 하는 목록의 인덱스를 다시 입력하세요.");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }

    public void method3() {

        String file = "파일이름txt";

        int dotIndex = file.lastIndexOf('.');
        try {
            String fileName = file.substring(0,dotIndex);
            String fileType = file.substring(dotIndex);

            System.out.println("파일명 : " + fileName);
            System.out.println("확장자명 : " + fileType);
            System.out.println("파일병과 확장자명 확인 검사를 통과했습니다.");
        } catch (StringIndexOutOfBoundsException e) {
            // 파일명에 .이 존재하지 않아서 dotIndex가 -1을 반환한다.
            System.out.println("파일명에 . 이 존재하지 않습니다.");
            System.out.println("다시 입력해주세요.");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {

        }


    }

    public void method4() {

        Scanner sc = new Scanner(System.in);
        System.out.print("파일명 입력 :");
        String input = sc.nextLine();

        int dotIndex = input.lastIndexOf('.');
        System.out.println("dotIndex : " + dotIndex);
        try {
            // dotIndex 뒤에 아무런 확장자 명칭이 없다면
            // throw new IllegalArgumentException("확장자 명칭이 없습니다.")
            // if문과 catch문을 활용해서 출력하기

            if (dotIndex == -1 || dotIndex == (input.length() - 1)) {
                throw new IllegalArgumentException("확장자 명칭이 없습니다.");
            }

            String fileName = input.substring(0, dotIndex);
            String fileType = input.substring(dotIndex);

            System.out.println("파일명 : " + fileName);
            System.out.println("확장자명 : " + fileType);
            System.out.println("파일병과 확장자명 확인 검사를 통과했습니다.");
        } catch (StringIndexOutOfBoundsException e) {
            // 파일명에 .이 존재하지 않아서 dotIndex가 -1을 반환한다.
            System.out.println("파일명에 . 이 존재하지 않습니다.");
            System.out.println("다시 입력해주세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("확장자를 제대로 입력하세요.");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            sc.close();
        }


    }
}
