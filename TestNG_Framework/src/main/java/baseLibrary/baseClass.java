package baseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	public static WebDriver driver = new ChromeDriver();

	public void getURL(String URL) {

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
	}

}
