package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

 
public class BasePage {

    protected WebDriver driver;
    
    // Constructor
    public BasePage(WebDriver driver) {
       this.driver = driver;
    }

    public WebDriver getDriver() {
 	   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
 	   driver = new FirefoxDriver();
 	   driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
 	   return driver;
     }

	// method
    public void navigateTo(String url) {
       driver.get(url);
    }
  
    // Click Method
    public void click(By elementBy) {
       driver.findElement(elementBy).click();
    }

    // Submit Method
    public void submit(By elementBy) {
       driver.findElement(elementBy).submit();
    }

    // Write Text
    public void writeText(By elementBy, String text) {
        driver.findElement(elementBy).sendKeys(text);
    }
    
    // Read Text
    public String readText(By elementBy) {
       return driver.findElement(elementBy).getText();
    }
    
    public void closeDriver() {
        driver.quit();
     }
    
    public boolean existElement(By elementBy) {
    	Boolean isPresent = driver.findElements(elementBy).size() > 0;
        return isPresent;
    }

}