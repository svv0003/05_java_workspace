package edu.io.pack7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoginLog {

    public void login() {
        Path path = Path.of("C", "더조은회사", "login.log");

        try {
            Files.createDirectories(path.getParent());
            System.out.println("로그인 기록 파일이 생성됐습니다.");
            /*
            Files.writeString(path, "유저가 로그인한 정보\n");                               // 기본 값 : create
            Files.writeString(path, "유저가 로그인한 정보\n",  StandardOpenOption.CREATE);   // 무조건 파일 다시 만들기
            Files.writeString(path, "유저가 로그인한 정보\n",  StandardOpenOption.APPEND);   // 무조건 내용 이어 작성하기
             */
            String loginInfo = 현재시간가져오기() + " 로그인한 정보\n";

            Files.writeString(path, loginInfo,  StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("유저가 로그인한 정보를 작성 완료했습니다.\n개발자 단순 코드 확인용");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void logout() {
        Path path = Path.of("C", "더조은회사", "login.log");

        try {
            Files.createDirectories(path.getParent());
            String logoutInfo = 현재시간가져오기() + " 로그아웃한 정보\n";
            Files.writeString(path, logoutInfo, StandardOpenOption.APPEND);
            System.out.println("유저가 로그아웃한 정보를 작성 완료했습니다.\n개발자 단순 코드 확인용");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 로그인, 로그아웃 시간 기록하기
    public String 현재시간가져오기() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public void 시간비교() {
        long a = System.currentTimeMillis();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("a : " + a);
        System.out.println("now : " + now);
    }

    /*
파일명 다르게 설정할 때 자주 사용한다.
System.currentTimeMillis ( )                                                            1970년 01월 01일 00시 00분 00초부터 흐른 시간을 숫자로 표현한다.

로그인시간, 채팅 보낸 시간 기록하고 보여줄 때 사용한다.
LocalDateTime.now ( )                                                                   현재 시간을 문자열 형태로 출력한다.
DateTimeFormatter.ofPattern ("회사에서 원하는 시간 형태")                               회사에서 원하는 시간 형태로 변환한다.
LocalDateTime.now ( ).format (DateTimeFormatter.ofPattern ("yyyy-MM-dd HH:mm:ss"))      지정 시간 형태로 출력한다.
     */
}
