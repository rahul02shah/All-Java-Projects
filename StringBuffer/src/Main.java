public class Main {
    public static void main(String[] args) {
        String Fname = "Rahul";
        StringBuffer obj = new StringBuffer("Rahul");
        obj.append(" shah");
        System.out.println(obj);
        String FullName = Fname.concat("Shah");
        System.out.println(FullName);
    }
}