package chapter10;

public class Apple extends Fruit{

    public Apple(double calories) {
        super(calories);
        System.out.println(" this is Apple");

    }

    public Apple() {
        System.out.println(" it's an Apple");
    }

    public  void removeSeeds(){
        System.out.println(" Seeds removed");

    }
    public  void peel(){
        System.out.println(" no need to Peel");
    }

    @Override
    public  void makeJuice(){
        System.out.println(" Apple Juice is made ");
    }
}
