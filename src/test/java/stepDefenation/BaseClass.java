package stepDefenation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static  WebDriver driver; 
	
	  public  static void initializeBrowser() {
       try {
			
		
      	System.setProperty("webdriver.chrome.driver","E:\\Users\\mukil\\eclipse-workspace\\com.selenium\\product\\chromedriver.exe");

   		 driver=new ChromeDriver();

   		driver.manage().window().maximize();
		  
       } catch (Exception e) {
      	 
			e.printStackTrace();
		}
	}
	  
	  public  static void getUrl(String value) {
		  
		  try {
			
		
		  driver.get(value);
	  } catch (Exception e) {

		  e.printStackTrace();
	  }
	  }
	  
	  public  static  void entryText(WebElement element,String values) {
		  try {
			  
			  element.sendKeys(values);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		  
	  }
	  
	  public  static  void click(WebElement element) {
		  try {
			  
			  element.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  public  static  void tackScreenshot(String values) {
		  try {
			  
			  TakesScreenshot ts=(TakesScreenshot)driver;
			  
			  File src = ts.getScreenshotAs(OutputType.FILE);
			  
			  File location = new File(values);
			  
			  FileUtils.copyFile(src, location);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  public  static  void windowHandling(int i) {
		  try {
			  Set<String> win = driver.getWindowHandles();
			  List<String> li= new ArrayList();
			  li.addAll(win);
			  driver.switchTo().window( li.get(i));
			  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  public  static  void dropDown(WebElement element,int i) {
		  try {
			  
			  Select s = new Select(element);
			  s.selectByIndex(i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  public static  String readFromExcel(int row,int cell) throws IOException {
		 
			  File f=new File("C:\\Users\\mukil\\Desktop\\excel\\adactin.xlsx");
			  FileInputStream fis=new FileInputStream(f);
			  Workbook wb=new XSSFWorkbook(fis);
			  Sheet sheetAt = wb.getSheetAt(0);
			  Row r = sheetAt.getRow(row);
			  Cell c = r.getCell(cell);
			  //System.out.println(c);
			  String value=null;
			  CellType cellType = c.getCellType(); 
			  //System.out.println(cellType);
			  if (cellType==CellType.STRING) {
				value=c.getStringCellValue();
				System.out.println(value);
			}else if (cellType==CellType.NUMERIC) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
					value=sdf.format(dateCellValue);
					System.out.println(value);
					
				}else {
					double d = c.getNumericCellValue();
					long l=(long) d;
					value=String.valueOf(l);
					System.out.println(value);
				}
				
			}
			return value;
		}
		

		  
	  }


