interface sayName{
    public void sayName();
}


enum Name implements sayName{

    SHARU("Sharu"), ANU("Arun"), NANDHANA("Naaru");

    private String value;

    Name(String value){
        this.value = value;
    }

    public void sayName(){
        System.out.println("Name : " + value);
    }
    
}

public class InterfaceSample{
    public static void main(String[] args) {

        Name.SHARU.sayName();
        Name.ANU.sayName();
        Name.NANDHANA.sayName();

    }
}
