package edu.io.pack1.ex;

import java.io.File;
import java.io.IOException;

/*
폴더 내 전체 경로 및 파일 확인 명령어

cmd 창에서 tree /f     폴더별 파일들 모두 확인 가능하다.
 */

public class FilePracticeService {

    // 문제 1번
    // 상대 경로를 이용한 폴더 및 파일 생성하기
    /*
`java_basic` 프로젝트 폴더(현재 작업 디렉토리)를 기준으로, 상대 경로를 사용하여 다음 작업을 수행하는 Java 메소드를 작성하세요.

1. 프로젝트 루트 바로 아래에 `my_logs` 라는 이름의 새 폴더(디렉토리)를 생성합니다.
2. 만약 `my_logs` 폴더가 이미 존재하지 **않는다면** `mkdirs()`를 호출하고, "my_logs 폴더 생성 완료."라고 출력합니다.
3. 생성된 `my_logs` 폴더 내부에 `access_log.log` 라는 이름의 빈 파일을 생성합니다. (`IOException`에 대한 `try-catch` 처리가 필요합니다.)
4. 파일 생성이 성공하면 "access_log.log 파일 생성 성공."이라고 출력합니다.
     */
    public void method1() {

        /*
상대 경로 정의
폴더명 맨 앞에 /가 붙지 않으면 현재 작업하고 있는 프로젝트 내 폴더 경로로 인식한다.
=> java_basic 폴더를 기준으로 폴더 및 파일 생성한다.
         */

        String 경로 = "my_logs";
        String 파일 = "/access_log.log";
        File 폴더생성 = new File(경로);
        File 파일생성 = new File(경로 + 파일);

        if (폴더생성.exists()) {
            System.out.println(폴더생성.getName() + "은 이미 존재하는 폴더입니다.");
        } else {
            폴더생성.mkdirs();
            System.out.println(폴더생성.getName() + " 폴더 생성 완료");
        }
        try {
            if (파일생성.exists()) {
                System.out.println(파일생성.getName() +  "은 이미 존재하는 파일입니다.");
                return;
            }
            파일생성.createNewFile();
            System.out.println(파일생성.getName() + " 파일 생성 완료");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생하였습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("파일 생성을 종료합니다.");
        }
    }

    // 문제 2번
    // 기존 디렉토리 목록 조회 및 유형 판별
    /*
제공된 `tree` 목록에 있는 `src/edu/oop/method/ex` 경로를 참조하세요.

1. `"src/edu/oop/method/ex"` 상대 경로를 사용하여 File 객체를 생성합니다.
2. `listFiles()` 메소드를 사용하여 해당 디렉토리 내부의 모든 파일 및 디렉토리 목록( `File[]` )을 가져옵니다.
3. 반복문을 실행하여 목록에 있는 각 항목의 이름을 가져옵니다.
4. 만약 항목이 파일(`isFile()`)이면 이름 뒤에 **"[파일]"**을, 디렉토리(`isDirectory()`)라면 이름 뒤에 **"[폴더]"**를 붙여서 콘솔에 출력하세요.

**예상 출력 예시:**

`LibraryMember.java[파일]
LibraryRun.java[파일]
LibraryService.java[파일]
...`
     */
    public void method2() {

        // java_basic 폴더에서 src/edu/oop/method/ex 폴더까지 경로 설정
        File logFolder = new File("src/edu/oop/method/ex");

        // 디렉토리 내부 모든 파일 / 디렉토리 목록 가져오기
        File [] 파일들 = logFolder.listFiles();

        System.out.println(logFolder.getParent() + "내부 목록");
        for (File item : 파일들) {
            String name = item.getName();

            if (item.isFile()) {
                System.out.println(name + "[파일]");
            } else if (item.isDirectory()) {
                System.out.println(name + "[폴더]");
            }
        }
    }

    // 문제 3번
    // 파일 생성 확인 및 삭제 처리
    /*
`method3()` 또는 `method4()`에서 사용한 절대 경로를 응용하여 다음 작업을 수행하는 메소드를 작성하세요.

1. 절대 경로 `C:/io_test/temp` 폴더 내부에 `delete_target.txt` 라는 이름의 파일을 생성합니다. (단, `C:/io_test/temp` 폴더가 존재하지 않을 수 있으니 파일 생성 전에 폴더가 있는지 확인하고, 없다면 `mkdirs()`로 먼저 생성해야 합니다.)
2. 파일이 성공적으로 생성되었는지 `exists()`로 확인합니다.
3. 파일이 존재한다면, `delete()` 메소드를 호출하여 `delete_target.txt` 파일을 즉시 삭제합니다.
4. 파일 삭제 후, 다시 `exists()` 메소드를 호출하여 파일이 정말로 삭제되었는지(false가 반환되는지) 확인하고, 그 결과에 따라 "파일 삭제 완료." 또는 "파일 삭제 실패."를 출력합니다.
     */
    public void method3() {

        // 절대 경로로 폴더와 파일을 참조하는 File 객체 생성
        // 경로를 포함한 파일 객체 생성
        String path = "/Users/svv/io_test//temp";
        String fName = "delete_target.txt";

        File tempDir = new File(path);
        File f = new File(tempDir + "/" + fName);

        if (!tempDir.exists()) {
            tempDir.mkdirs();
            System.out.println(tempDir + " 폴더가 존재하지 않아서 생성하였습니다.");
        } else {
            System.out.println(tempDir + "는 이미 존재하는 폴더입니다.");
        }

        try {
            // 파일 생성 시도
            f.createNewFile();
            System.out.println(fName + " 파일을 생성하였습니다.");

            // 파일 생성 성공 여부 확인
            if (f.exists()) {
                System.out.println(fName + " 파일을 확실히 생성하였습니다.");

                if (f.delete()) {
                    System.out.println(f.getName() + " 파일을 삭제했습니다.");
                } else {
                    System.out.println(f.getName() + " 파일 삭제에 실패했습니다.");
                }
            }
            if (!f.exists()) {
                System.out.println("파일 삭제 완료");
            } else {
                System.out.println("파일 삭제 실패");
            }
        } catch (IOException e) {
            System.out.println("파일 생성에 문제가 발생했습니다.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
        }

    }
}
