public class Name {
    //set name and get name
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //set age and get age
    private int age;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Name n = new Name();
        n.setName("Rahul");
        n.setAge(20);
        System.out.println("Name: " + n.getName());
        System.out.println("Age: " + n.getAge());
    }
}
