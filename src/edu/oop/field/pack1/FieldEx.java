package edu.oop.field.pack1;

public class FieldEx {
    /*
    필드 (Field)
    객체의 속성을 나타낸다.
    필드 == 멤버 변수

    [작성법]
    [접근제한자] [예약어] 자료형 변수명 [=초기값];

    접근 제한자 필드 선언
     */
    public          int publicValue = 10;
    protected       int protectedValue = 10;
    /* default */   int defaultValueOne = 10;
                    int defaultValueTwo = 10;
    /*
    default는 생략
    제어자 default는 허용되지 않는다.
    default         int defaultValueThree = 10;
     */
    private         int privateValue = 10;

    // 모든 접근 제한자가 같은 클래스 내부에 접근 가능하기 때문에 오류 없다.
    public void method1(){
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValueOne);
        System.out.println(defaultValueTwo);
        System.out.println(privateValue);
    }

}
