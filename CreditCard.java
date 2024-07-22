
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067575 Esa Shakya)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //attributes
   private int cvcNumber;
   private double creditLimit;
   private double interestRate;
   private String expirationDate;
   private int gracePeriod;
   private boolean isGranted;
   //constructor
   public CreditCard(int cardId , String issuerBank , String bankAccount , double balanceAmount,String clientName ,int cvcNumber ,double interestRate,String expirationDate){
       super(cardId , issuerBank ,  bankAccount , balanceAmount);
       super.setClientName(clientName);
       this.cvcNumber = cvcNumber;
       this.interestRate = interestRate;
       this.expirationDate = expirationDate;
       this.isGranted = false;
        
   }
   //accessor method
   public int getCvcNumber(){
       return this.cvcNumber;
   }
   public double getCreditLimit(){
       return this.creditLimit;
   }
   public double getInterestRate(){
       return this.interestRate;
   }
   public String getExpirationDate(){
       return this.expirationDate;
   }
   public int getGracePeriod(){
       return this.gracePeriod;
   }
   public boolean getIsGranted(){
       return this.isGranted;
   }
   //method
   public void setCreditLimit(double creditLimit , int gracePeriod){
       if (creditLimit <= (2.5*super. getBalanceAmount())){
           this.creditLimit = creditLimit;
           this.gracePeriod = gracePeriod;
           this.isGranted = true;
           
       }
       else{
           System.out.println("The credit can't be issued");
       }
   }
   //method named cancelCreditCard
   public void cancelCreditCard(){
       this.cvcNumber = 0;
       this.creditLimit = 0;
       this.gracePeriod = 0;
       this.isGranted = false;
       System.out.println("The credit card has been cancelled !!");
   }
   //display method
   public void display(){
       super.display();
       if (isGranted==true)
       {
           System.out.println("CVC Number:" + cvcNumber);
           System.out.println("Credit Limit:" + creditLimit);
           System.out.println("Interest Rate:" + interestRate);
           System.out.println("Expiration Date:" + expirationDate);
           System.out.println("Grace Period:" + gracePeriod);
        }
        else{
            System.out.println("CVC Number:" + cvcNumber);
           System.out.println("Interest Rate:" + interestRate);
           System.out.println("Expiration Date:" + expirationDate);
        }
    
       
   }
}
