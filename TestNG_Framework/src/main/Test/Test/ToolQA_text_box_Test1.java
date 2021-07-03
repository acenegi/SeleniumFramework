package Test;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baseLibrary.baseClass;
import excelUtility.ExcelUtility;
import Pages.ToolQA_text_box_page;
import appUtility.AppUtility;

public class ToolQA_text_box_Test1 extends baseClass {

	static String path = "D:\\Workspace\\TestNG_Framework\\src\\main\\java\\test_Data\\ToolsQA_Data.xlsx";

	@Test
	public void Text_Box_Test() throws InterruptedException, IOException {

		ToolQA_text_box_page tb = new ToolQA_text_box_page();

		tb.textBox();
		Thread.sleep(1000);
		
		int row = ExcelUtility.getRowCount(path, "Sheet1");
		
		for (int i = 1; i <= row; i++) {
			
			String name = ExcelUtility.getCellData(path, "Sheet1", i, 0);
			String email = ExcelUtility.getCellData(path, "Sheet1", i, 1);
			String curAdd = ExcelUtility.getCellData(path, "Sheet1", i, 2);
			String perAdd = ExcelUtility.getCellData(path, "Sheet1", i, 3);

			tb.name(name);

			tb.email(email);

			tb.currentAdd(curAdd);

			tb.permanentAdd(perAdd);
			
			ExcelUtility.setCellData(path, "Sheet1", i, 4, "Entry Inserted");
			
			WebElement ele = driver.findElement(By.xpath("//*[text()='Submit']"));
			AppUtility.getScroll(ele);

			tb.submit();
			Thread.sleep(2000);
				
		}
		
		//driver.quit();
	}
}
