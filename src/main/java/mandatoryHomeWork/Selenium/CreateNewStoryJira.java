package mandatoryHomeWork.Selenium;

import java.time.*;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


public class CreateNewStoryJira {
	
	@Test
	public void test1() throws InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://api-training.atlassian.net/");
		driver.findElement(By.name("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		driver.findElement(By.name("password")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'sc-1p2gpiw-1 ktRddP')]//child::p")).click();
		Thread.sleep(3000);
		WebElement create=driver.findElement(By.xpath("//button[@id='createGlobalItem']"));
		wait.until(ExpectedConditions.elementToBeClickable(create)).click();
		driver.findElement(By.xpath("//label[@id='summary-field-label']//following-sibling::div")).click();
		driver.findElement(By.xpath("//input[@name='summary']")).sendKeys("Benjamin D ticket created");
		driver.findElement(By.xpath("//button[@form='issue-create.ui.modal.create-form']")).click();
		driver.findElement(By.xpath("//a[@data-testid='navigation-apps-sidebar-software-classic.ui.menu.backlog-link']//descendant::span[5]")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search backlog']")).sendKeys("Benjamin D ticket created");
		driver.findElement(By.xpath("//input[@aria-label='Search backlog']")).sendKeys(Keys.ENTER);
		Assert.assertTrue(driver.findElement(By.xpath("//a[@data-testid='issue-field-summary.ui.multiline-inline-summary.ui.read.link-item']//descendant::mark")).getText().equals("Benjamin D ticket created"));
		driver.close();
	}
	
	
	

}
