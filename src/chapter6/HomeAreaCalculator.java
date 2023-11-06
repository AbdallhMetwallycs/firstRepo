package chapter6;

/*
* write a class that creates instance of the ReactAngel class to find the
* total area of three rooms in the house
* */
public class HomeAreaCalculator {
    public static void main(String[] args) {
        /* *******************
         * ReactAngel 1
         * ****************/
        // create instances of ReactAngel
        ReactAngel room1 = new ReactAngel();
        room1.setWidth(10);
        room1.setLength(50);
        double areaRoom1 = room1.calculateArea();

        /* *******************
         * ReactAngel 2
         * ****************/
        // create instances of ReactAngel
        ReactAngel room2 = new ReactAngel();
        room2.setLength(80);
        room2.setWidth(25);
        double areaRoom2 = room2.calculateArea();

        /* *******************
         * ReactAngel 3
         * ****************/
        // create instances of ReactAngel
        ReactAngel room3 = new ReactAngel(65, 45);
        double areaRoom3 =  room3.calculateArea();

        double area = areaRoom1 + areaRoom2 + areaRoom3;
        System.out.println(" the total area of the 3 rooms  : "+area);

    }

}
