package edu.exception.pack2;

/*
catch 구문 여러 개 작성하기
1) throw             : 예외 강제 발생시킨다.
2) 예외 + 다형성     : catch문 여러 개 작성 시 부모 예외를 처리하는 catch문이
                       자식 예외도 모두 잡아서 처리한다.
                       -> 부모 예외를 맨 아래 쪽에 작성해야 프로그램 상 문제가 없다.

throw 같은 경우는 자바 프로그램 상 문제가 없지만
회사 내 프로그램에서 소비자가 진행하면 안 되는 행동을 발생할 경우
진행하지 못하도록 정지 후 회사가 원하는 방향으로 프로그램 진행하도록 처리한다.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {

    /*
throw new 문제발생상황명칭Exception();

case 1: throw new ArithmeticException("개발자가 발생하는 문제 1번");
case 2: throw new NullPointerException("개발자가 발생하는 문제 2번");
case 3: throw new ClassCastException();
case 4: throw new RuntimeException();
case 0: System.out.println("프로그램 종료"); System.exit(0);
default: System.out.println("표시된 예외만 선택해 주세요.");

case에서 문제가 발생한 경우
break를 작성하지 않아도 이미 예외 발생되기 때문에
method1() 기능 자체가 중단하는 상황이 발생한다.
-> break 작성할 필요가 없고, 작성할 수도 없다.
     */

    public void method1() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("===예외 강제 발생시키기===");
            System.out.println("1. ArithmeticException");
            System.out.println("2. NullPointerException");
            System.out.println("3. ClassCastException");
            System.out.println("4. RuntimeException");
            System.out.print("예외를 선택하세요 : ");
            int choice = sc.nextInt();

            // throw new 예외()   : 개발자가 예외를 강제로 발생할 때 사용하는 구문
            switch (choice) {
                // switch문 내에 작성된 예외 때문에 어차피 예외가 발생해서 프로그램이 중지되기 때문에
                // break 작성할 필요가 없고, 작성할 수도 없다. -> 중복
                case 1: throw new ArithmeticException("개발자가 발생하는 문제 1번");
                case 2: throw new NullPointerException("개발자가 발생하는 문제 2번");
                // 소괄호 () 내에 문자열을 작성하면 에러 문구 표시될 때 같이 출력된다.
                // 아무런 문자열도 작성하지 않으면 문제 발생 상왕에 대해 어떤 문제인 지
                    // 개발자나 사용자가 알 수 없는 문제가 발생한다.
                case 3: throw new ClassCastException();
                case 4: throw new RuntimeException();
                case 0:
                    System.out.println("프로그램 종료");
                    // 프로그램 종료된다.
                    System.exit(0);
                default:
                    System.out.println("표시된 예외만 선택해 주세요.");
            }

        }

    }

    /*
try {
    switch (choice) {
                    case 1: throw new ArithmeticException("개발자가 발생하는 문제 1번");
                    case 2: throw new NullPointerException("개발자가 발생하는 문제 2번");
                    case 3: throw new ClassCastException();
                    case 4: throw new RuntimeException();
                    case 0: System.out.println("프로그램 종료"); System.exit(0);
                    default: System.out.println("표시된 예외만 선택해 주세요.");
                }
} catch (InputMismatchException e) { System.out.println("input 내에 버퍼가 남아있습니다."); sc.nextLine();
} catch (ArithmeticException e) { System.out.println("계산적인 문제가 발생했습니다."); System.out.println("아래 단게에 따라 문제를 해결합시다.");
} catch (NullPointerException e) { System.out.println("참조하는 객체가 없습니다."); System.out.println("그런데 객체를 참고하여 프로그램을 진행한다고 합니다.");
} catch (ClassCastException e) { System.out.println("클래스 참조 문제 발생");  System.out.println("부모 클래스 공간에서 자식 클래스 메서드를 실행했을 때 ");
} catch (RuntimeException e) { System.out.println("프로그램 실행 중 발생한 예외 처리 완료");
}

특정 문제가 발생했을 경우
현재 진행 중인 기능을 잠시 중단 후 문제 해결하고,
문제가 해결되면 다음 기능을 수행하도록 되어있기 때문에 break; 처리하지 않는다.
throw new 자체에 return이나 break가 내장되어 있는 것과 같은 효과를 지니기 때문에
break; 처리하는 것은 break;를 이중 작성하는 것과 같아서 오류가 발생한다.
     */

    public void method2() {
        Scanner sc = new Scanner(System.in);
        while (true) {

            try {
                System.out.println("===예외 강제 발생시키기===");
                System.out.println("1. ArithmeticException");
                System.out.println("2. NullPointerException");
                System.out.println("3. ClassCastException");
                System.out.println("4. RuntimeException");
                System.out.print("예외를 선택하세요 : ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: throw new ArithmeticException("개발자가 발생하는 문제 1번");
                    case 2: throw new NullPointerException("개발자가 발생하는 문제 2번");
                    case 3: throw new ClassCastException();
                    case 4: throw new RuntimeException();
                    case 0:
                        System.out.println("프로그램 종료");
                        System.exit(0);
                    default:
                        System.out.println("표시된 예외만 선택해 주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("input 내에 버퍼가 남아있습니다.");
                // 입력 버퍼에 잘못 들어간 값을 제거한다.
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("계산적인 문제가 발생했습니다.");
                System.out.println("아래 단게에 따라 문제를 해결합시다.");
                // 산술적인 문제에 대한 대안을 개발자가 코드로 작성해서 원활하게 진행하도록 설정한다.
            } catch (NullPointerException e) {
                System.out.println("참조하는 객체가 없습니다.");
                System.out.println("그런데 객체를 참고하여 프로그램을 진행한다고 합니다.");
                // 특정 객체를 참조하지 못하는 대안을 개발자가 코드로 작성해서 원활하게 진행하도록 설정한다.
            } catch (ClassCastException e) {
                System.out.println("클래스 참조 문제 발생");
                System.out.println("부모 클래스 공간에서 자식 클래스 메서드를 실행했을 때 ");
            }  catch (RuntimeException e) {
                System.out.println("프로그램 실행 중 발생한 예외 처리 완료");
            }

        }

    }

    public void method3() {
        try {
            // 각종 예외 강제 발생시키기
        } catch (Exception e) {
            /*
            맨 위에 Exception을 작성하면 모든 예외가 이곳에서 처리되기 때문에
            아래 catch 구문으로 예외 상황에 따른 대응을 작성하더라도
            대응 처리를 하지 못하기 때문에 맨 아래 작성하는 것이다.
             */
            System.out.println("예외는 어떤 예외들이 뜨는지 확인 후 위에\ncatch (문제 상황 e)를 활용해서 개발자가 예상하는 문제 상황들을 추가하고,\n상황에 맞게 대비하는 것이 좋다.");
        }
    }
}
