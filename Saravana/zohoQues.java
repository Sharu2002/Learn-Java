import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

class Taxi{

    private int taxiId;
    private int totalEarnings;
    private int freeAt;
    private char point;

    public Taxi(int taxiId,int totalEarnings,int freeAt,char point){

        this.taxiId = taxiId;
        this.totalEarnings = totalEarnings;
        this.freeAt = freeAt;
        this.point = point;

    }

    public int getTaxiId(){
        return taxiId;
    }

    public int getTotalEarnings(){
        return totalEarnings;
    }

    public int getFreeAt(){
        return freeAt;
    }

    public char getPoint(){
        return point;
    }

    public void setTotalEarnings(int amount){
        totalEarnings += amount;
    }

    public void setFreeAt(int hrs){

        freeAt += hrs;
    }

    public void setPoint(char point){
        this.point = point;
    }
}

class TaxiList{

        private ArrayList<Taxi> taxiList = new ArrayList<>();

        public void addTaxi(Taxi taxi){
            taxiList.add(taxi);
        }

        public void displayAllTaxi(){

            System.out.println("Taxi No" + "\t" + "Total Earnings" + "\t" + "Available time" + "\t" + "Point");

            for(Taxi i : taxiList){

                System.out.println(i.getTaxiId() + "\t" + i.getTotalEarnings() + "\t" + i.getFreeAt() + "\t" + i.getPoint());
            }
        }

        public void bookTaxi(char pickupPoint, char dropPoint, int pickupTime, int totTaxi){

            int taxiNos = 0;
            ArrayList<Taxi> taxis = new ArrayList<>();
            
            for(int i = 0 ;i<=totTaxi ;i++){
            
                if(taxiNos == 0){
            
                    for(Taxi j : taxiList){
            
                        if(((j.getPoint() + i  == pickupPoint) || (j.getPoint() - i  == pickupPoint)) && j.getFreeAt() <= pickupTime){
            
                            taxiNos++;
                            taxis.add(j);
    
                        }
                    }
                }
                
            }

            Taxi taxi ;
            if(taxis.size() == 1){
                taxi = taxis.get(0);
            }
            else if (taxis.size() == 0){

                System.out.println("Taxi not available");
                return;
            }
            else{
                
                Taxi lowestEarningTaxi = taxiList.get(0); 

                for (Taxi i : taxis) {

                    if (i.getTotalEarnings() < lowestEarningTaxi.getTotalEarnings()) {
                        lowestEarningTaxi = i;
                    }

                
                }
                taxi = lowestEarningTaxi;
            }

            System.out.println("Taxi can be allotted");
            System.out.println(taxi.getTaxiId() + " is allotted");
                        
            int pointNos = Math.abs((int)pickupPoint - (int)dropPoint);
            int kms = pointNos * 15;
            int amount = 100 + ((kms - 5) * 10);
                            
                            
            taxi.setTotalEarnings(amount);
            taxi.setPoint(dropPoint);
            taxi.setFreeAt(pointNos);
           
            
        }
}

public class zohoQues {
    public static void main(String[] args) {
        
        System.out.print("Enter total no of taxis: ");
        Scanner in = new Scanner(System.in);
        int totTaxi = in.nextInt();

        TaxiList taxiList = new TaxiList();
        
        for(int i = 1; i<=totTaxi; i++){
            
            int taxiId = i;
            Taxi taxi = new Taxi(taxiId, 0, 0,'A');
            taxiList.addTaxi(taxi);
        }

        
        while(true){

            System.out.println("Enter your choice \n1.Book Taxi\n2.Display All Taxi details\n3.Close the program");
            int choice = in.nextInt();

            if(choice == 1){

                int custId = 1;
                System.out.println("Customer Id: " + custId);
                System.out.println("Pickup point: ");
                char pickupPoint = in.next().charAt(0);
                System.out.println("Dropping point: ");
                char dropPoint = in.next().charAt(0);
                System.out.println("Pickup time: ");
                int pickupTime = in.nextInt();
                custId++;
                taxiList.bookTaxi(pickupPoint, dropPoint, pickupTime,totTaxi);
                in.close();
            }

            else if(choice == 2){
                taxiList.displayAllTaxi();
            }

            else if(choice == 3){
                return;
            }

            else{
                System.out.println("Invalid choice. Try again.");
            }
        }        
    }
}
