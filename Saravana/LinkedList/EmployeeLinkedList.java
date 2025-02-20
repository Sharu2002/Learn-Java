// Requirements:
// 	1.	Create an Employee class with the following attributes:
// 	•	int id
// 	•	String name
// 	•	double salary
// 	•	String department
// 	2.	Create a Manager class that extends Employee, with an additional attribute:
// 	•	double bonus
// 	3.	Implement a Company class that:
// 	•	Uses a LinkedList<Employee> to store employees.
// 	•	Provides methods to:
// 	•	Add an employee.
// 	•	Remove an employee by ID.
// 	•	Display all employees.
// 	•	Find an employee by ID.
// 	•	Display all employees in a particular department.


package LinkedList;

import java.util.LinkedList;


class Employee{

    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id,String name, double salary, String department){
        
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

}

class Manager extends Employee{

    private double bonus;

    public Manager(double bonus,int id,String name, double salary, String department){
        
        super(id, name, salary, department);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }
}

class Company{

    private LinkedList<Employee> emp = new LinkedList<>();

    public Company(){
        emp = new LinkedList<Employee>();
    }

    public void addEmployee(Employee Employee){
        emp.add(Employee);
    }

    public void removeEmployee(int id){
        
        for (int i = 0 ; i<emp.size();i++){
            
            if(emp.get(i).getId() == id){
                emp.remove(i);
            }
        }
    }
    
    public void displayEmployees(){

        for (int i =0 ; i<emp.size();i++){
            System.out.println(emp.get(i).getId() + "\n" + emp.get(i).getName() + "\n" + emp.get(i).getSalary()+ "\n"  + emp.get(i).getDepartment());        }
    }

    public void findEmployee(int id){

        for(int i = 0 ; i<emp.size();i++){
            if (emp.get(i).getId() == id){
                System.out.println("Employee found");
            }
        }
    }

    public void displayByDept(String dept){
        
        for(int i = 0; i<emp.size();i++){

            if(emp.get(i).getDepartment() == dept){
                System.out.println(emp.get(i).getId() + "\n" + emp.get(i).getName() + "\n" + emp.get(i).getSalary()+ "\n"  + emp.get(i).getDepartment());
            }
        }
    }
}

public class EmployeeLinkedList {
    public static void main(String[] args) {
        
        Manager manager = new Manager(50000, 1, "Sharu", 1000000, "AI");
        Company company = new Company();

        company.addEmployee(manager);
        company.displayEmployees();
    }
}