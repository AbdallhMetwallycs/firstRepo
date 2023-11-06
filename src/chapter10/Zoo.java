package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();;
        System.out.println(" ");
        Dog rocky = new Dog();
        Cat kitty = new Cat();
        rocky.fetch();
        rocky.makeSound();
        System.out.println(" ");
        kitty.scratch();
        kitty.makeSound();
        System.out.println(" ");
    }

}
