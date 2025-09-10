package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 프로필사진Service {

    // 1으로 끝나는 명칭들만 이용해서 member03, member04 폴더에 각각 프로필사진2.txt 저장
    public void createProfileFolder(String memberNumber, String profilePicture) {

        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        Path memberFolder1 = Path.of("profiles", memberNumber);
        // Path memberFolder2 = Path.of("profiles", "member02");

        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder1);
            // Files.createDirectories(memberFolder2);

            // 3. 폴더 내 프로필 사진 저장
            Path picture1 = Path.of("profiles", memberNumber, profilePicture);
            // Path picture2 = Path.of("profiles", "picture02", "프로필사진02.png");

            Files.writeString(picture1, "프로필 사진 이미지입니다.");
            // Files.writeString(picture2, "프로필 사진 이미지입니다.");

            System.out.println("프로필 사진이 개별 폴더에 저장되었습니다.");

        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생했을 때 문제 해결");

            // 1. 메인 서버가 끊기면 2번째 후보 서버에 저장하도록
            // 2. 이미지 용량이 5MB 이상이라면 저장 못하도록 하고, 사용자에게 알리기
        }
    }

    // 이미지 주소로 이미지 저장하기
    public void saveIMG(String imgURL) {

        // String imgURL = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";

        Path memberFolder1 = Path.of("profiles", "member06");

        try {

            Files.createDirectories(memberFolder1);
            Path picture1 = Path.of("profiles", "member06", "사진1.png");

            // 4. 이미지 주소에서 이미지 다운로드 처리
            System.out.println("이미지 다운로드 중 ...");
            URL url = new URL(imgURL);
            InputStream inputStream = url.openStream();

            // 5. 파일로 저장하기
            Files.copy(inputStream, picture1, StandardCopyOption.REPLACE_EXISTING);
            inputStream.close();

            /*
URL url = new URL(imgURL);
URL         클라이언트가 작성한 이미지 주소를 java에서 (읽거나 쓰거나) 사용할 수 있도록 설정하는 문서

InputStream inputStream = url.openStream();
InputStream 인터넷의 데이터가 흘러들어오는 통로를 만든다.
            이미지 주소에서 데이터가 들어올 수 있도록 통로를 열어두는 기능

Files.copy(inputStream, picture1, StandardCopyOption.REPLACE_EXISTING);
(선택사항)
인터넷에 존재하는 이미지를 내 컴퓨터에 복제한다.
기존에 이미지이름이 존재한다면 덮어쓰기 형태로 이미지이름에 현재 저장하려는 데이터로 덮어쓰기

inputStream.close();
데이터를 모두 가져온 후 데이터를 복사하여 컴퓨터 내에 저장 완료되면
데이터가 들어오는 통로를 닫는 설정을 해주어야 저장이 완료된다.

             */

            System.out.println("프로필 사진이 개별 폴더에 저장되었습니다.");

        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생했을 때 문제 해결");
        }
    }

    public void saveIMG2(String imgURL,  String imgName) {

        Path memberFolder1 = Path.of("profiles", "member07");

        try {

            Files.createDirectories(memberFolder1);
            Path picture1 = Path.of("profiles", "member07", imgName);

            System.out.println("이미지 다운로드 중 ...");
            URL url = new URL(imgURL);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, picture1);
            inputStream.close();

            System.out.println("프로필 사진이 개별 폴더에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생했을 때 문제 해결");
        }
    }

    // Scanner를 사용하여 폴더명, 이미지명를 설정하고, 이미지 주소를 입력받아 저장하기
    public void saveIMG3(String imgURL, String imgName, String folderName) {

        Path memberFolder1 = Path.of("profiles", folderName, imgName);

        try {

            // 폴더가 없다면 생성, 있다면 false 넘어가기
            Files.createDirectories(memberFolder1.getParent());

            URL url = new URL(imgURL);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, memberFolder1);
            inputStream.close();

            System.out.println("이미지 저장 완료");
        } catch (IOException e) {
            System.out.println("이미지 다운로드 실패");
            // 더 자세한 오류 정보 출력
            if (e.getMessage().contains("403")){
                System.out.println("위키피아에서 접근을 거부했습니다.");
            }
        }


    }
}

/*
png
투명도를 지원하는 비손실 압축
로고, 아이콘 등 투명 배경이 필요한 이미지 사용한다.
파일 크기가 크거나 여러 번 수정해야 할 때 주로 사용한다.

jpg
투명도를 지원하지 않는 손실 압축
사진, 그라데이션, 배너 등 완성된 사진을
압축하여 데이터 크기를 줄여 사용할 때 용이하다.

svg
확장 가능한 이미지
크기에 맞춰 매번 공식을 계산 후 표현되기 때문에
이미지를 아무리 확대하거나 축소해도
절대 깨지지 않는 디지털 이미지 형태
수학 공식으로 이미지를 설계한다.
 */