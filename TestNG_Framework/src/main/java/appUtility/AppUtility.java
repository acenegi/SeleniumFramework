package appUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseLibrary.baseClass;

public class AppUtility extends baseClass {

	public static void Dropdown(WebElement element, int indexNO) {

		Select dropdown = new Select(element);
		dropdown.selectByIndex(indexNO);
	}

	public static void getScroll(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}
	
	public static void captureScreen(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File path = new File(System.getProperty("user.dir") + "\\Screenshots\\" + name + ".png");
		FileUtils.copyFile(source, path);
		System.out.println("Screenshot taken");

	}

}
