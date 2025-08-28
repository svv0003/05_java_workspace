package edu.practice.day4;

public class Practice1 {


    /*
    name(String), studentId(String), score(int)
     */

    private String name;
    private String student;
    private int score;


    public Practice1() {
    }

    public Practice1(String name, String student, int score) {
        this.name = name;
        this.student = student;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getStudent() {
        return student;
    }

    public int getScore() {
        return score;
    }

/*
- `displayInfo()` 메서드로 학생 정보 출력
- `isPass()`
 */

    public String isPass() {
        String result;
        if (getScore() >= 60) {
            result = "합격";
        } else {
            result = "불합격";
        }
        return result;
    }

    public void displayInfo() {
        System.out.println("===== 학생 정보 관리 시스템 =====");
        System.out.println("이름 : " + getName());
        System.out.println("학번 : " + getStudent());
        System.out.println("점수 : " + getScore() + "점");
        System.out.println("결과 : " + isPass());

        // 같은 클래스 내에서 메서드를 호출할 때 클래스 명칭이나 객체 변수명을 생략하고 호출 가능.
        // return 값이 존재할 때
    }

    public void method1() {
        isPass();
        displayInfo();
        System.out.println();
    }













}
