package edu.polymorphism.ex2.model;

import edu.polymorphism.ex2.service.UniverseService;

public class Student extends UniverseMember {

    // 학생 정보 관련 필드들
    private String studentMajor;
    private int studentGrade; // 학년
    private double studentGpa; // 학점

    public Student() {
    }

    public Student(String studentMajor, int studentGrade, double studentGpa) {
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentGpa = studentGpa;
    }

    public Student(String name, String id) {
        super(name, id);
    }

    public Student(String name, String id, String studentMajor, int studentGrade, double studentGpa) {
        super(name, id);
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentGpa = studentGpa;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public double getStudentGpa() {
        return studentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        this.studentGpa = studentGpa;
    }


    @Override
    public String toString() {
        return super.toString() +
                "studentMajor='" + studentMajor + '\'' +
                ", studentGrade=" + studentGrade +
                ", studentGpa=" + studentGpa;
    }
}
