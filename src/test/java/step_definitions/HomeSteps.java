package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @When("User filter list product by {string}")
    public void selectFilterProduct(String filterProduct) throws InterruptedException{
        homePage.selectFilterProduct(filterProduct);
        Thread.sleep(5000);
    }

    @When("User click item {string}")
        public void clickButtonAddToCartItem(String item) throws InterruptedException{
            homePage.clickButtonAddToCart(item);
            Thread.sleep(2000);
        }

    @When("User click item2 {string}")
    public void clickButtonAddToCartItem1(String item1) throws InterruptedException{
        homePage.clickButtonAddToCart1(item1);
        Thread.sleep(2000);
    }

    @Then("User click cart button")
    public void ClickButtonCart() throws InterruptedException{
        homePage.ClickButtonCart();
        Thread.sleep(2000);
    }

}


