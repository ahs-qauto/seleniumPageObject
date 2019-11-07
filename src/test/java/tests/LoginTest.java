package tests;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;


public class LoginTest {
	
	//protected WebDriver driver;

	 //Create firefox driver's instance
    public WebDriver driver;
    BasePage base;
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage accountPage;
    
	@Before
	public void setUp(){
	     base = new BasePage(driver);
	     driver = base.getDriver();
	}

	@Test
	public void loginTest() throws Exception {
		
		//definimos objectos y variables
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		accountPage = new MyAccountPage(driver);
		boolean exists = false;
		
		//funcionalidad automatizada
		homePage.loadHomepage();
		homePage.clickloginLink();
		loginPage.setEmail("alejandro.herranz@es.gfi.world");
		loginPage.setPassword("Pass01");
		loginPage.clickSignInButton();
		
		//verificación
		exists = accountPage.existElement(accountPage.WebSpanOrderHistoryAndDetails);
		assertTrue("login succesfully", exists);
	}
	
	@After
	public void tearDown() {
		base.closeDriver();
	}

}
