package edu.polymorphism.pack2.ex2.run;

import edu.polymorphism.pack2.ex2.service.PostService;

public class PostMain {
    public static void main(String[] args) {

        // 1. Notice Question Review 개별 객체 생성 후 다형성을 통해 공통 기능 실행하기
        // 2. PostService 호출 후 display() 실행하기

        PostService postService = new PostService();
        postService.display();

    }
}
