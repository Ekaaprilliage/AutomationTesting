package org.example.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {
    public static WebDriver webDriver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement ButtonRemoveCart;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement ButtonCheckout;

    public void ClickButtonCart(){
        ButtonRemoveCart.click();
    }

    public void ClickButtonCheckout(){
        ButtonCheckout.click();
    }
}
