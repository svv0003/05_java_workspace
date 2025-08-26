package edu.array;

// 배열 기능용 클래스

/*
배열 (자료 구조)
- Java에서의 배열
-> 같은 자료형 변수를 하나의 묶음으로 다루는 것
- 생성된 배열의 요소는 index를 이용해서 구분한다.
- 생성된 배열을 활용하기 위해서는 배열을 참조하는 "참조형 변수"를 이용한다.

[참조형 변수]
- 주소를 저장하는 변수
- 변수 사용 시 저장된 주소로 찾아가서 그 곳에 위치한 배열, 객체를 참조한다.
- 기본 자료형 8개를 제외한 나머지는 모두 참조형 변수이다.
  (boolean, byte, short, int, long, char, float, double)

  참조형 변수란?
  개발자가 만들어 놓은 클래스 파일을 참조하는 변수명
 */

import java.util.Scanner;

public class ArrayEx1 {
    // 배열 선언, 할당, 초기화
    public void Exam1() {
        // 변수 선언
        int num;
        // Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성하고 변수명으로 "num" 지정

        // 배열 선언
        int[] arr;
        // Stack 영역에 int[] 자료형을 참조할 변수를 생성하고 (주소 저장) 그 변수명을 "arr" 지정

        // 배열 할당
        arr = new int[4];
        // Heap 영역에 int 4개 배열을 할당 후 생성된 배열의 주소를 "arr" 변수에 대입한다.

        // -> arr 이용해서 배열을 참조하고, arr에 저장된 데이터를 사용 가능하다.

        // 배열 초기화
        // 1) 초기화 전 상태 -> 0 대입되어 있는지를 확인한다.
        System.out.println("초기화 전 배열의 상태");
        System.out.println("arr의 초기값 길이 : " + arr.length);
        System.out.println("arr가 위치한 컴퓨터 내의 주소명 : " + arr);
        System.out.println("arr[0]의 초기화 전 값 : " + arr[0]);
        System.out.println("arr[1]의 초기화 전 값 : " + arr[1]);
        System.out.println("arr[2]의 초기화 전 값 : " + arr[2]);
        System.out.println("arr[3]의 초기화 전 값 : " + arr[3]);
        // * bug    : 프로그램 수행 중 발생하는 오류 (== error)
        // * debug  : 프로그램 수행 중 특정 시점에 어떤 값을 지니고 있는지 확인하는 것
        //              -> 코드 상태, 오류 분석

        // 2) 인덱스를 이용한 초기화
        arr[0] = 100;
        arr[1] = 10000;
        arr[2] = 3;
        arr[3] = 777;
        /*
        arr[4] = 5555;
        문제 발생
        -> 자바는 배열 추가 불가능!!!

        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at edu.array.ArrayEx1.Exam1(ArrayEx1.java:53)
        at edu.array.ArrayRun.main(ArrayRun.java:9)

        Index 4 out = index 배열이 배치될 수 있는 칸은 4칸인데 그 이상을 작성해서 발생하는 예외 상황

        자바스크립트에서는 length 길이보다 데이터가 추가되면 자연스럽게 length의 길이도 커지지만
        자바에서는 최초로 지정한 칸 수를 그대로 유지하며, 칸 수를 초과할 경우 예외 상황 발생한다.

        추후 js처럼 최초로 지정한 칸 수와 관계없이 ArrayList로 데이터를 추가할 수 있는 class 파일을 자바 개발자가 만든후 자바 버전 업그레이드했다.
        개발자들은 ArrayList와 같은 기능을 활용해서 유연하게 데이터 추가, 삭제 가능하다.
         */
        System.out.println("초기화 후");
        System.out.println("arr가 위치한 컴퓨터 내의 주소명 : " + arr);
        System.out.println("arr[0]의 초기화 후 값 : " + arr[0]);
        System.out.println("arr[1]의 초기화 후 값 : " + arr[1]);
        System.out.println("arr[2]의 초기화 후 값 : " + arr[2]);
        System.out.println("arr[3]의 초기화 후 값 : " + arr[3]);

        // 디버그 모드   : 확인하고 싶은 코드 다음 줄에 break point 추가해서 문제 확인할 것!
    }
    // 정수 4개를 입력 받고, for문 사용해서 배열에 차례대로 대입하기
    public void Exam2() {
        Scanner sc = new Scanner(System.in);

        // 배열 선언 + 할당
        int[] arr = new int[4];

        // 배열명.length = 배열의 총 길이
        // index = length - 1
        // index 0번부터 length-1번까지 추가하기
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번째 idx : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("----배열에 추가된 값 확인하기----");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
