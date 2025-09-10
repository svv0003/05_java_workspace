package edu.io.pack5.ex;

import java.io.IOException;
import java.util.Scanner;

public class 이미지URL실행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        이미지URL서비스 service = new 이미지URL서비스();

        System.out.print("이미지 주소 입력 : ");
        String imgURL = sc.nextLine();
        System.out.print("이미지 이름 입력 : ");
        String name = sc.nextLine();
        String imgName = name + ".png";
        System.out.print("이미지 폴더 입력 : ");
        String folderName = sc.nextLine();

        service.dirSaveImg(imgURL, imgName, folderName);
    }
}
