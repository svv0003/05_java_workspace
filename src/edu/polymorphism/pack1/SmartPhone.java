package edu.polymorphism.pack1;

// 부모 클래스 역할
/*
Object 클래스

개발자가 만드는 모든 클래스(문서)는 extends Object를 한 상태에서 만들어진다.
    public class SmartPhone extends Object {
    }
당연히 extends Object를 작성해야 하기 때문에 굳이 작성하지 않는다.

Object

개발자들이 기본적으로 필요하다고 판단한 기능들을 작성해놓은 문서
Java 개발자 포함하여 모든 개발자들이 만드는 Class 변수명 뒤에 상속된다.
    ex) toString    : System.out.println()과 같은 형태로 모든 필드의 정보를 출력하기 위해
                      작성하는 코드를 단축하고, 필드에 대한 정보를 출력하기 위해 만들어진 기능
                      inheritance에서 작성한 showInfo와 같은 출력문을 toString 메서드를 확용해서 단축적인 작성 가능
    ex) equals()    : 두 객체가 같은 클래스 주소를 가리키는가? 비교
 */

public class SmartPhone {

    protected String display;     // 화면
    protected String newsAgency;  // 통신사
    protected String ap;          // 스마트폰 cpu
    // ??? 상속자 필드는 private에서 protected로 변경 가능하다???

    // 메서드 시작!!
    // 기본 생성자
    // 파라미터가 하나도 없는 생성자
    public SmartPhone() {
    }

    // 매개변수 생성자
    // 파라미터가 1개 이상 존재하는 생성자
    public SmartPhone(String display, String newsAgency, String ap) {
        this.display = display;
        this.newsAgency = newsAgency;
        this.ap = ap;
    }


    // getter
    // 1) 생성자를 이용해서 특정 데이터를 사용할 수 있도록 전달한다.
    // 2) set변수명 또는 변수 내에 저장되어 있는 데이터를
    // 3) 추후 main이나 service 메서드에서 객체로 생성한다.

    // 회원가입 HTML에서 사용자가 작성한 데이터를 DB에 저장하기 위해 Java를 통해 저장하고,
    // DB에 저장된 데이터를 확인한다.
    // 순서 : C -> B -> A
    // C에서 전달한 데이터를 B에서 갖고 있고, B에 작성된 내용을 확인하기 위해 C 사용한다.
    // "회원가입이 완료되었습니다."와 같은 정보를 보여줄 때 C 사용한다.
    public String getDisplay() {
        return display;
    }

    public String getNewsAgency() {
        return newsAgency;
    }

    public String getAp() {
        return ap;
    }


    // toString
    // showInfo와 같은 출력문을 하나씩 작성하지 않아도 알아서 변수명들에 대한 데이터 정보를 출력할 수 있도록
    // 기능을 재사용하여 정보확인에 대한 기능을 편리하게 사용할 수 있다.
    @Override       // Object class 객체 문서에서 작성된 메서드를
                    // SmartPhone class 문서를 작성하는 개발자가
                    // SmartPhone class 문서 필드에 대한 정보를 확인할 수 있도록 재사용한 것
    public String toString() {
        return "SmartPhone{" +
                "display='" + display + '\'' +
                ", newsAgency='" + newsAgency + '\'' +
                ", ap='" + ap + '\'' +
                '}';
    }


    // 회원가입 HTML에서 사용자가 작성한 데이터를 DB에 저장하기 위해 Java를 통해 저장하고,
    // DB에 저장된 데이터를 확인한다.
    // 순서 : C -> B -> A
    // C에서 전달한 데이터를 B에서 갖고 있고, B에 작성된 내용을 확인하기 위해 C 사용한다.
    // "회원가입이 완료되었습니다."와 같은 정보를 보여줄 때 C 사용한다.



















}
