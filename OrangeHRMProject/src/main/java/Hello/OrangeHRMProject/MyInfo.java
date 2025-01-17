package Hello.OrangeHRMProject;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyInfo {
	private WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.Chrome.driver", "D:\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7"); 
		driver.manage().window().maximize();
	}
	
	@Test (dataProvider="personalDetails")
	public void MyInformaion (String firstName, String middelName, String lastName,String employeeID, String otherID, String driverLicense,boolean Expected) throws InterruptedException  {
		Thread.sleep(1500);
		WebElement usernameField= driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");
		WebElement passwordField= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		passwordField.sendKeys("admin123");
		WebElement loginButton= driver.findElement(By.xpath("//button[@type=\"submit\"]"));	
		loginButton.click();
		
		Thread.sleep(3000);
		WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		String currentText = FirstName.getAttribute("value");
        FirstName.click();
        Actions actions = new Actions(driver);
        for (int i = 0; i < currentText.length(); i++) {
            actions.sendKeys("\u0008").perform(); 
        }
        FirstName.sendKeys(firstName);
        
    	Thread.sleep(3000);
		WebElement MiddeltName = driver.findElement(By.xpath("//input[@placeholder=\"Middle Name\"]"));
		String currentText1 = MiddeltName.getAttribute("value");
		MiddeltName.click();
        Actions actions1 = new Actions(driver);
        for (int i = 0; i < currentText1.length(); i++) {
            actions1.sendKeys("\u0008").perform(); 
        }
        MiddeltName.sendKeys(middelName);
        
     	Thread.sleep(3000);
    		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
    		String currentText2 = LastName.getAttribute("value");
    		LastName.click();
            Actions actions2 = new Actions(driver);
            for (int i = 0; i < currentText2.length(); i++) {
                actions2.sendKeys("\u0008").perform(); 
            }
            LastName.sendKeys(lastName);
           
            
            Thread.sleep(3000);
    		WebElement EmployeeID = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
    		String currentText4 = EmployeeID.getAttribute("value");
    		EmployeeID.click();
            Actions actions4 = new Actions(driver);
            for (int i = 0; i < currentText4.length(); i++) {
                actions4.sendKeys("\u0008").perform(); 
            }
            EmployeeID.sendKeys(employeeID); 
            
            Thread.sleep(3000);
    		WebElement OtherID = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
    		String currentText5 = OtherID.getAttribute("value");
    		OtherID.click();
            Actions actions5 =new Actions(driver);
            for (int i = 0; i < currentText5.length(); i++) {
                actions5.sendKeys("\u0008").perform(); 
            }
            OtherID.sendKeys(otherID); 
            
            Thread.sleep(3000);
    		WebElement DriverLicense = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]"));
    		String currentText6 = DriverLicense.getAttribute("value");
    		DriverLicense.click();
            Actions actions6 =new Actions(driver);
            for (int i = 0; i < currentText6.length(); i++) {
                actions6.sendKeys("\u0008").perform(); 
            }
            DriverLicense.sendKeys(driverLicense); 
            
//            Thread.sleep(4000);
//            Date licenseDate = new Date();
//    		WebElement LicenseDate = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[4]"));
//    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
//    		String format = sdf.format(licenseDate);
//    		LicenseDate.sendKeys(format);
//    		driver.switchTo().defaultContent();
//    		
//    		 Thread.sleep(5000);
//     		WebElement sSN = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[5]"));
//     		String currentText7 = sSN.getAttribute("value");
//     		sSN.click();
//             Actions actions7=new Actions(driver);
//             for (int i = 0; i < currentText7.length(); i++) {
//                 actions7.sendKeys("\u0008").perform(); 
//             }
//             sSN.sendKeys(SSN); 
//             
//             Thread.sleep(5000);
//      		WebElement sIN = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[6]"));
//      		String currentText8 = sIN.getAttribute("value");
//      		sIN.click();
//              Actions actions8=new Actions(driver);
//              for (int i = 0; i < currentText8.length(); i++) {
//                  actions8.sendKeys("\u0008").perform(); 
//              }
//              sIN.sendKeys(SIN); 
              
              
//      		Thread.sleep(5000);
//    		String EgyptianXPath="//div[contains(@class,'oxd-select-text')]//div[text()='Egyptian']";
//    		WebElement nationality = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]"));  
//    		nationality.click();
//    		Thread.sleep(2000);
//    		WebElement egyptian = driver.findElement(By.xpath(EgyptianXPath));  
//    		egyptian.click();
    		
    		Thread.sleep(3000);
    		String MarriedXPath="//div[contains(@class,'oxd-select-text')]//div[text()='Married']";
    		WebElement MaritalStatus= driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[2]"));  
    		MaritalStatus.click();
    		Thread.sleep(1000);
    		WebElement married = driver.findElement(By.xpath(MarriedXPath));  
    		married.click();
    		
    		WebElement Save = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
    		Save.click();
    		
//    		WebElement bOD = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[9]"));
//    		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
//    		String format1 = sdf1.format(DOB);
//    		bOD.sendKeys(format1);
//    		driver.switchTo().defaultContent();
    		
    		
//    		Thread.sleep(5000);
//    		WebElement MilitaryService = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[8]"));
//    		String currentText9 = MilitaryService.getAttribute("value");
//    		MilitaryService.click();
//            Actions actions9 = new Actions(driver);
//            for (int i = 0; i < currentText9.length(); i++) {
//                actions9.sendKeys("\u0008").perform(); 
//            }
//            MilitaryService.sendKeys(militaryService);
            
    		
	}
	
	@DataProvider(name="personalDetails")
	public Object[][] personalDetails(){
	return new Object[][] {
		{"Ghaith","Mahmoud","Mahmoud","52","15248","5",true}
		
	};
	}
}
