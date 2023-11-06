package chapter9;

public class Square extends ReactAngel{

    @Override
    public double calculatePrimitive(){
        return sides * length;
    }
    public void print(String str){
        System.out.println(" iam a "+ str);
    }
}
