package edu.collection.pack4.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {

    /*
Wrapper Class

기본 자료형을 객체 (속성, 기능)로 감싸는 클래스
-> 기본 자료형의 객체화

왜?
컬렉션처럼 객체만 취급하는 상황에서
기본 자료형도 취급 가능하도록
형태를 바꾸기 위해 만들어졌다.

Java는 "모든 것이 객체"라는 철학을 추구한다!!
메모리 성능상의 이유로 기본 타입 (primitive type)을 별로도 유지한다.
기본 타입은 메모리를 차지하는 공간 비중이 정해져 있고,
Java보다 먼저 존재했던 타입이다.

    기본 타입 : byte, int, short, long, float, double, char, boolean

Java는 객체 (Class 파일로 만들어진 문서) 중심으로 실행하는 프로그램이기 때문에
기본 타입 또한 class 파일 형태로 자바 개발자들이 만들어 놓은 상태이다.
-> 클래스 파일 형태이기 때문에 대문자로 시작한다!

    wrapper Class : Byte, Integer, Short, Long, Float, Double, Character, Boolean

    String
    기본 타입과 별개로 만들어진 문서
    char 기본 타입을 이용하여 문자를 하나씩 가져오는 것이 비효율적이라 판단되어서
    String 파일 생성 후 문자 데이터를 한 번에 작성할 수 있게 설정한 것이다.


ArrayList처럼 클래스 파일 문서 형태만
유연한 배열 형태에 특정 파일의 데이터만 들어올 수 있도록
제약을 걸어놓은 문서를 사용할 때

Java 언어를 사용하면서 ArrayList를 활용하고,
유연한 목록 배열 리스트에 숫자나 소수값, 참/거짓처럼
특정 자료형만 담을 수 있게 설정하고자 하는 개발자들을 위해
기본 타임을 Wrapper 클래스 타입으로 만들어서 제공한다.


List<> 배열명1 = new ArrayList<>();
List<class 파일로 이루어진 문서들만 제한 가능> 배열명1 = new ArrayList<>();

배열명1의 공간에 숫자, 문자, 참/거짓, 소수값 모두 담을 수 있는 종합 바구니이다.
배열명2의 공간은 특정 자료형의 Wrapper 클래스를 작성해서 특정 자료형의 데이터만 담을 수 있다.


     */

    public void method1() {
        List<Integer> a =  new ArrayList<>();
        a.add(1);
        a.add(100);
        a.add(1000);
        a.add(-1);

        System.out.println(a);

        // get과 index를 활용하여 출력하기
        System.out.println(a.get(0) + a.get(1) +  a.get(2));        // int 자료형의 덧셈으로 계산된다.
    }

    public void method2() {

        // 사용자 (개발자)가 관리하는 String 객체를 생성해서 사용할 수 있다.

        String str1 = new String();
        // 원래라면 String 또한 new String() 형태로 데이터가 들어갈 공간을 생성하는 것이 맞지만
        // 수많은 개발자가 String 자체를 기본 타입 이상으로 사용하기 때문에
        // new String()을 생략 후 기본 자료형처럼 리터럴 형태로 특정 공간에 데이터 작성 가능하도록 설정했다.

        // 리터럴
        // 데이터를 개발자가 직접적으로 작성한 형태
        String str2 = "안녕";
        String str3 = "ㅎㅇ염";
        // str2, str3는 리터럴 형태로 각각의 공간에 데이터를 작성하여 추가한 것이다.

        String str4 = str2;
        // 리터럴 형태로 직접 데이터를 작성한 것이 아닌 "안녕"을 담고 있는 str2를 이용하여 데이터를 추가한 것이다.

        System.out.println("str2 : " + str2);
        System.out.println("str4 : " + str4);
        str2 = "ㅎㅇ";
        System.out.println("str2 : " + str2);
        System.out.println("str4 : " + str4);
        // str2의 값이 이후에 변하더라도 str4의 값은 변하지 않는다.

    }

}
