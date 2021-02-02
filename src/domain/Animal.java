package domain;

public class Animal {

    protected String name;

    protected int weight;

    public Animal() {
        name = "default name";
        weight = 10;
    }

    public void speak() {
        System.out.println("The animal is talking");
    }

    public void sleep() {
        System.out.println("The animal is sleeping");
        
    }

    @Override
    public String toString() {
        return "Animal name: " + name + ", \nWeiht: " + weight;
    }

    public void eat() {
        System.out.println("The animal eats");
    }
}
