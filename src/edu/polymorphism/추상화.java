package edu.polymorphism;

/*
추상화

어떤 개념이나 정보를 단순화하고 핵심적인 요소만 뽑아내는 것을 의미한다.
코드에서 추상화란 추후 어떤 구현이 될 지는 알 수 없지만
그 구현의 기능 명칭은 알 수 있다.

abstract

기능에 대한 틀만 존재하고 구체적인 기능은 없다.
반드시 추상화 기능을 작성하는 class 문서는
class 앞에 abstract를 작성해야 한다.

이 파일은 세부 기능없이 기능에 대한 명칭만 작성된 메서드가 존재한다는 뜻의 표기
public abstract class 파일명 {
    // 추상화 기능 또한 abstract 작성해야 하며, 중괄호 {}는 생략한다.
}

추상화     : 특정 구현 기술이 없어 모호한 기능을 나타내는 단어
             중괄호 {}가 존재하지 않는다는 이유 때문에!!
 */

public abstract class 추상화 {
    // 필드 작성 필수 아님

    // 접근제한자 추상화 자료형 메서드명();
    public abstract void info();
    public abstract String display();
    public abstract int method3();
}
