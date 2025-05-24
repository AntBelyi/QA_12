class Animal {
    void eat() {
        System.out.println("I am eating");
    }

    void sleep() {
        System.out.println("I am sleeping");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("I am swimming");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof-woof");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();

        Fish fish = new Fish();
        fish.eat();
        fish.sleep();
        fish.swim();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
