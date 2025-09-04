package edu.collection.pack1.service;

// service.ListService 폴더와 클래스를 한 번에 생성하기

import edu.collection.pack1.model.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListService {

    /*
    List
    자료를 순차적으로 나열한 자료 구조 (배열과 비슷하다.)
    인덱스가 존재한다.
    인덱스로 순서를 구분짓기 때문에 중복 데이터 저장 가능하다.

    인덱스란?
    0번부터 순차적으로 변수명나 데이터들의 자리번호를 생성하는 것
    for문 작성할 때 사용하는 i는 index의 약자.

    List가 Array보다 편리하다.
     */

    public void method1() {

        // 배열은 해당 자료형의 데이터만 삽입 가능하다.
        // 배열처럼 목록 데이터 형태를 만들 때 자료형의 제약을 해결하기 위해 만들어진 컬랙션이
        // List list = new ArrayList(E); 리스트이다.
        // E는 element 요소의 약자로, 숫자, 문자, 논리형 등의 모든 자료형 데이터가 삽입 가능하다.
        int[] a = {1, 2, 3};
        String[] b = {"1","2","3"};


        // List 객체 생성
        // List (인터페이스) : 특정 기능을 기준으로 만들어진 클래스 파일을 이용할 예정이다.
        //                      인터페이스이기 때문에 객체 생성 불가하고, 다형성을 이용해서 사용해야 한다.
        // ArrayList (클래스 문서 존재) : List의 후손 클래스

        // ArrayList는 고무줄처럼 공간 크기가 변하기 때문에 배열처럼 초기에 크기를 설정할 필요 없다.
        // 배열과 다르게 여러 자료형의 데이터를 삽입 가능하다.
        List list = new ArrayList();

        // .add(E e);   목록에서 마지막에 e에 해당하는 데이터를 추가하겠다.
        // add를 작성하는 만큼 무제한으로 추가된다.
        list.add(1);
        list.add(2);
        list.add("아무거나 작성한다.");
        System.out.println("list : " + list);

        // .get(int idx)   List에서 idx번째 요소를 반환한다.
        // 파이썬과 다르게 리스트명[idx]로 접근 불가능하다.
        // 왜?
        // ArrayList는 클래스이고, 내부적으로 배열을 캡슐화하여 메서드로만 데이터에 접근하도록 설계됨.
        // 이는 타입 안정성과 객체 지향 설계를 강화하기 위함이다.
        System.out.println("list 변수명에 저장된 2번째 데이터 : " + list.get(2));

        // int size()       List에 저장된 요소(객체)의 개수를 반환한다.
        //                  length 대신 size를 사용한다.
        System.out.println("list 변수명에 저장된 데이터 개수 : " + list.size());

        // List에서 ArrayList는 언제 사용하는가?
        // 회원 목록 조회, 상품 이스트 모두 조회, 검색 데이터를 모두 가져올 때 등
        // DB에서 데이터를 2개 이상 가져온 후 사용자에게 보여줄 때 사용한다.
    }

    public void method2() {

        /*
        컬랙션 List + 제너릭 (타입 제한)
        ArrayList 형태인데 목록에 들어올 수 있는 자료형을 개발자가 제한하는 목록 리스트
         */

        // String 데이터만 무제한으로 추가, 삭제할 수 있는 리스트 만들기
        //      ↓ String형태만 담을 수 있도록 반드시 작성
        List<String> strList = new ArrayList<String>();
        //                                      ↑ String을 작성해도 되고, 안 해도 된다.
        strList.add("보쌈");
        strList.add("닭갈비");
        strList.add("치킨");
        strList.add("보쌈");
        // strList.add(1234);       // String 자료형으로 제한되어 있는데 int 자료형이 제공되면 오류 발생

        System.out.println("strList[0]: " + strList.get(0));
        System.out.println("strList[1]: " + strList.get(1));
        System.out.println("strList[2]: " + strList.get(2));
        // System.out.println("strList[3]: " + strList.get(3));
        // ArrayList 데이터가 idx[2]까지만 존재하기 때문에 idx[3]을 조회할 때 오류 발생한다.
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3

        System.out.println("=".repeat(20) + "for문 활용해서 출력하기" + "=".repeat(20));
        // for문으로 한 번에 출력하기
        for (int i = 0; i < strList.size(); i++) {
            System.out.println("strList[" + i + "]: " + strList.get(i));
        }

        System.out.println("=".repeat(20) + "idx 중간에 삽입하기" + "=".repeat(20));
        // void add(idx, E)     idx번째 공간에 중간 삽입 가능하다.
        //                      기존 idx에 존재하던 데이터부터 순차적으로 뒤로 밀린다.
        strList.add(1, "막국수");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println("strList[" + i + "]: " + strList.get(i));
        }

        System.out.println("=".repeat(20) + "전체 조회하기" + "=".repeat(20));
        // String toString()    List 인터페이스를 만들면서 toString을 추가로 작성하는 것이 변거로워서
        //                      strList.toString()을 작성한 것처럼 리스트 내부의 전체 값을 한 번에 조회 가능하다.
        System.out.println("strList 전체 조회 : " + strList);

        System.out.println("=".repeat(20) + "idx 데이터 수정하기" + "=".repeat(20));
        // E set(idx, E)        idx번째 요소를 e로 수정한다.
        //                      수정 전 요소가 반환된 다음 수정된다.
        System.out.println("수정 전 str : " + strList.set(2, "양념치킨"));
        System.out.println("수정 후 str : " + strList.get(2));
        System.out.println("strList 전체 조회 : " + strList);

        System.out.println("=".repeat(20) + "요소로 인덱스 반환하기" + "=".repeat(20));
        // ind indexOf(E)       List 내부에 e와 같은 요소가 있다면 해당 인덱스 값을 반환하고, 없으면 -1을 반환한다.
        System.out.println("보쌈 idx : " + strList.indexOf("보쌈"));
        System.out.println("막국수 idx : " + strList.indexOf("막국수"));
        System.out.println("콩국수 idx : " + strList.indexOf("콩국수"));

        System.out.println("=".repeat(20) + "요소 존재 유무를 반환하기" + "=".repeat(20));
        // boolean contains(E)  List 내부에 e와 같은 요소가 있다면 true, 없다면 false 반환한다.
        System.out.println("보쌈 존재 : " + strList.contains("보쌈"));
        System.out.println("막국수 존재 : " + strList.contains("막국수"));
        System.out.println("콩국수 존재 : " + strList.contains("콩국수"));

        System.out.println("=".repeat(20) + "idx 데이터 제거하기" + "=".repeat(20));
        // E remove(idx)        idx번째 요소를 제거하고, 제거된 요소를 반환한다.
        System.out.println("제거 전 str : " + strList);
        System.out.println("제거된 요소 : " + strList.remove(2));
        System.out.println("제거 후 str : " + strList);


    }

    /*
    List        목록에 관련된 컬랙션
    ArrayList   배열 형태의 리스트
        장점    검색 빠르다.
        단점    중간 삽입, 제거가 느리다.
        사용    학생 성적 관리 (조회가 많은 경우)
                게시판 목록 (순서대로 조회하는 경우)
                설정 값 저장 (수정이 적은 경우)

    LinkedList  서로 연결된 링크 형태의 리스트 (기차)
        장점    중간 삽입, 제거가 빠르다.
        단점    검색이 느리다.
        사용    음악 플레이리스트 (중간에 곡 삽입, 삭제하는 경우)
                실행 취소 기능 (앞, 뒤로 이동하는 경우)
                대기열 관리 (앞에서 빼고, 뒤에 넣는 경우)

    대부분의 일반적인 경우에는 ArrayList를 주로 사용하고,
    LinkedList는 중간에 삽입, 삭제하는 경우가 정말 많을 때만 사용한다.
     */
    public void bookManage(){

        // while문 활용해서 도서 추가, 전체 조회, 종료

        // List<Book> bookList = new ArrayList<>();
        List<Book> bookList = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int input = 0;

        while(true){
            System.out.println("""
도서 관리 시스템
1. 추가
2. 전체 조회
0. 종료
""");
            System.out.print("메뉴 번호를 입력하세요 : ");
            input =  sc.nextInt();
            sc.nextLine();          // Scanner에 남은 개행 문자 제거 (자동으로 한 줄 바꿈으로 버퍼 생성된다.)

            switch (input){
                case 0:
                    System.out.println("도서 프로그램을 종료합니다."); return;
                case 1:
                    System.out.println("도서를 추가합니다.");
                    System.out.print("제목을 입력하세요 : ");
                    String title = sc.nextLine();
                    System.out.print("저자를 입력하세요 : ");
                    String writer = sc.nextLine();
                    System.out.print("가격을 입력하세요 : ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    // List는 모든 자료형 데이터를 담을 수 있다.
                    // 그런데 List<Book>은 Book class 문서 형태의 데이터들로 이루어진 것들만 담을 수 있다.
                    // -> 목록 추가 제약 설정
                    bookList.add(new Book(title, writer, price));   // bookList는 제목, 저자, 가격 형태만 가능하다.
                    System.out.println("책이 추가되었습니다."); break;
                case 2:
                    if (bookList.size() > 0){
                        System.out.println("도서 목록을 모두 조회합니다.");
                        for (Book book : bookList) {
                        /*
                        System.out.println("제목 : " + book.getTitle());
                        System.out.println("저자 : " + book.getWriter());
                        System.out.println("가격 : " + book.getPrice());
                         */
                            System.out.println(book);
                        }
                    } else System.out.println("도서가 존재하지 않습니다."); break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }




    }








}
