
class InvalidAgeException extends Exception{
    InvalidAgeException(String Message){
        super(Message);
    }
}
public class mainp {
    static void validator(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You can not vote");
        }
    }
    public static void main(String[] args) {
        try{
            validator(13);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}
