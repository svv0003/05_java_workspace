package edu.polymorphism.pack2.ex2.model;

public class Review extends Post {

    // 필드
    private int rating;        // 평점 (1-5점)

    // 생성자
    public Review() {
    }
    public Review(String postId, String title, String author, String content, int rating) {
        super(postId, title, author, content);
        this.rating = rating;
    }

    // getter / setter
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    // 일반 메서드
    public void rating(){
        System.out.println(getPostId() + " rating");
    }

    @Override
    public void displayPost() {
        // [후기] {제목}작성자: {작성자}평점: {평점}/5점내용: {내용}
        System.out.printf("[후기]\n제목 : {%s}\n작성자 : {%s}\n평점 : {%d}/5점\n내용 : {%s}\n", getTitle(), getAuthor(), getRating(), getContent());
    }


}
