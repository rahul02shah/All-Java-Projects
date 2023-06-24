public class Recursive {
    //reverse the number using recursion function
    static int reverse(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.println(n % 10);
            return reverse(n / 10);
        }
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n));

    }

}
