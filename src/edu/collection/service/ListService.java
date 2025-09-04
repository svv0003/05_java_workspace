package edu.collection.service;

// service.ListService 폴더와 클래스를 한 번에 생성하기

import java.util.ArrayList;
import java.util.List;

public class ListService {

    /*
    List
    자료를 순차적으로 나열한 자료 구조 (배열과 비슷하다.)
    인덱스가 존재한다.
    인덱스로 순서를 구분짓기 때문에 중복 데이터 저장 가능하다.

    인덱스란?
    0번부터 순차적으로 변수명나 데이터들의 자리번호를 생성하는 것
    for문 작성할 때 사용하는 i는 index의 약자.

    List가 Array보다 편리하다.
     */

    public void method1() {
        // List 객체 생성
        // List (인터페이스) : 특정 기능을 기준으로 만들어진 클래스 파일을 이용할 예정이다.
        //                      인터페이스이기 때문에 객체 생성 불가하고, 다형성을 이용해서 사용해야 한다.
        // ArrayList (클래스 문서 존재) : List의 후손 클래스

        // ArrayList는 고무줄처럼 공간 크기가 변하기 때문에 배열처럼 초기에 크기를 설정할 필요 없다.
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add("아무거나 작성한다.");

        System.out.println("list : " + list);





    }










}
