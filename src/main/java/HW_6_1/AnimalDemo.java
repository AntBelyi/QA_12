// Base class Animal
class Animal {
    public void eat() {
        System.out.println("I am eating");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}

// Subclass Bird
class Bird extends Animal {
    public void fly() {
        System.out.println("I am flying");
    }
}

// Subclass Fish
class Fish extends Animal {
    public void swim() {
        System.out.println("I am swimming");
    }
}

// Subclass Dog
class Dog extends Animal {
    public void bark() {
        System.out.println("Woof-woof");
    }
}

// Main class for demonstration
public class AnimalDemo {
    public static void main(String[] args) {
        // Create objects
        Bird eagle = new Bird();
        Fish shark = new Fish();
        Dog husky = new Dog();

        System.out.println("--- Animal Demonstration ---");

        System.out.println("Eagle:");
        eagle.eat();
        eagle.sleep();
        eagle.fly();
        System.out.println();

        System.out.println("Shark:");
        shark.eat();
        shark.sleep();
        shark.swim();
        System.out.println();

        System.out.println("Husky:");
        husky.eat();
        husky.sleep();
        husky.bark();
        System.out.println();
    }
}