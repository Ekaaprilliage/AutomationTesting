package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private WebDriver driver = Hooks.driver;

    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @When("User input {string} as a FirstName {string} as a LastName {string} as a PostalCode")
    public void inputCredential(String FrstName, String LstName, String PstlCode) throws InterruptedException {
        checkoutPage.setFirstName(FrstName);
        checkoutPage.setLastName(LstName);
        checkoutPage.setPostalCode(PstlCode);
        Thread.sleep(2000);
    }

    @Then("User clicks the Continue button")
    public void clickButtonContinue() throws InterruptedException{
        checkoutPage.clickButtonContinue();
        Thread.sleep(2000);
    }

}
