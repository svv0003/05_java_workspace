package edu.practice.day8.model;

public class KakaoTalk implements Messenger {

    // 필드
    private String friend;

    // 생성자
    public KakaoTalk(String friend) {
        this.friend = friend;
    }


    @Override
    public void sendMessage() {
        System.out.printf("{%s}님에게 카톡을 보냅니다! 노란색 말풍선~\n", friend);
    }

    @Override
    public void receiveMessage() {
        System.out.printf("{%s}님으로부터 카톡이 왔어요! 톡톡~\n", friend);
    }

    @Override
    public void makeCall() {
        System.out.printf("{%s}님과 카톡 보이스톡 연결!\n", friend);
    }
}
