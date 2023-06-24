package studentdata;
class Book{
    String BookName;
    int ISBN_NO;
    String Author;
    String Pub;
    Book(String BookName, int ISBN_NO,String Author, String Pub){
        this.Author = Author;
        this.BookName = BookName;
        this.Pub = Pub;
        this.ISBN_NO = ISBN_NO;
    }
    void SetData(String BookName, int ISBN_NO,String Author, String Pub){
        this.Author = Author;
        this.BookName = BookName;
        this.Pub = Pub;
        this.ISBN_NO = ISBN_NO;
    }
    String GetData(){
        String Datas = "Book : "+BookName+"ISBN NO : "+ISBN_NO+" Author: "+Author+" PUB : "+Pub;
        return Datas;
    }
}
public class StudentData {
    public static void main(String[] args) {
        Book obj = new Book("Math",55,"Rahulshah","ankita");

        String Data = obj.GetData();
        obj.SetData("Science",89,"rahul","Anisha");
        System.out.println(Data);
    }
}
