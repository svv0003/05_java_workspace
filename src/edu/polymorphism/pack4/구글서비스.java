package edu.polymorphism.pack4;

public class 구글서비스 {

    protected String 서비스이름;
    protected boolean 로그인유무;

    public void login(String email) {
        로그인유무 = true;
        System.out.printf("%s로 %s에 로그인했습니다.", email, 서비스이름);
    }

    public void logout(String email) {
        로그인유무 = true;
        System.out.printf("%s에 로그아웃했습니다.", 서비스이름);
    }
}
