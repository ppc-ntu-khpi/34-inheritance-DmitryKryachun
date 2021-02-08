package domain;


 /**
 * The class Pet extends animal
 */ 
public class Pet extends Animal {

    protected String alias;


/** 
 *
 * Default constructor
 *
 */
    public Pet() { 

        this.alias = "default alias";
        this.name = "default name";
        this.weight = 10;
    }


/** 
 *
 * Go to the owner
 *
 */
    public void goToTheOwner() { 

        System.out.println("The pet goes to the owner");
    }
}
