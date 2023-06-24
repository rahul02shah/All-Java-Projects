import java.io.*;
public class Maint {
    public static void main(String[] args) {
        try{
            BufferedReader Reader = new BufferedReader(new FileReader("src/input.txt"));
            String Line;
            while((Line = Reader.readLine())!= null){
                System.out.println(Line);
            }
            Reader.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
