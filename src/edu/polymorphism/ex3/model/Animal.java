package edu.polymorphism.ex3.model;

/*
구현해야할 클래스
Animal (부모 클래스)
├── Dog (자식 클래스)
├── Cat (자식 클래스)
└── Bird (자식 클래스)

Animal  에서 구현 후 자식클래스에서 각각 재사용
// makeSound() - 각 동물마다 다른 소리
//move() - 각 동물마다 다른 이동 방식
//eat() - 각 동물마다 다른 먹이
 */

public class Animal {

    // 공통 필드
    protected String name;
    protected int age;
    protected String color;
    protected String type; // "개", "고양이", "새"


    public Animal() {
    }
    public Animal(String name, int age, String color, String type) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal : \n" +
                "name= '" + name +
                "', age= " + age +
                ", color= '" + color +
                "', type= '" + type + "'";
    }


    /*
    추후 중괄호 내부에 기능을 작성할 것!
    내일부터 9/3 인터페이스 추상클래스 배워서
    지금 재사용하여 각 class에 맞게 커스텀해야 할 기능을
    필수로 작성하지 않아도 상속받은 자식 클래스가 정상적으로 작동한다.
    상속을 받을 때 필수로 해야 하는 기능에 대해 설정하는 방법
     */
    public void makeSound() {}
    public void move(){}
    public void doSpecialAction() {}
    public void eat(){}

}
