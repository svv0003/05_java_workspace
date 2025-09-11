package edu.io.pack5.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 중복된_파일_폴더명칭_Service {

    public void saveImage1() {

        String originName = "사진.png";
        Path path = Path.of("profiles", "member01", originName);
        int dot = originName.lastIndexOf('.');
        // originName의 문자열 idx 0번부터 . 전까지 가져온다.
        String baseName = originName.substring(0, dot);
        // originName의 문자열 .부터 끝까지 가져온다.
        String extName = originName.substring(dot);

        System.out.println("dot 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);

        int count = 1;
        do {
            String newName = baseName + " (" + count + ")" + extName;
            path = Path.of("profiles", "member01", newName);
            System.out.println("newName : " + newName);
            count++;
        } // 파일명이 존재하지 않을 때까지 반복한다.
        while (Files.exists(path));

        try {

            // profile/member01까지만 포함한다.
            Files.createDirectories(path.getParent());

            String 이미지주소 = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";
            URL url = new URL(이미지주소);
            InputStream inputStream = url.openStream();
            Files.copy(inputStream, path);
            // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream 종료
            inputStream.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
while 을 이용해서 원본파일이름 이외
동일한 파일명칭이 없을 때까지 반복수행
조건이 true 이어야지만 실행
    */
    public void saveImage2(){

        String originName = "사진.png";

        Path path = Path.of("profiles","member01",originName);
        int dot = originName.lastIndexOf('.'); // . 이 몇번재에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일이름 처음부터 .이 존재하기 전까지의 파일 명칭을 가져오는 방법
        String extName = originName.substring(dot); // .확장자 이름을 가지고 있는 상태

        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);
        int count = 1;

        while (Files.exists(path)){
            //존재하지 않으면 알아서 while 문 종료 ~
            String NewName = baseName + "_" + count +  extName;
            System.out.println("newName : " + NewName);


            path = Path.of("profiles","member01",NewName);
            count++;
        }


        try {
            Files.createDirectories(path.getParent());// profile/member01 까지만 포함
            String imgURL = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTZWlPjghR3F6rno2RtA56T9mRyUL_BWILiAmpxP0-npm6nmw-Gsm9AFDYLAl8paow4CEKMeRHaQn39tB4VniZan8svg2JIpXXOO6L84F4";
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream을 종료
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
타임 스탬프

현재시간을 이용해서 현재시간으로 명칭 구분한다.
System.currentTimeMillis()

1970년 1월 1일 00:00:00 부터 현재까지 얼마나 흘렀는지 숫자로 나타낸 것
0.001 초로 매우 정밀하며, 이 정밀함을 넘어서 동일한 사진명칭이다?
동시에 같은 파일을 저장해도 회사컴퓨터로 데이터 저장이 순차적으로 넘어오기 때문에
겹칠일이 없음
     */

    public void saveImage3(){

        String originName = "사진.png";

        Path path = Path.of("profiles","member01",originName);
        int dot = originName.lastIndexOf('.'); // . 이 몇번재에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일이름 처음부터 .이 존재하기 전까지의 파일 명칭을 가져오는 방법
        String extName = originName.substring(dot); // .확장자 이름을 가지고 있는 상태

        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);


        while (Files.exists(path)){
            // 존재하지 않으면 알아서 while 문 종료 ~
            String NewName = baseName + "_" + System.currentTimeMillis() +  extName;
            System.out.println("newName : " + NewName);

            path = Path.of("profiles","member01",NewName);

        }


        try {
            Files.createDirectories(path.getParent());// profile/member01 까지만 포함
            String imgURL = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTZWlPjghR3F6rno2RtA56T9mRyUL_BWILiAmpxP0-npm6nmw-Gsm9AFDYLAl8paow4CEKMeRHaQn39tB4VniZan8svg2JIpXXOO6L84F4";
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream을 종료
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveImage4(){

        String originName = "사진.png";

        Path path = Path.of("폴더1",originName);
        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);

        int count = 1;
        while (Files.exists(path)){
            String NewName = baseName + "_" + count +  extName;

            path = Path.of("폴더1",NewName);
            count++;
        }

        try {
            Files.createDirectories(path.getParent());// profile/member01 까지만 포함
            String imgURL = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTZWlPjghR3F6rno2RtA56T9mRyUL_BWILiAmpxP0-npm6nmw-Gsm9AFDYLAl8paow4CEKMeRHaQn39tB4VniZan8svg2JIpXXOO6L84F4";
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream을 종료
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveImage5() {

        String imgUrl = "https://naverpa-phinf.pstatic.net/MjAyNTA4MjBfMTgg/MDAxNzU1Njg0NTc4ODc3.Y-_Ks1i_T3Ux2BOuq4u_XIeJd-VsniNITndfK_DFvdMg._qhzEI1Altf_fKVhZXcdJR2wT4FuX60aFRs0kMavvx8g.JPEG/1200x1200px_Type_%286%29_175568457883810866111258157700758.jpg";
        String originName = "사진.png";

        Path path = Path.of("profiles","member01", originName);

        int 마침표위치 = originName.lastIndexOf('.');
        String 기본이름 = originName.substring(0, 마침표위치);
        String 확장자이름 = originName.substring(마침표위치);
        int count = 1;
        while (Files.exists(path)) {
            System.out.println("count : " + count);
            String 새로운이름 = 기본이름 + " (" +  count + ")" + 확장자이름;
            path = Path.of("profiles","member01", 새로운이름);
            // 혹시 현재 작성한 숫자 번호를 포함한 파일명이 존재할 수 있으므로 count를 +1 상태로 유지한다.
            count++;
        }

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);
            System.out.println("사진 저장 완료");
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void kakaoSave(String imgUrl) {

        String kakaoName = "KakaoTalk_" + System.currentTimeMillis() + ".jpg";
        Path path = Path.of("profiles","kakaoTalk", kakaoName);

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);
            System.out.println("사진 저장 완료");
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method1() {

        Path path = Path.of ("/Users", "svv", "folder1", "파일이름.txt");
        Path a = path.getParent();

        try {
            Files.createDirectories(a);
            Files.writeString(path, "안녕하세요");
            System.out.println(path);
            System.out.println(path.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
