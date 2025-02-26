// Create a Person class with attributes name and age. Then, create 
// a Student class that inherits from Person and adds attributes studentId and grade.
// Write a constructor for both classes.
// Create an object of Student and display its details.

class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Student extends Person{
    int studId;
    String grade;
    
    public Student(int studId, String grade,String name,int age){
        super(name,age);
        this.studId = studId;
        this.grade = grade;
    }
    public void display(){
        System.out.println(this.studId);
        System.out.println(this.grade);
        super.display();
    }
}

public class PersonOops{
    public static void main(String args[]){
        Student student = new Student(10,"A","abc",10);
        student.display();
    }
    
}