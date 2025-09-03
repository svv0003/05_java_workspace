package edu.practice.day7;

public class KakaoTalk extends KakaoService {

    // 필드
    private int friendCount;
    private boolean isOnline;


    public KakaoTalk() {
    }
    public KakaoTalk(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        super(serviceName, userId, userNickname, isLoggedIn);
    }
    public KakaoTalk(String serviceName, String userId, String userNickname, boolean isLoggedIn, int friendCount, boolean isOnline) {
        super(serviceName, userId, userNickname, isLoggedIn);
        this.friendCount = friendCount;
        this.isOnline = isOnline;
    }
    public int getFriendCount() {
        return friendCount;
    }
    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }
    public boolean isOnline() {
        return isOnline;
    }
    public void setOnline(boolean online) {
        isOnline = online;
    }


    // 추상 메서드
    @Override
    public void startService() {
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
        return "MESSENGER";
    }

    @Override
    public void performSpecialAction() {
    }


    // 메서드 오버라이딩
    @Override
    public void sendNotification(String message){
        System.out.println("[카카오톡 알림] " + message);

    }


    // 고유 메서드
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
