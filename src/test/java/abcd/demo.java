package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

	}
	@Test
	public void test1()  {
		WebDriver driver =new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
}
}
