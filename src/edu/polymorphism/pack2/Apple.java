package edu.polymorphism.pack2;

// 자식 클래스
// extends 부모클래스명을 작성해야 상속받을 수 있다.

// 상속받는 자식 클래스는 abstract로 선언되거나 부모 클래스에서 선언된 추상 메서드를 구현해야 한다.
// 추상 메서드를 자식 클래스에 맞게 기능을 수정하여 작성하지 않으면 문제가 발생한다.
// 1) public abstract class 자식클래스명 extends 부모클래스명 {}
// 2) @Override
//    public 자료형 메서드명(){}

public class Apple extends Fruit {

    // 필드
    // 추가적으로 작성해야 하는 자식 클래스의 필드가 필요하다면 작성한다.
    private String 품종;

    // 생성자
    public Apple() {
    }
    public Apple(String 품종) {
        this.품종 = 품종;
    }
    public Apple(String ftuitmane, String 품종) {
        super(ftuitmane);
        this.품종 = 품종;
    }

    // getter / setter
    public String get품종() {
        return 품종;
    }
    public void set품종(String 품종) {
        this.품종 = 품종;
    }

    // 추상 메서드
    // abstract 붙은 메서드를 강제로 상속받아서 사용할 때는 필수로 자식 클래스에 맞게 재설정해야 한다.
    @Override
    public void taste(){
        System.out.printf("%s 의 맛 %s 품종에 따라 다릅니다.\n", getFtuitmane(), get품종());
    }

    // 상속 메서드
    // abstract 붙지 않은 메서드를 상속받아서 사용할 때는 필수로 자식 클래스에 맞게 재설정하지 않아도 된다.
    @Override
    public void info(){
        System.out.println("Fruit : " + getFtuitmane());
    }





}
