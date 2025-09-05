package edu.exception.pack2.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {

    // 문제 1: 나이 입력 검증
    // 나이를 입력받아서 0보다 작거나 150보다 크면 직접 예외를 발생시키세요
    public void problem1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");

        try {
            int age = sc.nextInt();
            // 여기에 조건문을 작성하고 예외를 직접 발생시키세요
            // 힌트: throw new IllegalArgumentException("메시지");
            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("입력된 값이 나이 범위를 넘어섰습니다.");
            }
            System.out.println("입력하신 나이: " + age + "세");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요.");
        } finally {
            System.out.println("나이 검증이 완료되었습니다.");
        }
    }

    // 문제 2: 비밀번호 강도 검사
    // 비밀번호가 8자 미만이면 예외를 발생시키세요
    public void problem2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요 (8자 이상): ");

        try {
            String password = sc.nextLine();
            // 여기에 비밀번호 길이를 체크하고 예외를 발생시키세요
            // 힌트: throw new RuntimeException("메시지");
            if (password.length() < 8) {
                throw new IllegalArgumentException("비밀번호는 8자 이상 작성해야 합니다.");
            }
            System.out.println("비밀번호가 설정되었습니다.");
        } catch (RuntimeException e) {
            System.out.println("비밀번호 오류: " + e.getMessage());
        } finally {
            System.out.println("비밀번호 검사를 완료했습니다.");
        }
    }

    // 문제 3: 성적 등급 계산
    // 점수가 0~100 범위를 벗어나면 예외를 발생시키세요
    public void problem3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (0~100): ");

        try {
            int score = sc.nextInt();
            // 여기에 점수 범위를 체크하고 예외를 발생시키세요
            // 힌트: throw new IllegalArgumentException("메시지");
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("점수는 0~100점 사이를 작성해야 합니다.");
            }
            if (score >= 90) System.out.println("등급: A");
            else if (score >= 80) System.out.println("등급: B");
            else if (score >= 70) System.out.println("등급: C");
            else if (score >= 60) System.out.println("등급: D");
            else System.out.println("등급: F");
        } catch (IllegalArgumentException e) {
            System.out.println("점수 오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("올바른 숫자를 입력해주세요.");
        } finally {
            System.out.println("성적 처리를 완료했습니다.");
        }
    }

    // 문제 4: 이메일 형식 검사
    // 이메일에 '@'가 없거나 '.'이 없으면 예외를 발생시키세요
    public void problem4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이메일을 입력하세요: ");

        try {
            String email = sc.nextLine();
            // 여기에 이메일 형식을 체크하고 예외를 발생시키세요
            // 힌트1: email.contains("@") 로 '@' 포함 여부 확인
            // 힌트2: throw new IllegalArgumentException("메시지");

            if (!email.contains("@") || !email.contains(".")) {
                throw new IllegalArgumentException("이메일 형식을 맞춰 작성하세요.");
            }
            System.out.println("유효한 이메일: " + email);

        } catch (IllegalArgumentException e) {
            System.out.println("이메일 형식 오류: " + e.getMessage());
        } finally {
            System.out.println("이메일 검증을 완료했습니다.");
        }
    }

    // 문제 5: 계산기 (0으로 나누기 방지)
    // 두 번째 숫자가 0이면 직접 예외를 발생시키세요
    public void problem5() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자: ");
            int num2 = sc.nextInt();
            // 여기에 두 번째 숫자가 0인지 체크하고 예외를 발생시키세요
            // 힌트: throw new ArithmeticException("메시지");
            if (num2 == 0) {
                throw new ArithmeticException("분모를 0으로 설정할 수 없습니다.");
            }
            double result = (double) num1 / num2;
            System.out.println("결과: " + result);

        } catch (ArithmeticException e) {
            System.out.println("계산 오류: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력하세요.");
        } finally {
            System.out.println("계산을 완료했습니다.");
        }
    }
}
/*
단축키
chrl + shift + F
인텔리제이에 검색해서 특정 단어나 변수명 찾기

프론트엔드에서 예외 처리를 하더라도
백엔드에서도 회사나 프로그램이 진행하고자 하는 방향과
다른 상황이 발생하는 경우,
프로그램이 진행되지 않도록 백엔드에서도 예외 처리를 진행하여
기능을 중지하는 상황을 만들어야 한다.

프로그램에서 원하는 상황으로 진행할 수 있도록
개발자가 프로그램 흐름을 한 번 더 설정하는 것이다.
 */
