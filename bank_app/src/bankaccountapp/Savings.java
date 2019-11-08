package bankaccountapp;

public class Savings extends Account
{
    //List properties specific to the Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize settings for the Savings properties
    public Savings(String name,String SSN, double initDeposit)
    {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
        /*System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        System.out.println("NEW SAVINGS ACCOUNT: ");
         */
    }

    @Override
    public void setRate()
    {
        //System.out.println("Implement rate for savings");
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox()
    {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
        //System.out.println(safetyDepositBoxID);

    }


    //List any methods specific to savings account
    public void showInfo()
    {
        //System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                "Your savings account Features" +
                        "\n Safety Deposit Box ID " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: "+ safetyDepositBoxKey
        );
    }



}
