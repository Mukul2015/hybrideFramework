package testcases;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.testBase;
import pages.FooterLink;
import pages.RegistationPage;

public class FooterlinkTest extends testBase {

	FooterLink  link;

	public FooterlinkTest() throws IOException {
		super();		
	}
	@BeforeMethod
	public void setUp() throws IOException {
		FooterLink  link;
		initialization();
	}	
	@Test
	public void validateCreateaccount() throws InterruptedException{	

	//	link = new FooterLink(driver);
	//	link.flink();

	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}