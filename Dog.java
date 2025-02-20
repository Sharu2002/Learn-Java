class DogClass{

    //Attributes
    String name ;
    String breed;
    int age;
    float height;

    //Parameterised Constructor
    public DogClass(String name, String breed, int age, float height){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.height = height;
    }

    //Default Constructor or Empty Constructor
    public DogClass(){
        this.name = null;
        this.breed = null;
        this.age = 0;
        this.height = 0.0f;
    }

}

public class Dog{
    public static void main(String[] args){
        
        DogClass dog1 = new DogClass("Tommy", "Labrador", 3, 0.7f);

        System.out.println("Dog 1: ");
        System.out.println("Name: " + dog1.name);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Age: " + dog1.age);
        System.out.println("Height: " + dog1.height);


        DogClass dog2 = new DogClass();

        dog2.name = "Mr.Kumar";
        dog2.breed = "Saravana";
        dog2.age = 21;
        dog2.height = 5.7f;

        System.out.println("\nDog 2: ");
        System.out.println("Name: " + dog2.name);
        System.out.println("Breed: " + dog2.breed);
        System.out.println("Age: " + dog2.age);
        System.out.println("Height: " + dog2.height);
        
    }
}