package pages;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.testBase;

public class SearchBox extends testBase {

	WebDriver driver;

	public SearchBox(WebDriver driver) throws IOException {
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	@CacheLookup
	WebElement Searchbox;

	@FindBy(xpath="//*[@id='nav-search-bar-form']/div[3]/div")
	@CacheLookup
	WebElement clickButton;

	@FindBy(xpath="//*[@id='search']/div[1]")
	@CacheLookup
	WebElement Search;

	public void Sbox(String input){
		Searchbox.sendKeys(input);
	}
	public void click(){
		clickButton.click();
	}
	public void Searchitem(){
		Search.click();
	}
}
//get all link
/* for(int i=0;i<product.size();i++) {
		String data=   product.get(i).getText();
		System.out.println(data);*/

/*for (WebElement cameraName:product) {

		String n = cameraName.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2")).getText();
		System.out.println("Camera Name=" + n);*/

