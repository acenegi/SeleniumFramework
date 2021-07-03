package Test;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import baseLibrary.baseClass;
import excelUtility.ExcelUtility;
import Pages.ToolQA_text_box_page;
import appUtility.AppUtility;

public class ToolQA_text_box_Test extends baseClass {

	static String path = "D:\\Workspace\\TestNG_Framework\\src\\main\\java\\test_Data\\ToolsQA_Data.xlsx";

	@Test(dataProvider = "data")
	public void Text_Box_Test(String name, String email, String curAdd, String perAdd) throws InterruptedException {

		ToolQA_text_box_page tb = new ToolQA_text_box_page();

		tb.textBox();
		Thread.sleep(1000);
		
		tb.name(name);

		tb.email(email);
		
		tb.currentAdd(curAdd);
	
		tb.permanentAdd(perAdd);
	
		WebElement ele = driver.findElement(By.xpath("//*[text()='Submit']"));
		AppUtility.getScroll(ele);

		tb.submit();
		Thread.sleep(2000);

	}

	@DataProvider(name = "data")
	String[][] getData() throws IOException {

		int row = ExcelUtility.getRowCount(path, "Sheet1");
		int coloumn = ExcelUtility.getCellCount(path, "Sheet1", 1);

		String readData[][] = new String[row][coloumn];

		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < coloumn; j++) {

				readData[i - 1][j] = ExcelUtility.getCellData(path, "Sheet1", i, j);
				ExcelUtility.setCellData(path, "Sheet1", i, 4, "Data Inserted");

			}
		}
		return readData;
	}

}
