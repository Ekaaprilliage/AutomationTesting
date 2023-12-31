package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
       // WebDriverManager.chromedriver()
       /*         .driverVersion("116.0.5845.96") // Set the desired ChromeDriver version
                .cachePath("'https://googlechromelabs.github.io/chrome-for-testing/last-known-good-versions-with-downloads.json'") // Set the path where ChromeDriver will be downloaded
                .setup();
       */ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(co);

        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl);
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
