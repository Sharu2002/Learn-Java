import java.util.*;


public class Arraylist {
    public static void main(String[] args) {
        
        //method1

        //String[] arr = new String[4]; -> length

        ArrayList<String> arr = new ArrayList<String>(); //dynamic -> size


        System.out.println("length : " + arr.size());

        arr.add("10");
        arr.add("20");
        arr.add("30");
        arr.add("40");
        arr.add("50");
        
       
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+ " ");
        }

        arr.remove(4);
        System.out.println("\nlength : " + arr.size());


    }
}
