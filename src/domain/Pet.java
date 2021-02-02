package domain;

public class Pet extends Animal {

    protected String alias;

    public Pet() {
        this.alias = "default alias";
        this.name = "default name";
        this.weight = 10;
    }

    public void goToTheOwner() {
        System.out.println("The pet goes to the owner");
    }
}
