package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

 
public class MyAccountPage extends BasePage {
	
	//declaramos objetos
	public By WebSpanOrderHistoryAndDetails= By.xpath("//span[contains(text(), 'Order history and details')]");
	
   //constructor
    public MyAccountPage(WebDriver driver){
	   super(driver);
	}

	
	
}