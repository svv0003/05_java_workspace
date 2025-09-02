package edu.inheritance.ex3;

public class YouTube extends GoogleService {
    // Youtube는 상속받은 자식이기 때문에 private
    // Youtube에서 작성한 필드를 상속할 자식이 현 재 는 존재하지 않기 때문
    private int 구독자수;
    private boolean isPremium;

    public YouTube() { // setter로 super() 를 작성했으니
        super();        // 부모 클래스인 GoogleService 필드까지 YouTube 객체를 활용하여
    }                   //                                      데이터 저장을 setter로 할 수 있는 상태

    public YouTube(String serviceName, String userEmail, String userName, String accountType) {
        super(serviceName, userEmail, userName, accountType);
    }
    //             YouTube youTube = new YouTube("user1@gmail.com","박길동","개인계정",50,true);
    public  YouTube( String userEmail, String userName, String accountType, int 구독자수, boolean isPremium) {
        super("YouTube", userEmail, userName, accountType);
        this.구독자수 = 구독자수;
        this.isPremium = isPremium;
    }

    // 오버라이딩
    @Override
    public void search(){
        System.out.println("YouTube에서 동영상을 검색합니다.");
    }

    @Override
    public void share(){
        System.out.println("YouTube에서 동영상 링크를 공유합니다.");
    }

    public void uploadVideo(){
        System.out.println(userName + "님이 동영상을 업로드합니다.");
    }

    public void subscribe(){
        System.out.println(userName + " 님이 채널을 구독합니다.");
        구독자수++; // 구독자수 1 증가
    }

    public void watchAd(){
        if(!isPremium) {
            System.out.println("광고를 시청합니다.");
        } else {
            System.out.println("프리미엄 사용자는 광고가 없습니다.");
        }
    }

    // 게터와 세터
    public int get구독자수() {
        return 구독자수;
    }

    public void set구독자수(int 구독자수) {
        this.구독자수 = 구독자수;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}