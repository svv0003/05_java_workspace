package edu.practice.day3;

public class PracticeRun {
    public static void main(String[] args) {
        Practice1 p1 = new Practice1("운수좋은날", "김불암", 19000);
        Practice2 p2 = new Practice2("아이폰 SE3", 27);
        Practice3 p3 = new Practice3("1002-123-123456", 1000000, 0);
        Practice4 p4 = new Practice4();
        Practice5 p5 = new Practice5();

        // 원하는 문제의 주석을 해제하고 실행하세요
        System.out.println("=== 문제 1: 도서 관리 클래스 ===");
        p1.method1();

        System.out.println("\n=== 문제 2: 스마트폰 클래스 ===");
        p2.method2(22, 45);

        System.out.println("\n=== 문제 3: 은행계좌 업그레이드 ===");
        p3.setAccountHoler("박세원");
        p3.setPassword("1234");
        p3.method3("1234", 200000, "현윤선");

        System.out.println("\n=== 문제 4: 학생 성적 관리 시스템 ===");
        // p4.method4();

        System.out.println("\n=== 문제 5: 자동차 관리 시스템 ===");
        //p5.method5();
    }
}
