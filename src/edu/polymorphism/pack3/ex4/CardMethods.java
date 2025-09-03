package edu.polymorphism.pack3.ex4;

// 추상클래스로 CreditCard에 작성된 추상메서드르 인터페이ㅣ스로 옮겨 작성한 후
// 추상클래스가 아닌 인터페이스 CardMethods를 활용하여 문제없이 동작하도록 설정하기

public interface CardMethods {

     void showBenefits();        // 혜택 안내
     int calculateDiscount(int amount); // 할인 계산
     int getPointRate();         // 포인트 적립률
}
