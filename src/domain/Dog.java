package domain;


 /**
 * The class Dog extends pet
 */ 
public class Dog extends Pet {

    private String breed;


/** 
 *
 * Dog
 *
 * @param name  the name
 * @param breed  the breed
 * @param weight  the weight
 * @param alias  the alias
 */
    public Dog(String name, String breed, int weight, String alias) { 

        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.alias = alias;
    }
    

/** 
 *
 * The constructor who takes the dog's alias
 *
 * @param alias  the alias
 */
    public Dog(String alias){ 

        this("default name","default breed",10,alias);
        
    }


/** 
 *
 * Default constructor
 *
 */
    public Dog(){ 

        this("default name","default breed",10,"default alias");
    }


/** 
 *
 * Sniff the area
 *
 */
    public void sniffTheArea() { 

        System.out.println("The dog sniffs the area");         
    }


/** 
 *
 * Chase the cat
 *
 */
    public void chaseTheCat() { 

        System.out.println("The dog is chasing the cat");
    }


/** 
 *
 * Play
 *
 */
    public void play() { 

        System.out.println("The dog is playing");
    }
    
    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString(){ 

        return super.toString()+", \nBreed: "+ breed+ ", \nAlias: "+ alias + "\n";
    }
    
    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Woof woof");
    }
    
}
