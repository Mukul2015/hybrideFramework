package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistationPage {

	WebDriver driver;

	public RegistationPage(WebDriver driver){

	    driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//*[contains(text(),'Hello, Sign in')]")
		WebElement txtclick;

		@FindBy(xpath="//*[@id='createAccountSubmit']")
		WebElement txtAccountclick;

		@FindBy(xpath="//*[@id='ap_customer_name']")//
		WebElement txtcustomer;

		@FindBy(xpath="//*[@id='ap_email']")
		WebElement txtemail;

		@FindBy(xpath="//*[@id='ap_password']")
		WebElement txtclickpass;
		
		@FindBy(xpath="//*[@id='ap_password_check']")//
		WebElement txtUserpass;
		
		@FindBy(xpath="//*[@id='continue']")
		WebElement txtclickcountinue;

		@FindBy(xpath="//*[@id='continue']")
		WebElement txtUsercountinue;

		public void txtclickbutton(){
			txtclick.click();
		}
		public void txtAccountbutton(){
			txtAccountclick.click();
		}
		/*public void txtcustomername(){  //
			txtcustomer.sendKeys("tamim");
		}
		public void txtemailname(){
			txtemail.sendKeys("monirul.nur1338@gmail.com");
		}
		public void txtpass(){
			txtclickpass.sendKeys("kamal123");
		}
		public void setUserName(){
			txtUserpass.sendKeys("kamal123");}*/
		
		public void createAccount(String name,String email,String password,String cpassword){
			txtcustomer.sendKeys(name);
			txtemail.sendKeys(email);
			txtclickpass.sendKeys(password);
			txtUserpass.sendKeys(cpassword);
			txtclickcountinue.click();
		}
		/*public void txtcountinuebutton(){
			txtclickcountinue.click();
		}*/
		public void txtUsercountinuebutton(){
			txtUsercountinue.click();
	}
}