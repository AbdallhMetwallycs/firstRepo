package chapter10;

public class Fruit {
    double calories ;
    public Fruit(double calories){
        this.calories = calories;
    }

    public Fruit() {
        System.out.println(" unknown Fruit");
    }

    public  void makeJuice(){
        System.out.println(" Juice is made");
    }
}
