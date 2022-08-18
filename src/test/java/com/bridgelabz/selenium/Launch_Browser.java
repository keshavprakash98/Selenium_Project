package com.bridgelabz.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Launch_Browser {
	
	//=========launch Browser(1)
	@Test
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("the title of page "+title);
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
		Thread.sleep(2000);
		String sourceCode = driver.getPageSource();
	    System.out.println(sourceCode);

		Thread.sleep(2000);

		////*****Browser Navigations******////
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		String fktitle = driver.getTitle();
		System.out.println("The title of the page is :"+fktitle);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);


		driver.close();
	}
	//
	@Test
	public void login ()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\lenovo\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("keshavprakash1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Keshav@1996");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(2000);
}
	@Test
	public void CreateAccount () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a [text ()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Keshav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Prakash");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("keshavprakash1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("keshavprakash1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Keshav12345");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select select = new Select(day);
		select.selectByVisibleText("21");
		Thread.sleep(2000);
		
	    WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	    Select select1 = new Select(month);
	    select1.selectByVisibleText("Feb");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));        
        Select select2 = new Select(year);
        select2.selectByVisibleText("1998");
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		//driver.close();
		
		
	}
	
	
	@Test
	public void screenshot() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		driver1.findElement(By.name("email")).sendKeys("Keshavprakash1996@gmail.com");
		TakesScreenshot ts = (TakesScreenshot) driver1;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot"+"facebook"+".png");
		FileHandler.copy(srcFile,destFile);
		
		
		
		
	}
	//============mouseAndKeyboardOperation Robot class============
	@Test
	public void mouseAndKeyboardOperation() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("keshavprakash98@gmail.com");
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.mouseMove(300, 400);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F);
		
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_W);
		Thread.sleep(2000);
		driver.close();
	}

	//============ActiTime===========
	@Test
	public void ActiTime() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\lenovo\\OneDrive\\Desktop\\ActiTime");
		Thread.sleep(2000);
	driver.manage().window().maximize();
	    Thread.sleep(2000);
	   
	}
	
	
	
	
	
//==============VerifyFbUserNameAndPasswordFieldsAreAligned_intheSameRow=======	
	
	
	@Test
	public void test() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement unTB = driver.findElement(By.id("email"));
		// get the y-coordinate of username field
		int username_Ycordinate = unTB.getLocation().getY();
		System.out.println(username_Ycordinate);
		WebElement pwdTB = driver.findElement(By.name("pass"));
		// get the y-coordinate of password field
		int password_Ycordinate = pwdTB.getLocation().getY();
		System.out.println(password_Ycordinate);
		//check whether the Y-coordinate of username and password field are same
		if (username_Ycordinate==password_Ycordinate) {
			System.out.println("Both username and password fields are displayed in the same row");
		}else
		{
			System.out.println("username and password fields are NOT aligned in the same row");
		}
	}
	
	
	
	//============VerifyFbUsingUrl===========
	
	@Test
	public  void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("keshavprakash1996@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Keshav@1996");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();//submit()
		Thread.sleep(3000);
		String expectedUrl = "submit";
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.contains(expectedUrl)) {
			System.out.println("Home page is displayed");
		} 
		else{
			System.out.println("Home page is NOT displayed");
		}

	}
	
	
	
	//============VerifyhomepageUsingTitle============
	
	@Test
	public void homepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("keshavprakash1996gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Keshav@1996");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String expectedTitle = "Enter Time";
		String actualTitle = driver.getTitle();
		//If actual title contains "Enter Time" text then home page is displayed.
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Home page is displayed");
		} else{
			System.out.println("Home page is NOT displayed");

		}
	}
	//========= VerifyUserNameAndPasswordAlignment=========	
	
		@Test
		public void loginPageAreAlignedOrNot() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lenovo\\\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

			WebElement unTB = driver.findElement(By.id("email"));
			int un_x = unTB.getLocation().getX();
			int un_width = unTB.getSize().getWidth();
			int un_height = unTB.getSize().getHeight();

			WebElement pwTB = driver.findElement(By.name("pass"));
			int pw_x = pwTB.getLocation().getX();
			int pw_width = pwTB.getSize().getWidth();
			int pw_height = pwTB.getSize().getHeight();

			if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
				System.out.println("Username and password text box are aligned");
			} else {
				System.out.println("Username and password text box are NOT aligned");
			}
			Thread.sleep(4000);
		}
	
	
}
	




