package edu.practice.day4;

public class PracticeRun {
    public static void main(String[] args) {

        Practice1 Exam1_1 = new Practice1("김자바", "2024001", 85);
        Practice1 Exam1_2 = new Practice1("박코딩", "2024002", 57);
        Practice2 Exam2 = new Practice2("자바의 정석", "남궁성", "978-89-7914-726-9");
        Practice3 Exam3_1 = new Practice3("김계란", "아이스 아메리카노", 4500);
        Practice3 Exam3_2 = new Practice3("말왕", "아이스 말차 프라푸치노", 5700);
        Practice4 Exam4 = new Practice4();


        //Exam1_1.method1();
        //Exam1_2.method1();


        //Exam2.method2();
        //Exam2.borrowBook("김자바");
        //Exam2.borrowBook("박코딩");
        //Exam2.returnBook("김자바");

        //Exam3_1.method3();
        //Exam3_2.method3();

        int[] numbers = {1, 2, 3, 4, 5};
        Exam4.method4(10, 5, 8.0, 1.2, numbers);


    }
}
