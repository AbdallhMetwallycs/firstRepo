package chapter9;

public class WeddingCake extends Cake{
    int tiers;

    public void setTiers(int tiers){
        this.tiers = tiers;
    }
    public int getTiers(){
        return tiers;
    }
    public WeddingCake(){
        System.out.println(" this is WeddingCake class");
    }
}
