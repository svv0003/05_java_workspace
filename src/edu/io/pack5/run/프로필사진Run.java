package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진Service;

import java.util.Scanner;

public class 프로필사진Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        프로필사진Service service = new 프로필사진Service();

        // service.createProfileFolder("member03", "프로필사진2.png");
        // service.createProfileFolder("member04", "프로필사진2.png");

        // String imgURL = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";

        System.out.print("저장할 이미지 주소 입력 : ");
        String imgURL = sc.nextLine();
        // service.saveIMG(imgURL);

        System.out.print("저장할 사진 명칭 입력 : ");
        String name = sc.nextLine();
        String imgName = name + ".png";
        // service.saveIMG2(imgURL, imgName);

        System.out.print("저장할 폴더 명칭 입력 : ");
        String folderName = sc.nextLine();
        service.saveIMG3(imgURL, imgName, folderName);
    }
}
