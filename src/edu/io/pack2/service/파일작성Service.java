package edu.io.pack2.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class 파일작성Service {

    // 텍스트 파일을 생성하고, 내부에 작성시킬 내용을 포함시킨다.
    /*
Files.writeString ( )
Java 11부터 도입된 기능으로,
간단히 문자열을 파일에 작성하는 방법이다.

파일 작성 시 파일을 열고, 내부에 글자를 작성하여 표기하고,
try-catch를 이용해서 파일을 생성하는데 문제가 없는지 확인하면서 진행한다.
영어, 숫자 외 다른 글자들은 컴퓨터에서 글자 깨짐 없이 작성되도록
인코딩 설정도 알아서 처리해주는 문서이다.

Java 개발자들이 만든 class 문서 파일들
File    : 가장 처음에 만들어진 파일에 관련된 기능들이 작성되어 있는 문서
          java.io

Files   : Java 7부터 도입된 문서
          파일 및 디렉토리를 처리 (생성, 복사, 이동, 쓰기, 읽기 등)를
          더 편리하고 문제 없이 사용하도록 개선된 기능들을 모아놓은 File 업그레이드 버전이다.

          .writeString ( )
          Java 11부터 추가된 기능
          문자열을 파일에 저장하는 기능을 전담한다.

Path    : 주소 경로에 대한 정보를 기능적으로 작성해놓은 문서 (인터페이스)
Paths   : Path 기능들을 활용해서 만든 문서 파일
          -> 이 두 가지를 사용하지 않아도
             Files.getPath ( )와 같은 기능으로
             파일 경로를 가져올 수 있지만
             경로에 대한 기능들만 중점적으로 작성해 놓은 문서를 만든 이유는
             File 문서는 파일 처리만 진행하도록 하기 위해서이다.
             Paths 문서를 이용해서 경로에 해당하는 건 이 문서를 통해서 이용하자는 것이다.
             역할에 따른 명확한 분리가 필요하다 여겨 Paths를 만들었지만
             Files.getPath ( )를 사용해도 큰 문제 없다.

             마치 Math.random ( )과 Random.random ( )이 존재하는 것과 같은 개념
                  수학 랜덤 기능    랜덤 자체를 분리한 기능

             Files                                                  파일 2v 문서를 활용해서 내부에 존재하는
                  .writeString                                      문자열 작성 기능 사용하겠다.
                              (Paths.get(fileName), fileContent)    ((문서) 위치 경로, 문서에 들어갈 내용)

     */
    public void method1() {

        String fileName = "파일1.txt";
        String fileContent = "파일1 내부에 글자를 작성할 것입니다.";

        try {
            // 파일들 문서를 이용해서 문자열로 글자를 작성한다.
            Files.writeString(Paths.get(fileName), fileContent);
            System.out.println(fileContent + " 파일 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
현재 java_basic 폴더에 files 폴더 생성하고,
내부에 파일2.txt 생성하고, 내용도 삽입하기
     */
    public void method2() {

        String path = "files";
        String fileName = "파일2.txt";
        String content = "안녕하세요. 반갑습니다. 오늘 점심은 무엇인가요.";

        File folder = new File(path);
        File file = new File(fileName);

        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("폴더를 생성하였습니다.");
        } else {
            System.out.println("이미 존재하는 폴더입니다.");
        }

        try {
            // 필요한 타입   : Path
            // 재공된 타입   : String
            // Files.writeString(folder + "/" + fileName, fileContent);
            Files.writeString(Paths.get(path + "/" + fileName),content);
            System.out.println("파일 생성 및 컨텐츠 작성이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
