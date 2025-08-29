package edu.oop.method;

// Student 속성을 활용한 기능 제공 클래스

import java.util.Scanner;

public class StudentService {

    // 필드
    private Scanner sc = new Scanner(System.in);
    // Scanner에 private을 작성하는 건 어떤 설정이지?
    // 애초에 이 클래스에서만 입력을 받는 것 아닌가?


    // 메서드
    // 메인 메뉴를 제공하는 화면 = HTML 대신 활용하는 화면
    // displayMenu를 html 화면으로 데이터 보낸다고 생각하기!!!
    // 메서드 속에서 new 연산자를 사용해서 객체를 생성하고, 생성된 객체의 속성을 작성할 수 있는 반복문을 설정한다.
    public void displayMenu() {
        int input;         // Scanner로 입력받은 메뉴 번호를 저장할 변수를 선언  -> int 변수의 기본값은 0.

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



        // Scanner는 input textarea 대신 사용하고,
        // System은 div, p, span, a 등의 태그 대신 사용한다.
        // -> HTML과 Java를 연결하면 HTML 화면을 이용한다.
        // Scanner는 사용하지 않고, System은 개발자가 데이터를 무사히 전달하고, 사용하고 있는지 확인하는 용도로 쓰인다.

        // print println printf는 개발자가 출력을 확인하기 위해서 사용할 뿐
        // 사용자는 HTML에서 출력 결과를 확인하기 때문에 별도로 프로그램 연결이 필요하다.
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
                    int select = sc.nextInt();
                    if (select == 1) {
                        System.out.println("이미 학생이 등록되어 있는 번호입니다.");
                        return;
                    }
                    else {
                        System.out.println("조회되는 학생 정보가 존재하지 않습니다.");
                        System.out.println("학생 등록을 시작합니다.");
                        // 학생 등록을 위한 메서드 호출한다.
                        st2 = createStudent();
                    }
                    break;
                case 2:
                    System.out.println("학생 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1 = std1\n2 = std2\n3 = std3 : ");
                    select = sc.nextInt();

                    // 같은 내용을 여러 번 작성하지 않기 위해 하나의 메서드 (기능)으로 작성하고 재사용하기
                    /*
                    if (selected == 1) {
                        System.out.println("학생 이름 : " + st1.getName());
                        System.out.println("학생 번호 : " + st1.getStudentNumber());
                        System.out.println("학생 성별 : " + st1.getGender());
                    } else {
                        System.out.println("학생 이름 : " + st2.getName());
                        System.out.println("학생 번호 : " + st2.getStudentNumber());
                        System.out.println("학생 성별 : " + st2.getGender());
                    }
                    */

                    if (select == 1) {
                        studentInform(st1);
                    } else {
                        // html 화면 대신 print 출력 화면으로 데이터가 무사히 나오는 지 확인한다.
                        studentInform(st2);
                        // studentInform(st2);  -> html 연결 후에는 이와 같은 형태로 데이터를 html로 전달한다.
                    }
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다."); return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }
    }

    private Student createStudent() {
        System.out.print("이름 : ");
        String createName = sc.next();
        System.out.print("학번 : ");
        String createNumber = sc.next();
        System.out.print("성별 : ");
        char createGender = sc.next().charAt(0);

        // sc.next().charAt(0);
        // sc.next()로 입력받은 문자열 중에서 0번째 인덱스 문자 하나를 반환 받아서 createGender 변수에 저장하기.
        return new Student(createName, createNumber, createGender);
    }

    /**
     * 학생 정보 확인하는 메서드
     *
     * 매개변수로 전달받은 학생 정보를 문자열로 만들어서 반환한다.
     *      출력할 목적이라면 printf 사용해도 되지만
     *      변수에 담아서 return 반환할 목적으로 String.format을 사용한다.
     *
     * @param 특정학생  : st1 또는 st2 변수명의 데이터가 들어올 자리
     * @return        : 학생 정보가 작성된 문자열
     *                  html 연결 후에는 OOO 주소로 이동시켜서 데이터를 전달하겠다 와 같은 역할
     *
     * private void studentInform(Student 특정학생) {             // return을 사용하지 않아서 반환하지 않을 때
     */
    private String studentInform(Student 특정학생) {              // "특정함수" 매개변수의 자료형은 Student 객체
        // String.format("패턴", 변수)
        // 패턴 모양의 문자열을 반환하는 String 메서드
        // printf와 비슷하지만 print, 즉 출력하는 기능이지만 위 기능은 반환하는 기능이다?

        // Student 클래스 모형으로 담긴 학생의 데이터가 존재하면 값을 출력한다.
        // 존재하지 않으면 null이나 0으로 출력된다.
        String a = String.format("%s / %s / %c", 특정학생.getName(), 특정학생.getStudentNumber(), 특정학생.getGender());
        return a;
    }

}
