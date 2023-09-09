package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.OverviewPage;
import org.openqa.selenium.WebDriver;

public class OverviewSteps {
    private WebDriver driver = Hooks.driver;

    OverviewPage overviewPage = new OverviewPage(driver);

    @Then("User Verify that Sauce Labs Onesie as a product in the list checkout")
    public void VerifyCheckoutProduct() throws InterruptedException{
        overviewPage.VerifyCheckoutProduct();
        Thread.sleep(2000);
    }

    @When("User Verify the total price of item checkout")
    public void VerifyProductTotal() throws InterruptedException{
        overviewPage.VerifyProductTotal();
        Thread.sleep(2000);
    }
    @When("User clicks the Finish button")
    public void clickButtonFinish() throws InterruptedException{
        overviewPage.clickButtonFinish();
        Thread.sleep(3000);
    }

}
