public class empty {
    static void Return14(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j]==14){
                    System.out.println("index is"+i+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        Return14(a);
    }
}
