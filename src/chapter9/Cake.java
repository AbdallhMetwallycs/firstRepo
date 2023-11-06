package chapter9;

public class Cake {
    String flavor;
    double price;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Cake(){
        System.out.println(" this is Cake class");
    }
}
