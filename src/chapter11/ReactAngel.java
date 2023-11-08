package chapter11;

public class ReactAngel extends Shape {
    private double length;

    private double width;
    public ReactAngel(double length, double width){
        this.width = width;
        this.length = length;
        /*
        * or
        *  setLength(length);
        *  setWidth(width);
        * */
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
