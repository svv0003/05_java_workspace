package edu.polymorphism.pack1.ex3.service;

// edu.polymorphism.pack1.ex3.model 폴더 내부의 모든 문서를 참조하겠다. 설정
import edu.polymorphism.pack1.ex3.model.*;
/*
import edu.polymorphism.pack1.ex3.model.Animal;
import edu.polymorphism.pack1.ex3.model.Dog;
import edu.polymorphism.pack1.ex3.model.Cat;
import edu.polymorphism.pack1.ex3.model.Bird;
*/
public class AnimalService {
    public static void display() {
        Dog dog = new Dog("멍멍이", 3, "갈색", "개");
        Cat cat = new Cat("야옹이", 2, "흰색", "고양이");
        Bird bird = new Bird("짹짹이", 1, "노란색", "새");

        System.out.println("=== 동물들의 행동 ===");

        Animal[] animals = {dog, cat, bird};

        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
            dog.setTrained(true);
            animal.doSpecialAction();
            animal.eat();
            System.out.println(animal.toString());
            System.out.println();
        }

        /*
        // 개
        dog.makeSound();
        dog.move();
        dog.setTrained(true);
        dog.doSpecialAction();
        dog.eat();
        System.out.println(dog.toString());

        System.out.println();

        // 고양이
        cat.makeSound();
        cat.move();
        cat.doSpecialAction();
        cat.eat();
        System.out.println(cat.toString());

        System.out.println();

        // 새
        bird.makeSound();
        bird.move();
        bird.doSpecialAction();
        bird.eat();
        System.out.println(bird.toString());
         */
    }
}
