package cucumber_proyectos;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shoppingStep {
    @Given("^I start the application$")
    public void iStartTheApplication() {
        System.out.println("I start the application");
    }

    @Then("^I should see a selection of products$")
    public void iShouldSeeASelectionOfProducts() {
        System.out.println("I should see a selection of products");
    }

    @When("^I browse without buying product$")
    public void iBrowseWithoutBuyingProduct() {
        System.out.println("I browse without buying product");
    }

    @Then("^my basket should be empty$")
    public void myBasketShouldBeEmpty() {
        System.out.println("My basket should be empty");
    }

    @And("^I cannot buy an item$")
    public void iCannotBuyAnItem() {
        System.out.println("I cannot buy an item");
    }

    @When("^I browse with buying product$")
    public void iBrowseWithBuyingProduct() {
        System.out.println("I browse with buying product");
    }

    @Then("^my basket shouldnot be empty$")
    public void myBasketShouldnotBeEmpty() {
        System.out.println("My basket shouldnot be empty");
    }

    @And("^I can buy an item$")
    public void iCanBuyAnItem() {
        System.out.println("I can buy an item");
    }
}
