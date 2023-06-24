// non static method and static method
class Static {
    int a = 10;
    static int b = 20;
    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static void show() {
        // System.out.println("a = " + a); // error
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Static obj = new Static();
        obj.display();
        show();
    }
}