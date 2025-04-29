package AutomationSimefinalProject.AutomationSimefinalProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest{

	WebDriver driver = new ChromeDriver();

	Random rand = new Random();

	@BeforeTest

	public void mysetup() {

		driver.get("https://codenboxautomationlab.com/practice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test(priority=1, enabled=false)

	public void autoCompleteInputTest() throws InterruptedException {

		WebElement autoCompleteInputfiled = driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input"));

		String[] Countries = { "jo", "sy", "ja", "ye" };

		int randomindex = rand.nextInt(Countries.length);
		System.out.println(randomindex);
		autoCompleteInputfiled.sendKeys(Countries[randomindex]);

		System.out.println(randomindex);
		Thread.sleep(1000);
		autoCompleteInputfiled.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));

	}

	@Test(priority=2 ,enabled=false)
	public void SelectTag () {
		
		WebElement TheSelector =driver.findElement(By.id("dropdown-class-example"));
		 Select mySelect =new Select(TheSelector);
		// mySelect.selectByVisibleText("API");
		 //mySelect.selectByIndex(1);
		 mySelect.selectByValue("option3");
		
		
		// System.out.println (TheSelector.findElements(By.tagName("option")).size());
		
		
	}
	
	@Test(priority=3 , enabled =false)
	
	public void CheckBoxTest() {
		
		WebElement DivofCheckBox=driver.findElement(By.id("checkbox-example"));
		  List<WebElement> AllCheckBoxes =DivofCheckBox.findElements(By.tagName("input"));
//		AllCheckBoxes.get(0).click();
//		AllCheckBoxes.get(1).click();
//		AllCheckBoxes.get(2).click();
	
		   int indexrandom = rand.nextInt(AllCheckBoxes.size());
		   AllCheckBoxes.get(indexrandom).click();
//		  for(int i=0; i<AllCheckBoxes.size();i++) {
//			  
//			  AllCheckBoxes.get(i).click();
//		  }
		
	}
	@Test(priority=4 , enabled=false)
	
	public void Window_Example() throws InterruptedException {
		
		 WebElement SwitchWindowButton =driver.findElement(By.id("openwindow"));
		 SwitchWindowButton.click();
		 
		 Set<String> Handels =driver.getWindowHandles();
		 List<String> WindowList=new ArrayList<>(Handels);
		 
		 driver.switchTo().window(WindowList.get(1));
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"menu-item-9660\"]/a/span[1]")).click();
		 driver.switchTo().window(WindowList.get(0));
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());

		 
		 
		 
		 
		 
		 
		 
		 
	}
	
@Test(priority=5, enabled=false)
	
	public void Switch_Tab_Example() throws InterruptedException 
{
		
		 WebElement SwitchTabButton =driver.findElement(By.id("opentab"));
		 SwitchTabButton.click();
		 
		 Set<String> Handels =driver.getWindowHandles();
		 List<String> TabList=new ArrayList<>(Handels);
		 Thread.sleep(2000);
		 
		 driver.switchTo().window(TabList.get(1));
		 System.out.println(driver.getTitle());
		 
		 
	
		 driver.switchTo().window(TabList.get(0));
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());

		 
		 
	  
		 
	}

	@Test(priority=6 ,enabled=false)
	
		public void AlertTest() throws InterruptedException {
		Thread.sleep(2000);
		WebElement InputFilrdOfName=driver.findElement(By.id("name"));
		InputFilrdOfName.sendKeys("Alizagib");
		
		WebElement AlertButton= driver.findElement(By.id("alertbtn"));
		
		AlertButton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
				
		
		
	
	}
	
	@Test(priority=7, enabled=false)
	
	public void ConfirmTest() throws InterruptedException {
	Thread.sleep(2000);
	WebElement InputFilrdOfName=driver.findElement(By.id("name"));
	InputFilrdOfName.sendKeys("Alizagib");
	
	WebElement AlertButton= driver.findElement(By.id("confirmbtn"));
	
	AlertButton.click();
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
			
	
	

}

	@Test(priority=8,enabled=false)
	
		public void TableTest() {
		//	to print all rows
		WebElement TheTable=driver.findElement(By.id("product"));
		 List<WebElement>AllRows=TheTable.findElements(By.tagName("th"));
		 List<WebElement>AllData=TheTable.findElements(By.tagName("td"));

		 
		 // This is the  loigc  to print random row
		 
//		 int RandomRow =rand.nextInt(AllRows.size());
//		 System.out.println(AllRows.get(RandomRow).getText());
		 
		 // to print all rows
		 
//		 for(int i=0; i<AllRows.size(); i++) {
//			 System.out.println(AllRows.get(i).getText());
//			 
//		 }
		 
		 for(int i=2; i<AllData.size(); i=i+3) {
			 System.out.println(AllData.get(i).getText());
			 
		 }
		
		
	}
	
	
	@Test(priority =9 ,enabled=false)
	
	public void HideAndshow() throws InterruptedException {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1900)");
		Thread.sleep(2000);
		
		
		WebElement HideButton =driver.findElement(By.id("hide-textbox"));
		HideButton.click();
		Thread.sleep(2000);
		WebElement ShowButton =driver.findElement(By.id("show-textbox"));
		ShowButton.click();
		
	}
	
	@Test(priority =10 ,enabled=false)
	
	public void EnableAndDisable() throws InterruptedException {
		
		WebElement DisableButton =driver.findElement(By.id("disabled-button"));
		DisableButton.click();
	
		Thread.sleep(2000);
		WebElement EnabledButton =driver.findElement(By.id("enabled-button"));
		EnabledButton.click();
		
		WebElement InputFiled =driver.findElement(By.id("enabled-example-input"));
		InputFiled.sendKeys("Alizagibi");
		
	}
	@Test(priority=11,enabled=false)
	
	public void MouseHover () throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1900)");
		Thread.sleep(2000);
		
		WebElement TheElementINeedToMoveTo =driver.findElement(By.id("mousehover"));
		
		Actions actions =new Actions(driver);
		
		actions.moveToElement(TheElementINeedToMoveTo).click().perform();
		Thread.sleep(2000);
		
		
//		WebElement TopPartial =driver.findElement(By.partialLinkText("To"));
//		TopPartial.click();
//		
//		WebElement Top =driver.findElement(By.linkText("Top"));
//		Top.click();
	
		WebElement Reload =driver.findElement(By.linkText("Reload"));
		Reload.click();
		
		
		
		
		
	}
		@Test(priority=12,enabled=false)
		
		public void Calender() throws InterruptedException {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,1900)");
			Thread.sleep(2000);
			
			WebElement CalenderTap =driver.findElement(By.linkText("Booking Calendar"));
			CalenderTap.click();
			
			 Set<String> Handels =driver.getWindowHandles();
			 List<String> TabList=new ArrayList<>(Handels);
			 Thread.sleep(2000);
			 
			 driver.switchTo().window(TabList.get(1));
			 
			 WebElement TheTable =driver.findElement(By.cssSelector(".datepick.wpbc_calendar"));
			 
			 
			List<WebElement> Tds =TheTable.findElements(By.tagName("td"));
			
			for(int i =0 ; i<Tds.size();i=i+2) {
				
				System.out.println(Tds.get(i).getText());
			}
			

			
			
		}
		
		@Test(priority=13,enabled=false)
		
		public void IFrame() throws InterruptedException {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,2200)");
			Thread.sleep(2000);
			
			driver.switchTo().frame("iframe-name");
			Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".ct-mobile-meta-item.btn-nav-mobile.open-menu.opened"));
			 
			 Set<String> Handels =driver.getWindowHandles();
			 List<String> TabList=new ArrayList<>(Handels);
			 driver.switchTo().window(TabList.get(1));
			 Thread.sleep(2000);
			 
			 
			 WebElement CalenderTap =driver.findElement(By.linkText("Booking Calendar"));
				CalenderTap.click();
				
				Set<String> Handels2 =driver.getWindowHandles();
				 List<String> TabList2=new ArrayList<>(Handels2);
				 driver.switchTo().window(TabList2.get(1));
				 
				 System.out.println(driver.getTitle());
		}
		
		@Test (priority=14)
		
		public void DownloadFile() {
			
			WebElement DownloadButton=driver.findElement(By.linkText("Download Apk files"));
			DownloadButton.click();
			
		}

}

   
