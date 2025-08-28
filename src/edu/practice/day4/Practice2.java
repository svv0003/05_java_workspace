package edu.practice.day4;

public class Practice2 {

    /*
    title(String), author(String), isbn(String), isAvailable(boolean)
     */

    private String title;
    private String author;
    private String isbn;
    private static boolean isAvailable;

    static {
        isAvailable = true;
    }

    public Practice2() {
    }

    public Practice2(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }



    public String borrowBook(String name) {
        String result1 = "";
        System.out.printf("%s님이 '%s' 대출 시도\n", name, getTitle());
        if (isAvailable) {
            isAvailable = false;
            result1 = "대출 성공";
        } else {
            isAvailable = false;
            result1 = "이미 대출중";
        }
        System.out.println("결과 : " + result1);
        System.out.println();
        return result1;
    }

    public String returnBook(String name) {
        String result2 = "";
        if (!isAvailable) {
            isAvailable = true;
            result2 = "반납 완료";
        }
        System.out.printf("%s님이 '%s' 반납\n", name, title);
        System.out.println("결과 : " + result2);
        System.out.println();
        return result2;
    }

    public void method2() {
        System.out.println("===== 도서 관리 시스템 =====");
        System.out.println("도서명 : " + getTitle());
        System.out.println("저자 : " + getAuthor());
        System.out.println("ISBN : " + getIsbn());
        System.out.println("상태 : " + isAvailable);
        System.out.println();

    }






}
