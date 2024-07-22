
/**
 * Write a description of class BankCard here.
 *
 * @author (22067575 Esa Shakya)
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes
   private int cardId;
   private String clientName;
   private String issuerBank;
   private String bankAccount;
   private double balanceAmount;
   //constructor
   public BankCard(int cardId , String issuerBank , String bankAccount , double balanceAmount){
       this.cardId = cardId;
       this.clientName = "";
       this.issuerBank = issuerBank;
       this.bankAccount = bankAccount;
       this.balanceAmount = balanceAmount;
       
   }
   //accessor methods
   public int getCardId(){
       return this.cardId;
   }
   public String getClientName(){
       return this.clientName;
   }
   public String getIssuerBank(){
       return this.issuerBank;
   }
   public String getBankAccount(){
       return this.bankAccount;
   }
   public double getBalanceAmount(){
       return this.balanceAmount;
   }
   //new methods
   public void setBalanceAmount(double balanceAmount){
       this.balanceAmount = balanceAmount;
   }
   public void setClientName(String clientName){
       this.clientName = clientName;
   }
   //display method
   public void display(){
       if (clientName==""){
           System.out.println("Client name is not assigned");
       }
       else{
           System.out.println("Card Id = "+cardId);
           System.out.println("Client name = "+clientName);
           System.out.println("Issuer Bank = "+issuerBank);
           System.out.println("Bank Account = "+bankAccount);
           System.out.println("Balance Amount = "+balanceAmount);
      
       }
   }
   
   
}
