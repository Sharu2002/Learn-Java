import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        
        LinkedList<String> arr = new LinkedList<String>(); //dynamic -> size

        arr.add("Sharu");
        arr.add("Arun");
        arr.add("Naaru");
        arr.add(1,"Ananya");

        Collection<String> arr2 = new ArrayList<String>();
        arr2.add("Abilash");
        arr2.add("Sarvesh");

        arr.addAll(2,arr2);

        arr.add(3, "Vanitha" );


        System.out.println("length : " + arr.size());

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i)+ " ");
        }
    
}
}