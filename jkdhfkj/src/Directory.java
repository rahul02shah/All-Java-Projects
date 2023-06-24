import java.io.*;
class CreateDirectory {
    public static void main(String args[])
    {
        // specify an abstract pathname in the File object
        File f = new File("D:\\Educative");
        // check if the directory can be created
        // using the specified path name
        if (f.mkdir() == true) {
            System.out.println("Directory has been created successfully");
        }
        else {
            System.out.println("Directory cannot be created");
        }
    }
}
