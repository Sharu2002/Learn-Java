class Dummy extends Thread{

    private String name;

    public Dummy(String name){
        this.name = name;
    }
    synchronized public void run(){
        for(int i  = 0; i< 10;i++){
            System.out.println("Printing from " + name + " : i : " + i);
        }    }
}




public class ThreadSample {
    public static void main(String[] args) {

        Dummy d1 = new Dummy("Saravana");
        d1.start();


        Dummy d2 = new Dummy("Sharu");
        d2.start();
        
    }
}

/*
 * New
 * Runnable
 * Running
 * Waiting
 * Dead
 */


