package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog rocky = new Dog();
        Cat kitty = new Cat();

        System.out.println(" ");
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        System.out.println(" ");
        kitty.scratch();
        kitty.makeSound();

        System.out.println("polymorphism");

        System.out.println(" ");
        Animal sasha = new Dog();
        sasha.makeSound();
        ((Dog)sasha).fetch();
        feed(sasha);

        System.out.println(" ");
        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);
        System.out.println(" ");
        ((Cat) sasha).scratch();

    }
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println(" feed me Dog Food");
        } else if (animal instanceof Cat) {
            System.out.println(" feed me Cat Food");
        }
    }

}
