package edu.polymorphism.pack2;

// 부모 클래스
// 과일

// 추상 메서드   abstract
// 부모 클래스를 상속받는 자식 클래스가
// 강제로 작성해야 하는 기능이 존재할 수 있다는 것을
// public abstract class 클래스명{}으로 작성하고,
// 해당 메서드에도 public abstract 자료형 메서드명();으로 작성해서 설정한다.
// 상속받는 자식 클래스에서 추상 메서드를 @Override로 재정의해서 사용한다.

public abstract class Fruit {

    // 필드
    // 부모 클래스의 필드 접근제한자는 자식이 접근할 수 있도록 protected로 설정한다.
    protected String ftuitmane;

    // 생성자
    public Fruit() {
    }
    public Fruit(String ftuitmane) {
        this.ftuitmane = ftuitmane;
    }

    // getter / setter
    public String getFtuitmane() {
        return ftuitmane;
    }
    public void setFtuitmane(String ftuitmane) {
        this.ftuitmane = ftuitmane;
    }

    // 메서드
    // 작성법 : 접근제어자 void/자료형 메서드명(){}
    // 각기 다른 맛을 자식 클래스에서 과일 이름에 맞게 재설정 (= Override)
    // public void taste(/*매개변수 유무는 선택*/) {/*실행 코드가 없어도 중괄호{}는 필수 생성*/}
    public abstract void taste();

    public void info(){
        System.out.println("Fruit : " + getFtuitmane());
    }





}
