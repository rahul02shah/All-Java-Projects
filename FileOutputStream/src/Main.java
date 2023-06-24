import java.io.*;
public class Main {
    public static void main(String[] args) {
        File obj = new File("output.txt");
        try{
            obj.createNewFile();
            FileOutputStream Fout = new FileOutputStream(obj,true);
            String Data = "Hello Myself Rahul Kumar Shah, I'm From Rajbiraj";
            char arr []= Data.toCharArray();
            for(int i= 0;i<Data.length();i++){
                Fout.write(arr[i]);
                Fout.close();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}