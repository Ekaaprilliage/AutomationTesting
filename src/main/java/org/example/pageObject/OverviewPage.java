package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
    public static WebDriver webDriver;

    public OverviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@class='cart_item']")
    private WebElement VerifProductCheckout;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement VerifTotalProduct;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement ButtonFinish;


    public boolean VerifyCheckoutProduct(){
        return VerifProductCheckout.isDisplayed();
    }

    public boolean VerifyProductTotal(){
        return VerifTotalProduct.isDisplayed();
    }

    public void clickButtonFinish(){
        ButtonFinish.click();
    }


}
