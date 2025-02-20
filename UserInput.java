import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter your name : ");
        String name;


        name = in.nextLine();

        int num = in.nextInt();


        float num1 = in.nextFloat();

        System.out.println("Name : " + name);

        System.out.println("Number : " + num);

        System.out.println("Float : " + num1);


        in.close();
    }
}