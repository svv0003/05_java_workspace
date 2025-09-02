package edu.inheritance.ex1;
/*
`Bird` 자식 클래스 작성

- **클래스명**: `Bird extends Animal`
- **고유 필드**: `wingspan` (날개 길이, private double)
- **생성자**: 기본, 3개 매개변수, 4개 매개변수 생성자 (super 사용)
- **오버라이딩**: `makeSound()`, `move()` 메소드
- **고유 메소드**: `fly()`, `buildNest()`
- **getter/setter**: wingspan 관련
 */
public class Bird extends Animal {
    // 필드 속성 인스턴스변수
    private double wingspan;

    public Bird(String name,int age,String color){
        super(name,age,color);
    }
    public Bird(String name,int age,double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }
    // 매개변수 생성자 Animal 3개                    Bird 1개
    public Bird(String name, int age, String color, double wingspan) {
        super(name, age, color);
        this.wingspan = wingspan;
    }

    // 게터 :  set 이나 wingspan에 저장된 데이터를 사용할 수 있는 기능
    public double getWingspan() {
        return wingspan;
    }
    // 세터 : DB에 저장하기 전에 임시로 데이터를 보유하고 있는 기능
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override // Animal 클래스에 작성한 기능 재사용
    public void makeSound() {
        System.out.println(getName() + "이(가) 짹짹 웁니다.");
    }

    @Override // Animal 클래스에 작성한 기능 재사용
    public void move() {
        System.out.println(getName() + "이(가) 날아다닙니다.");
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("날개 길이 : " + getWingspan());
    }

    // Bird 에서만 사용할 수 있는 기능들
    public void fly(){
        System.out.println(getName() + "이(가) 높이 날아오릅니다.");
    }

    public void buildNest(){
        System.out.println(getName() + "이(가) 둥지를 만듭니다.");
    }

}