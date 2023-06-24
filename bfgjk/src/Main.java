interface Customer{
    int amt =5;
    void purchase();
}
class Seller implements Customer{
    @Override
    public void purchase(){
        System.out.println("i want "+amt+" kg Rice");
    }
}
public class Main {
    public static void main(String[] args) {
        Customer C1 = new Seller();
        C1.purchase();
    }
}