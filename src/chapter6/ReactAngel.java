package chapter6;

public class ReactAngel {
    // global variables OR fields

    private double length;
    private double width;
    // constructors
    public ReactAngel(){
        length = 0;
        width = 0;
    }
    public ReactAngel(double length, double width){
        this.length = length;
        setWidth(width);
    }
    // getters and setters
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    // methods
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }


}
