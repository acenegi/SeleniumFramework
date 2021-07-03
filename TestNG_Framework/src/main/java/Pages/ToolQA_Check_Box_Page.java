package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.baseClass;

public class ToolQA_Check_Box_Page extends baseClass {

	public ToolQA_Check_Box_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[text()='Check Box']")
	@CacheLookup
	private WebElement checkBox;

	@FindBy(xpath = "(//*[@type=\"button\"])[4]")
	@CacheLookup
	private WebElement extendHome;

	@FindBy(xpath = "(//*[@type=\"button\"])[7]")
	@CacheLookup
	private WebElement extendDownload;

	@FindBy(xpath = "//*[text()='Word File.doc']")
	@CacheLookup
	private WebElement checkWord;

	@FindBy(xpath = "//*[text()='Excel File.doc']")
	@CacheLookup
	private WebElement checkExcel;

	public void checkBox() {

		try {
			checkBox.click();
		} catch (Exception e) {
			System.out.println("Issue in checkBox method"+e);
		}

	}

	public void extendHome() {

		try {
			extendHome.click();
		} catch (Exception e) {
			System.out.println("Issue in extendHome method"+e);
		}

	}

	public void extendDownload() {

		try {
			extendDownload.click();
		} catch (Exception e) {
			System.out.println("Issue in extendDownload method"+e);
		}

	}

	public void checkWord() {

		try {
			checkWord.click();
		} catch (Exception e) {
			System.out.println("Issue in clickWord"+e);
		}

	}
	
	public void checkExcel() {

		try {
			checkExcel.click();
		} catch (Exception e) {
			System.out.println("Issue in clickExcel"+e);
		}

	}

}
