package domain;

public class Dog extends Pet {

    private String breed;

    public Dog(String name, String breed, int weight, String alias) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.alias = alias;
    }
    
    public Dog(String alias){
        this("default name","default breed",10,alias);
        
    }

    public Dog(){
        this("default name","default breed",10,"default alias");
    }

    public void sniffTheArea() {
        System.out.println("The dog sniffs the area");         
    }

    public void chaseTheCat() {
        System.out.println("The dog is chasing the cat");
    }

    public void play() {
        System.out.println("The dog is playing");
    }
    
    @Override
    public String toString(){
        return super.toString()+", \nBreed: "+ breed+ ", \nAlias: "+ alias + "\n";
    }
    
    @Override
    public void speak() {
        System.out.println("Woof woof");
    }
    
}
