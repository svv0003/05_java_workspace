package edu.io.pack8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class EmployeeFileWriter {

    /*
    String str = "";
    str += "이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n";
    Files.writeString(path, str);

    직원 정보를 추가할 때마다 메모리 상에서는 str이 "종료"를 입력하기 전까지 생성되고,
    기존에 있던 str 공간은 GC에 의해서 삭제된다.


    StringBuilder sb = new StringBuilder();
    sb.append("이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n");
    Files.writeString(path, sb.toString());

    문자열 생성이 완료될 때까지 데이터 추가 가능하며,
    "종료"를 입력하면 데이터 추가 작업이 종료되어
    문자열 기반 파일에 작성되어 누적된 문자열 데이터를 저장한다.

     */

    public void stringMethod() {
        Scanner sc = new Scanner(System.in);

        String str = "";

        System.out.println("종료 입력하면 파일 생성됩니다.");

        while (true) {
            System.out.print("직원 정보 입력 : ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                break;
            }
            System.out.print("부서 : ");
            String 부서 =  sc.nextLine();
            System.out.print("직급 : ");
            String 직급 =   sc.nextLine();

            str += "이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n";
            System.out.println("입력이 완료되었습니다.");
            System.out.println("다른 직원 정보를 입력하거나 종료를 입력하세요");

            // 종료
            Path path = Path.of("files", "employee.txt");
            try {
                Files.createDirectories(path.getParent());
                Files.writeString(path, str);
                System.out.println("파일이 성공적으로 생성되었습니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void builderMethod() {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.println("종료 입력하면 파일 생성됩니다.");

        while (true) {
            System.out.print("직원 정보 입력 : ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                break;
            }
            System.out.print("부서 : ");
            String 부서 =  sc.nextLine();
            System.out.print("직급 : ");
            String 직급 =   sc.nextLine();

            sb.append("이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n");
            System.out.println("입력이 완료되었습니다.");
            System.out.println("다른 직원 정보를 입력하거나 종료를 입력하세요");

            // 종료
            Path path = Path.of("files", "employee.txt");
            try {
                Files.createDirectories(path.getParent());
                Files.writeString(path, sb.toString());
                System.out.println("파일이 성공적으로 생성되었습니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
