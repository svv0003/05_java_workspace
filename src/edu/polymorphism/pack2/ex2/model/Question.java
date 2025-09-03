package edu.polymorphism.pack2.ex2.model;

public class Question extends Post {

    // 필드
    private int answerCount;        // 답변 개수 (초기값 : 0)

    // 생성자
    public Question() {
    }
    public Question(String postId, String title, String author, String content) {
        super(postId, title, author, content);
    }

    // getter / setter
    public int getAnswerCount() {
        return answerCount;
    }
    public void setAnswerCount(int answerCount) {
        this.answerCount = 0;
    } // 첫 응답 개수는 개발자가 지정하는 것이다.

    // 일반 메서드
    public void answerCount(){
        System.out.println(getAnswerCount());
    }
    public void addAnswer(){
        setAnswerCount(getAnswerCount() + 1);
    }

    @Override
    public void displayPost() {
        // [Q&A] {제목}작성자: {작성자}답변 개수: {답변수}개내용: {내용}
        System.out.printf("[Q&A]\n제목 : {%s}\n작성자 : {%s}\n답변 개수 : {%d}\n내용 : {%s}\n", getTitle(), getAuthor(), getAnswerCount(), getContent());
    }


}
