import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        // Create an object to serialize
        Student student = new Student("John Doe", 20, "Computer Science");

        try {
            // Create a FileOutputStream to write the object to a file
            FileOutputStream fileOut = new FileOutputStream("student.ser");

            // Create an ObjectOutputStream to serialize the object
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Write the object to the ObjectOutputStream
            out.writeObject(student);

            // Close the ObjectOutputStream and FileOutputStream
            out.close();
            fileOut.close();

            System.out.println("Object serialized and saved to student.ser");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

// Define a class to be serialized
class Student implements Serializable {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}