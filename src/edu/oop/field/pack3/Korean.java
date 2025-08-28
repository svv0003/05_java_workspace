package edu.oop.field.pack3;

public class Korean {

    /* 필드 */

    // static 붙은 필드는 프로그램 실행 시 static 메로리 영역에 할당된다.
    // static 필드 앞에 public을 작성하는 이유
    // -> 어디서든지 누구든지 공유할 수 있도록 하는게 목적이다.

    public static int nationalCode = 82;     // 국가 코드

    // static + final

    public static final String ANCESTOR = "단군";

    private String name;
    private String id;

    // 초기화 블록
    // 객체 생성 시 필드를 {} 내부의 값으로 초기화한다.
    // 실행 시점 : 객체가 생성될 때마다 실행한다.
    //           -> new Korean() 할 때마다 실행한다.
    // 객체마다 초기값을 공통으로 설정하고 싶을 때 사용한다.
    // -> 생성자에 반복해서 쓸 필요가 없도록

    {
        name = "홍길동";
        id = "000329-1234567";
    }

    /*
    main 메서드에서
    Korean k1 = new Korean();       // 초기화 블록 실행된다.
    Korean k2 = new Korean();       // 또 실행된다.
     */

    // static 초기화 블록
    // -> static 붙어있는 구문은 프로그램 실행 시 1회만 읽는다.
    // -> Korean 객체가 100만번 생성되어도 처음 1회만 읽는다.
    // main 메서드가 실행될 때 최초 1회만 실행된다.
    // -> Korean 클래스가 메모리에 올라갈 때 실행된다.

    static {
        nationalCode = 10;
    }

    /*
    main 메서드에서
    Korean k1 = new Korean();       // static에 작성된 nationalCode는 여기서 최초 1회 실행한다.
    Korean k2 = new Korean();       // static으로 작성된 nationalCode는 다시 실행되지 않는다.
     */

    /*
     일반 초기화 블록
     user가 접속할 때마다 guest 부여할 때
     k1, k2, k3와 같은 유저마다 guest 칭호를 붙이고,
     k1이 admin이면 k1만 추후 admin으로 교체하고,
     k2, k3는 그대로 guest 칭호 유지한다.

     -> 생성자 내부에 작성해놓는 경우가 더 많다.

     static 초기화 블록
     설정 파일, 드라이버, 로깅 설정 등
     프로그램 실행 시 연결해야 하는 기본 설정에서 많이 사용된다.
     */



    /* 메서드 */

    public void setName(String name) {
        this.name = name;
        // 매개 변수로 전달 받은 name을 현재 객체의 name 필드에 대입힌다.
    }

    public void setId(String id) {
        this.id = id;
    }

    // 반환형 void
    // 오직 실행만 할 뿐 전달하는 값은 없다.

    // 반환형 String
    // 기능 실행 후 종료 시 String에 해당하는 데이터를 전달한다.

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    /*
    return
    --------------------------------------------------------------------
    return;  : 데이터를 전달할 값이 존재하지 않고,
               특정 기능을 return; 작성된 순간부터 기능 중지하는 역할
               보통 return;을 작성하는 것은 method의 최하위에 작성하는 것이 아니라
               제어문이나 반복문과 같은 특정 조건에서 다수 작성한다.
    --------------------------------------------------------------------
    public 자료형 기능명(매개변수) {
        return 변수명|값;         : 기능명이 종료될 때 자료형이 일치하는 변수명이나 데이터 값을 활용할 수 있도록 전달한다.
    }
     */

    public int method1() {
        // public 옆에 작성된 자료형이 int이기 때문에 return 옆에는 숫자값이 들어가야 한다.
        return 0;
    }

    public int method2() {
        int b = 1;
        // 정수 1 대신 1이라는 값을 담고 있는 int 자료형 "b" 변수명을 대신 사용한다.
        return b;
    }

    public int method3(int c) {
        // 매개변수로 전달받는 값의 자료형이 int로 제한되고, 추후 "c" 변수명에 담겨서 사용한다.
        return c;
    }

    public String method4() {
        // public 옆에 위치한 자료형이 String이기 때문에 return 값 또한 문자열 형태를 유지한다.
        return "ㅎㅇ";
    }

    public String method5() {
        String d = "ㅎㅇ요";
        return d;
    }

    public String method6(String e) {
        return e;
    }


}
