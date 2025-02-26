import java.util.HashMap;
import java.util.Scanner;

class Employee{
    
    private String name;
    private int salary;

    public Employee(String name, int salary){
        
        this.name = name;
        this.salary = salary;
    
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }
    
}
public class hashMapSample {
    public static void main(String[] args) {
        
        int id = 1;

        Scanner in = new Scanner(System.in);
        HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
        
        for(int i=0;i<3;i++){
        
            System.out.println("Employee name");
            String name = in.next();
            System.out.println("Enter salary: ");
            int salary = in.nextInt();
            Employee emp = new Employee(name , salary);
            hm.put(id,emp);
            id++;
        }
        
        for(Integer i : hm.keySet()){
        
            System.out.print(i + " ");
            System.out.print(hm.get(i).getName() + " ");
            System.out.println(hm.get(i).getSalary());
        }
        in.close();
    }
}