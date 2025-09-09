package edu.io.pack3.ex;

import java.util.Scanner;

public class FilePracticeRun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FilePracticeService practiceService = new FilePracticeService();
        // practiceService.method1();

        System.out.print("폴더를 입력하시겠습니까? (Yes/No) : ");
        String answer = sc.nextLine().trim().toLowerCase();
        String dirName = "";
        if (answer.equals("yes") || answer.equals("y")) {
            System.out.print("폴더명을 입력하세요 : ");
            dirName = sc.nextLine().trim().toLowerCase();
        } else {
            dirName = "";
            System.out.println("기본 프로젝트 최상위 폴더로 설정됩니다.");
        }

        System.out.print("파일명.확장자명을 작성하세요 : ");
        String fileName = sc.nextLine();
        practiceService.method1(dirName, fileName);  // intro.txt

    }

}
