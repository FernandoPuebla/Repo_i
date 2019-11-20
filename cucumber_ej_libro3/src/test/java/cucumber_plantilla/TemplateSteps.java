package cucumber_plantilla;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.*;
import org.apache.velocity.Template;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TemplateSteps {

    class Account
    {
    //    public Account(int openingBalance){}
        private Money balance = new Money();
        public void deposit(Money amount){
            balance += balance.add(amount);
        }
        public Money getBalance(){ return balance;}
    }

    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) {
        //new Account(amount);
        Account myAccount = new Account();
        myAccount.deposit(amount);

        Assert.assertEquals("Incorrect account balance -", amount, myAccount.getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest$(int arg0) {
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int arg0) {
    }
}