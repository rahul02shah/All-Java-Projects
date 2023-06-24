import java.io.*;
public class Main {
    public static void main(String[] args) {
        File obj = new File("abc.txt");
        if(!obj.exists()){
            try{
                obj.createNewFile();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        try{
            FileOutputStream Fout = new FileOutputStream(obj);
            String Data = "Hello Myself Rahul Kumar Shah .";
            Fout.write(Data.getBytes());
            Fout.close();
        }catch(Exception e){
            System.out.println(e);
        }
        try (FileInputStream input = new FileInputStream(obj)) {
            int character;
            while ((character = input.read()) != -1) {
                System.out.print((char)character);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}