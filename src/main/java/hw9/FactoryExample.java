public class FactoryExample {
    public static void main(String[] args) {
        System.out.println("--- Factory Pattern Example ---");

        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("dog");
        Animal cat = factory.createAnimal("cat");
        Animal bird = factory.createAnimal("bird");

        dog.speak();
        cat.speak();
        bird.speak();
    }
}

// Animal interface with the speak method
interface Animal {
    void speak();
}

// Dog class implements Animal
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Dog says: Woof!");
    }
}

// Cat class implements Animal
class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Cat says: Meow!");
    }
}

// Bird class implements Animal
class Bird implements Animal {
    @Override
    public void speak() {
        System.out.println("Bird says: Chirp!");
    }
}

// Factory class to create Animal objects
class AnimalFactory {
    public Animal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}
