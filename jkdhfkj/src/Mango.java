import java.io.*;
public class Mango {
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("src/input.txt");
            out = new FileWriter("src/output.txt");
            int c;
            while ((c= in.read())!= -1){
                out.write(c);
            }
        }
        finally {
            if(out!= null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }

    }
}