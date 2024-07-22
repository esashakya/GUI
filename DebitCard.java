
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067575 Esa Shakya)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
   private int pinNumber;
   private int withdrawalAmount;
   private String dateOfWithdrawal;
   private boolean hasWithdrawn;
   
   
    public DebitCard(int cardId , String issuerBank , String bankAccount , double balanceAmount , String clientName , int pinNumber){
        //make a call to the superclass constructor
        super(cardId , issuerBank ,  bankAccount , balanceAmount);
        
        //setter method call
        super.setClientName(clientName);
        //set PIN Number
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    //accessor methods
    public int getPinNumber()
    {
        return this.pinNumber;
    }
    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    //mutator methods
    public void setWithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
    public void withdraw(int withdrawalAmount , String dateOfWithdrawal, int pinNumber){
        if (this.pinNumber == pinNumber){
            if (withdrawalAmount <= super.getBalanceAmount())
            {
                double newBalanceAmount = (super.getBalanceAmount() - withdrawalAmount);
                super.setBalanceAmount(newBalanceAmount);
                this.hasWithdrawn = true;
                        
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
            }
            else{
                 System.out.println("There is no sufficient balance");
             }
        }
        else{
            System.out.println("Wrong pin number");
        }
    }
    //display method
    public void display(){
        super.display();
        if(this.hasWithdrawn==true)
        {
            System.out.println("Card Id="+ super.getCardId());
            System.out.println("Client Name="+ super.getClientName());
            System.out.println("Issuer Bank="+ super.getIssuerBank());
            System.out.println("Bank Account="+ super.getBankAccount());
            System.out.println("Balance Amount="+ super.getBalanceAmount());
            System.out.println("pin = "+this.pinNumber);
            System.out.println("withdrawal amount = "+this.withdrawalAmount);
            System.out.println("date of withdrawal = "+this.dateOfWithdrawal);
            
            
        }
        else{
            System.out.println("Balance amount="+super.getBalanceAmount());
            System.out.println("Transaction has not been carried out");
        }
        
        
    }
}
