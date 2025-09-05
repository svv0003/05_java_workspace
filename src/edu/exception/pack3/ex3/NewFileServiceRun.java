package edu.exception.pack3.ex3;

import java.io.File;
import java.io.IOException;

public class NewFileServiceRun {

    /*
자바는 컴퓨터와 직접적으로 연관이 있는 서버 언어이다.
따라서 파일 생성, 삭제, 수정과 같은
컴퓨터에 직접적인 영향을 주는 코드 작업이 가능하다.

자바스크립트는 웹에 직접적으로 영향을 주는 웹 관련 언어이다.
파일 생성이나 삭제, 수정과 같은 작업은 사용하기 어렵다.
nodeJs라는 프레임워크 (라이브러리) 도구를 활용하면 가능하긴 하다.
     */

    // IO 입출력
    public static void main(String[] args) {
        // File이라는 자바 개발자들이 만든 문서를 활용해서 파일 생성하기
        // 파일 만들 때 덮어쓰기가 자동으로 되므로 파일 존재 유무를 확인하고,
        // 파일명이 존재하면 마지막에 (1)처럼 이런 식으로 붙이도록 한다.
        File file = new File("새 텍스트 문서.txt");
        // 생성된 텍스트가 존재하지 않는게 사실이라면
        if (!file.exists()) {
            // 파일을 생성하기
            try {
                file.createNewFile();
                System.out.println("file 생성이 완료되었습니다.");
            } catch (IOException e) {
                System.out.println("파일을 생성하는 도중에 문제가 발생했습니다.");
            } catch (Exception e) {
                System.out.println("개발자가 예기치 못한 문제가 발생했습니다.");
                System.out.println("err : " + e);
                // e.printStackTrace();     // 예외 정보 + 예외 발생 위치까지 추적하는 메서드
            } finally {
                System.out.println("파일 생성을 종료합니다.");
            }

        }
    }

}
