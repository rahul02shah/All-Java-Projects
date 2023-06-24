public class Reference {
// reference method in javapsvm
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = sum(a,b);
        System.out.println(c);
    }
    static int sum(int x, int y){
        int z = x + y;
        return z;
    }
}
