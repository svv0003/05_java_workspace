package edu.io.pack5.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 프로필사진Service {

    public void createProfileFolder() {

        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        Path memberFolder1 = Path.of("profiles", "member01");
        Path memberFolder2 = Path.of("profiles", "member02");

        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder1);
            Files.createDirectories(memberFolder2);

            // 3. 폴더 내 프로필 사진 저장
            Path picture1 = Path.of("profiles", "picture01", "프로필사진01.png");
            Path picture2 = Path.of("profiles", "picture02", "프로필사진02.png");

            Files.writeString(picture1, "프로필 사진 이미지입니다.");
            Files.writeString(picture2, "프로필 사진 이미지입니다.");

            System.out.println("프로필 사진이 개별 폴더에 저장되었습니다.");

        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생했을 때 문제 해결");

            // 1. 메인 서버가 끊기면 2번째 후보 서버에 저장하도록
            // 2. 이미지 용량이 5MB 이상이라면 저장 못하도록 하고, 사용자에게 알리기
        }

    }

}
