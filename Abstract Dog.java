
abstract class Animal {

    public abstract void makeSound();

    public void sleep() {
        System.out.println("Zzzzzzzz.");
    }
}

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof.");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.makeSound();
        dog.sleep();
    }
}
