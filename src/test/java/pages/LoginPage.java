package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

 
public class LoginPage extends BasePage {
	
	
	//declaramos objetos
	By WebEditExistingEmail = By.id("email");
	By WebEditExistingPasswd = By.id("passwd");
	By WebButtonSignIn = By.id("SubmitLogin");


   //constructor
    public LoginPage(WebDriver driver){
	   super(driver);
	  
	}
	
	//funcionalidades
	public void setEmail(String mail) throws Exception{
         writeText(WebEditExistingEmail, mail);
	}
	
	public void setPassword(String pass) throws Exception{
		writeText(WebEditExistingPasswd, pass);
	}
	
	public void clickSignInButton() throws Exception{
		click(WebButtonSignIn);
	}
	
	
	
}