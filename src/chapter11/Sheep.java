package chapter11;

public class Sheep extends Animal {
    private boolean silk;
    @Override
    void makeSound() {
        System.out.println(" maaA for Sheep");
    }
    public void setSilk(boolean haveSilk){
        this.silk = haveSilk;
    }
    public boolean isSilk() {
        return silk;
    }
}
