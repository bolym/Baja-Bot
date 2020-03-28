

import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Baja1 {
	
	
	WebDriver driver;
	JavascriptExecutor jse;
	Scanner reader = new Scanner(System.in);
	String storeNumber;
	String date;
	

	
	public void invokeBrowser(){
		
		try {
			/*
			System.out.println("Hello and Welcome to the BajaBot!");
			System.out.println("Enter the following information from your receipt: ");
			System.out.print("Store Location Number (without the zero): ");
			storeNumber = "0" + reader.nextInt();
			System.out.print("Date in this format -> ##/##/####: ");
			date = "" + reader.next();
			*/
			
			
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pickle\\Downloads\\Selenium\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			//driver = new FirefoxDriver();
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pickle\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions cOptions = new ChromeOptions();
		    cOptions.addArguments("test-type");
		    cOptions.addArguments("start-maximized");
		    cOptions.addArguments("--js-flags=--expose-gc");  
		    cOptions.addArguments("--enable-precise-memory-info"); 
		    cOptions.addArguments("--disable-popup-blocking");
		    cOptions.addArguments("--disable-default-apps"); 
		    cOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		    cOptions.addArguments("disable-infobars");
		    driver = new ChromeDriver(cOptions);
		    
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //was 30
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); //was 30
			
			driver.get("http://www.bajafreshsurvey.com");
			searchCourse();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void searchCourse(){
		try {
			jse = (JavascriptExecutor)driver;
			driver.findElement(By.id("option_240542_103988")).click();	
			jse.executeScript("scroll(0,1000)");		
			driver.findElement(By.id("nextPageLink")).click();
			
			
			driver.findElement(By.id("promptInput_103987")).sendKeys(storeNumber);
			driver.findElement(By.id("nextPageLink")).click();
			
			
			driver.findElement(By.id("option_257161_111884")).click();
			driver.findElement(By.id("nextPageLink")).click();
			
			
			driver.findElement(By.id("promptInput_5850")).sendKeys(date);
			driver.findElement(By.id("nextPageLink")).click();
			
			
			driver.findElement(By.id("option_21414_9557")).click();
			jse.executeScript("scroll(0,1000)");
			driver.findElement(By.id("option_32612_14409")).click();
			driver.findElement(By.id("nextPageLink")).click();
			
			driver.findElement(By.id("option_32592_14398")).click();
			jse.executeScript("scroll(0,1000)");
			driver.findElement(By.id("option_27203_11993")).click();
			driver.findElement(By.id("nextPageLink")).click();
			
			driver.findElement(By.id("option_21418_9559")).click();
			jse.executeScript("scroll(0,1000)");
			driver.findElement(By.id("option_32596_14399")).click();
			driver.findElement(By.id("option_11541_5593")).click();
			jse.executeScript("scroll(0,1000)");
			driver.findElement(By.id("nextPageLink")).click();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//death1
			driver.findElement(By.xpath(".//*[@id='prompt_5602']/div[2]/div/div[1]/div/div/div[1]/label/div/div")).click();
			driver.findElement(By.id("nextPageLink")).click();
			//death2-4
			driver.findElement(By.xpath(".//*[@id='prompt_41959']/div[2]/div/div[1]/div/div/div[1]/label/div/div")).click();
			driver.findElement(By.xpath(".//*[@id='prompt_103597']/div[2]/div/div[1]/div/div/div[1]/label/div/div")).click();
			driver.findElement(By.xpath(".//*[@id='prompt_9576']/div[2]/div/div[1]/div/div/div[1]/label/div/div")).click();
			
			driver.findElement(By.id("nextPageLink")).click();
			//death5-7
			driver.findElement(By.xpath(".//*[@id='prompt_9591']/div[2]/div/div[1]/div/div/div[1]/label/div/div")).click();
			driver.findElement(By.xpath(".//*[@id='prompt_5584']/div[2]/div/div[1]/div/div/div[1]/label/div/div")).click();
			driver.findElement(By.xpath(".//*[@id='prompt_14401']/div[2]/div/div[1]/div/div/div[1]/label/div/div")).click();
			driver.findElement(By.id("nextPageLink")).click();
			
			driver.findElement(By.id("option_11564_5598")).click();
			driver.findElement(By.id("option_11569_5599")).click();
			jse.executeScript("scroll(0,1000)");
			driver.findElement(By.id("nextPageLink")).click();
			
			driver.findElement(By.id("option_37350_16388")).click();
			driver.findElement(By.id("nextPageLink")).click();
			
			Thread.sleep(2000);
			
			jse.executeScript("scroll(0,1000)");
			driver.findElement(By.id("nextPageLink")).click();
			
			jse.executeScript("scroll(0,400)");
			driver.findElement(By.xpath("//input[@type='radio'][@value='21434']")).click();
			driver.findElement(By.xpath("//input[@type='radio'][@value='21431']")).click();
			jse.executeScript("scroll(0,1000)");
			driver.findElement(By.xpath("//input[@type='radio'][@value='21665']")).click();
			driver.findElement(By.id("nextPageLink")).click();
			
			JOptionPane.showMessageDialog(null, "The Discount Code is: " + driver.findElement(By.xpath(".//*[@id='promptText_5852']/div/span/span/span[1]/center[2]/b/font")).getText() + "\n" + "Write this code on your receipt and turn in for a $2 discount!");
			System.out.print("The Discount Code is: ");
			System.out.println(driver.findElement(By.xpath(".//*[@id='promptText_5852']/div/span/span/span[1]/center[2]/b/font")).getText());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	public static void main(String[] args) {
		
		GUI clientWindow = new GUI();
		clientWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clientWindow.setSize(400,500);
		clientWindow.setVisible(true);

		Baja1 myBaja = new Baja1();
		myBaja.invokeBrowser();

	}
	*/

}
