package edu.polymorphism.pack2;

// 부모클래스

// public class Animal {
public abstract class Animal {

    // 필드
    protected String name;

    // 생성자
    public Animal(){}

    // 생성자
    public Animal(String name) {
        this.name = name;
    }

    // getter/setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 먹고 자는 행위는 무조건 한다!
    // eat sleep을 상속받는 자식클래스에서 작성하지 않아도 아무런 문제가 되지 않는다.
    // public void eat(){}
    // public void sleep(){}

    // 하지만 abstract를 작성하면 필수로 작성해야 한다.
    public abstract void eat();
    public void sleep(){};



}
