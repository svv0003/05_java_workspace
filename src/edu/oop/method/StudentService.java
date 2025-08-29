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
                    System.out.println("1 = st1\n2 = st2\n3 = st3");
                    int select = sc.nextInt();
                    if (select == 1) {
                        System.out.println("이미 학생이 등록되어 있는 번호입니다.");
                        return;
                    }
                    else {
                        System.out.println("조회되는 학생 정보가 존재하지 않습니다.");
                        System.out.println("학생 등록을 시작합니다.");
                        // 학생 등록을 위한 메서드 호출한다.
                        // st2 = new Student(createName, createNumber, createGender);
                        // return 반환값으로 위 내용의 객체를 받아와서 st2에 할당한다.
                        st2 = createStudent();

                        // 학생 등록이 잘 되었는지 학생 정보를 출력해서 확인한다.
                        System.out.println(studentInform(st2));
                    }
                    break;
                case 2:
                    System.out.println("학생 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1 = st1\n2 = st2\n3 = st3 : ");
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
                        // studentInform(st1);          // 반환값은 출력되지 않으니까 print 구문으로 작성해야 한다.
                        System.out.println(studentInform(st1));
                    } else if (select == 2) {
                        // html 화면 대신 print 출력 화면으로 데이터가 무사히 나오는 지 확인한다.
                        System.out.println(studentInform(st2));
                        // studentInform(st2);  -> html 연결 후에는 이와 같은 형태로 데이터를 html로 전달한다.
                        // 아직까지는 st2 객체가 생성되지 않았기 때문에 에러 발생하지만
                        // 학생 등록 (1번)을 마치고 나서 조회하면 입력된 정보로 조회된다.
                    } else {
                        System.out.println(studentInform(st3));
                    }
                    break;
                case 3:     // 마이페이지 - 회원정보 수정 메뉴
                    System.out.print("이름 수정할 학생 선택하세요. (1 = st1 / 2 = st2) : ");
                    select = sc.nextInt();
                    if (select == 1) {
                        // 회원정보 수정을 진행한다.
                        updateStudentName(st1);
                        // 수정된 결과를 확인한다.
                        System.out.println(studentInform(st1));
                    }
                    else {
                        // 회원정보 수정을 진행한다.
                        updateStudentName(st2);
                        // 수정된 결과를 확인한다.
                        System.out.println(studentInform(st2));
                    }
                    break;
                case 4:     // 관리자 페이지 - Java 역량 탭
                    System.out.print("Java 역량을 수정할 학생을 선택하세요. (1 = st1 / 2 = st2) : ");
                    select = sc.nextInt();
                    if (select == 1) {
                        updateJava(st1);
                        System.out.println(studentInform(st1));     // 실제 HTML에서는 새로고침 같은 기능을 사용할 예정이다.
                    } else {
                        updateJava(st2);
                        System.out.println(studentInform(st2));
                    }
                    break;
                case 5:     // 관리자 페이지 - HTML 역량 탭
                    System.out.print("HTML 역량을 수정할 학생을 선택하세요. (1 = st1 / 2 = st2) : ");
                    select = sc.nextInt();
                    if (select == 1) {
                        updateHTML(st1);
                        System.out.println(studentInform(st1));     // 실제 HTML에서는 새로고침 같은 기능을 사용할 예정이다.
                    } else {
                        updateHTML(st2);
                        System.out.println(studentInform(st2));
                    }
                    break;
                case 6:     // Java 역량 비교에 대한 결과 확인
                    System.out.println(compareJava(st1, st2));
                    break;
                case 7:     // HTML 역량 비교에 대한 결과 확인
                    System.out.println(compareHtml(st1, st2));
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다."); return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }
    }

    /**
     * 학생 정보를 입력 받아서 생성된 Student 객체를 반환한다.
     * @return
     */
    private Student createStudent() {
        System.out.print("이름 : ");
        String createName = sc.next();
        System.out.print("학번 : ");
        String createNumber = sc.next();
        System.out.print("성별 (남/여) : ");
        char createGender = sc.next().charAt(0);

        // sc.next().charAt(0);
        // sc.next()로 입력받은 문자열 중에서 0번째 인덱스 문자 하나를 반환 받아서 createGender 변수에 저장하기.
        return new Student(createName, createNumber, createGender);
        // Student st1 = new Student(createName, createNumber, createGender);
        // st1 new 연산자와 객체에 입력되는 매개변수, 즉 속성들의 값만 return으로 반환하는 코드 작성 방식!
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
    private String studentInform(Student 특정학생) {
    // 객체인 "특정함수"를 매개변수로 사용할 때 작성할 객체의 자료형은 객체를 생성한 클래스명을 작성한다.

        // String.format("패턴", 변수)
        // 패턴 모양의 문자열을 반환하는 String 메서드
        // st1처럼 Student 클래스 모형으로 담긴 학생의 데이터가 존재하면 값을 출력한다.
        // st3처럼 객체와 속성만 있고, 속성 값이 존재하지 않으면 기본값인 null이나 0으로 출력된다.
        // st2처럼 객체가 생성되지 않아서 존재하지 않는다면 오류 발생한다.
        String a = String.format("%s / %s / %c / %d / %d", 특정학생.getName(), 특정학생.getStudentNumber(), 특정학생.getGender(), 특정학생.getJava(), 특정학생.getHtml());
        return a;
    }

    /**
     * 매개변수로 전달 받은 학생 객체의 이름을 수정한다.
     * @param 특정학생  : st1 또는 st2 (학생에 대한 정보가 담겨 있는 객체 형태 위치 주소를 가져오기)
     *
     * 수정이나 삭제 작업은 void 형태로 진행하며, 수정과 삭제에 대한 결과
     * 수정이 완료되었다면 studentInfo에서 수정된 내용이 조회될 것이고,
     * 수정에 실패하였다면 studentInfo 수정되기 전의 내용이 조회될 것이다.
     */
    private void updateStudentName(Student 특정학생) {
        System.out.print("새로운 이름을 입력하세요 : ");
        String newName = sc.next();

        // 새 이름 세팅
        특정학생.setName(newName);

        System.out.println("학생 이름이 수정되었습니다.");
    }

    /**
     * Java 역량이 얼마나 증가/감소했는지 정수로 입력받고, 학생의 Java 역량을 관리자가 수정한다.
     * 수정된 Java 역량은 최대값, 최소값 범위를 넘지 않도록 if문으로 설정하기
     * @param 특정학생  : st1 또는 st2 (학생에 대한 정보가 담겨 있는 객체 형태 위치 주소를 가져오기)
     */
    private void updateJava(Student 특정학생) {
        System.out.print("Java의 역량 변화를 입력하세요 : ");
        int newJava = sc.nextInt();

        int beforeJava = 특정학생.getJava();
        int result = beforeJava + newJava;

        // 새로운 점수가 유효 범위를 벗어났을 때 반복 수행을 위한 while문
        while (result > Student.MAX_VALUE || result < Student.MIN_VALUE) {
            System.out.printf("점수는 %d점부터 %d점 사이만 가능합니다.\n", Student.MIN_VALUE, Student.MAX_VALUE);

            System.out.printf("현재 점수 : %d\n최종 결과 : %d\n", 특정학생.getJava(), result);

            System.out.println("다시 입력하세요 : ");
            newJava = sc.nextInt();
            result = 특정학생.getJava() + newJava;

            // 입력 종료를 원한다면 000을 입력하세요.
            if (sc.nextLine() == "000") return;
        }
        //  result 를 setJava에 저장
        특정학생.setJava(result);

        // 만약 다시 입력했는데 또다시 다시 입력하는 경우는 같은 코드를 내부에 반복해서 작성해야 하기 때문에 while문으로 반복 수행시킨다.
        /*
        if  (result > Student.MAX_VALUE) {
            System.out.println("최대 점수는 " + Student.MAX_VALUE + "점입니다.\n다시 입력하시겠습니까? (Y/N)");
            if (sc.next().charAt(0) == 'Y') {
                newJava = sc.nextInt();
                result = beforeJava + newJava;
            } else return;

            // 다시 입력하겠냐는 기능은 HTML confirm (alert X)
            if  (result > Student.MAX_VALUE) {
                System.out.println("최대 점수는 " + Student.MAX_VALUE + "점입니다.\n다시 입력하시겠습니까? (Y/N)");
                if (sc.next().charAt(0) == 'Y') {
                    newJava = sc.nextInt();
                    result = beforeJava + newJava;
                } else return;
            }
        } else if (result < Student.MIN_VALUE) {
            System.out.println("최대 점수는 " + Student.MIN_VALUE + "점입니다.\n다시 입력하시겠습니까? (Y/N)");
            if (sc.next().charAt(0) == 'Y') {
                newJava = sc.nextInt();
                result = beforeJava + newJava;
            } else return;
        } else {
            특정학생.setJava(result);
            System.out.println("역량 변화를 적용했습니다.");
        }
         */
    }

    /**
     * HTML 역량이 얼마나 증가/감소했는지 정수로 입력받고, 학생의 HTML 역량을 관리자가 수정한다.
     * 수정된 HTML 역량은 최대값, 최소값 범위를 넘지 않도록 if문으로 설정하기
     * @param 특정학생  : st1 또는 st2 (학생에 대한 정보가 담겨 있는 객체 형태 위치 주소를 가져오기)
     */
    private void updateHTML(Student 특정학생) {
        System.out.print("HTML의 역량 변화를 입력하세요 : ");
        int newHtml = sc.nextInt();

        int beforeHtml = 특정학생.getHtml();
        int result = beforeHtml + newHtml;

        // 새로운 점수가 유효 범위를 벗어났을 때 반복 수행을 위한 while문
        while (result > Student.MAX_VALUE || result < Student.MIN_VALUE) {
            System.out.printf("점수는 %d점부터 %d점 사이만 가능합니다.\n", Student.MIN_VALUE, Student.MAX_VALUE);

            System.out.printf("현재 점수 : %d\n최종 결과 : %d\n", 특정학생.getHtml(), result);

            System.out.println("다시 입력하세요 : ");
            newHtml = sc.nextInt();
            result = 특정학생.getHtml() + newHtml;

            // 입력 종료를 원한다면 000을 입력하세요.
            if (sc.nextLine() == "000") return;
        }
        //  result 를 setJava에 저장
        특정학생.setHtml(result);
    }

    /**
     * 매개변수로 전달 받은 두 학생의 Java 점수 확인하기
     * @param student1
     * @param student2
     * @return  비교 결과 문자열로 확인한다.
     */
    private String compareJava(Student student1, Student student2) {
        if (student1 == null || student2 == null) return "등록된 학생의 정보가 조회되지 않습니다.";
        if (student1.getJava() == student2.getJava()) return "두 학생의 점수가 같습니다.";
        else if (student1.getJava() > student2.getJava()) return student1.getName() + "의 점수가 더 높습니다.";
        else return student2.getName() + "의 점수가 더 높습니다.";
    }

    /**
     * 매개변수로 전달 받은 두 학생의 Java 점수 확인하기
     * @param student1
     * @param student2
     * @return  비교 결과 문자열로 확인한다.
     */
    private String compareHtml(Student student1, Student student2) {
        if (student1 == null || student2 == null) return "등록된 학생의 정보가 조회되지 않습니다.";
        if (student1.getHtml() == student2.getHtml()) return "두 학생의 점수가 같습니다.";
        else if (student1.getHtml() > student2.getHtml()) return student1.getName() + "의 점수가 더 높습니다.";
        else return student2.getName() + "의 점수가 더 높습니다.";
    }


}
