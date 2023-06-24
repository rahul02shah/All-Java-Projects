class InvalidAgesException extends Exception{
    public InvalidAgesException(String message){
        super(message);
    }
}
public class Mainr {
    static void ValidateAge (int age) throws InvalidAgesException{
        if(age<18){
            throw new InvalidAgesException("You Can Not Vote :) ");
        }else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        try{
            ValidateAge(12);
        }catch (InvalidAgesException Ex){
            System.out.println("caught exception");
            System.out.println(Ex);
        }
    }
}
