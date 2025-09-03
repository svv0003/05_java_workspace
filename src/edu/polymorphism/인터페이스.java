package edu.polymorphism;

// 추후 작성해야 하는 기능을 위주로 설정하는 문서

public interface 인터페이스 {
    /*
    멤버, 인스턴스 변수, 필드를 작성할 때
    임의의 공간이 설정된 공간이 아닌 데이터가 들어있는 변수명만 생성 가능하다.
    자료형은 private 불가능!!
    String name = "김개발"; 처럼 리터럴 형태만 가능하다.

    인터페이스에서 작성하는 모든 필드명은 자동으로 public static final 처리된다.

    static  : main(String[] args) 실행 시 모든 상황에서 접근 가능한 위치
              접근 가능하도록 반드시 public을 작성한다.

    final   : 값을 변경할 수 없는 상수
              필드 명칭에 들어있는 데이터를 변경할 수 없다.

    인터페이스에서는 주로 나중에 작성해야 하는 기능만 정의한다.
     */

    // public 생략 가능하다.
    // 왜? private default protected 사용 불가능하기 때문에 public만 가능하기 때문이다.
    // 왜? 무조건 추후 재설정해야 하는 기능들만 나열하기 때문에 기능들에 접근할 수 있도록 해야 하기 때문이다.
    // public void/자료형 fly();
    void fly();

    // {}가 작성되어야 하는 메서드는 작성 불가능하다.
    // public void map(){}



    // static으로 작성해야 하는 데이터는 작성 가능하지만
    // 추후 "설정파일"이라는 곳에 한 번에 작성할 예정이다.




}
