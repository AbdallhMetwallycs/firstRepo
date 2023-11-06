package chapter9;

public class ReactAngel {
    protected int sides;
    protected double width;
    protected double length;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double calculatePrimitive(){
        return (2 * length)+(2 * width);
    }
    public void print(){
        System.out.println(" iam a react angel");
    }
}
