package edu.oop.method.ex;

public class RPGGameWithoutMethods {
    public static void main(String[] args) {

        RPGGameCharacter ch1 = new RPGGameCharacter("용감한 전사", 15, 80, 60, 20);
        RPGGameCharacter ch2 = new RPGGameCharacter("현명한 마법사", 12, 30, 40, 95);
        RPGGameCharacter ch3 = new RPGGameCharacter("민첩한 도적", 18, 55, 45, 35);


        ch1.method();
        ch2.method();
        ch3.method();

        RPGGameCharacter.partyInfo(ch1, ch2, ch3);
        RPGGameCharacter.strongest(ch1, ch2, ch3);


    }
}
