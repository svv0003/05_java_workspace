package edu.oop.method;

/*
메서드
특정 작업을 수행하는 코드의 집합
데이터를 넣고 처리된 결과를 실행하고, 반환하기도 한다.

[기본 구조]
접근제한자 [static] 반환타입 메서드명(매개변수) {
    // 실행할 코드
    return 반환타입에 해당하는 반환값 데이터;
}

접근제한자 [static] 반환타입 메서드명(매개변수) {
    // 실행할 코드
}

메서드 기능에서 클래스 메서드와 인스턴스 메서드가 존재한다.

클래스 메서드 (static Method)     / 클래스 변수 (static Variable)
static 키워드가 붙은 메서드
객체 생성 없이 클래스명으로 직접 호출한다.
모든 객체가 공유하는 기능

인스턴스 메서드 (Instance Method)  / 인스턴스 변수 (Instance Variable)
static 키워드가 없는 일반 기본 메서드
객체를 생성한 후 객체에 붙은 변수명을 통해 호출한다.
각 객체별로 개별적인 기능을 수행한다.
간단히 기능/변수를 사용할 수 있고, 사용 후 메모리에서 정리되는 기능/변수
 */

public class MethodEx {

    // 1) void 메서드 (반환값 없음)
    public void welcomeMessage() {
        System.out.println("환영합니다.");       // 특정 기능을 출력하고 끝
    }

    // 2) 매개변수 메서드 (입력값 처리)
    public void orderCoffee(String coffeeName, int quantity) {
        // 커피 이름과 수량을 매개변수로 전달 받아서 처리한다.
    }

    // 3) 반환값 메서드 (결과 돌려줌)
    public int getOrder(int productPrice, int quantity) {
        // 총 매출     = 개수        * 단가
        int totalOrder = quantity * productPrice;
        return totalOrder;
    }

    // 4) 반환자료형 = boolean 메서드 (참/거짓 판단)
    public boolean isPopularCafe() {
        int totalOrders = 100;
        boolean result = totalOrders >= 50;
        // return totalOrders >- 50;
        return result;
    }

    // 5) static 메서드 (=class 메서드)
    //      클래스파일명.static기능명(매개변수 존재 유무)
    public static void systemInfo() {
        // 모든 객체들이 알아야 하는 컴퓨터 기본 정보 작성
    }
    // 나중에 systemInfo 기능을 사용할 때는
    // MethodEx ex = new MethodEx();
    // ex.systemInfo();             <- 형식으로 작성하는 것이 아니라
    // MethodEx.systemInfo();       <- 령식으로 작성해야 한다.



    /*
    메서드 오버로딩 (Method Overloading)
    하나의 클래스 내부에서 이름이 동일한 메서드를 여러 개를 정의하는 것
    같은 이름으로 새로운 메서드를 계속 추가하는 것

    오버로딩 조건
    메서드 이름은 같아야 하지만, 매개변수는 달라야 한다.
    1) 매개변수의 자료형 개수가 다른 경우
    2) 매개변수의 개수가 다른 경우
    3) 매개변수의 개수는 같지만 타입이 다른 경우
    4) 매개변수의 개수, 타입이 같지만 순서가 다른 경우

    생성자는 오버로딩에 해당한다.
    생성자
        기본 생성자  : 매개변수가 존재하지 않는 생성자
                    작성하지 않아도 기본적으로 존재하나 매개변수 생성자가 생성되면 기본 생성이 소멸하기 때문에 작성하는 것이 바람직하다.

        필수 생성자  : 파라미터 = 매개변수를 필수로 작성한 후 객체를 생성해야 하는 생성자
                             대표적인 오버로딩

     */


    // 로그인 진행
    // 6-1 아이디 (String)와 비밀번호 (String)으로 로그인
    public void login(String username, String password) {
        System.out.println(username + "님, 환영합니다.");
    }

    // 6-2 소셜 로그인 토큰 (String)으로 로그인
    // SNS 로그인 -> SNS 회사에서는 진짜 아이디와 비밀번호를 외부 개발자에게 제공하지 않는다.
    // 대신 SNS 본인 인증을 마쳤으니 믿고 입장해도 좋다는 의미로 토큰을 제공한다.
    // 축제나 클럽에서 신분증을 보여주고, 본인인증이 된다면 다신 신분증을 필요로 하지 않도록
    //  자유롭게 쓸 수 있는 팔찌를 나눠주듯 온라인에서는 팔찌 대신 토큰을 제공한다.
    public void login(String socialToken) {
        // 만약 이메일이 입력되면 이메일 확인 후 로그인 처리
        // 만약 토큰이 들어오면 토큰 확인하고 로그인 처리
        System.out.println("[소셜 로그인] 토큰으로 간편 로그인 성공!");
    }

    // 6-3 유저id(int)와 비밀번호 (String) 로그인
    public void login(int userId, String password) {
        System.out.println("userId와 password가 일치합니다.");
    }

    // 6-4 매개변수가 존재하지 않는 로그인 기능
    public void login() {

    }


    /*
    // 6-5 매개변수에서 자료형이 동일하고 개수도 동일한 경우
    public void login (String ) {
        // login (String)이(가) 'edu.oop.method.MethodEx'에 이미 정의되어 있습니다.
        // 에러 발생한다.
    }

    */

}
