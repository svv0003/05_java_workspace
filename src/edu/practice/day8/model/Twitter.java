package edu.practice.day8.model;

public class Twitter implements SocialMedia {

    // 필드
    private String tweet;

    // 생성자
    public Twitter(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public void post() {
        System.out.printf("트위터에 트윗합니다: {%s}\n", tweet);
    }

    @Override
    public void like() {
        System.out.println("트윗에 좋아요를 눌렀습니다!");
    }

    @Override
    public void share() {
        System.out.println("리트윗했습니다!");
    }
}
