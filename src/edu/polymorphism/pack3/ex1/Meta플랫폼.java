package edu.polymorphism.pack3.ex1;

/**
 * Meta플랫폼을 추상클래스로 변경 후
 * FaceBook과 Instagram 에서 implements 없이
 * post() 기능과 like() 기능을 사용할 수 있도록 추상메서드로 설정
 */
public abstract class Meta플랫폼 {
    protected String 플랫폼이름;
    protected String 유저아이디;

    // 메서드 생성자 = main 을 실행했을 때 데이터를 담을 수 있도록 공간을 생성해주는 메서드
    // new Meta플랫폼() 특별한 기준이나 규칙없이                            데이터를 담을 수 있는 새로운 공간을 생성
    // new Meta플랫폼(String, String) 플랫폼이름이랑 유저아이디가 존재해야지                             공간을 생성 하는 것
    public Meta플랫폼() {
    }
    public Meta플랫폼(String 플랫폼이름, String 유저아이디) {
        this.플랫폼이름 = 플랫폼이름;
        this.유저아이디 = 유저아이디;
    }

    //게터와 세터   게터 : 클라이언트나 DB에서 전달받은 데이터를 사용할 수 있도록 하는 기능
    //              세터 : 클라이언트한테 전달받은 데이터를 프로그램이 실행되는 동안 임시로 저장하여 보유하고 있는 기능
    public String get플랫폼이름() {
        return 플랫폼이름;
    }
    public void set플랫폼이름(String 플랫폼이름) {
        this.플랫폼이름 = 플랫폼이름;
    }
    public String get유저아이디() {
        return 유저아이디;
    }
    public void set유저아이디(String 유저아이디) {
        this.유저아이디 = 유저아이디;
    }

    // 기타 메서드 : 보통 기타 메서드의경우 또한 service 문서로 분류해서 작성
    public void login(){
        System.out.println(유저아이디 + " 님이 " + 플랫폼이름 + " 에 로그인 했습니다.");
    }

    public void logout(){
        System.out.println(유저아이디 + " 님이 " + 플랫폼이름 + " 에 로그아웃 했습니다.");
    }


    public abstract void post(String content);
    public abstract void like(String postId);
}