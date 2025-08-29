package edu.oop.method.ex;

// 도서관 회원 속성 정의 클래스

public class LibraryMember {

    // static 공유 정보
    public static int totalMemberCount;
    public static int currentVisitorCount;

    // static final 상수
    public static final String LIBRARY_NAME = "스마트 도서관";
    public static final String OPENING_HOURS = "09:00 - 22:00";
    public static final int MAX_BORROW_BOOKS = 10;
    public static final int MIN_AGE_LIMIT = 14;

    // 인스턴스 변수
    private String membershipId;
    private String memberName;
    private String phoneNumber;
    private int borrowedBooks;
    private int age;


    // 인스턴스 초기화 블록
    {
        membershipId = "TEMP001";
        memberName = "임시회원";
        phoneNumber = "010-0000-0000";
        borrowedBooks = 0;
        age = 14;
    }

    // static 초기화 블록
    static {
        totalMemberCount = 0;
        currentVisitorCount = 0;
        System.out.println("=== " + LIBRARY_NAME + " 시스템 초기화 완료 ===");
        System.out.println("운영시간: " + OPENING_HOURS);
    }


    /*
    - 기본 생성자
    - 매개변수가 있는 생성자 (membershipId, memberName, phoneNumber, age)

    **Getter/Setter 메서드들**

    - `setMembershipId(String membershipId)`
    - `setMemberName(String memberName)`
    - `setPhoneNumber(String phoneNumber)`
    - `setAge(int age)`

    - `getMembershipId()`
    - `getMemberName()`
    - `getPhoneNumber()`
    - `getBorrowedBooks()`
    - `getAge()`
     */

    // 기본 생성자
    public LibraryMember() {
    }

    // 필수 생성자
    public LibraryMember(String membershipId, String memberName, String phoneNumber, int age) {
        this.membershipId = membershipId;
        this.memberName = memberName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // setter / getter
    public String getMembershipId() {
        return membershipId;
    }
    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getBorrowedBooks() {
        return borrowedBooks;
    }
    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
