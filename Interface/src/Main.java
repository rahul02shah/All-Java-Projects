interface customerraj{
    int amt = 5; // public static final
    void purchase(); // public abstract
}
class SellerSanju implements customerraj{
    @Override
    public void purchase() {
        System.out.println("Raj needs "+amt+" Rice");
    }
}
public class Main {
    public static void main(String[] args) {
        customerraj obj = new SellerSanju();
        obj.purchase();
        System.out.println(customerraj.amt);
    }
}