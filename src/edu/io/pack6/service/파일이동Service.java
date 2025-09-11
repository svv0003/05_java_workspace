package edu.io.pack6.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 파일이동Service {

    public void moveFile1() {

        Path 기존파일위치 = Path.of("animal", "animal.png");
        Path 옮길파일위치 = Path.of("animal","lion", "animal.png");

        try {

            // 기존 위치한 파일에서 이동할 파일의 폴더가 존재하지 않을 경우
            // 먼저 폴더 생성한다.
            Files.createDirectories(옮길파일위치.getParent());
            Files.move(기존파일위치, 옮길파일위치);

            System.out.println(기존파일위치 + " -> " + 옮길파일위치 + " : 이동 완료");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
