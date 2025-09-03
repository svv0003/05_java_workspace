package edu.practice.day7.model;

public class KakaoTalk extends KakaoService {
    private int friendCount;
    private boolean isOnline;

    // KakaoTalk용 생성자

    public KakaoTalk(int friendCount, boolean isOnline) {
        super();
        this.friendCount = 0;
        this.isOnline = false;
    }
    // public KakaoTalk(String serviceName, String userId, String userNickname,int friendCount, boolean isOnline) {
    public KakaoTalk(String serviceName, String userId, String userNickname, int friendCount) {
        super(serviceName, userId, userNickname,"TALK");
        this.friendCount = friendCount;
    }

    public KakaoTalk(String serviceName, String userId, String userNickname, int friendCount, boolean isOnline) {
        super(serviceName, userId, userNickname,"TALK");
        this.friendCount = friendCount;
        this.isOnline = isOnline;
    }

    @Override
    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("친구 수: " + friendCount);
        System.out.println("온라인 상태: " + (isOnline ? "온라인" : "오프라인"));
    }

    @Override
    public  void startService() {
        System.out.println("카카오톡을 시작합니다. 친구들과 채팅을 시작하세요!");
        if (isOnline) {
            System.out.println("온라인 상태로 접속했습니다.");
        }
    }

    @Override
    public void stopService() {
        System.out.println("카카오톡을 종료합니다.");
        this.isOnline = false;
    }

    @Override
    public String getServiceType() {
        return "메신저";
    }

    @Override
    public void performSpecialAction() {
        System.out.println("메세지 전송 기능을 실행합니다.");
        System.out.println("친구들과 실시간 채팅을 즐겨보세요.");

        // 또는 아래 구현된 메서드들을 호출할 수 있음
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오톡 알림] " + message);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("[카카오톡에서 알림 수신] " + message);
    }



    // KAKAOTALK 에서만 있는 기능
    public void sendMessage(String friendName, String message) {
        System.out.println(friendName + "에게 메시지 전송: " + message);
    }

    public void addFriend(String friendName) {
        this.friendCount++;
        System.out.println(friendName + "를 친구로 추가했습니다. (총 친구 수: " + friendCount + ")");
    }

    public void changeStatus(boolean online) {
        this.isOnline = online;
        System.out.println("상태를 " + (online ? "온라인" : "오프라인") + "으로 변경했습니다.");
    }

}