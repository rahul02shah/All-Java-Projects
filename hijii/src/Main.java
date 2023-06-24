class Person{
    String Name;
    int ID;
    @Override
    public String toString(){
        return this.Name+" "+this.ID;
    }
    Person(String Name,int id){
        this.Name = Name;
        this.ID = id;
    }
}
public class Main {
    public static void main(String[] args) {
        Person P1 = new Person("Rahul Shah",67);
        System.out.println(P1.toString());
    }
}