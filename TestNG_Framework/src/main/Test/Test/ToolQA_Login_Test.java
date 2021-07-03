package Test;

import org.testng.annotations.Test;

import Pages.ToolQA_Element_Page;
import Pages.ToolQA_Login_Page;

public class ToolQA_Login_Test {
	
	ToolQA_Login_Page ob = new ToolQA_Login_Page();
	
	@Test(priority = 0)
	public void getLaunch_URL_Test() {
		
		ob.getLaunch_URL();
	}
	
	@Test(priority = 1)
	public void element_Page_Test() throws InterruptedException {
		
		ToolQA_Element_Page ep = new ToolQA_Element_Page();
		
		ep.elementsClick();
		Thread.sleep(2000);
		
	}
	
}
