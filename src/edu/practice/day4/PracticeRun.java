package edu.practice.day4;

public class PracticeRun {
    public static void main(String[] args) {

        Practice1 Exam1_1 = new Practice1("김자바", "2024001", 85);
        Practice1 Exam1_2 = new Practice1("박코딩", "2024002", 57);
        Practice2 Exam2 = new Practice2("자바의 정석", "남궁성", "978-89-7914-726-9");
        Practice3 Exam3 = new Practice3();
        Practice4 Exam4 = new Practice4();


        //Exam1_1.method1();
        //Exam1_2.method1();


        Exam2.method2();
        Exam2.borrowBook("김자바");
        Exam2.borrowBook("박코딩");
        Exam2.returnBook("김자바");
    }
}
