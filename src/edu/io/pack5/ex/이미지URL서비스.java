package edu.io.pack5.ex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 이미지URL서비스 {

    public void dirSaveImg(String imgURL, String imgName, String imgDir) {

        Path path = Path.of(imgDir, imgName);

        System.out.println("path : " + path);
        System.out.println("path.getParent() : " + path.getParent());

        // 파일명 중복 처리

        try {

            /*
path : animal/animal.png
path.getParent()   : 모든 폴더 경로를 가져오는 기능
path.getFileName() : 경로의 마지막에 존재하는 폴더명 또는 파일명을 가져오는 기능

이름 뒤에 확장자가 붙으면 확장자를 지운 뒤에 파일명 수정 작업해야 한다.
             */
            // 파일명 가져오기
            String name = path.getFileName().toString();
            // 확장자 제거하기
            int dot = name.lastIndexOf('.');
            // . 을 제외한 이전의 문자열
            String baseName = name.substring(0, dot);
            // . 을 포함한 이후의 문자열
            String extName = name.substring(dot);
            System.out.println("baseName : " + baseName);
            System.out.println("extName : " + extName);

            int count = 1;

            do {
                // 파일 생성할 때마다 중복 숫자 포함하기
                String newName = baseName + " (" + count + ")" + extName;
                path = Path.of(imgDir, newName);
                count++;
            } while (Files.exists(path));



            Files.createDirectories(path.getParent());
            // URL 불러오기
            URL url = new URL(imgURL);
            // 이미지 데이터 불러오기
            InputStream in = url.openStream();
            // 이미지 복제하여 저장하기
            // 중복 시 덮어쓰기 설정 X
            Files.copy(in, path);

        } catch (FileAlreadyExistsException e) {
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }


}
