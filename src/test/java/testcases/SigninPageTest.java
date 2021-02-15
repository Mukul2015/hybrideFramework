package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.testBase;
import pages.SigninPage;

public class SigninPageTest extends testBase {
	SigninPage signpage;

	public SigninPageTest() throws IOException {
		super();		
	}
	@BeforeMethod
	public void setUp() throws IOException {

		initialization();
		SigninPage signpage;
	}
	@Test(priority=1)
	public void serchBox() throws IOException {

		signpage = new SigninPage(driver);
		
		signpage.signinbutton();
		signpage.signinemail("mukul_wana@yahoo.com");
		signpage.cbutton();
		signpage.signinpassword("mukul1338");
		signpage.signinsubmit();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}