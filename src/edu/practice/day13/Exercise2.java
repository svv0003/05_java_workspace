package edu.practice.day13;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Exercise2 {

    public void solution1() {
        /*
student; 폴더 생성
info.txt; 파일 생성
이름: 홍길동나이: 25전공: 컴퓨터공학학년: 3학년
- 성공 시 "학생 정보 파일이 생성되었습니다." 출력
- 파일 생성 후 내용을 다시 읽어서 화면에 출력
학생 정보 파일이 생성되었습니다.
=== 파일 내용 ===
이름: 홍길동
나이: 25
전공: 컴퓨터공학
학년: 3학년
         */

        Path studentDir = Path.of("student");
        Path filePath = studentDir.resolve("info.txt");
        String content = "이름: 홍길동\n나이: 25\n전공: 컴퓨터공학\n학년: 3학년\n";

        try {
            Files.createDirectories(studentDir);
            System.out.println(filePath.getParent() + " 생성되었습니다.");
            Files.writeString(filePath, content);
            System.out.println(filePath.getFileName() + " 내용이 작성되었습니다.");
            // readString은 컴퓨터가 읽는 용도일 뿐, 사용자에게 보여주지 않는다.
            Files.readString(filePath);
            System.out.println(Files.readString(filePath));
            System.out.println("학생 정보 파일이 생성되었습니다.");

            String fileContent = Files.readString(filePath);
            System.out.println("=== 파일 내용 ===");
            System.out.println(fileContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void solution2() {
/*
downloads/text; 폴더 생성
- URL: ;"https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ=="; 에서 텍스트 다운로드
downloaded_data.txt; 파일로 저장
- 다운로드 완료 후 파일 내용 출력
- 성공 시 "텍스트 다운로드 완료: downloads/text/downloaded_data.txt" 출력

텍스트 다운로드 완료: downloads/text/downloaded_data.txt
다운로드된 내용: Hello World! Java File IO Practice
 */

        Path textDir = Path.of("downloads", "text","downloaded_data.txt");
        String textUrl = "https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ==";

        try {
            // 경로 실제로 생성
            Files.createDirectories(textDir.getParent());
            // URL 생성
            URL url = new URL(textUrl);
            // 통로 생성
            // InputStream in = url.openStream();
            // 가져온 파일 저장하기
            if (!Files.exists(textDir)) {
                Files.copy(url.openStream(), textDir, StandardCopyOption.REPLACE_EXISTING);
            }

            System.out.println("텍스트 다운로드 완료 : " +  url.getPath());
            System.out.println("다운로드된 내용 : ");

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution3() {

        /*
backup; 폴더 생성
- 기본 파일명: ;document.txt;
- 파일 내용: "이것은 백업 문서입니다."
- 이미 같은 이름의 파일이 존재하면 document_1.txt, document_2.txt 형식으로 생성
- 3번 실행하여 3개의 파일이 생성되는지 확인
- 각 파일 생성 시 "파일이 저장되었습니다: [파일명]" 출력

파일이 저장되었습니다: document.txt
파일이 저장되었습니다: document_1.txt
파일이 저장되었습니다: document_2.txt
         */

        Path backupDir = Path.of("backup");          // 1) 경로 설정
        String baseName = "document";
        String extension = ".txt";
        String content = "이것은 백업 문서입니다.";

        Path textDir = backupDir.resolve(baseName+extension);
        // 기존 경로와 파일명을 이어 작성할 때 주로 사용하지만
        // 처음에 작성할 때 Path.of로 완벽한 경로를 설정한 후
        // 경로 내에 파일명이 들어가도록 작성하는게 대부분이다.
        int count = 1;

        try {

            Files.createDirectories(backupDir);            // 2) 경로 존재 유무 확인 후 생성

            while (Files.exists(textDir)) {
                String newName = baseName + count + extension;
                textDir = backupDir.resolve(newName);
                // 추후 문제가 발생할 경우 실행할 작업은 맨 아래에 작성하도록 한다.
                count++;
            }
            System.out.println(textDir);
            Files.writeString(textDir, content);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void solution4() {
        /*
- 1단계: ;temp; 폴더에 ;data.txt; 파일 생성 (내용: "중요한 데이터 파일")
- 2단계: ;archive; 폴더와 ;backup; 폴더 생성
- 3단계: ;temp/data.txt;를 ;archive/data.txt;로 이동
- 4단계: 동시에 ;backup/data_backup.txt;로 복사
- 각 단계마다 진행 상황 출력

1단계: 임시 파일 생성 완료 - temp/data.txt
2단계: 폴더 생성 완료 - archive, backup
3단계: 파일 이동 완료 - temp/data.txt -> archive/data.txt
4단계: 백업 복사 완료 - backup/data_backup.txt
모든 작업이 완료되었습니다.
         */

        Path tempDir = Path.of("temp");
        Path archiveDir = Path.of("archive");
        Path backupDir = Path.of("backup");
        Path sourceFile = tempDir.resolve("data.txt");
        Path targetFile = archiveDir.resolve("data.txt");
        Path backupFile = backupDir.resolve("data_backup.txt");
        /*
        Files.move()/
        Files.copy();
        StandardCopyOption.REPLACE_EXISTING
         */

        try {
            Files.createDirectories(tempDir);
            Files.writeString(sourceFile, "임시데이터");
            System.out.println("1단계 : 임시 파일 생성 완료 - " + sourceFile);

            Files.createDirectories(archiveDir);
            Files.createDirectories(backupDir);
            System.out.println("2단계 : 폴더 생성 완료 - " + archiveDir.getFileName() + ", " + backupDir.getFileName());

            Files.move(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("3단계 : 파일 이동 완료 - " + sourceFile + " -> " + targetFile);

            Files.copy(targetFile, backupFile,  StandardCopyOption.REPLACE_EXISTING);
            System.out.println("4단계 : 백업 복사 완료 - " + backupFile);
            System.out.println("모든 작업 완료되었습니다.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution5() {
        /*
logs; 폴더 생성
- 현재 시간을 이용한 파일명 생성: ;log_[타임스탬프].txt;
- 사용자로부터 로그 메시지를 계속 입력받음
- "종료"를 입력하면 파일 저장하고 프로그램 종료
- 각 로그 메시지 앞에 현재 시간 추가
- 저장 완료 후 파일명과 저장된 로그 개수 출력

=== 로그 생성기 시작 ===
로그 메시지를 입력하세요 ('종료'를 입력하면 저장됩니다):
> 시스템 시작
> 사용자 로그인 성공
> 데이터베이스 연결 완료
> 종료

로그 파일이 저장되었습니다: logs/log_1694567890123.txt
총 3개의 로그가 저장되었습니다.
         */

        Path logsDir = Path.of("logs");
        Scanner sc = new Scanner(System.in);
        StringBuilder content = new StringBuilder();
        long timestamp = System.currentTimeMillis();
        String fileName = "log_" + timestamp + ".txt";
        int logCount = 0;
        new java.util.Date();
    }


}
