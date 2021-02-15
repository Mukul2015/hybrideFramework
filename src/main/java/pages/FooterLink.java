package pages;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FooterLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Software tester\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com");
		//WebDriver driver = new ChromeDriver();
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerlink =driver.findElement(By.xpath("//*[@id='navFooter']"));

		System.out.println(footerlink.findElements(By.tagName("a")).size());

		WebElement countlink=footerlink.findElement(By.xpath("//*[@id='navFooter']/div[1]/div/div[1]"));
		System.out.println(countlink.findElements(By.tagName("a")).size());

		for (int i = 1; i < countlink.findElements(By.tagName("a")).size(); i++) {

			String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			countlink.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
			Thread.sleep(5000);
		}
		Set <String> window = driver.getWindowHandles();
		Iterator <String> it=window.iterator();

		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	//	driver.quit();
	}
}
