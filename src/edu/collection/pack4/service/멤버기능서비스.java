package edu.collection.pack4.service;

public class 멤버기능서비스 {

    public void 멤버조회(String 멤버이름, String 멤버핸드폰번호, String 멤버이메일){
        System.out.println(
                "멤버{" +
                        "멤버이름='" + 멤버이름 + '\'' +
                        ", 멤버핸드폰번호='" + 멤버핸드폰번호 + '\'' +
                        ", 멤버이메일='" + 멤버이메일 + '\'' +
                        '}');
    }

    public void 멤버수정(){
        System.out.println( "멤버 수정 기능");
    }

    public void 멤버삭제(){
        System.out.println( "멤버 삭제 기능"
        );
    }

    public void 멤버마이페이지(){
        System.out.println(
                "멤버 마이페이지 접속 기능");
    }

    public void 멤버포인트(){
        System.out.println(
                "멤버 포인트");
    }
    public void 멤버게시물(){
        System.out.println("멤버를 수정합니다");
    }


}