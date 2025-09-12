package edu.practice.day14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day14Practice {

    public void saveMemo() {
        Path memoDir = Path.of("src", "edu","practice","day14","memo");
        Path memoFile = Path.of("src", "edu","practice","day14","memo", "my_memo.txt");
        String content = "오늘은 Java 파일 처리를 배우는 날!\n화이팅!";

        try {
            Files.createDirectories(memoDir);
            Files.writeString(memoFile, content, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("메모가 저장되었습니다 : " + memoFile.getFileName());
            System.out.println("저장된 내용 : \n" + Files.readString(memoFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeDiary() {
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path diaryDir = Path.of("src", "edu","practice","day14","diary");
        Path diaryFile = Path.of("src", "edu","practice","day14","diary", today + "_일기.txt");
        String content = today + " 일기\n오늘 배운 것: Java 파일 입출력\n기분: 좋음!";

        try {
            Files.createDirectories(diaryDir);
            Files.writeString(diaryFile, content, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("일기가 저장되었습니다 : " + diaryFile.getFileName());
            System.out.println("저장된 내용 :  \n" + Files.readString(diaryFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recordVisitor() {
        Path logDir = Path.of("src", "edu","practice","day14","visitors");
        Path logFile = Path.of("src", "edu","practice","day14","visitors", "visitor_log.txt");
        String timestamp = getCurrentTime();
        String visitInfo = timestamp + " - 새로운 방문자가 들어왔습니다.\n";

        System.out.println("방문자 기록이 추가되었습니다");
        System.out.println("=== 전체 방문자 기록 ===");
        System.out.println();

        try {
            Files.createDirectories(logDir);
            Files.writeString(logFile, visitInfo, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("방문자가 추가되었습니다.");
            System.out.println("=== 전체 방문자 기록 ===\n" + Files.readString(logFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createConfig() {
        Path configDir = Path.of("src", "edu","practice","day14","config");
        Path configFile = Path.of("src", "edu","practice","day14","config", "app_config.txt");
        String config = "=== 앱 설정 파일 ===\n버전: 1.0\n언어: 한국어\n테마: 기본\n생성일: " + getCurrentTime();

        try {
            if (Files.exists(configFile)) {
                System.out.println("기존 설정 파일을 업데이트합니다.");
                Files.write(configFile, config.getBytes(), StandardOpenOption.CREATE);
            } else {
                System.out.println("새로운 설정 파일을 생성합니다.");
                Files.createDirectories(configDir);
                Files.writeString(configFile, config, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println("설정 파일이 생성되었습니다 : " + configFile.getFileName());
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
