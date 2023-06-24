import java.io.*;
public class Main {
    public static void main(String[] args) {
        File Myfile = new File("Output.txt");
        try{
            if(Myfile.exists()){
                System.out.println("already file created");
            }else{
                Myfile.createNewFile();
            }
            String Data = "Rahul Kumar Shah";
            BufferedWriter Writer = new BufferedWriter(new FileWriter(Myfile));
            Writer.write(Data);
            Writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}