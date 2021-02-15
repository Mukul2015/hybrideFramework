package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SigninPage {

	WebDriver ldriver;

	public SigninPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[contains(text(),'Hello, Sign in')]")
	WebElement signin;
	
	@FindBy(xpath="//*[@name='email']")
	WebElement Semail;
    
	@FindBy(xpath="//*[@id='continue']")
	WebElement Continue;
	
	@FindBy(xpath="//*[@id='ap_password']")
	WebElement pword;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	WebElement submit;
	
	public void signinbutton() {
		signin.click();
	}
	public void signinemail(String email) {
		Semail.sendKeys(email);
	}
	public void cbutton() {
		Continue.click();
	}
	public void signinpassword(String pass) {
		pword.sendKeys(pass);
	}
	public void signinsubmit() {
		submit.click();
	}
}

