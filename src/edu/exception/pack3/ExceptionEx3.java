package edu.exception.pack3;

/*
Checked Exception
반드시 확인해야 하는 예외
-> 예외 처리 구문 (try-catch, throw)
반드시 작성해야 하는 예외

UnChecked Exception
확인 생략해도 되는 예외
-> 예외 처리 구문 (try-catch, throw)
작성 생략 가능한 예외

 */

import java.io.IOException;

public class ExceptionEx3 {

    // Checked / UnChecked 구분하기

    public void method1(){
        int result = 1;

        if (result == 1){
            throw new RuntimeException();       // 빨간줄이 생기지 않는다.
            //throw new IOException();          // 빨간줄이 생긴다
                                                // 이런 경우는 try-catch를 통해 필수로 예외 처리해야 한다.
        }
    }

    public void method2(){
        int result = 101;

        if (result > 100){
            throw new 개발자Exception();        // 빨간줄이 생기지 않으니까 반드시 try-catch로 예외 처리하지 않아도 된다..
        }
    }
}
