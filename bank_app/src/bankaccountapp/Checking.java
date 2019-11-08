package bankaccountapp;

public class Checking extends Account
{
    //List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to initialize checking account properties, suele ser lo primero a definir
    public Checking(String name, String SSN, double initDeposit)
    {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        /*System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        System.out.print ("NEW CHECKING ACCOUNT: ");  //CONSTRUCTOR DE LA CLASE HIJA
        System.out.println("NAME: " + name);
         */
        setDebitCard();
    }

    @Override
    public void setRate()
    {
        rate = getBaseRate() * .15;
        //System.out.println("Implement rate for Checking");
    }

    //List any methods specific to the checking account
    private void setDebitCard()
    {
        debitCardNumber = (int)(Math.random()* Math.pow(10,12));
        debitCardPin = (int)(Math.random()* Math.pow(10,4));
        /*System.out.println("CARD: " + this.debitCardNumber);
        System.out.println("PIN: " + this.debitCardPin);
         */

    }

    public void showInfo()
    {
        super.showInfo();
        System.out.println("Your Checking Account Features" +
                            "\n Debit Card Number " + debitCardNumber +
                            "\n Debit Cad Pin " + debitCardPin);
    }
}
