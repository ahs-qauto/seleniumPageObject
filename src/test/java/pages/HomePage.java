package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import pages.BasePage;

 
public class HomePage extends BasePage {
	
	//declaramos objetos
	By WebLinkSignIn = By.className("login");
	
   //constructor
    public HomePage(WebDriver driver){
	   super(driver);
	   
	}
	
	//funcionalidades
	public void clickloginLink() throws Exception{
		click(WebLinkSignIn);
		
	}
	
	public void loadHomepage() {
		navigateTo("http://automationpractice.com/index.php");
	}
	
	
	
}