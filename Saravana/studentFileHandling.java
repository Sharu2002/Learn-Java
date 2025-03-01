import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

class Student{
    
    private int id;
    private String name;
    private char grade;

    public Student(int id,  String name , char grade){
    
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void studentFileWrite(){
        try {
            FileWriter fw = new FileWriter(name + ".txt");
            fw.write("Student id: " + id + "\nName: " + name + "\nGrade: " + grade);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}

public class studentFileHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to add student?(yes/no): ");
        String choice = in.next();
        int id = 1;
        if (choice.equals("yes")){

            System.out.println("Enter student name: ");
            String name = in.next();
            System.out.println("Enter grade: ");
            char grade = in.next().charAt(0);
           
            Student student =  new Student(id, name, grade);
            student.studentFileWrite();
            id++;
        }
    }
}
