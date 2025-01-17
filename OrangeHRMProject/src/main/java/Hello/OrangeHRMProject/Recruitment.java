package Hello.OrangeHRMProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Recruitment {
	private WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.Chrome.driver", "D:\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		driver.manage().window().maximize();
	}
//	@Test (dataProvider ="login")
//	public void LoginPage (String userName,String Password,boolean Expected) throws InterruptedException {
//		Thread.sleep(1500);
//		WebElement usernameField= driver.findElement(By.name("username"));
//		usernameField.sendKeys(userName);
//		WebElement passwordField= driver.findElement(By.xpath("//input[@name=\"password\"]"));
//		passwordField.sendKeys(Password);
//		WebElement loginButton= driver.findElement(By.xpath("//button[@type=\"submit\"]"));	
//		loginButton.click();
//	}
//	
//	@DataProvider(name="login")
//	public Object[][] provideAuthen(){
//	return new Object[][] {
//		{"Afnan","af123",false},
//		{"Admin","admin123",true},
//		{"","",false},
//		{"Admin","",false},
//		{"","admin123",false},
//		{"@@","##",false},
//		
//	};
//	}
	
	@Test
	public void recruitment () throws InterruptedException, ParseException {
		Thread.sleep(1500);
		WebElement usernameField= driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");
		WebElement passwordField= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		passwordField.sendKeys("admin123");
		WebElement loginButton= driver.findElement(By.xpath("//button[@type=\"submit\"]"));	
		loginButton.click();
		
		Thread.sleep(2000);
		WebElement recruitmentButton = driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));
		recruitmentButton.click();
		
		Thread.sleep(1000);
		String QAEngineerXPath="//div[contains(@class,'oxd-select-option')]//span[text()='QA Engineer']";
		WebElement JobTitle = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));  
		JobTitle.click();
		Thread.sleep(1000);
		WebElement qAEngineer = driver.findElement(By.xpath(QAEngineerXPath));  
		qAEngineer.click();
		
		Thread.sleep(1000);
		String SeniorQALeadXPath="//div[contains(@class,'oxd-select-option')]//span[text()='Senior QA Lead']";
		WebElement Vacancy = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));  
		Vacancy.click();
		Thread.sleep(1000);
		WebElement seniorQALead = driver.findElement(By.xpath(SeniorQALeadXPath));  
		seniorQALead.click();
		
		Thread.sleep(1000);
		String RahulPatilXPath="//div[contains(@class,'oxd-select-option')]//span[text()='Rahul Patil']";
		WebElement HiringManager = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[3]"));  
		HiringManager.click();
		Thread.sleep(1000);
		WebElement rahulPatil = driver.findElement(By.xpath(RahulPatilXPath));  
		rahulPatil.click();
		
		Thread.sleep(1000);
		String HiredXPath="//div[contains(@class,'oxd-select-option')]//span[text()='Hired']";
		WebElement Status = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[4]"));  
		Status.click();
		Thread.sleep(1000);
		WebElement hired = driver.findElement(By.xpath(HiredXPath));  
		hired.click();
		
		Thread.sleep(1000); // Consider removing this or using wait logic instead
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// Define XPath for the dropdown option
		String dropdownOptionXPath = "//div[@class='oxd-autocomplete-dropdown']//div[text()='John Doe']";

		// Wait for the candidate name field to be visible and interactable
		WebElement candidateNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//input[@placeholder='Type for hints...']")
		));
		candidateNameField.sendKeys("John");

		// Wait for the dropdown option to be visible
		WebElement dropdownOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath(dropdownOptionXPath)
		));

		// Click the desired option
		dropdownOption.click();

		
		Thread.sleep(1000);
		WebElement Keywords = driver.findElement(By.xpath("//input [@placeholder=\"Enter comma seperated words...\"]"));  
		Keywords.sendKeys("John");
		
		WebElement DateOfApplication = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String format = sdf.format(date);
		DateOfApplication.sendKeys(format);
		driver.switchTo().defaultContent();

		WebElement To = driver.findElement(By.xpath("//input[@placeholder=\"To\"]"));
		String toDateString = "2025-03-24"; 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date toDate = sdf1.parse(toDateString);
		String format1 = sdf1.format(toDate); 
		To.sendKeys(format1);
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		String OnlineXPath="//div[contains(@class,'oxd-select-option')]//span[text()='Online']";
		WebElement MethodOfApplication = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[5]"));  
		MethodOfApplication.click();
		Thread.sleep(1000);
		WebElement online = driver.findElement(By.xpath(OnlineXPath));  
		online.click();
		
		WebElement Search = driver.findElement(By.xpath("(////button[@type=\"submit\"]"));  
		Search.click();

        
		
 }

            

	
//	@DataProvider(name="candidates")
//	public Object[][] provideAuthen(){
//	return new Object[][] {
//		{"Afnan","af123",false},
//		{"Admin","admin123",true},
//		{"","",false},
//		{"Admin","",false},
//		{"","admin123",false},
//		{"@@","##",false},
//		
//	};
//	}

}
