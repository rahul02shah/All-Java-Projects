class Book{
    String BookName;
    int ISBN_NO;
    String AuthorName;
    String Publisher;
    Book(String BookName,String Publisher,String AuthorName,int ISBN_NO){
        this.AuthorName = AuthorName;
        this.BookName = BookName;
        this.ISBN_NO = ISBN_NO;
        this.Publisher = Publisher;
    }
    String Display(){
        String BookData = "BookName "+BookName+"Author Name "+AuthorName+"Publisher "+Publisher+"ISBN No"+ISBN_NO;
        return BookData;
    }
}
public class Main {
    public static void main(String[] args) {
        Book obj = new Book("Math","MK","DR. simkhada",19);
        System.out.println(obj.Display());
    }
}