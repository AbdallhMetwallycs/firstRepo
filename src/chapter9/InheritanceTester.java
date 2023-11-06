package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {
        Person person = new Person("Abdallh Metwally");
        Employee employee = new Employee(11468);
        testSquareOverride();

        Mother mother = new Mother();
        mother.setName("Sameha");
        System.out.println(mother.getGender());
        mother.setAge(60);
    }

    public static void testSquareOverride(){
        ReactAngel reactAngel = new ReactAngel();
        reactAngel.print();
        reactAngel.setLength(5);
        reactAngel.setWidth(10);
        System.out.println(reactAngel.calculatePrimitive());

        Square square = new Square();
        square.print("square");
        square.setLength(5);
        square.setSides(4);
        System.out.println(square.calculatePrimitive());
    }
}
