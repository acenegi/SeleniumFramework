package Test;

import org.testng.annotations.Test;

import Pages.ToolQA_Check_Box_Page;
import baseLibrary.baseClass;

public class ToolQA_Check_Box_Test extends baseClass{
	
	@Test
	public void Check_Box_Test() throws InterruptedException {
		
		ToolQA_Check_Box_Page cb = new ToolQA_Check_Box_Page();
		
		cb.checkBox();
		Thread.sleep(1000);
		
		cb.extendHome();
		Thread.sleep(1000);
		
		cb.extendDownload();
		Thread.sleep(1000);
		
		cb.checkWord();
		Thread.sleep(1000);
		
		cb.checkExcel();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
