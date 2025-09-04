package edu.collection.model;

// 클래스를 생성할 때 .을 사용해서 작성하면
// .앞에 작성된 명칭으로 폴더가 생성되고,
// 폴더 내부에 .뒤에 작성된 명칭으로 클래스를 생성된다.

public class book {

    // 필드 / 속성 / 인스턴스 변수
    private String title;
    private String writer;
    private int price;

    // 메서드
    // 기본 생성자 / 파라미터 생성자 / getter / setter / toString
    // 아래 모든 기능들은 추후 @생성자 @파라미터생성자 @게터 @세터 @투스트링과 같은 형태로 가볍고 편하게 작성할 것이다.
    public book() {
    }
    public book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    // 개발자들이 만드는 모든 클래스는 extends Object를 작성하지 않아도
    // extends Object 문서를 상속받는 것이 자동으로 설정된다.
    // Object 클래스 문서 내에는 개발자들이 공통적으로 필요로 하는 기능들이 작성되어 있다.
    // 그 중 대표적으로 가장 많이 사용하는 것이 toString이다.
    @Override
    public String toString() {
        return "book\n" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price + "원";
    }
}
