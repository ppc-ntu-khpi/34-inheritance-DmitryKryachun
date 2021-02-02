package test;

import domain.Dog;

public class TestAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog("Alfred");
        System.out.println(dog);
        dog.chaseTheCat();
        dog.speak();
        dog.eat();
        dog.play();
        dog.sleep();
    }
}
