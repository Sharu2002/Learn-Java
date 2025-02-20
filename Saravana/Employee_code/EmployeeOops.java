package Employee_code;

class Employee{
    private String name;
    private int emp_id;
    private int basicSalary;

    public Employee(String name,int emp_id,int basicSalary){
        this.name = name;
        this.emp_id = emp_id;
        this.basicSalary = basicSalary;
    }
    public String getName(){
        return name;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public int getBasicSalary(){
        return basicSalary;
    }
    public int calculateSalary(){
        return basicSalary;
    }
}

class Manager extends Employee{
    private int bonus;
    public Manager(int bonus,String name,int emp_id,int basicSalary){
        super(name,emp_id,basicSalary);
        this.bonus = bonus;
    }
    public int getBonus(){
        return bonus;
    }
    public int calculateSalary(){
        return getBasicSalary()+bonus;
    }
}

class Developer extends Employee{
    private int overTimePay;

    public Developer(int overTimePay,String name,int emp_id,int basicSalary){
        super(name,emp_id,basicSalary);
        this.overTimePay = overTimePay;
    }
    public int getOverTimePay(){
        return overTimePay;
    }
    public int calculateSalary(){
        return getBasicSalary()+overTimePay;
    }
}

public class EmployeeOops {
    public static void main(String args[]){
        Manager manager = new Manager(10000, "Sharu", 1, 100000);
        Developer developer = new Developer(15000, "Saravana", 2, 200000);
        System.out.println(manager.calculateSalary());
        System.out.println(developer.calculateSalary());
    }
}
