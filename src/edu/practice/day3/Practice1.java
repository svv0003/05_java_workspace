package edu.practice.day3;

public class Practice1 {
    private String title;
    private String author;
    private int price;
    private boolean isAvailable = true;

    public Practice1() {
    }

    public Practice1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {                                          // 대출 가능 상태인데 책 대출한다면
            isAvailable = false;                                    // 대출 불가능한 상태로 변경하고
            System.out.println(title + "이(가) 대출되었습니다.");        // 대출 완료임을 표시한다.
        } else {                                                    // 대출 불가능한 상태인데 책 대출한다면
            System.out.println(title + "은(는) 이미 대출된 상태입니다.");  // 이미 대출되었음을 표시한다.
        }

    }

    public void returnBook() {
        if (!isAvailable) {                                         // 대출 불가능 상태인데 책 반납한다면
            isAvailable = true;                                     // 대출 가능한 상태로 변경하고
            System.out.println(title + "이(가) 반납되었습니다.");        // 반납 완료임을 표시한다.
        } else {                                                    // 대출 가능한 상태인데 책 반납한다면
            System.out.println(title + "은(는) 이미 반납된 상태입니다.");  // 이미 반납되었음을 표시한다.
        }
    }

    public void displayInfo() {
        System.out.println("=== 도서 정보 ===");
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
        System.out.println("대출 가능: " + (isAvailable ? "가능" : "불가능"));
    }

    public void method1(){
        displayInfo();
        returnBook();
        borrowBook();
    }
}

    /*
    제목: Java 프로그래밍
저자: 김개발
가격: 25000원
대출 가능: 불가능
     */