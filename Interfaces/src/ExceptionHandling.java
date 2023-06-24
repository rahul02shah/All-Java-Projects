public class ExceptionHandling {
    public static void main(String[] args) {
        int a=5,b;
        try{
            b = Integer.parseInt(args[1]);
            int ans = a/b;
            System.out.println(ans);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
