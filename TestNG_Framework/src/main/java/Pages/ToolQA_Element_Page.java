package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.baseClass;

public class ToolQA_Element_Page extends baseClass {
	
	public ToolQA_Element_Page() {


		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@class=\"card-up\"])[1]")
	@CacheLookup
	private WebElement elementsClick;
	
	public void elementsClick() {
		
		try {
			elementsClick.click();
		} catch (Exception e) {
			System.out.println("Issue in elementClick method"+e);
		}
		
	}
	
}
