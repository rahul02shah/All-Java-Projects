class InvalidAgeException extends Exception{
    InvalidAgeException(String ErrorMessage){
        super(ErrorMessage);
    }
}
public class Main {
    static void ValidateAge(int Age) throws InvalidAgeException{
        if(Age<18){
            throw new InvalidAgeException("You cannot vote");
        }else{
            System.out.println(" you are welcome ");
        }
    }
    public static void main(String[] args) {
        try{
            ValidateAge(13);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}