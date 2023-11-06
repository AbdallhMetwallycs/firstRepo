package chapter9;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println(" In Person default constructor ");
    }

    public Person(String name) {
        this.name = name;
        System.out.println(" In Person 2nd constructor, name is set ");

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(" In Person 3rd constructor , name and age is set");

    }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println(" In Person 4rd constructor name, age, and gender is set");

    }

    // create getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
