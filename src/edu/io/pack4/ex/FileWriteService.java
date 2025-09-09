package edu.io.pack4.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWriteService {
    Scanner sc = new Scanner(System.in);

    public void method1() {

        System.out.print("생성할 파일명 입력하시오 : ");
        String fileName = sc.nextLine();

        System.out.println("'finish'를 작성하면 입력이 종료됩니다.");
        System.out.print("작성할 내용을 입력하시오 : ");


        StringBuilder contents = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).equals("finish")){
            contents.append(line).append("\n");
        }

        Path path = Path.of("my_logs", fileName);

        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, contents);
            System.out.println("파일 생성 완료 : " + fileName);
        } catch (IOException e) {
            // 임시 저장이나 자동 저장 같은 로직을 넣고, 사용자가 파일을 다시 작성할 때
            // 저장된 내용을 불러올 수 있는 유도를 추후 설정하기
            System.out.println("작성 중에 문제가 발생할 때 처리할 로직 작성");
        }
    }
}
