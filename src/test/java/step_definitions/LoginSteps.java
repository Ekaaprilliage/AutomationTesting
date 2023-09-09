package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver = Hooks.driver;

    LoginPage loginPage = new LoginPage(driver);

    @When("User input {string} as a userName {string} as a password")
    public void inputCredential(String usrName, String Pswd) throws InterruptedException {
        loginPage.setUserName(usrName);
        loginPage.setPassword(Pswd);
        loginPage.setButtonLogin();
        Thread.sleep(5000);
    }

    @Given("User open the website sauce demo")
    public void verifyLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.userNameDisplayed());
    }

    @Then("User already on home page")
    public void verifyHomePage() {
        Assert.assertTrue(loginPage.verifyLabelProduct());
    }

    @Then("User see eror {string} on login page")
    public void verifyLabelErrorText(String errorText) throws InterruptedException{
        Assert.assertEquals(loginPage.getLabelErrorText(),errorText);
        Thread.sleep(3000);
    }
}
