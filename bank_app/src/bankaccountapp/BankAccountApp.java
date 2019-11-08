package bankaccountapp;

import javax.lang.model.util.ElementScanner6;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp
{
    public static void main(String[] args) throws FileNotFoundException
    {
        List<Account> accounts = new LinkedList<Account>();

        /*Checking chkacc1 = new Checking("Tom Wilson", "321456789",1500);
        Savings savacc1 = new Savings("Rich Love", "45667897", 2500);
        //savacc1.compound();  //compuesto, interés compuesto
        savacc1.showInfo();
        System.out.println("***************");
        chkacc1.showInfo();
        /*savacc1.deposit(5000);
        savacc1.withdraw(200);
        savacc1.transfer("Brokerage", 3000);
         */

        //Read a CSV File then create new accounts based on that data
        String file = "C:\\Users\\FernandoPueb_5dvr3\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders)
        {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
           // System.out.println(name + " " + SSN + " " + accountType +" $ " + initDeposit);
            if(accountType.equals("Savings"))
                {
                //System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name,SSN, initDeposit));
                }
            else if (accountType.equals("Checking"))
                {
                  //  System.out.println("OPEN A CHECKING ACCOUNT");
                    accounts.add(new Checking(name,SSN, initDeposit));
                }
            else
                {
                    System.out.println("ERROR READING ACCOUNT TYPE");
                }
        }

        for (Account acc : accounts)
        {
            System.out.println("\n*****************");
            acc.showInfo();
         }
    }
}
