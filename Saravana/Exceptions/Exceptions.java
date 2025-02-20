import java.util.Scanner;

// Custom exception
class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){
        super(message);
    }
}

public class Exceptions {

    public static void checkAge(int age) throws InvalidAgeException{
    
        if(age > 18){
            System.out.println("Age okay");          
        }
        else{
            throw new InvalidAgeException("Age is below 18");
        }    
    }
    public static void main(String args[]){
    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = in.nextInt();
    
        try{
            checkAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Exception" + e.getMessage());
        }
    
        in.close();
    }    
}
