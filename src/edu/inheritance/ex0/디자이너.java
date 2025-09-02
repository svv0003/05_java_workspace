package edu.inheritance.ex0;

public class 디자이너 extends 직원{

    /*
    private String eName;       // 사원이름
    private String eId;         // 사원번호
    private double baseSalary;  // 기본급
    private String department;  // 부서
     */
    // extends 직원을 작성해서
    // 하나씩 직접 작성해야 하는 필드명에서 공통적으로 활용할 필드명을 직원 클래스에 작성하고,
    // 이외 추가로 필요한 필드명만 디자이너에서 작성한다.

    private String designTool;      // 디자인 도구

    // 기본 생성자
    // 자식 클래스의 기본 메서드는 부모 클래스의 필수 생성자 매개변수를 모두 작성해야 한다.
    public 디자이너(String eName, int eId, double baseSalary, String department, String designTool) {

        /*
        this.eName = eName;
        this.eId = eId;
        this.baseSalary = baseSalary;
        this.department = department;
         */
        // extends 직원을 작성해서
        // 하나씩 직접 작성해야 하는 this를 직원 클래스에 작성하고,
        // super를 이용해서 직원 클래스에 작성된 this를 참조해서 사용한다.

        super(eName, eId, baseSalary, department);
        this.designTool = designTool;

    }

    // getter/setter
    public String getDesignTool() {
        return designTool;
    }
    public void setDesignTool(String designTool) {
        this.designTool = designTool;
    }


    /*
    @Override 표기

    extends 상송 클래스로 가져온 기능을 재활용한다는 표기
    굳이 작성하지 않아도 동작하는데 문제 없지만 작성하는 것이 개발자 간의 예의
     */

    @Override
    public void info(){
        super.info();
        System.out.println("주 사용 디자인 도구 : " + getDesignTool());
    }

    @Override
    public void work(){
        // super.work()는 부모 클래스에 작성된 기능들을 추가로 사용하고자 할 때 작성한다.
        // 기능에서 super.기능명() 작성은 필수가 아니다.
        System.out.println(geteName() + " 디자이너가 " + getDesignTool() + "를 활용해 디자인합니다.");
    }



}
