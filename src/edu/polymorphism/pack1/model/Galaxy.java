package edu.polymorphism.pack1.model;

public class Galaxy extends SmartPhone {

    // 안드로이드 운영체제 버전
    private int androidVersion;

    // HTML에서 필수로 데이터 정보를

    // 기본 생성자
    // Galaxy라는 객체를 생성할 때 기본적으로 갖추어야 하는 필드 값 없이 생성한다.
    // (일단 공간부터 만들고 나중에 Galaxy에 대한 정보를 설정하자!)
    public Galaxy() {

    }

    // 매개변수 생성자
    // 매개변수 타입은 모두 SmartPhone 문서에 작성된 필드 값을 기본적으로 설정한 객체를 생성한다.
    // (공간을 만들 때 적어도 부모생성자 매개변수가 무엇인지는 작성하고 공간을 설정하자!)
    public Galaxy(String display, String newsAgency, String ap) {
        super(display, newsAgency, ap);
    }

    // 매개변수 생성자
    // 매개변수 타입은 SmartPhone + Galaxy 필드 값을 모두 갖춘 상태에서 객체를 생성한다.
    // (공간을 만들 때 필수로 모든 매개변수의 정보를 입력한 상태로 공간을 설정하자!)
    public Galaxy(String display, String newsAgency, String ap, int androidVersion) {
        super(display, newsAgency, ap);
        this.androidVersion = androidVersion;
    }

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public String toString() {
        // androidVersion + SmartPhone에 작성된 toString 정보를 사용한다.
        return "Galaxy androidVersion : " + androidVersion + super.toString() ;
    }
}
