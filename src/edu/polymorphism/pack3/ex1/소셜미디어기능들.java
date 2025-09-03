package edu.polymorphism.pack3.ex1;
// 인터페이스로 작성한 자바 문서는 추후 다른 클래스에서 클래스에 맞게 재사용해서 작성해야함
// public 이외 모든 접근 제어자 금지!
public interface 소셜미디어기능들 {
    public void post(String content);
    void like(String postId);
}