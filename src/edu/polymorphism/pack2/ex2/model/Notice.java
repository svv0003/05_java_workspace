package edu.polymorphism.pack2.ex2.model;


public class Notice extends Post {

    // 필드
    private String priority;        // 중요도

    // 생성자
    public Notice() {
    }
    public Notice(String priority) {
        this.priority = priority;
    }
    public Notice(String postId, String title, String author, String content, String priority) {
        super(postId, title, author, content);
        this.priority = priority;
    }

    // getter / setter
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public void displayPost() {
        // [공지사항] {제목}작성자: {작성자}중요도: {중요도}내용: {내용}
        System.out.printf("[공지사항]\n제목 : {%s}\n작성자 : {%s}\n중요도 : {%s}\n내용 : {%s}\n", getTitle(), getAuthor(), getPriority(), getContent());
    }





}
