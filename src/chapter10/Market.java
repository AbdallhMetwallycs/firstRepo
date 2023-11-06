package chapter10;

public class Market {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.makeJuice();

        fruit = new Apple();
        ((Apple)fruit).peel();
        ((Apple)fruit).removeSeeds();
        fruit.makeJuice();

        fruit = new Banana();
        ((Banana)fruit).peel();
        ((Banana)fruit).removeSeeds();
        fruit.makeJuice();
    }
}
