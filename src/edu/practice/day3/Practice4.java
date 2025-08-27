package edu.practice.day3;

import java.util.Scanner;

public class Practice4 {
    /*
    - `String name` (학생명)
    - `int studentId` (학번)
    - `int[] scores` (과목별 점수 배열, 5과목)
    - `String[] subjects` (과목명 배열: "국어", "영어", "수학", "과학", "사회")
     */

    private String name;
    private int studentId;
    private int[] scores;
    private String[] subjects;


    public Practice4() {
    }

    public Practice4(String name, int studentId, String[] subjects) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }


    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int[] getScores() {
        return scores;
    }

    public String[] getSubjects() {
        return subjects;
    }

    /*
    - `inputScores()`: Scanner로 5과목 점수 입력받기
    - `getTotalScore()`: 총점 계산하여 반환
    - `getAverage()`: 평균 계산하여 반환
    - `getGrade()`: 학점 계산 (A: 90이상, B: 80이상, C: 70이상, D: 60이상, F: 60미만)
    - `printReport()`
    */

    public void inputScores(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        int korean = sc.nextInt();
        System.out.print("영어 점수 : ");
        int english = sc.nextInt();
        System.out.print("수학 점수 : ");
        int math = sc.nextInt();
        System.out.print("과학 점수 : ");
        int science = sc.nextInt();
        System.out.print("사회 점수 : ");
        int social = sc.nextInt();
        printReport(korean, english, math, science, social);
        getTotalScore(korean, english, math, science, social);
    }


    private void getTotalScore(int korean, int english, int math, int science, int social) {
        int total = korean + english + math + science + social;
        System.out.printf("합계 : %d점\n", total);
        getAverage(total);
    }


    public void getAverage(int total){
        double avg = (double) total / 5;
        System.out.printf("평균 : %.1f점\n", avg);
        getGrade(avg);
    }

    public void getGrade(double avg){
        char grade;
        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else if (avg >= 60) grade = 'D';
        else grade = 'F';
        System.out.printf("학점 : %c\n",  grade);
    }

    private void printReport(int korean, int english, int math, int science, int social) {
        System.out.printf("---%s(%s) 성적표---\n국어 : %d\n영어 : %d\n수학 : %d\n과학 : %d\n사회 : %d\n", name, studentId, korean, english, math, science, social);
        System.out.println("-----------------------");
    }

    public void method4(){
        inputScores();
    }
}
