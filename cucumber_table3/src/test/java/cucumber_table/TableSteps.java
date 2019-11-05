package cucumber_table;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class TableSteps {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
    }

   /* @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username is: " + username + " and password is " + password);
    }*/

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("Click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) {
        /*List<List<String>> data = table.raw();//Retorna una lista de listas de Strings .raw()
        System.out.print("The value is " + data.get(0).get(0).toString());
        System.out.print(" The value is " + data.get(0).get(1).toString());*/

        //Creando un ArrayList
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user: users)
        {
            System.out.println("The username is " + user.username);
            System.out.println("The password is " + user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) {
        System.out.println("username is : " + userName);
        System.out.println("password is : " + password);
    }

    public class User {
        public String username;// alt + insert para crear constructores
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }


    }
}
