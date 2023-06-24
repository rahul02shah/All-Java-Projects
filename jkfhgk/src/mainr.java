class Mango{
    Mango(String Name,int a){

    }
}
public class mainr {
    public static void main(String[] args) {
        Mango obj = new Mango("Rahul shah",19);
        String s1 = obj.toString();
        String s2 = String.valueOf(obj);
        System.out.println(s1);
        System.out.println(s2);
        String S1 = "Rahul shah";
        StringBuilder sb = new StringBuilder(S1);
        System.out.println(sb.toString());
//        sb.append(S1);
        sb.reverse();
        System.out.println(sb);
    }
}
