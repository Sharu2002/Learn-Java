package enums;

enum Name{
    Earth(10,5),Mars(20,10);
    private float mass;
    private float radius;
    Name(int mass,int radius){
        this.mass = mass;
        this.radius = radius;
    }
    public void surfaceGravity(){
        System.out.println(mass/((radius*radius*100)));
    }
}


public class enumSample {
    public static void main(String args[]){
        Name.Earth.surfaceGravity();
    }
}
