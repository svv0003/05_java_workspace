package edu.oop.method;

// Student 속성을 활용한 기능 제공 클래스

import java.util.Scanner;

public class StudentService {

    // 필드
    private Scanner sc = new Scanner(System.in);
    // Scanner에 private을 작성하는 건 어떤 설정이지?
    // 애초에 이 클래스에서만 입력을 받는 것 아닌가?


    // 메인 메뉴를 제공하는 화면
    public void displayMenu() {
        int input;                      // Scanner로 입력받은 메뉴 번호를 저장할 변수를 선언  -> int 변수의 기본값은 0.

        // 학생 객체를 참조할 참조형 변수 선언  -> String 변수의 기본값은 null.
        // 필수생성자로 객체 생성한다.
        // 매개변수로 속성 값 작성한다.
        Student st1 = new Student("홍길동", "123456", '남');

        // Student 클래스의 참조형 변수 st2만 선언했을 뿐,
        // new 연산자를 작성하지 않아서 아직 객체가 생성된 상태는 아니다.
        Student st2 = null;                             // name stNumber gender java html와 같은 속성 변수명 자체가 없는 상태

        // 기본생성자로 객체 생성한다.
        // setter나 매개변수로 필드 값이 작성되지 않아서
        // 아직 객체의 속성은 선언되었지만 아직 속성 값은 없는 상태이다.
        Student st3 = new Student();                    // name stNumber gender java html와 같은 속성 변수명만 선언된 상태



        //
        // Scanner는 input textarea 대신 사용하고,
        // System은 div, p, span, a 등의 태그 대신 사용한다.
        // -> HTML과 Java를 연결하면 HTML 화면을 이용한다.
        // Scanner는 사용하지 않고, System은 개발자가 데이터를 무사히 전달하고, 사용하고 있는지 확인하는 용도로 쓰인다.
        while (true) {
            System.out.println("""
===학생 관리 프로그램===
1. 학생 등록하기
2. 학생 정보 확인하기
3. 학생 이름 수정하기
4. Java 공부하기
5. HTML 공부하기
6. Java 역량 비교하기
7. HTML 역량 비교하기
8. 프로그램 종료
                    """);

            // Java 언어로만 데이터 출력과 저장을 확인할 때만 label 태그 대신 사용한다.
            System.out.print("메뉴 선택 : ");

            // input type = number 대신 사용한다.
            input = sc.nextInt();

            // 입력 값에 따른 결과를 반환하거나 동작을 수행한다.
            switch (input) {
                case 1:
                    System.out.println("학생을 등록할 변수를 선택하세요.");
                    System.out.println("1 = std1\n2 = std2\n3 = std3");
                    int selected = sc.nextInt();
                    if (selected == 1) {
                        System.out.println("이미 학생이 등록되어 있는 번호입니다.");
                        return;
                    }
                    else {
                        System.out.println("학생 등록을 시작합니다.");
                        // 학생 등록을 위한 메서드 호출한다.
                    }; break;
                case 2:
                    System.out.println("프로그램을 종료합니다."); break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }








        }
        // print println printf는 개발자가 출력을 확인하기 위해서 사용할 뿐
        // 사용자는 HTML에서 출력 결과를 확인하기 때문에 별도로 프로그램 연결이 필요하다.










    }

}
