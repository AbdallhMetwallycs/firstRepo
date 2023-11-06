package chapter10;

public class Banana extends Fruit{

    public Banana(double calories) {
        super(calories);
        System.out.println(" this is Banana");
    }

    public Banana() {
        System.out.println(" it's a  Banana");
    }

    public  void removeSeeds(){
        System.out.println(" NO Seeds to remove");

    }
    public  void peel(){
        System.out.println(" Peeled");
    }

    @Override
    public  void makeJuice(){
        System.out.println(" Banana Juice is made ");
    }
}
