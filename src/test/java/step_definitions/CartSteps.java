package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private final WebDriver driver = Hooks.driver;
    CartPage cartPage = new CartPage(driver);

    @When("User clicks the Delete button on one cart product item")
    public void ClickButtonCart() throws InterruptedException{
        cartPage.ClickButtonCart();
        Thread.sleep(2000);
    }

    @Then("User clicks the Checkout button")
    public void ClickButtonCheckout() throws InterruptedException{
        cartPage.ClickButtonCheckout();
        Thread.sleep(2000);
    }
}
