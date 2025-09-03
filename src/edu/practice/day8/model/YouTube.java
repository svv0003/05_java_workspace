package edu.practice.day8.model;

public class YouTube implements VideoPlayer {

    // 필드
    private String videoTitle;

    // 생성자
    public YouTube(String videoTitle) {
        this.videoTitle = videoTitle;
    }


    // 오버라이드로 작성하는 기능들 모두 get 형태로 변경
    @Override
    public void upload() {
        System.out.println("📺 유튜브에 { "+ videoTitle +"} 영상을 업로드합니다!");
    }

    @Override
    public void play() {
        System.out.println( "▶️ 유튜브에서 { "+ videoTitle +"} 재생 중... 구독과 좋아요!");
    }

    @Override
    public void pause() {
        System.out.println("⏸️ 유튜브 영상을 일시정지합니다.");
    }
}