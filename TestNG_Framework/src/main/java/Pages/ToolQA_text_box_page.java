package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.baseClass;

public class ToolQA_text_box_page extends baseClass {

	public ToolQA_text_box_page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Text Box']")
	@CacheLookup
	private WebElement textBox;

	@FindBy(xpath = "//*[@id=\"userName\"]")
	@CacheLookup
	private WebElement name;

	@FindBy(xpath = "//*[@id=\"userEmail\"]")
	@CacheLookup
	private WebElement email;

	@FindBy(xpath = "//*[@id=\"currentAddress\"]")
	@CacheLookup
	private WebElement currentAdd;

	@FindBy(xpath = "//*[@id=\"permanentAddress\"]")
	@CacheLookup
	private WebElement permanentAdd;

	@FindBy(xpath = "//*[@id=\"submit\"]")
	@CacheLookup
	private WebElement submit;

	public void textBox() {

		try {

			textBox.click();

		} catch (Exception e) {
			System.out.println("Issue in text box method"+e);
		}
	}

	public void name(String Name) {

		try {

			name.clear();
			name.sendKeys(Name);

		} catch (Exception e) {
			System.out.println("Issue in name method"+e);
		}

	}

	public void email(String Email) {

		try {

			email.clear();
			email.sendKeys(Email);

		} catch (Exception e) {
			System.out.println("Issue in email method"+e);
		}

	}

	public void currentAdd(String CurAdd) {

		try {

			currentAdd.clear();
			currentAdd.sendKeys(CurAdd);

		} catch (Exception e) {
			System.out.println("Issue in currentAdd method"+e);
		}

	}

	public void permanentAdd(String perAdd) {

		try {

			permanentAdd.clear();
			permanentAdd.sendKeys(perAdd);

		} catch (Exception e) {
			System.out.println("Issue in permanentAdd method"+e);
		}

	}

	public void submit() {

		try {

			submit.click();

		} catch (Exception e) {
			System.out.println("Issue in submit method"+e);
		}

	}

}
