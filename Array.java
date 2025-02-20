import java.util.*;

public class Array {

    public static void main(String[] args) {
        

        //method1

        String[] arr = new String[5];
        System.out.println("length : " + arr.length);

        arr[0] = "10";
        arr[1] = "20";
        arr[2] = "30";
        arr[3] = "40";
        arr[4] = "50";
        
       
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        //method2

        int[] arr2 = {30};

        System.out.println("\nlength : " + arr2.length);

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }

        arr2[0] = 10;

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }

    }
    
}
