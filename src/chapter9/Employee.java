package chapter9;

public class Employee extends Person{
    private int id;
    private String title;

    public Employee() {
        super();
        System.out.println(" IN Employee default constructor");
    }
    public Employee(int id) {
        super("Abdallh Metwally");
        this.id = id;
        System.out.println(" IN Employee 2nd constructor, id is set");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
