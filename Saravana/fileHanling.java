// Write a class FileReaderWriter that performs basic file operations.
// The class should include:
// Method to write text to a file.
// Method to read the contents of a file.
// Method to append text to an existing file.
// Demonstrate the usage of the class in the main() method.

import java.io.FileReader;
import java.io.FileWriter;

class FileReaderWriter{
    public void writeText(String s){
        try{
            FileWriter fw = new FileWriter("Sample.txt");
            fw.write(s);
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }             
    }

    public void readText(){
        try {
            FileReader fr = new FileReader("Sample.txt");
            int inputchar;
            while((inputchar = fr.read()) != -1){
                System.out.print((char)inputchar);
            
            }
            System.out.println();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void append(String s){
        try {
            FileReader fr = new FileReader("Sample.txt");
            int inputchar;
            String oldText = "";
            while((inputchar = fr.read()) != -1){

                oldText = oldText + (char)inputchar;
                
            }
            fr.close();
            oldText = oldText + s;
            writeText(oldText);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class fileHanling {

    public static void main(String[] args) {
        FileReaderWriter frw = new FileReaderWriter();
        frw.writeText("Sharu Lakshmi");
        frw.readText();
        frw.append("Saravana Kumar");
        frw.readText();
    }
    
}
