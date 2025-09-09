package edu.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileEx {

    /*
파일 읽기 관련
FileInputStream         파일의 Byte 데이터를 읽는 클래스
FileReader              파일의 Text 데이터를 문자 단위로 읽는 클래스
BufferedReader          파일의 Text를 버퍼에 담아 효율적으로 읽는 클래스
Scanner                 파일의 데이터를 다양한 형태로 파싱하여 읽는 클래스

파일 작성 관련
FileOutputStream        파일의 Byte 데이터를 저장하는 클래스
FileWriter              파일에 Text 데이터를 문자 단위로 저장하는 클래스
BufferedWriter          파일에 Text를 버퍼에 담아 효율적으로 저장하는 클래스
PrintWriter             파일에 다양한 형태의 데이터를 편리하게 저장하는 클래스

파일 정보 및 관리
File                    파일이나 폴더의 존재 여부, 정보 확인하는 레거시 클래스
Files                   파일 생성, 삭제, 복사 등 모든 파일 작업을 담당하는 유틸리티 클래스
Path                    파일 경로를 나타내고 조작하는 현대적 클래스
Paths                   Path 객체를 생성하는 팩토리 클래스

레거시 (Legacy)         오래된 예전 방식 (구식)
팩토리 (Factory)        인터페이스를 활용하여 클래스 형태로 만들어지고,
                        만들어진 클래스를 객체 형태로 사용할 수 있도록 만드는 클래스 또는 메서드 기능
유틸리티 (Utility)      편리한 기능들을 모아놓은 클래스
     */

    // 레거시 (Legacy) 클래스 비교하기
    public void legacyMethod() {

        /*
왜 레거시라고 부르는가??

오래되어서 문제가 많지만 기존 코드와 호환성 때문에 아직 남아있다.
새 프로젝트에는 거의 사용하지 않는다.
         */

        // 레거시 방식 (1950년~) : 오래되어서 사용하기 불편하다.
        File file = new File("폴더경로/파일명.확장자명");
        // 예외 처리 안 된다.
        // => 그냥 T/F만 진행한다.
        boolean exists1 = file.exists();
        boolean success = file.delete();
        if (!success) {
            // 삭제하지 못한게 사실이라면
            // 왜 못했는가? => 권한이 없어서? 다른 프로그램에서 사용중인가?
            // 개발자가 코드를 수정함에 있어 어떻게 문제를 수정하고 대안을 설정해야 하는지에 대한 정보가 없다.
            System.out.println("삭제... 실패...이유...모름...");
        }

        /*
기타 문제
File 클래스가 느리다.
시스템에서 직접적으로 콜 위험성 높다.
copy ( ) move ( ) readAllText ( ) 파일 복사, 이동, 내용 읽기 기능 등 다수 없다.
         */

        // 현대적 방식 (2011년~) : 새롭고 사용하기 편리하다.
        Path path = Path.of("폴더경로/파일명.확장자명");
        boolean exists2 = Files.exists(path);
        try {
            Files.delete(path);
        } catch (NoSuchFileException e) {
            System.out.println("파일이 없습니다 : \n=> 파일이 없는 경우에 대한 개발자의 처리");
        } catch (AccessDeniedException e) {
            System.out.println("권한이 없습니다 : \n=> 권한이 없는 경우에 대한 개발자의 처리");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("입출력 연결 오류 : \n=> 입출력 연결 문제에 대한 개발자의 처리");
        } catch (Exception e) {
            System.out.println("개발자도 모르는 오류 : \n=> 해당 문제에 대한 추가 catch를 추후 처리");
        }


    }

    // 팩토리 패턴
    public void factoryMethod() {

        /*
레거시 방식
Windows, Linux (Mac)은 각자 / 또는 \를 사용해서 구분해야 하기 때문에 좋은 방식이 아니다.
         */
        File file1 = new File("폴더경로/파일명.확장자명");
        File file2 = new File("폴더경로", "/파일명.확장자명");     // 반드시 슬래시 /를 추가하기

        /*
현대 방식
Windows, Linux (Mac)을 자바 코드에서 운영 체제를 구분하여
, 사이에 운영 체제에 필요한 형태로 / 또는 \를 작성한다.

Windows         User/user/file.text를
                user\\user\\file.text 형태로 슬래시 자동 생성

Linux (Mac)     Users/user/file.text 형태로 슬래시 자동 생성
        //
         */
        // Paths 팩토리의 경우
        Path path1 = Paths.get("file.txt");
        Path path2 = Paths.get("C:","폴더명", "file.txt");

        /*
Java 11부터 사용되는 최신 방법
Paths와 Path 구분하지 못한 채 사용하는 경우가 많아서 Path 명칭으로 통일하여
폴더명 파일명.확장자명 경로를 사용할 수 있도록 설정된 기능
        */
        Path path3 = Path.of("file.txt");

        // 절대 경로 (전체 경로)
        Path 절대경로1 = Path.of("C", "Users", "user", "Desktop", "file.txt");
        Path 절대경로2 = Path.of("/", "home", "user", "Desktop", "file.txt");

        // 상대 경로 (현재 자바 실행 폴더 위치 기준)
        Path 상대경로1 = Path.of("file.txt");                       // java_basic 폴더에서 file.txt
        Path 상대경로2 = Path.of("src","file.txt");        // java_basic 폴더에서 src 폴더 아래 위치한  file.txt
        Path 상대경로3 = Path.of("..","file.txt");         // java_basic 폴더를 감싸고 있는 java_workspace 폴더를 가리킴
        Path 상대경로4 = Path.of(".","path1","file.txt");  // 현재 폴더에서  path1 이라는 폴더 안에 존재하는 fil
    }

    // 유틸리티 클래스 및 메서드 기능
    public void utilityMethod() {

        // 클래스 기반 유틸리티
        try {
            Files.copy(Path.of("원본"), Path.of("사본"));
            Files.move(Path.of("원본"), Path.of("사본"));
            Files.delete(Path.of("사본"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 메서드 유틸리티
        double result1 = Math.max(10, 20);
        double result2 = Math.sqrt(10);
        double result3 = Math.random();

        // 정렬 뒤집기
        ArrayList<String /* 제네릭 */> list = new ArrayList<>();
        Collections.sort(list);         // 정렬 도구
        Collections.reverse(list);      // 뒤집기 도구
    }

}
