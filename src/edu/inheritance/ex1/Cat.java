package edu.inheritance.ex1;
/*
public class Cat extends Animal { // 이줄에 빨간줄이 생기는 경우

    // 생성자를 만들어주지 않았기 때문에 빨간줄 에러 발생
    // 상속의 경우 부모에 작성된 필드와 생성자를 활용하겠다 가 기본정의
    // 이므로 부모의 필드를 활용할 수 있는 생성자가 존재하지 않아 문제가 발생

    public void makeSound() {
        System.out.println(name + "이(가) 야옹 웁니다.");
    }

    public void move() {
        System.out.println(name + "이(가) 네 발로 조용히 걸어다닙니다.");
    }
}



 */
/*
`Cat` 자식 클래스 작성

- **클래스명**: `Cat extends Animal`
- **고유 필드**: `isIndoor` (실내묘 여부, private boolean)
- **생성자**: 기본, 3개 매개변수, 4개 매개변수 생성자 (super 사용)
- **오버라이딩**: `makeSound()`, `move()` 메소드
- **고유 메소드**: `purr()`, `scratch()`
- **getter/setter**: isIndoor 관련
 */
public class Cat extends Animal {
    //필드 속성 인스턴스 변수
    private boolean isIndoor;

    // 기본생성자 생성
    public Cat(){
        super();
    }

    // 매개변수가 4개 존재하는 생성자 (Animal 3 개 + Cat 1 개)
    public Cat(String name, int age, String color, boolean isIndoor) {
        super(name, age, color);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    // Animal 클래스에서 작성한 기능을 재사용
    @Override
    public void makeSound() {
        // Animal 의 작성된 이름이 private = Animal 클래스에서만 사용할 수 있는 명칭
        // 으로 getName 을 활용해서 setName에 담겨져 있는 데이터를 사용
        System.out.println(getName()+ "이(가) 야옹 웁니다.");
    }
    @Override
    public void move() {
        System.out.println(getName() + "이(가) 네 발로 조용히 걸어다닙니다.");
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("실내묘 : " + isIndoor());
    }
    // Cat 클래스에서만 사용할 수 있는 기능들
    public void purr(){
        System.out.println(getName() + "이(가) 골골 소리를 냅니다.");
    }

    public void scratch(){
        System.out.println(getName() + "이(가) 발톱으로 긁습니다.");
    }
}