class m {
    int i;
    m(){
        i =10;
    }
}
class n extends m{
    public void Derived(){
        super.i= 45;
        System.out.println(this.i);
    }
}
public class Main {
    public static void main(String[] args) {
        n on = new n();
        on.Derived();
    }
}