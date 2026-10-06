class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
}

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        this.breed = breed;
        super(name);
    }

    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", "Golden Retriever");
        System.out.println(myDog.name);
        
        Dog emptyDog = new Dog();
    }
}
