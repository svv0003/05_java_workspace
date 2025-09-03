package edu.practice.day8.model;

public class Netflix implements StreamingService {

    // 필드
    private String show;

    // 생성자
    public Netflix(String show) {
        this.show = show;
    }


    @Override
    public void login() {
        System.out.println("넷플릭스에 로그인합니다. 어떤 프로필로 시청하시겠어요?");
    }

    @Override
    public void watch() {
        System.out.printf("넷플릭스에서 {%s} 시청 중... 몰아보기 시작!\n", show);
    }

    @Override
    public void logout() {
        System.out.println("넷플릭스에서 로그아웃합니다. 또 만나요!");
    }
}
