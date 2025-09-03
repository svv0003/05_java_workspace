package edu.practice.day8.model;

public class TikTok implements VideoPlayer {
    private String creator;

    public TikTok(String creator) {
        this.creator = creator;
    }


    // 오버라이드로 작성하는 기능들 모두 get 형태로 변경
    @Override
    public void upload() {
        System.out.println( "🎵 { "+ creator +"}님이 틱톡에 숏폼 영상을 올립니다!");
    }

    @Override
    public void play() {
        System.out.println( "▶️ {"+ creator+" }님의 틱톡 영상 재생 중! 중독성 있어요~");
    }

    @Override
    public void pause() {
        System.out.println( "⏸️ 틱톡 영상을 잠시 멈춥니다.");
    }
}