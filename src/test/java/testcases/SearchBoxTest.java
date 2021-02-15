package testcases;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.testBase;
import pages.SearchBox;
public class SearchBoxTest extends testBase {
	SearchBox serchbox;

	public SearchBoxTest() throws IOException {
		super();		
	}
	@BeforeMethod
	public void setUp() throws IOException {

		initialization();
		SearchBox serchbox;
	}
	@Test(priority=1)
	public void serchBox() throws IOException {

		serchbox = new SearchBox(driver);

		serchbox.Sbox("canon camara");

		serchbox.click();
	}
	@Test(priority=2)
	public void Searchitem(){
		List<WebElement> product =driver.findElements(By.xpath("//*[@id='search']/div[1]"));

		//get all link
		for(int i=0;i<product.size();i++) {
			String data=   product.get(i).getText();
			System.out.println(data);

			for (WebElement cameraName:product) {

				String n = cameraName.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2")).getText();
				System.out.println("Camera Name=" + n);
			}
		}
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}	


