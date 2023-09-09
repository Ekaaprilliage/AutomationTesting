package org.example.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement FirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement LastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement PostalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement ButtonContinue;

    public void setFirstName(String FrstName){
        FirstName.sendKeys(FrstName);
    }

    public void setLastName(String LstName){
        LastName.sendKeys(LstName);
    }

    public void setPostalCode(String PstlCode){
        PostalCode.sendKeys(PstlCode);
    }

    public void clickButtonContinue(){
        ButtonContinue.click();
    }
}
