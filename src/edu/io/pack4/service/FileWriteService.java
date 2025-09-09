package edu.io.pack4.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileWriteService {
    Scanner sc = new Scanner(System.in);

    public void 고전방식() {
        System.out.print("생성할 파일명을 입력하세요 : ");
        String fileName = sc.nextLine();

        System.out.println("'종료'를 입력하면 파일 작성이 종료됩니다.");
        System.out.print("작성할 파일 내용을 입력하세요 : ");

        // 문자열로 빌딩을 짓는 것처럼, 문자열을 쌓아 올려 만드는 클래스
        StringBuilder content = new StringBuilder();
        String line;

        while(!(line = sc.nextLine()).equals("종료")){
            // 한 줄씩 작성 후 엔터를 입력하면 내용 사이에 줄바꿈 처리한다.
            content.append(line).append("\n");
        }

        // 모두 작성하기 종료하면 files/파일명으로 저장하기
        File file = new File("files/" + fileName);

        // 디렉토리 없으면 생성하기
        if(!file.exists()){
            // 폴더 먼저 생성하기
            file.getParentFile().mkdirs();
        }

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(content.toString());
            System.out.println("파일 생성 및 작성 완료 : " + fileName);
        } catch (IOException e) {
            System.out.println("파일 작성 중 오류 발생");
        } finally{
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패하였습니다.");
                }
            }
            sc.close(); // 스캐너 입력 닫기 처리
        }
    }

    public void 현대방식() {
        System.out.print("생성할 파일명을 입력하세요 : ");
        String fileName = sc.nextLine();

        System.out.println("'종료'를 입력하면 파일 작성이 종료됩니다.");
        System.out.print("작성할 파일 내용을 입력하세요 : ");

        // 건물처럼 층층이 문자열을 쌓는 기능
        StringBuilder content = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).equals("종료")) {
            content.append(line).append("\n");
        }

        //
        Path path = Path.of("files/" + fileName);

        try {
            // getParent    : 파일명.확장자명이 나오기 전까지의 폴더 경로
            // 폴더들이 존재하지 않으면 생성 mkdir/mkdirs로 구분하지 말고,
            // 폴더들이라는 전제하에 없다면 생성하겠다.
            // => createDirectories() 기능 사용!
            Files.createDirectories(path.getParent());
            // 경로+파일 내 내용 작성하고 저장하기
            // 저장한다는 것은 close와 같기 때문에 굳이 close() 작성할 필요 없다.
            Files.writeString(path, content.toString());
            System.out.println("파일 생성 완료 : " + fileName);
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생");
        }
    }
}
