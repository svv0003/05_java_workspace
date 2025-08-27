package edu.oop.basic.ex;

// Employee 클래스를 활용한 캡슐화 및 생성자 기능 실행용 클래스

public class EmployeeRun {
    public static void main(String[] args) {



        // 기본 생성자 활용해서 데이터 추가
        Employee em1 = new Employee();
        em1.setName("김개발");
        em1.setAge(28);
        em1.setDepartment("개발팀");
        em1.setPosition("주임");
        em1.setSalary(4500);
        em1.setEmployeeId("DEV100");
        em1.setWorkYears(2);

        // 필수 생성자 활용해서 핵심 정보 우선적으로 데이터 추가
        // 이외 데이터는 set 활용해서 추가
        /*
        Employee 클래스에 존재하지 않는 매개변수생성자를 호출하면
            Employee em2 = new Employee("박기획", "기획팀");
        ↓   아래와 같이 오류 문구 뜬다.
            생성자 'Employee(String, String)'을(를) 해결할 수 없습니다
        ↓   Employee 클래스에 아래 코드 생성
            public Employee(String 박기획, String 기획팀) {
            }
        코드를 생성하기보다는 활용하고자 하는 클래스를 방문하여 생성자에 존재하는 필수 생성자에서
        매개변수가 어떻게 어떤 순서대로 작성되어 있는지 확인할 것!
         */
        Employee em2 = new Employee("박기획", "기획팀", "대리", "PLN007");
        em2.setAge(32);
        em2.setSalary(5200);
        em2.setWorkYears(5);

        // 기본 생성자로 회사원 객체 생성 후 다음 정보만 설정
        // 필수 생성자 + set 매서드 활용하기
        Employee em3 = new Employee("최신임", "인사팀", "사원", "HR003");
        em3.setAge(24);
        em3.setSalary(3800);
        em3.setWorkYears(1);

        // 전직원 상세 정보 출력하기
        // employee 직원들 중에서 em1 직원에 대한 정보를 출력
        // em1 변수명에는 Employee 클래스에서 작성한 메서드 기능들을 사용할 수 있다.
        // @Override (기본에 존재하는 기능을 재수정해서 사용 표기가 없어도 정상 작동/재사용한다는 표기)
        //  public class Employee{
        //    public String toString(){}
        //  }
        // Employee.toString() 이 맞지만 변수명에 해당하는 직원 정보를 출력하는 것이기 때문에
        // em1.toString() 형식으로 작성한다.
        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println(em3.toString());


        // 자기소개, 근무 현황, 연봉 정보, 승진 대상자 확인, 퇴직금 계산
        em1.introduce();
        em1.work();
        em1.salaryInfo();
        em1.checkPromotion();
        em1.retirement();
        System.out.println();

        em2.introduce();
        em2.work();
        em2.salaryInfo();
        em2.checkPromotion();
        em2.retirement();
        System.out.println();

        em3.introduce();
        em3.work();
        em3.salaryInfo();
        em3.checkPromotion();
        em3.retirement();


    }
}
