package edu.io.pack4.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class 파일생성삭제서비스 {

    // createFolder, createFile 메서드 생성 후
    // createFolder로 file/store 폴더 생성
    // createFile에서는 file/store 폴더가 존재하는지 확인하고, 존재하면 Book.txt 파일 생성
    // 더조은책방 - 책 리스트 한 줄 추가, 생성 완료까지 확인하기

    public void createFolder(){

        Path path = Path.of("file/store");
        if (!Files.exists(path)) {

        }


    }

    public void createFile(){



    }
}
