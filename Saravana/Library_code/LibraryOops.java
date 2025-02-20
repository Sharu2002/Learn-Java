package Library_code;
import java.util.List;
import java.util.ArrayList;

class Book{
    private int bookId;
    private String bookName;
    private String author;
    private int year;
    public Book(int bookId,String bookName,String author,int year){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    public int getBookId(){
        return bookId;
    }
    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }

    public void setBookId(int bookId){
        this.bookId = bookId;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }
}

class Library{

    private List<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<Book>();
    }
    
    public void displayAvailableBooks(){
        for(int i=0;i<=bookList.size()-1;i++){
            Book book = bookList.get(i);
            System.out.println(book.getBookId());
            System.out.println(book.getBookName());
            System.out.println(book.getAuthor());
            System.out.println(book.getYear());
        }

    }
    public void searchBook(String bookName){
        for(int i=0;i<=bookList.size()-1;i++){
            if(bookList.get(i).getBookName() == bookName){
                System.out.println("Book Available");
            }

        }
    }
    public void removeBook(String bookName){
        for(int i=0;i<=bookList.size()-1;i++){
            if(bookList.get(i).getBookName() == bookName){
                bookList.remove(bookList.get(i));
                System.out.println("Book removed");
            }

        }
    }
    public void addBook(Book book){
        bookList.add(book);
    }
}

public class LibraryOops{
    public static void main(String args[]) {
        
        Book book = new Book(1,"Quiet","Susan Cain",2020);    
        Library library = new Library();
        library.addBook(book);
        book = new Book(2,"Sharu","Saravana",2024); 
        library.addBook(book);
        library.displayAvailableBooks();
        library.removeBook("Quiet");
        library.displayAvailableBooks();
    }
}
