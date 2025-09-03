package edu.practice.day8.model;

public class Disney implements StreamingService {

    // 필드
    private String movie;

    // 생성자
    public Disney(String movie) {
        this.movie = movie;
    }


    @Override
    public void login() {
        System.out.println("디즈니플러스에 로그인합니다. 마법같은 시간!");
    }

    @Override
    public void watch() {
        System.out.printf("디즈니플러스에서 {%s} 감상 중... 꿈과 희망이 가득!\n", movie);
    }

    @Override
    public void logout() {
        System.out.println("디즈니플러스에서 로그아웃. 꿈은 계속되어요!");
    }
}
