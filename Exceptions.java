import java.util.Scanner;

//custom Exception
class SaravanaException extends Exception{

    public SaravanaException(String message){
        super(message);
    }
}

public class Exceptions {

    public static void checkLifeLine(String HerReply) throws SaravanaException {

        if(! HerReply.equals("Yes")) {

            System.out.println("Saravana is good to go");
        } else {
            
            throw new SaravanaException("Will be sliced in half");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Will u reply ? : ");

        String HerReply = in.next();
        
        try {

            checkLifeLine(HerReply);

        } catch (SaravanaException e) {
            System.out.println("Exception : " + e.getMessage());
        }

        in.close();
        
    }
}
