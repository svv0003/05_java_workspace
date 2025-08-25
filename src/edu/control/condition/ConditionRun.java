package edu.control.condition;
// 폴더 위치 edu 폴더 > control 폴더 > condition 폴더
// 다른 폴더


// 조건문 실행용 클래스

import edu.control.condition.ConditionEx;

public class ConditionRun {
    public static void main(String[] args) {
        ConditionEx ex = new ConditionEx();     // new ConditionEx 파일을 사용하겠다.

        /*
        Function라면 method1() 형태로 단독 사용 가능,
        method라면 객체.method1() 형태로 특정 클래스나 예약어에 존재하는 기능 형태로 작성한다.
        자바에서는 class 형태가 기본이기 때문에 메서드 형태로 모든 기능 작성한다.
        */
        // ex.method1();
        // ex.method2();
        ex.method3();
    }
}
