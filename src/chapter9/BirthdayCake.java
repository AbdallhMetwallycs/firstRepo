package chapter9;

public class BirthdayCake extends Cake{
    int candles;

    public void setCandles(int candles){
        this.candles = candles;
    }

    public int getCandles(){
        return candles;
    }
    public BirthdayCake(){
        System.out.println(" this is BirthdayCake class");
    }
}
