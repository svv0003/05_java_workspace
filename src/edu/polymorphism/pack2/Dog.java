package edu.polymorphism.pack2;

public class Dog extends Animal{

    private String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }


    // Animal을 상속받는 동물들은 접근제한자와 void나 자료형 사이에 존재하는
    // abstract 표시가 적힌 method 기능들을 무조건 개별 class에 맞게 작성을 다시 해야 한다.
    @Override
    public void eat() {
    }

    // sleep의 경우는 public void 사이에 abstract가 없으므로 작성할 필요 없다.

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}
