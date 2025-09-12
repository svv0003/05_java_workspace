package edu.io.pack8.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringBuilderService {
    Scanner sc = new Scanner(System.in);

    public void saveBooks() {

        /*
도서 정보를 입력하세요 (완료를 입력하면 저장됩니다)
제목: 자바의 정석
저자: 남궁성
출판년도: 2022
제목: 완료

도서 목록이 저장되었습니다: book_list.txt
저장된 내용:
제목: 자바의 정석, 저자: 남궁성, 출판년도: 2022
         */
        String fileName = "books.txt";
        Path path = Path.of("books", fileName);
        StringBuilder sb = new StringBuilder();

        System.out.println("도서 정보를 입력하세요 (완료를 입력하면 저장됩니다)");
        while (true) {
            System.out.print("제목 : ");
            String bookName = sc.nextLine();
            if (bookName.equals("완료")) {
                break;
            }
            System.out.print("저자 : ");
            String author = sc.nextLine();
            System.out.print("출판년도 : ");
            String publisher = sc.nextLine();
            sb.append("제목 : " + bookName + ", 저자 : " + author + ", 출판년도 : " + publisher);
            System.out.println("입력이 완료되었습니다.");

            try {
                Files.createDirectories(path.getParent());
                Files.writeString(path, sb.toString());
                System.out.println("도서 목록이 저장되었습니다 : " + fileName);
                System.out.println("저장된 내용 : \n" + Files.readString(path) + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void manageGrades() {
        String fileName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "성적표.txt";
        Path path = Path.of("grades", fileName);
        StringBuilder sb = new StringBuilder();

        System.out.println("학생 성적을 입력하세요 (종료를 입력하면 저장됩니다)");
        while (true) {
            System.out.print("이름 : ");
            String 이름 = sc.nextLine();
            if (이름.equals("종료")) {
                break;
            }
            System.out.print("국어 : ");
            int 국어 = sc.nextInt();
            System.out.print("영어 : ");
            int 영어 = sc.nextInt();
            System.out.print("수학 : ");
            int 수학 = sc.nextInt();
            sc.nextLine();
            sb.append("이름 : " + 이름 + "\n국어 : " + 국어 + "\n영어 : " + 영어 + "\n수학 : " + 수학 + "\n평균 점수 : " + (국어 + 영어 + 수학)/3 + "\n");
            System.out.println("입력이 완료되었습니다.");

            try {
                Files.createDirectories(path.getParent());
                Files.writeString(path, sb.toString());
                System.out.println("학생 성적이 저장되었습니다 : " + fileName);
                System.out.println("저장된 내용 : \n" + Files.readString(path) + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void recordCount() {

        String fileName = "account_book.txt";
        Path path = Path.of("household", fileName);
        StringBuilder sb = new StringBuilder();

        System.out.println("가계부 내역을 입력하세요 (끝을 입력하면 저장됩니다)");
        while (true) {
            System.out.print("항목 : ");
            String 항목 = sc.nextLine();
            if (항목.equals("끝")) {
                break;
            }
            System.out.print("금액 : ");
            int 금액 = sc.nextInt();
            sc.nextLine();
            System.out.print("수입/지출 : ");
            String 수입지출 = sc.nextLine();
            sb.append(getCurrentTime() + " " + 항목 + " : " + 금액 + "원 (" + 수입지출 + ")\n");
            System.out.println("입력이 완료되었습니다.");

            try {
                Files.createDirectories(path.getParent());
                Files.writeString(path, sb.toString());
                System.out.println("가계부 기록이 추가되었습니다 : " + fileName);
                System.out.println("=== 전체 가계부 기록 === \n" + Files.readString(path) + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
