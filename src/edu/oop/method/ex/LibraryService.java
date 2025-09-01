package edu.oop.method.ex;

// 도서관 회원 관리 기능 시스템 클래스

import java.sql.SQLOutput;
import java.util.Scanner;

public class LibraryService {

    Scanner sc = new Scanner(System.in);

    LibraryMember m1 = null;
    LibraryMember m2 = null;
    LibraryMember m3 = null;
    // m1만 사용하고 추가할 땐 Array -> ArrayList 활용할 것이다.


    /*
    - `registerMember()` : 회원가입 (전체 회원 수 +1)
    - `enterLibrary()` : 도서관 입장 (현재 방문자 수 +1)
    - `exitLibrary()` : 도서관 퇴장 (현재 방문자 수 -1)
    - `borrowBook(int bookCount)` : 도서 대출 (대출 권수 추가, 최대값 체크)
    - `returnBook(int bookCount)` : 도서 반납 (대출 권수 감소, 최소값 체크)
    - `displayMemberInfo()` : 회원 정보 출력
     */

    public void displayMenu() {
        int input;

        while(true){
            System.out.println("""
=== 멤버 관리 프로그램 ===
1. 회원 등록
2. 회원 정보 확인
3. 회원 정보 수정
4. 도서 대출
5. 도서 반납
6. 도서관 입장/퇴장
7. HTML 역량 비교하기
0. 도서관 통계 확인
                """);

        System.out.print("번호 선택 : ");
        input = sc.nextInt();

        switch (input) {
            case 1: // 회원 등록
                System.out.println("회원을 등록할 슬롯을 선택하세요.");
                System.out.print("1=member1 / 2=member2 / 3=member3: ");
                int select = sc.nextInt();
                // createMember() 메서드 호출하여 새 회원 생성
                if (select < 1 || select > 3) {
                    System.out.println("잘못된 번호입니다.\n다시 입력하세요.");
                    return;
                } else if (select == 1) m1=createMember();
                else if (select == 2)  m2=createMember();
                else m3=createMember();
                break;

            case 2: // 회원 정보 확인
                System.out.println("회원 정보를 확인할 번호를 선택하세요.");
                System.out.print("1=member1 / 2=member2 / 3=member3: ");
                select = sc.nextInt();
                // memberInform() 메서드 호출하여 회원 정보 출력
                if (select < 1 || select > 3) {
                    System.out.println("잘못된 번호입니다.\n다시 입력하세요.");
                    return;
                } else if (select == 1) System.out.println(memberInform(m1));
                else if (select == 2)  System.out.println(memberInform(m2));
                else System.out.println(memberInform(m3));
                break;

            case 3: // 회원 정보 수정
                System.out.println("정보를 수정할 회원을 선택하세요.");
                System.out.print("1=member1 / 2=member2 / 3=member3: ");
                select = sc.nextInt();
                // updateMemberInfo() 메서드 호출
                if (select < 1 || select > 3) {
                    System.out.println("잘못된 번호입니다.\n다시 입력하세요.");
                    return;
                } else if (select == 1) updateMemberInfo(m1);
                else if (select == 2)  updateMemberInfo(m2);
                else updateMemberInfo(m3);
                break;

            case 4: // 도서 대출
                System.out.println("도서를 대출할 회원을 선택하세요.");
                System.out.print("1=member1 / 2=member2 / 3=member3: ");
                select = sc.nextInt();
                // borrowBooks() 메서드 호출
                if (select < 1 || select > 3) {
                    System.out.println("잘못된 번호입니다.\n다시 입력하세요.");
                    return;
                } else if (select == 1) borrowBook(m1);
                else if (select == 2)  borrowBook(m2);
                else borrowBook(m3);
                break;

            case 5: // 도서 반납
                System.out.println("도서를 반납할 회원을 선택하세요.");
                System.out.print("1=member1 / 2=member2 / 3=member3: ");
                select = sc.nextInt();
                // returnBooks() 메서드 호출
                if (select < 1 || select > 3) {
                    System.out.println("잘못된 번호입니다.\n다시 입력하세요.");
                    return;
                } else if (select == 1) returnBook(m1);
                else if (select == 2)  returnBook(m2);
                else returnBook(m3);
                break;

            case 6: // 도서관 입장/퇴장
                System.out.println("1=입장 / 2=퇴장");
                System.out.print("선택: ");
                select = sc.nextInt();
                // enterLibrary() 또는 exitLibrary() 메서드 호출
                if (select < 1 || select > 2) {
                    System.out.println("잘못된 번호입니다.\n다시 입력하세요.");
                    return;
                } else if (select == 1) enterLibrary();
                else exitLibrary();
                break;

            case 7: // 도서관 통계 확인
                System.out.println("=== 도서관 운영 통계 ===");
                // static 변수들과 상수들 출력
                System.out.println("전체 회원 수 : " + LibraryMember.totalMemberCount);
                System.out.println("현재 방문자 수 : " + LibraryMember.currentVisitorCount);
                System.out.println("도서관 이름 : " + LibraryMember.LIBRARY_NAME);
                System.out.println("도서관 운영 시간 : " + LibraryMember.MAX_BORROW_BOOKS + "권");
                System.out.println("최소 가입 연령 : " + LibraryMember.MIN_AGE_LIMIT + "세");
                break;
            }
        }
    }

    /**
     * LibraryMember(String membershipId, String memberName, String phoneNumber, int age)
     * - m1 : "LIB001", "김독서", "010-1111-2222", 25
     * - m2 : "LIB002", "이공부", "010-3333-4444", 19
     * - m3 : "LIB003", "박학습", "010-5555-6666", 22
     * @return 생성된 도서관 멤버 정보를 각 멤버 위치에 전달한다.
     */
    private LibraryMember createMember() {
        System.out.print("맴버십 정보 : ");
        String newMembership = sc.next();
        System.out.print("멤버 이름 : ");
        String newName = sc.next();
        System.out.print("멤버 번호 : ");
        String newNumber = sc.next();
        System.out.print("멤버 나이 : ");
        int newAge = sc.nextInt();

        if (newAge < LibraryMember.MIN_AGE_LIMIT) {
            System.out.println(LibraryMember.MIN_AGE_LIMIT + "세 이하이므로 가입 불가합니다.");
            // private 접근제한자와 메소드명 사이에 void가 아닌데 return 해야 할 때 사용하는 트릭
            // 반환 값을 무조건 작성해야 하기 때문에 null로 처리한다.
            return null;
        }
        LibraryMember.totalMemberCount++;
        return new LibraryMember(newMembership, newName, newNumber, newAge);
    }

    private String memberInform(LibraryMember member) {
        // String.format()      : (static 메서드로 만들어짐) 정해진 형식에 원하는 값들을 끼워 넣어서 새로운 문자열을 만드는 메서드
        // String.toString()    : (일반 메서드로 만들어짐) 객체가 가진 데이터를 문자열로 파악하기 위해서 만들어진다.
        // 활용하는 기능은 정말 다양하고, 메소드 작성법도 정말 다양하다.
        // 위처럼 자바 개발자가 만든 기능을 활용하지 않고도 출력 가능하다.
        // return member.getMemberName() + "/" + member.getPhoneNumber() + "/" + member.getAge();
        // 문자열 + 숫자 => 이어서 붙힌 문자열로 처리된다.
        return member.getMemberName() + "/" + member.getPhoneNumber() + "/" + member.getAge();
    }

    private void updateMemberInfo(LibraryMember member) {
        System.out.print("회원의 새로운 이름 : ");
        String newName = sc.next();
        member.setMemberName(newName);
        System.out.println("회원 정보가 수정되었습니다.");
    };

    private void registerMember() {
        // 회원가입
        LibraryMember.totalMemberCount++;
    }

    private void enterLibrary() {
        // 도서관 입장
        System.out.print("입장할 고객의 정보를 작성하세요 : ");
        String customerName = sc.next();
        LibraryMember.currentVisitorCount++;
        System.out.println(customerName + "님이 도서관에 입장하셨습니다.");
    }

    private void exitLibrary() {
        // 도서관 퇴장
        System.out.print("퇴장할 고객의 정보를 작성하세요 : ");
        String customerName = sc.next();
        LibraryMember.currentVisitorCount--;
        System.out.println( customerName + "님이 도서관에 퇴장하셨습니다.");
    }

    private void borrowBook(LibraryMember member) {
        // 도서 대출
        System.out.print("대출할 책 수량 : ");
        int bookCount = sc.nextInt();

        int result = member.getBorrowedBooks() + bookCount;

        if (result > LibraryMember.MAX_BORROW_BOOKS) {
            System.out.printf("최대 대출 수량은 %d로 제한됩니다.\n", LibraryMember.MAX_BORROW_BOOKS);
            return;
        } else {
            member.setBorrowedBooks(result);
            System.out.println("대출이 완료되었습니다.");
        }
    }

    private void returnBook(LibraryMember member) {
        // 도서 반납
        System.out.print("반납할 책 수량 : ");
        int bookCount = sc.nextInt();

        int result = member.getBorrowedBooks() - bookCount;

        if (result < 0) {
            System.out.printf("최대 반납 수량은 현재 대출 수량인 %d권으로 제한됩니다.\n", member.getBorrowedBooks());
            return;
        } else {
            member.setBorrowedBooks(result);
            System.out.println("반납이 완료되었습니다.");
        }
    }

}
