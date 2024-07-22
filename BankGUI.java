
/**
 * Write a description of class BankGUI here.
 *
 * @author (22067575 Esa Shakya)
 * @version (1.0.0)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;
public class BankGUI implements ActionListener
{
    //components
    private  JFrame frame;
    private ArrayList<BankCard> cards = new ArrayList<BankCard>();
    private JLabel guiLabel;
    //declaring components for debit card
    private JLabel cardidLabel,balanceAmountLabel,clientNameLabel,withdrawalAmountLabel,bankAccountLabel,issuerBankLabel,pinNumberLabel,dateOfWithdrawalLabel;
    private JTextField balanceAmountTxt,cardIdTxt,clientNameTxt,withdrawalAmountTxt,bankAccountTxt,issuerBankTxt,pinNumberTxt,dateOfWithdrawalTxt;
    private JButton debitAddButton,debitWithdrawButton,displayDebitButton;
    //declaring components for credit card
    private JLabel cvcNumberLabel,interestRateLabel,expirationRateLabel,newCreditLimitLabel,newGracePeriodLabel ;
    private JTextField cvcNumberTxt,interestRateTxt,expirationRateTxt,newCreditLimitTxt,newGracePeriodTxt;
    private JButton creditAddButton,creditSetButton,creditCancelButton;
    
    private JButton displayButton,clearButton;
    JComboBox dateComboBox= new JComboBox();
    JComboBox yearComboBox= new JComboBox();
    JComboBox monthComboBox= new JComboBox();
    JComboBox dateComboBox2= new JComboBox();
    JComboBox monthComboBox2= new JComboBox();
    JComboBox yearComboBox2= new JComboBox();
    public BankGUI(){
        //create an array list
        
        
        //create the code to write for GUI
        JFrame frame = new JFrame("BankGUI");
        //date jcombobox
        
        for (int num = 1; num <= 31; num++){
            dateComboBox.addItem(num);
        }
        //month jcombobox
        
        monthComboBox.addItem("January");
        monthComboBox.addItem("February");
        monthComboBox.addItem("March");
        monthComboBox.addItem("April");
        monthComboBox.addItem("May");
        monthComboBox.addItem("June");
        monthComboBox.addItem("July");
        monthComboBox.addItem("August");
        monthComboBox.addItem("September");
        monthComboBox.addItem("October");
        monthComboBox.addItem("November");
        monthComboBox.addItem("December");
        
        
        //year jcombobox
        int presentYear = Calendar.getInstance().get(Calendar.YEAR);
        for(int year = 1990; year <= presentYear;year++){
            yearComboBox.addItem(year);
        }
        JLabel guiLabel = new JLabel("GUI");
        
        //creating debit card components
        JLabel balanceAmountLabel = new JLabel ("Balance Amount:");
        JLabel cardIdLabel = new JLabel("card Id:");
        JLabel clientNameLabel = new JLabel("Client Name:");
        JLabel withdrawalAmountLabel = new JLabel("Withdrawal Amount:");
        JLabel bankAccountLabel = new JLabel("Bank Account:");
        JLabel issuerBankLabel = new JLabel("Issuer Bank:");
        JLabel pinNumberLabel = new JLabel("Pin Number:");
        JLabel dateOfWithdrawalLabel = new JLabel("Date Of Withdrawal:");
        balanceAmountTxt = new JTextField();
        cardIdTxt = new JTextField();
        clientNameTxt = new JTextField();
        withdrawalAmountTxt = new JTextField();
        bankAccountTxt =  new JTextField();
        issuerBankTxt = new JTextField();
        pinNumberTxt = new JTextField();
        
        
        debitAddButton = new JButton("Add");//adding the button color pink
        debitAddButton.setBackground(Color.PINK);
        debitWithdrawButton = new JButton ("Withdraw");
        debitWithdrawButton.setBackground(Color.PINK);
        displayDebitButton = new JButton ("Display");
        displayDebitButton.setBackground(Color.PINK);
        
        //set the bounds of the debitcard components
        guiLabel.setBounds(427,15,46,36);
        balanceAmountLabel.setBounds(32,106,110,14);
        cardIdLabel.setBounds(32,195,51,14);
        clientNameLabel.setBounds(32,284,79,14);
        withdrawalAmountLabel.setBounds(32,373,125,14);
        bankAccountLabel.setBounds(370,101,93,14);
        issuerBankLabel.setBounds(370,191,80,14);
        pinNumberLabel.setBounds(370,281,78,14);
        dateOfWithdrawalLabel.setBounds(370,371,125,14);
        balanceAmountTxt.setBounds(173,97,127,32);
        cardIdTxt.setBounds(173,186,127,32);
        clientNameTxt.setBounds(173,275,127,32);
        withdrawalAmountTxt.setBounds(173,364,127,32);
        bankAccountTxt.setBounds(509,92,127,32);
        issuerBankTxt.setBounds(509,191,127,32);
        pinNumberTxt.setBounds(509,281,127,32);
        debitAddButton.setBounds(695,191,120,32);
        debitWithdrawButton.setBounds(697,281,120,32);
        dateComboBox.setBounds(631, 371, 53, 32);
        monthComboBox.setBounds(572, 371, 59, 32);
        yearComboBox.setBounds(509, 371, 63, 32);
        displayDebitButton.setBounds(695, 101, 120, 32);
    
        
        
        
        //ActionListener
        displayDebitButton.addActionListener(this);
        debitAddButton.addActionListener(this);
        debitWithdrawButton.addActionListener(this);
        //add to the frame
        frame.add(guiLabel);
        frame.add(balanceAmountLabel);
        frame.add(cardIdLabel);
        frame.add(clientNameLabel);
        frame.add(withdrawalAmountLabel);
        frame.add(bankAccountLabel);
        frame.add(issuerBankLabel);
        frame.add(pinNumberLabel);
        frame.add(dateOfWithdrawalLabel);
        frame.add(balanceAmountTxt);
        frame.add(cardIdTxt);
        frame.add(clientNameTxt);
        frame.add(withdrawalAmountTxt);
        frame.add(bankAccountTxt);
        frame.add(issuerBankTxt);
        frame.add(pinNumberTxt);
        frame.add(debitAddButton);
        frame.add(debitWithdrawButton);
        frame.add(dateComboBox);
        frame.add(monthComboBox);
        frame.add(yearComboBox);
        frame.add(displayDebitButton);

        
        
        
        
        
        
        
        
        
        
        
        //creating credit card components
        //jcombobox of creditCard
        for (int num = 1; num <= 31; num++){
            dateComboBox2.addItem(num);
        }
        //jcombobox of creditCard
        monthComboBox2.addItem("January");
        monthComboBox2.addItem("February");
        monthComboBox2.addItem("March");
        monthComboBox2.addItem("April");
        monthComboBox2.addItem("May");
        monthComboBox2.addItem("June");
        monthComboBox2.addItem("July");
        monthComboBox2.addItem("August");
        monthComboBox2.addItem("September");
        monthComboBox2.addItem("October");
        monthComboBox2.addItem("November");
        monthComboBox2.addItem("December");
        //jcombobox of creditCard
        int presentYear2 = Calendar.getInstance().get(Calendar.YEAR);
        for(int year = 1990; year <= presentYear2;year++){
            yearComboBox2.addItem(year);
        }
        //jlabel of creditCard
        JLabel cvcNumberLabel = new JLabel("CVC Number:");
        JLabel interestRateLabel = new JLabel("Interest Rate:");
        JLabel expirationRateLabel = new JLabel("Expiration Rate:");
        JLabel newCreditLimitLabel =new JLabel("New credit limit:");
        JLabel newGracePeriodLabel =new JLabel("New Grace period:");
        //jtextfield of creditCard
        cvcNumberTxt = new JTextField();
        interestRateTxt = new JTextField();
        newCreditLimitTxt = new JTextField();
        newGracePeriodTxt = new JTextField();
        creditAddButton = new JButton("Add");
        creditAddButton.setBackground(Color.PINK);
        creditSetButton = new JButton("Set");
        creditSetButton.setBackground(Color.PINK);
        creditCancelButton = new JButton("Cancel");
        creditCancelButton.setBackground(Color.PINK);//set the button color to pink
        displayButton = new JButton("Display");
        displayButton.setBackground(Color.PINK);
        clearButton = new JButton ("Clear");
        clearButton.setBackground(Color.PINK);
        //set bounds of creditCard
        cvcNumberLabel.setBounds(32,473,85,14);
        interestRateLabel.setBounds(32,551,84,14);
        newCreditLimitLabel.setBounds(370,468,99,14);
        newGracePeriodLabel.setBounds(370,549,114,14);
        expirationRateLabel.setBounds(32, 629, 100, 14);
        cvcNumberTxt.setBounds(173,470,127,32);
        interestRateTxt.setBounds(173,549,127,32);
        newCreditLimitTxt.setBounds(509,459,127,32);
        newGracePeriodTxt.setBounds(509,540,127,32);
        creditAddButton.setBounds(692,459,120,32);
        creditSetButton.setBounds(692,535,120,32);
        creditCancelButton.setBounds(692,611,120,32);
        dateComboBox2.setBounds(283, 628, 63, 32);
        monthComboBox2.setBounds(220, 628, 63, 32);
        yearComboBox2.setBounds(157, 628, 63, 32);
        
        
        //actionlistener
        creditAddButton.addActionListener(this);
        creditSetButton.addActionListener(this);
        creditCancelButton.addActionListener(this);
        
        
        //set bounds        
        displayButton.setBounds(364,630,120,32);
        clearButton.setBounds(516,630,120,32);
        //actionlistener
        
        displayButton.addActionListener(this);
        clearButton.addActionListener(this);
         //add to the frame
        frame.add(cvcNumberLabel);
        frame.add(interestRateLabel);
        frame.add(expirationRateLabel);
        frame.add(newCreditLimitLabel);
        frame.add(newGracePeriodLabel);
        frame.add(cvcNumberTxt);
        frame.add(interestRateTxt);
        frame.add(newCreditLimitTxt);
        frame.add(newGracePeriodTxt);
        frame.add(creditAddButton);
        frame.add(creditSetButton);
        frame.add(creditCancelButton);
        frame.add(displayButton);
        frame.add(dateComboBox2);
        frame.add(monthComboBox2);
        frame.add(yearComboBox2);
        frame.add(clearButton);

        
        
        
        frame.setSize(900,730);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent e){
      //add debit card 
      if (e.getSource()==debitAddButton){
          try{
              //check if the parameters are valid
              String cardId = cardIdTxt.getText();
              int updatedCardId = Integer.parseInt(cardId);
              String issuerBank = issuerBankTxt.getText();
              String bankAccount = bankAccountTxt.getText();
              String balanceAmount = balanceAmountTxt.getText();
              double updatedBalanceAmount = Double.parseDouble(balanceAmount);
              String clientName = clientNameTxt.getText();
              String pinNumber = pinNumberTxt.getText();
              int updatedpinNumber = Integer.parseInt(pinNumber);
              String debitDate = dateComboBox.getSelectedItem().toString();
              String debitMonth = monthComboBox.getSelectedItem().toString();
              String debitYear = yearComboBox.getSelectedItem().toString();
              String dateOfWithdrawal = debitDate + "/" + debitMonth +"/"+debitYear;
              boolean same = false;
              for(BankCard debitCards: cards){
                  
                      if (debitCards instanceof DebitCard){
                          DebitCard debitCard = (DebitCard) debitCards;//downcast
                          
                          if(updatedCardId == debitCard.getCardId()){
                              same = true;
                          }
                      
                  }
                }
              DebitCard recordsDebitCard = new DebitCard(updatedCardId,issuerBank,bankAccount,updatedBalanceAmount,clientName,updatedpinNumber);

              
              if (same == false){
                  cards.add(recordsDebitCard);
                  JOptionPane.showMessageDialog(null, "Successfully completion of adding Debit card process", "Success", JOptionPane.INFORMATION_MESSAGE);
              }
              else{
                    JOptionPane.showMessageDialog(null, "Please try again as it has already been added", "Alert", JOptionPane.ERROR_MESSAGE);
                     }
              
              
      }
          catch(NumberFormatException n){
              JOptionPane.showMessageDialog(null, "Invalid input", "Alert", JOptionPane.ERROR_MESSAGE);
          }
        
                
    }
    if (e.getSource()==debitWithdrawButton){
        try{
            //check if the parameters are valid
            String cardId = cardIdTxt.getText();
            int updatedCardId = Integer.parseInt(cardId);
            String withdrawalAmount = withdrawalAmountTxt.getText();
            int updatedWithdrawalAmount  = Integer.parseInt(withdrawalAmount);
            String debitDate = dateComboBox.getSelectedItem().toString();
            String debitMonth = monthComboBox.getSelectedItem().toString();
            String debitYear = yearComboBox.getSelectedItem().toString();
            String dateOfWithdrawal = debitDate + "/" + debitMonth +"/"+debitYear;
            String pinNumber = pinNumberTxt.getText();
            int updatedPinNumber = Integer.parseInt(pinNumber);
            String withdrawalPopup = "Card Id: " + updatedCardId +"\n"+  "withdrawalAmount: " + updatedWithdrawalAmount + "\n"+"Date of withdrawal: "+ dateOfWithdrawal +"\n"+"Pin Number : " +updatedPinNumber;
            for (BankCard debitCards: cards){
                if(debitCards instanceof DebitCard){
                    DebitCard debitCard = (DebitCard) debitCards;//downcast
                    if (debitCard.getCardId() == updatedCardId){
                        debitCard.withdraw(updatedWithdrawalAmount,dateOfWithdrawal,updatedPinNumber);
                        JOptionPane.showMessageDialog(frame,withdrawalPopup, "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"invalid input", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                    
                }
                
            }
            catch (NumberFormatException o){
                JOptionPane.showMessageDialog(null,"invalid input !!", "Alert", JOptionPane.ERROR_MESSAGE);
            }
                
            
            
            
        
        
        
    }
    if (e.getSource()==creditAddButton){
        try{
            //check if the parameters are valid
            String cardId = cardIdTxt.getText();
            int updatedCardId = Integer.parseInt(cardId);
            String issuerBank = issuerBankTxt.getText();
            String bankAccount = bankAccountTxt.getText();
            String balanceAmount = balanceAmountTxt.getText();
            double updatedBalanceAmount = Double.parseDouble(balanceAmount);
            String clientName = clientNameTxt.getText();
            String cvcNumber = cvcNumberTxt.getText();
            int updatedCvcNumber =  Integer.parseInt(cvcNumber);
            String interestRate = interestRateTxt.getText();
            double updatedInterestRate = Double.parseDouble(interestRate);
            String date = dateComboBox2.getSelectedItem().toString();
            String month = monthComboBox2.getSelectedItem().toString();
            String year = yearComboBox2.getSelectedItem().toString();
            String expirationDate = year + "/" +month +"/" + date;
            
        
            
            CreditCard recordsCreditCard = new CreditCard(updatedCardId,issuerBank,bankAccount,updatedBalanceAmount,clientName,updatedCvcNumber,updatedInterestRate,expirationDate);
            if (updatedCardId<0 || updatedBalanceAmount<0 || updatedInterestRate<0){
                      JOptionPane.showMessageDialog(frame, "Unsuccesful. Please try again with correct datas", "Alert", JOptionPane.ERROR_MESSAGE);
                      
                  }
                  else{
                      cards.add(recordsCreditCard);
                      JOptionPane.showMessageDialog(null, "Successfully completion of adding Credit card process", "Success", JOptionPane.INFORMATION_MESSAGE);
                         
                  }
        
                }
                catch(NumberFormatException f){
                      JOptionPane.showMessageDialog(null, "Invalid input", "Alert", JOptionPane.ERROR_MESSAGE);
          }
        
        
    }
    if (e.getSource()==creditSetButton){
        try{
            //check if the parameters are valid
            String cardId = cardIdTxt.getText();
            int updatedCardId = Integer.parseInt(cardId);
            String creditLimit = newCreditLimitTxt.getText();
            double updatedCreditLimit = Double.parseDouble(creditLimit);
            String gracePeriod = newGracePeriodTxt.getText();
            int updatedGracePeriod = Integer.parseInt(gracePeriod);
            for (BankCard creditCards: cards){
                if(creditCards instanceof CreditCard){
                    if(updatedCardId == creditCards.getCardId() ){
                        CreditCard creditCard = (CreditCard) creditCards;
                        creditCard.setCreditLimit(updatedCreditLimit, updatedGracePeriod);
                        String msg = "Credit limit and grace period respectfully "+ updatedCreditLimit + "," + updatedGracePeriod;
                        JOptionPane.showMessageDialog(frame, msg , "Information", JOptionPane.INFORMATION_MESSAGE);
                        
                                 
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid input", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
            }
        }
        }
        catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Invalid input", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    if (e.getSource() == displayDebitButton){
        if (cards.isEmpty()){//if the arraylist is empty
            JOptionPane.showMessageDialog(frame, "Please fill the data in order to display", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(BankCard debitCards: cards){
                if (debitCards instanceof DebitCard){
                    DebitCard debitCard = (DebitCard)debitCards;//downcast
                    JOptionPane.showMessageDialog(frame, "Display process successful","Success" , JOptionPane.INFORMATION_MESSAGE);
                    debitCard.display();
                    
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, "Invalid","Alert" , JOptionPane.ERROR_MESSAGE);
                
            }
        }
        
        }
        
    }
    if (e.getSource() == displayButton){
        if (cards.isEmpty()){//if the arraylist is empty
            JOptionPane.showMessageDialog(frame, "Please fill the data in order to display", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(BankCard creditCards: cards){
                if (creditCards instanceof CreditCard){
                    CreditCard creditCard = (CreditCard)creditCards;//downcast
                    creditCard.display();
                    JOptionPane.showMessageDialog(frame, "Display process successful","Success" , JOptionPane.INFORMATION_MESSAGE);
                    
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, "Invalid","Alert" , JOptionPane.ERROR_MESSAGE);
                
            }
        }
        
        }
    }
    if (e.getSource() == creditCancelButton){
        try{
            //check if the parameter is valid
        String cardId = cardIdTxt.getText();
        int updatedCardId = Integer.parseInt(cardId);
        for(BankCard creditCards: cards){
            if (creditCards instanceof CreditCard){
                CreditCard creditCard = (CreditCard) creditCards;//downcast
                if (updatedCardId == creditCard.getCardId() ){
                    JOptionPane.showMessageDialog(frame, "Cancel process successful","Success" , JOptionPane.INFORMATION_MESSAGE);
                    creditCard.cancelCreditCard();
                }
                 else{
                    JOptionPane.showMessageDialog(null, "Please try again as you have entered wrong datas","Alert" , JOptionPane.ERROR_MESSAGE);
                }
               
            }
        }
    }
        catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Invalid input", "Alert", JOptionPane.ERROR_MESSAGE);
        }
            
    }
    
    
    if (e.getSource() == clearButton){
        //set all the text to empty string
        balanceAmountTxt.setText("");
        cardIdTxt.setText("");
        clientNameTxt.setText("");
        withdrawalAmountTxt.setText("");
        bankAccountTxt.setText("");
        issuerBankTxt.setText("");
        pinNumberTxt.setText("");
        cvcNumberTxt.setText("");
        interestRateTxt.setText("");
        newCreditLimitTxt.setText("");
        newGracePeriodTxt.setText("");
        
    }
        
    
    
        
    
    
    
                
    }
            
    public static void main(String[] args){
            //object of bankgui
            BankGUI bankGui = new BankGUI();
          }
    
}
