// Student 

// 	id , name , roll , age

// methods

// 	add student
// 	remove student with id
// 	find student with id


package Array;

import java.util.ArrayList;

class Student{

    private int id;
    private String name;
    private int rollNo;
    private int age;

    public Student(int id,String name,int rollNo,int age){
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getRollNo(){
        return rollNo;

    }

    public int getAge(){
        return age;
    }
}

class studentList{
    
    private ArrayList<Student> studentList;
    
    public studentList(){
        studentList = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void removeStudent(int id){

        for (int i=0;i<studentList.size();i++){
            
            if(studentList.get(i).getId() == id){
                studentList.remove(i);
            }
        }
    }
    
    public Student findStudent(int id){
        
        for (int i=0;i<studentList.size();i++){
        
            if(studentList.get(i).getId() == id){
                return studentList.get(i);
            }
        }
        return null;
    }
    
    public void displayStudents(){
        
        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i).getId() + studentList.get(i).getName() + studentList.get(i).getRollNo() + studentList.get(i).getAge());
        }
    }
}

public class arrayStudent {
    public static void main(String args[]){
        
        Student student = new Student(1,"Saravana",119,22);
        studentList stud = new studentList();
        
        stud.addStudent(student);
        
        System.out.println(stud.findStudent(1).getId() + stud.findStudent(1).getName());;
    }
}
