package edu.collection.pack4.service;

public class 멤버기능서비스 {

    public String 멤버조회(String 멤버이름, String 멤버핸드폰번호, String 멤버이메일) {
        return "멤버\n" +
                "멤버이름='" + 멤버이름 + '\'' +
                ", 멤버핸드폰번호='" + 멤버핸드폰번호 + '\'' +
                ", 멤버이메일='" + 멤버이메일;
    }
    public void 멤버수정(){}
    public void 멤버삭제(){}
    public void 멤버마이페이지(){}
    public void 멤버포인트(){}
}
