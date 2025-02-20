// Payment Processing System
// Create an abstract class Payment with:
// An abstract method processPayment(double amount).
// Implement two subclasses:
// CreditCardPayment (requires cardNumber)
// PayPalPayment (requires emailId)
// Demonstrate abstraction by calling processPayment() from the subclass objects.

package Payment_code;
abstract class Payment{
    public abstract void processPayment(double amount);
}
class CreditCardPayment extends Payment{
    public void processPayment(double amount){
        System.out.println("Payment of credit card processed");
    }
}
class PayPalPayment extends Payment{
    private String mail;
    public PayPalPayment(String mail){
        this.mail = mail;
    }
    public String getMail(){
        return mail;
    }
    
    public void processPayment(double amount){
        System.out.println(getMail()+"Paypal payment processed");
    }

}
public class PaymentOops {
    public static void main(String args[]){
        CreditCardPayment creditCrad = new CreditCardPayment();
        PayPalPayment payPal = new PayPalPayment("123@gmail.com");
        creditCrad.processPayment(10);
        payPal.processPayment(20);
    }
}
