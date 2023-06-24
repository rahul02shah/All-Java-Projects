import java.util.Random;

class Interest{
    int principle;
    int  time;
    int rate;
    Interest(int p,int t,int r){
        this.principle = p;
        this.rate = r;
        this.time = t;
    }
    void Display(){
        System.out.println("principle : "+this.principle);
        System.out.println("Rate is : "+this.rate);
        System.out.println("Timr is : "+this.time);
    }
    void SimpleInterest(){
        System.out.println("SI : "+(principle*time*rate)/100);
    }
}
public class Main {
    public static void main(String[] args) {
        Interest obj = new Interest(500,6,7);
        obj.Display();
        obj.SimpleInterest();
    }
}