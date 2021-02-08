package test;

import domain.Dog;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
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
