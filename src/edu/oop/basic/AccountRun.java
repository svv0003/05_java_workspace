package edu.oop.basic;

// 계좌 기능 실행 클래스

public class AccountRun {
    // JVM 바라보는 메인 메서드
    // args 매개변수명은 변경 가능, 나머지는 그대로 유지
    // 되도록이면 수정없이 그냥 사용!
    public static void main(String[] args) {

        // Account 객체 생성

        Account a1 =  new Account();        // Account() : 기본 생성자를 호출해서 객체 생성

        // private이 설정된 값과 설정하지 않은 값 접근 가능 여부 확인하기

        // private을 적용한 변수(필드)는 외부에서 보이지 않는다. (정보 은닉)

        // a1.accountNumber = "1234";
        // Account.accountNumber = "1234"
        // Account 클래스 내부에 작성된 속성변수명 accountNumber는 private 형태이기 때문에 다른 클래스에서 직접적으로 접근 불가!!

        // 간접 접근 기능을 이용해서 값을 세팅한다.
        a1.setName("홍길동");      // name이라는 변수명을 간접적으로 사용하는 setName에서 홍길동 명칭을 갖고 있는 상태

        // 간접 접근 기능을 이용해서 객체 내부에 저장되어 있는 데이터를 출력한다.
        a1.getName();           // setName으로 저장된 데이터를 가져온다.
        // getName은 가져오는 것이지 가져와서 출력하는 메서드가 아니다!!
        // getName으로 가져온 데이터를 확인하기 위해서는 System과 같은 출력문 내부에 작성해야 한다.
        System.out.println(a1.getName());

        a1.setAccountNumber("1234-123-1234");
        a1.setPassword("1234");

        /*
        private String accountNumber;
        a1.setAccountNumber("1234-123-1234");
        String a1Number = a1.getAccountNumber();

        Account class에서 accountNumber를 String 자료형으로 작성한다고 표기했기 때문에
        데이터를 저장하는 것 또한 String 형태이어야 한다.
        저장된 데이터를 가져와서 변수명에 넣어서 사용하는 경우 또한 String 형태이어야 한다.
         */
        String a1Number = a1.getAccountNumber();
        String a1Password = a1.getPassword();
        System.out.println(a1Number);
        System.out.println(a1Password);

        System.out.println();
        // 필수 생성자를 활용하여 데이터 저장하고, 저장된 데이터를 확인하기
        // 필수 생성자는 Account 클래스에서 활용할 데이터를 외부에서 매개변수 데이터로 필히 넣어줘야 하는 매개변수를 작성한 공간
        // Account() 소괄호 내부에 작성한 매개변수 순서대로 데이터를 작성해야 한다.
        // -> 순서 일치하지 않으면 에러 발생
        //         public Account(String name, String accountNumber, long balance, String password)
        Account a2 =  new Account("강말숙", "1234-111-2345", 10000, "7777");
        System.out.println(a2.getName());
        System.out.println(a2.getAccountNumber());
        System.out.println(a2.getBalance());
        System.out.println(a2.getPassword());


    }
}
