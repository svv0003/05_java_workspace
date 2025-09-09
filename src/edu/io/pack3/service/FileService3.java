package edu.io.pack3.service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService3 {

    public void 고전방식() {

        File file = new File("files/파일2.txt");

        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            // 파일이 존재하지 않기 때문에 기능 멈춤 처리
            return;
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));

            // 가져온 파일 내용(글자)들이 null 값일 때까지 한 줄씩 읽고 출력하기
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("읽을 수 있는 파일이 존재하지 않습니다.");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제 발생했을 때의 로직을 작성하기");
        } finally {
            if (br != null) {
                try {
                    // 모두 읽은 파일을 닫을 때 문제 발생할 수 있으니까
                    // try-catch로 작성하여 발생 가능한 문제에 대한 처리 로직을 catch에 작성하기
                    br.close();
                } catch (Exception e) {
                    System.out.println("파일이 다른 곳에서 사용 중입니다.\n파일을 닫고 다시 시도해주세요.");
                }
            }
        }


    }

    public void 현대방식() {

        // 폴더와 파일 구분을 알아서 하여 /로 경로를 작성하기 때문에 편리하다.
        Path path = Path.of("files", "파일2.txt");

        if (!Files.exists(path)) {
            System.out.println("파일이 없습니다.");
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
            // 파일을 다 읽으면 알아서 닫히므로 별도의 설정은 필요 없다.
            // 매우 간단하다!
        } catch (IOException e) {
            throw new RuntimeException("파일을 읽는 도중에 발생하는 문제에 대한 처리 로직 작성하기");
        }

    }
}
