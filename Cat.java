class CatClass{

    //Attributes
    private String name ;
    private String breed;
    private int age;
    private float height;

    //Parameterised Constructor
    public CatClass(String name, String breed, int age, float height){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.height = height;
    }

    //Default Constructor or Empty Constructor

    public CatClass(){
        this.name = null;
        this.breed = null;
        this.age = 0;
        this.height = 0.0f;
    }
   
    //getter
    public String getName(){
        return name;
    }
    
    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    public float getHeight(){
        return height;
    }
    
    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHeight(float height){
        this.height = height;
    }

}

public class Cat{
    public static void main(String[] args){
        
        CatClass cat1 = new CatClass("Tommy", "Labrador", 3, 0.7f);

        System.out.println("Cat 1: ");
        System.out.println("Name: " + cat1.getName());
        System.out.println("Breed: " + cat1.getBreed());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Height: " + cat1.getHeight());


        CatClass cat2 = new CatClass();

        cat2.setName("Mr.Kumar"); ;
        cat2.setBreed("Saravana");
        cat2.setAge(21);
        cat2.setHeight(5.7f);

        System.out.println("\nCat 2: ");
        System.out.println("Name: " + cat2.getName());
        System.out.println("Breed: " + cat2.getBreed());
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Height: " + cat2.getHeight());
        
    }
}