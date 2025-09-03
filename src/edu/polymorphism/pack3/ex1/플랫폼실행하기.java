package edu.polymorphism.pack3.ex1;

public class 플랫폼실행하기 {
    public static void main(String[] args) {

        Facebook fb = new Facebook("자연인");
        fb.login();                                          // Meta플랫폼 클래스에서 상속받은 기능
        fb.post("오늘도 자연은 아름답네요.^^");    // 인터페이스 구현 메서드
        fb.like("post001");                         // 인터페이스 구현 메서드
        fb.logout();                                        // Meta플랫폼 클래스에서 상속받은 기능

        System.out.println();

        Instagram insta = new Instagram("이코딩");
        insta.login();                                       // Meta플랫폼 클래스에서 상속받은 기능
        insta.post("맛있는 음식");                 // 인터페이스 구현 메서드
        insta.like("photo456");                     // 인터페이스 구현 메서드
        insta.logout();                                     // Meta플랫폼 클래스에서 상속받은 기능
    }
}
