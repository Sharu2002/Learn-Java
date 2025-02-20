// Create a class named "Employee" with the following attributes:

// id (int)
// name (String)
// designation (String)
// salary (double)

// The above attributes should be private, and the class should have a parameterized constructor to initialize them.

// Implement the following methods in the Employee class:

// getSalary(): This method should return the salary of the employee.
// getDesignation(): This method should return the designation of the employee.

// Create a class named "Company" with the following attributes:

// companyName (String)
// employees (Employee array)
// numEmployees (int)

// The above attributes should be private, and the class should have a parameterized constructor to initialize them.

// Implement the following methods in the Company class:

// getAverageSalary(): This method should return the average salary of all the employees in the company.
// getMaxSalary(): This method should return the highest salary of all the employees in the company.
// getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.

// In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details 
// (id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the 
// appropriate parameters. Finally, call the three methods mentioned above and print the output.

// Note:

// All searches should be case-insensitive.
// You may assume that the input is valid and in the correct format.

// Sample input:
// ---------------------
// Enter company name: ABC Company
// Enter number of employees: 3
// Enter employee details:
// Employee 1:
// Enter id: 101
// Enter name: John Smith
// Enter designation: Manager
// Enter salary: 5000
// Employee 2:
// Enter id: 102
// Enter name: Jane Doe
// Enter designation: Engineer
// Enter salary: 4000
// Employee 3:
// Enter id: 103
// Enter name: Bob Johnson
// Enter designation: Engineer
// Enter salary: 4500

// Sample Output:
// --------------------
// Average salary: 4500.0
// Max salary: 5000.0
// Employees with designation: Engineer
// ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
// ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0



package tcsOops;
import java.util.Scanner;
import java.util.ArrayList;

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id,String name,String designation,double salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
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
    public String getDesignation(){
        return designation;
    }
}

class Company{
    private String companyName;
    private ArrayList<Employee> employeeArr;
    private int numEmployees;

    public Company(String companyName,ArrayList<Employee> employeeArr,int numEmployees){

        this.companyName = companyName;
        this.employeeArr = employeeArr;
        this.numEmployees = numEmployees;
    }

    public ArrayList<Employee> getEmployeeArr(){
        return employeeArr;
    }
    
   

    public double getAverageSalary(){
        int count = 0;
        double total = 0;
        for(int i=0;i<employeeArr.size();i++){
            total += employeeArr.get(i).getSalary();
            count++;
        }
        double avgSalary = total / count;
        return avgSalary;
    }

    public double getMaxSalary(){
        double maxSalary = 0;
        for(int i=0;i<employeeArr.size();i++){
            maxSalary += employeeArr.get(i).getSalary();
        }
        return maxSalary;

    }

    public void getEmployeesByDesignation(String designation){
        for(int i=0;i<employeeArr.size();i++){
            if(employeeArr.get(i).getDesignation().equals(designation)){
                System.out.println("Id: " + employeeArr.get(i).getId() + "Name: " + employeeArr.get(i).getName() + "Designation: " + employeeArr.get(i).getDesignation() + "Salary: " + employeeArr.get(i).getSalary());
            }
        }
    }
}
public class TcsOops {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter company name: ");
        String companyName = in.next();
        System.out.println("Enter no of employees in company: ");
        int numEmployees = in.nextInt();
        ArrayList<Employee> empArray = new ArrayList<>();
        for(int i=0;i<numEmployees;i++){
            int id = i+1;
            System.out.println("Enter employee name: ");
            String employeeName = in.next();
            System.out.println("Enter designation: ");
            String designation = in.next();
            System.out.println("Enter salary: ");
            double salary = in.nextDouble();
            Employee emp = new Employee(id, employeeName, designation, salary);
            empArray.add(emp);
        }
        Company company = new Company(companyName, empArray, numEmployees);
        System.out.println(company.getAverageSalary());
        System.out.println(company.getMaxSalary());
        company.getEmployeesByDesignation("Developer");
    }
    
}
