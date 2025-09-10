package edu.practice.day12;

import java.util.Scanner;

public class ExerciseRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exercise1 ex =  new Exercise1();

        System.out.println("문제 1번");
        System.out.print("폴더명 입력 : ");
        String dirName = sc.nextLine();
        System.out.print("파일명 입력 : ");
        String fileName = sc.nextLine();
        ex.method1(dirName, fileName);
        System.out.println();

        System.out.println("문제 2번");
        ex.method2(dirName, fileName);
        System.out.println();

        System.out.println("문제 3번");
        ex.method3(dirName, fileName);
        System.out.println();

        System.out.println("문제 4번");
        ex.method4();
        System.out.println();

        System.out.println("문제 5번");
        System.out.print("상위 폴더명 입력 : ");
        String folder1 = sc.nextLine();
        System.out.print("중간 파일명 입력 : ");
        String folder2 = sc.nextLine();
        System.out.print("하위 파일명 입력 : ");
        String folder3 = sc.nextLine();
        ex.method5(folder1, folder2, folder3);
        System.out.println();
    }
}
