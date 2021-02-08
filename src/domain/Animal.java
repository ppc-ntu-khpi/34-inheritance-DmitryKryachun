package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;

    protected int weight;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name = "default name";
        weight = 10;
    }


/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("The animal is talking");
    }


/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("The animal is sleeping");
        
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Animal name: " + name + ", \nWeiht: " + weight;
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("The animal eats");
    }
}

