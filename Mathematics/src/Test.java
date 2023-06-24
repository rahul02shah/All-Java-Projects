class Employee{

        }
public class Test {
    public static void main(String[] args) {
    int count =0;
    int min = 0;
        int [] arr = {1, 2, 3, 4, 5};
        int [] arr2 = arr.clone();
        for (int i = 0; i < arr2.length; i++) {
            if(min<arr2[i]){
                min = arr2[i];
            }
        }
        System.out.println("even numbers in array are: " + min);
    }
}
