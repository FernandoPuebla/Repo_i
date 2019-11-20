package cucumber_plantilla;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class TemplateSteps {
    int bananaPrice = 0;

    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        int bananaPrice = price;
    }
    Checkout checkout;

    @When("^I checkout <(\\d+)> \"([^\"]*)\"$")
    public void iCheckout(int itemCount, String itemName) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Checkout checkout = new Checkout();
        checkout.add(itemCount,bananaPrice);
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) {
        assertEquals(total, checkout.total());
    }

    @When("^I checkout <count> \"([^\"]*)\"$")
    public void iCheckoutCount(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}