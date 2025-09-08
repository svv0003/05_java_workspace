package edu.io.pack1.service;

import java.io.File;
import java.io.IOException;

public class FileService {

    /*
File 클래스

java.io 패키지
파일 / 디렉토리 (폴더) 관리하는 클래스
(파일 / 디렉토리 존재 유무 관계 없음)

파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재 여부 등의 기능 제공


File 클래스 메서드

boolean mkdir ( )           : 디렉토리 생성 (한 개의 폴더만 생성 make directory (= folder))
boolean mkdirs ( )          : 경로상의 존재하는 모든 디렉토리 생성 (여러 폴더를 한 번에 생성 make directory (= folder))
boolean createNewFile ( )   : 파일 생성
boolean delete ( )          : 파일 / 디렉토리 삭제
String getName ( )          : 파일명 반환
String parent ( )           : 파일이 저장된 디렉토리 반환
String getPath ( )          : 전체 경로 반환
boolean isFile ( )          : 현재 File 객체가 관리하는게 파일이면 true 아니면 false 반환
boolean isDirectory ( )     : 현재 File 객체가 관리하는게 디렉토리이면 true 아니면 false 반환
boolean exists ( )          : 파일 / 디렉토리가 존재하면 true 아니면 false 반환
long length ( )             : 파일 크기 반환
long lastModified           : 파일 마지막 수정일 (1970.01.01 9:00)부터 현재까지 지난 시간을 ms 단위로 반환
String [ ] list ( )         : 디렉토리 내 파일 목록을 String [ ] 배열로 반환
File [ ] listFiles ( )      : 디렉토리 내 파일 목록을 File [ ] 배열로 반환
     */

    // File 클래스로 객체 생성
    // 폴더가 존재하지 않으면 폴더 생성하기

    public void method1 () {

        // 맨 앞 "/"  : 최상위 폴더 (== root, 절대 경로의 기준점)

        // C 드라이브 폴더 다음에 io_test 폴더와 gildong 폴더가 존재하는지 확인하고,
        // 존재하지 않으면 생성, 존재하면 생성하지 않기

        File 폴더들 = new File("/io_test/gildong");
        // 처음에는 존재 유무를 모르지만
        // 개발자가 확인하고자 하는 폴더명(들)을 가지고 있는
        // File 객체를 "폴더들"이라는 이름으로 생성한다.

        System.out.println("폴더들의 존재 여부 확인 : " + 폴더들.exists());

        // 폴더들.exists();    -> T/F

        // 폴더 모두 생성하기
        // 폴더가 하나가 아닌 io_test 폴더 내 gildong 폴더를 생성할 예정이기 때문에 .mkdirs() 사용한다.
        폴더들.mkdirs();

        System.out.println("마지막 폴더명 : " + 폴더들.getName());
        System.out.println("마지막 폴더까지의 모든 경로들 : " + 폴더들.getPath());

        /*
        맥북이라 위 방식으로 폴더 생성 안 되네...
         */
    }

    public void method2 () {

        // 맥북이라 절대 경로가 아닌 상대경로로 설정
        File 폴더들 = new File("/Users/svv/io_test/gildong");


        System.out.println("폴더들의 존재 여부 확인 : " + 폴더들.exists());

        폴더들.mkdirs();

        System.out.println("마지막 폴더명 : " + 폴더들.getName());
        System.out.println("마지막 폴더까지의 모든 경로들 : " + 폴더들.getPath());
    }

    // File 객체를 이용해서 지정된 위치에 파일 생성하기

    public void method3 () {

        File 파일하나 = new File("/Users/svv/io_test/gildong/파일생성확인.txt");

        /*
        폴더 생성 mkdir() mkdirs()
        폴더와 별개로 [파일]을 마지막에 생성할 때
        파일 생성할 때
        특정 위치에 파일 생성할 때 사용하는 기능
        createNewFile()
         */

        try {
            // 컴퓨터에서 코드 실행 시 발생할 수 있는 문제 코드를 실행 시도할 것이다.
            파일하나.createNewFile();
        } catch (IOException e) {
            // 실행 시도 시 문제 발생하면 예외 상황으로 인하여 자바 전체 프로그램을 중지하는 것이 아닌
            // 특정 기능에 대한 문제를 개발자가 회사 또는 프로그렘에 적절한 방향으로 기능이 진행되도록 설정한다.
            System.out.println("파일을 생성하는 도중 문제가 발견했습니다.");
        } catch (Exception e) {
            System.out.println("개발자가 발견하지 못한 문제들 확인, 추후 문제들에 대하여");
            System.out.println("Exception으로 도달하기 전에 catch문으로 해당하는 문제에 대해");
            System.out.println("개발자가 처리할 수 있도록 문제를 확인하는 공간");
            // 예외 정보 + 발생 위치까지의 기능들을 추적해서 출력한다.
            e.printStackTrace();
            // e.printStackTrace():와 비슷한 형태
            System.out.println(e.getMessage());
            // 둘 중 하나 선택해서 사용하면 된다.
        }
    }

    /*
    method4
    c 드라이브 아래에 폴더들 생성
    io_text/practice/폴더및파일생성.txt 생성하고, 생성된 결과 출력하기
    성공적으로 생성 완료되었다면 성공 메시지 출력
    생성하지 못했다면 실패 메시지 출력
    if문 활용해서 출력
     */
}
