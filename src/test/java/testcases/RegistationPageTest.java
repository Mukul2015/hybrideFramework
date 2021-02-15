package testcases;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.testBase;
import pages.RegistationPage;
import utiles.TestUtil;

public class RegistationPageTest extends testBase {

	RegistationPage  Rpage;
	String sheetName = "contacts";
	
	public RegistationPageTest() throws IOException {
		super();		
	}
	@BeforeMethod
	public void setUp() throws IOException {
		RegistationPage  Rpage;
		initialization();
	}
	@DataProvider
	public Object[][] getCTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);   //***problem Here***
		return data;
	}
	
	@Test(priority=1,dataProvider="getCTestData")
	public void validateCreateaccount(String name,String email,String password,String cpassword){	
		
		Rpage = new RegistationPage(driver);

		Rpage.txtclickbutton();
		Rpage.txtAccountbutton();
		Rpage.createAccount(name,email,password,cpassword);
		Rpage.txtUsercountinuebutton();	
	}
	/*@AfterMethod
	public void tearDown(){
		driver.quit();
	}*/
}
