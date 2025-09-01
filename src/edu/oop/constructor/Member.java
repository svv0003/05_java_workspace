package edu.oop.constructor;

/*
오버로딩 (Over Loading : 과적 (== 너무 많이 주다.)
한 클래스 내에 여러 개의 메서드를 동일한 메서드명으로 작성하는 방식
같은 메서드명의 메서드가 수행하는 기능은 기본적으로 같으나
 전달받은 매개변수에 따라서 조금식 동작이 달라야 하는 경우
 상황별로 정의

오버로딩 조건
1) 메서드명은 같아야 한다.
2) 매개변수는 개수, 타입, 순서가 하나라도 달라야 한다.
 */

/*
나중에 SpringBoot라는 편리 기능을 활용하고,
Lombok @ 어노테이션 모양으로 코드를 간단하게 호출하여 사용하는 방법을 활용한 것!

@기본생성자          setter를 이용해서 html에서 가져온 데이터를 하나씩 담아놓는 것
@매개변수존재생성자  setter를 이용하지 않고, 데이터를 한번에 html에서 가져온 데이터를 담아놓는 것
@getter              DB에 저장된 데이터를 자바에서 가져와 가지고 있는 상태
@setter              DB에 저장하기 전에 자바에서 사용자가 작성한 이름, 이메일 같은 데이터를 가지고 있는 상태
 */

public class Member {

    // 필드 (== 멤버 변수)
    // 클래스 변수      static 붙은 변수
    //                  -> static 메모리에 할당해서 클래스를 참조해야 한다.
    //                  -> 클래스명.변수명
    //                  개발자가 작성한 특정 행위를 new 클래스명()을 통해
    //                   객체로 생성하고, 객체를 프로그램 실행하는 동안 지속적으로 사용하기 위해
    //                   객체에 특정 명칭을 활용하는 것이 아니라 클래스명. 을 활용하여 변수명을 사용한다.
    //                  Member.변수명;
    //                  public static 변수명;
    //                  public static final 변수명;

    // 인스턴스 변수    static 없는 변수
    //                  인스턴스 (== 객체)가 생성될 때 heap 메모리에 할당되기 때문에
    //                  객체명을 활용하여 클래스를 참조하는 새로운 객체를 생성하고 할당하며,
    //                   객체명으로 호출하여 사용할 수 있다.
    //                  클래스명 객체명 = new 클래스명();

    private String memberId;
    private String memberName;
    private String memberPw;
    private int memberAge;

    // 생성자
    // 객체 생성 시 필드 초기화 + 특정 기능을 수행하는 일종의 메서드
    // 작성법
    // 1) 반환형 없다.
    // 2) 생성자명은 클래스명과 동일하다.

    // 기본 생성자
    // 매개변수 없는 형태
    // 개발자가 생성자를 하나도 작성되지 않아도 자바에서 자동으로 생성한다.
    // 하지만 매개변수 생성자 (== 필수 생성자)를 작성하면 기본 생성자는 사라지기 때문에
    //  직접 작성해주어야 한다.

    // -> 기본 생성자와 필수 생성자는 기본적으로 둘 중 하나씩만 존재하도록 기본 설정???
    // -> 하지만 두 생성자를 사용하려고 할 때는 일일이 작성해서 기본 설정 파홰??

    // [Member 클래스]                [MemberRun 클래스]
    // 생성자 작성하지 않은 경우   -> Member m = new Member();          -> 오류 X
    // 필수 생성자만 작성한 경우   -> Member m = new Member();          -> 오류 O
    //                             -> Member m = new Member(매개변수);  -> 오류 X
    // 기본 생성자만 작성한 경우   -> Member m = new Member();          -> 오류 X
    //                             -> Member m = new Member(매개변수);  -> 오류 O


    /*
    ----- Member class 파일 -----
    public class Member{
        private String memberId;
        private String memberName;
        private String memberPw;
        private int memberAge;

        // 생성자가 아무것도 존재하지 않거나
        // 또는 기본 생성자를 작성한 경우
    }

    ----- MemberRun class 파일 -----
    public class MemberRun{
        public static void main(String[] args) {
            // Member 클래스에서 생성자 없어도 자동으로 기본 생성자가 생성되기 때문에 사용 가능!!
            Member m = new Member();
    }
     */

    /*
    ----- Member class 파일 -----
    public class Member{
        private String memberId;
        private String memberName;
        private String memberPw;
        private int memberAge;

        // 필수 생성자를 작성한 경우
        public Member(String memberId, String memberPw) {
            this.memberId = memberId;
            this.memberPw = memberPw;
        }
    }

    ----- MemberRun class 파일 -----
    public class MemberRun{
        public static void main(String[] args) {
            // 필수 생성자를 작성하면 생성자에 정해진 순서와 종류의 매개변수 작성 필수!!
            Member m = new Member("id 문자열", "pw 문자열");
    }
     */

    // 기본 생성자
    // 매개변수 없이 오로지 객체만 생성하는 방식
    // 생성자를 하나도 작성하지 않는다면 자바 프로그램이 기본적으로 자동 생성한다.
    public Member() {
    }

    // 필수 생성자
    // 개발자가 원하는 매개변수를 순서, 자료형을 지정해서 작성 가능하다.
    // 객체 생성 시 매개변수로 전달된 값을 생성된 객체의 필드에 초기화된다.
    // 추후 main이나 service에서 호출하여 자바 프로그램 실행 시 객체 형태로 만들어진다.
    // 매개변수는 외부에서 전달받은 데이터의 자료형과 데이터를 갖고 있는 변수명을 작성한다.
    public Member(String memberId, String memberName, String memberPw, int memberAge) {
        // 현재 클래스에서 private이나 public default protected 형태로 작성된 변수명에
        //  html에서 가져온 데이터를 담고 있는 매개변수명을 담아서 DB에 저장한다.
        // this.변수명 = 매개변수명
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPw = memberPw;
        this.memberAge = memberAge;
    }
    // 헉
    // 필수생성자를 작성하면 setter 작성할 필요 없이 객체와 필드를 생성하고, 필드에 매개변수 데이터를 바로 할당한다.
    // 하지만 새로운 데이터를 할당하려면 setter가 필요하고, 작성된 값을 호출하려면 getter가 필요하다.


    // setter
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    // 헉
    // 새로운 데이터를 객체에 추가하고 싶을 때
    // 필드를 우선 작성하고, setter를 추가해서 데이터를 저장, getter를 추가해서 데이터를 호출한다.


}
