package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://shazurelinux.azurewebsites.net/webapp/");
		System.out.println("got the url");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println("got the url text");
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("SHannonHiggins.com Learning"));
		System.out.println("asserted");
		driver.close();
	
		
		
	}
}
