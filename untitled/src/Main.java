interface CustomerBuy{
    int amount = 20;
    void purchase();
}
class Seller implements CustomerBuy{
    @Override
    public void purchase(){
        System.out.println("you made a purchase of "+amount+"Kg rice");
    }
}
public class Main {
    public static void main(String[] args) {
        Seller obj = new Seller();
        obj.purchase();
    }
}