package edu.variable;

public class VariableEx1 {
    public static void main(String[] args) {
        /*
        * 변수 (variable)
        * 메모리에 값을 저장하기 위한 공간의 명칭
        * 저장되는 값이 변할 수 있기 때문에 변수라고 한다.
        *
        * 자료형 (data Type)
        * 변수 또는 값의 크기와 형식
        * */

        /*
        자바 기본 자료형 (Java Primitive Types)

        [논리형]
        boolean (1 byte)    true / false

        [정수형]
        byte    (1 byte)
        short   (2 byte)
        int     (4 byte)    정수 기본형
        long    (8 byte)    숫자 뒤에 L 작성하는 방식 가능 (소문자도 가능)

        [실수형]
        float   (4 byte)    숫자 뒤에 F 작성
        double  (8 byte)    실수 기본형

        [문자형]
        char    (2 byte)    문자 하나, 문자 양 옆에 '' 홑따옴표 사용!!!
        */

        // 변수 선언 : 메모리에 공간 할당한다.

        boolean isTrue;         // 메모리에 boolean 저장 공간 1 byte를 할당하고, 공간의 명칭을 isTrue라고 부르겠다. 설정
        double number1;         // 메모리에 double 저장 공간 8 byte를 할당하고, 공간의 명칭을 number1라고 부르겠다. 설정

        // 값 대입 : 변수명에 특정 값을 담아놓는 것
        //          이미 값이 존재하는 변수명에 대입하면 --> 덮어쓰기가 된다.

        isTrue = true;          // null 빈 공간 값에 true라는 명칭으로 덮어쓰기가 된다.
        System.out.println("isTrue : " + isTrue);
        isTrue = false;         // true 값을 false 값으로 덮어쓰기가 된다.
        System.out.println("isTrue : " + isTrue);

        // print 단축키
        // sout + Tab   = System.out.println();
        // souf + Tab   = System.out.printf("");

        // 변수 선언 + 초기화 + 값의 범위 확인
        int number2 = 2100000000;       // 21억 - 오류 X

        // long number3 = 2200000000;     // 22억 - 오류 O
        long number3 = 2200000000L;     // 22억 - 오류 X
        // 숫자 자료형들은 리터럴 값이 기본적으로 int이기 때문에
        // byte short int long 모두 값(=리터럴)에서 뒤에 자료형 명칭을 붙이지 않는다면 모두 int
        // number3는 리터럴 값을 int -> long 값으로 변환

        System.out.println("number2 : " + number2);
        System.out.println("number3 : " + number3);

        int nt1 = 100;
        int nt2 = (int)10000000000L;            // long 데이터가 int 형태로 강제 형변환 -> 데이터 변질

        long lng1 = 200;                        // int 리터럴보다 2배 크기의 메모리를 차지하는 long에 담을 수 있다.
                                                // 큰 바구니에 작은 데이터를 담는 것은 문제가 되지 않는다.
                                                // long과 같이 리터럴에 L을 작성하는 경우에는 자료형 타입에도
                                                // Long 작성하는 사소한 문제 발생할 수 있다.
                                                // 기본 자료형은 String 외 모두 소문자
        long lng2 = 20000000000L;

        /*
        * nt1, nt2는 4 byte 크기의 데이터를 담는 바구니 명칭
        * int 이하 크기의 데이터를 담을 수 있지만 nt2의 2배 크기의 long 데이터를 담으려고 할 때 문제 발생한다.
        *
        * 값을 억지로 넣을 수는 있지만 값이 왜곡되어 변수명 바구니에 담긴다.
        * => 강제 형변환
        *
        * 형변환
        * - 숫자나 문자 구문 앞에 바구니 자료형을 소괄호로 작성하면 형변환
        *
        * */

        /*
        * 자바 기본 변수 선언 문법
        *
        * 자료형 변수명 = 리터럴;
        *
        * 자료형 (Data Type)       : 변수가 저장할 데이터의 종류를 지정한다.
        * 변수명 (Variable Name)   : 데이터를 저장할 메모리 공간의 이름
        * 리터럴 (Literal)         : 실제 저장되는 값 자체
        *
        * 리터럴과 값의 차이  -  리터럴 (Literal)은 코딩에서 직접적으로 작성된 고정된 값
        *                   ->  직접적으로 값이 정직하게 작성되어 있다면 리터럴
        *                   ->  값 내부에 존재하는 하나의 종류
        *                    값 (value)는 변수나 표현식이 실제로 가지고 있는 데이터
        *
        * int a = 100;                  // 리터럴이자 값
        * int b = a + 50;               // 리터럴이 아닌 값
        * int c = method명칭();          // 리터럴이 아닌 메서드 리턴 값
        * int d = Scanner.nextInt();    // 리터럴이 아닌 사용자의 입력 값
        * */


    }
}
