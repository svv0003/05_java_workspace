package edu.inheritance.ex0;

// public class 개발자 {

// 상속
// 부모의 코드를 물려받아 자식이 자신의 것처럼 활용하는 것
// 상속 키워드 - extends (확장하다)
// 부모의 코드를 작식이 물려받아 자식의 전체 크기가 증가한다. (코드가 증가한다는 의미)
public class 개발자 extends 직원 {
    // 필드
    private String computer;        // 직원 중 개발자는 컴퓨터가 추가로 필요하다.

    // 메서드
    // 기본 생성자
    public 개발자(String eName, int eId, double baseSalary, String department, String computer) {
        /*
        super()     : 자식 객체 생성 시 부모 생성자를 호출하는 생성자
                      직원에 존재하는 생성자를 가리킨다.

        1) super()              : 직원 클래스 안에 존재하는 기본 생성자
        2) super(매개변수)      : 직원 클래스 안에 존재하는 매개변수 생성자
         */

        super(eName, eId, baseSalary, department);
        /*
        this 대신 super를 사용해서 매개변수로 전달받은 eName, eId 등을 사용하겠다. 처리
         */

        this.computer = computer;
        // this를 여러 번 작성할 필요 없이 직원 클래스에 1번만 작성하고,
        // 추가로 클래스 내에 작성된 필드만 this로 작성하면 된다.
    }

    // getter/setter
    public String getComputer() {
        return computer;
    }
    public void setComputer(String computer) {
        this.computer = computer;
    }

    // @Override
    // 직원 클래스에서 작성한 기능을 참고해서 개발자 클래스가 원하는 기능으로 재활용한다.
    @Override
    public void info() {
        /*
         public void info(){
            // eName, eId처럼 직접적으로 작성해도 되지만
            // 직접적으로 사용하기 보다는 get을 활용해서 작성하는 편이 좋다.
            System.out.println("===직원 정보===");
            System.out.println("이름 : " + geteName());
            System.out.println("사번 : " + geteId());
            System.out.println("부서 : " + getDepartment());
            System.out.println("기본급 : " + getBaseSalary() + "원");
        }
         */

        // 직원 클래스 내 기존 info() 메서드에 작성한 텍스트를 호출한다.
        super.info();
        System.out.println("컴퓨터 : " + getComputer());
    }

    @Override
    public void work(){
        /*
        public void work() {
            System.out.println(geteName() + "님이 업무를 수행합니다.");
            System.out.println(geteName() + "님이 업무를 수행합니다.");
        }
         */

        // 위 메서드를 여러 번 작성하지 않고, 직원 클래스에 작성한 코드를 호출해서 활용한다.
        // 활용 후 개발자 클래스에서 원하는 출력문을 추가로 작성하기
        System.out.println(geteName() + " 개발자가 " + getComputer() + "로 코딩을 합니다." );
    }

    // 아래는 직원 클래스에서 다른 직원까지 공통으로 사용하지 않고, 오직 개발자 클래스에서만 사용하는 기능 추가하기
    public void codeReview(){
        System.out.println(geteName() + " 개발자가 코드 리뷰를 진행합니다.");
    }












}
