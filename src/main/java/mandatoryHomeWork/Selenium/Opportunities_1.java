package mandatoryHomeWork.Selenium;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.util.Date;
import org.asynchttpclient.util.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Opportunities_1 {

	public static void main(String[] args) {

		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("learners@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement opportunities= driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunities);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@id='input-243']")).click();
		driver.findElement(By.xpath("//input[@id='input-243']")).sendKeys("Salesforce Automation by Benjamin D");
		WebElement closeDate = driver.findElement(By.xpath("//input[@id='input-237']"));
		closeDate.click();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		Calendar calender = Calendar.getInstance();
		System.out.println(Calendar.getInstance());
		calender.setTime(date);
		String date1 = dateFormat.format(calender.getTime());
		closeDate.sendKeys(date1);
		driver.findElement(By.xpath("//button[@id='combobox-button-256']")).click();
		driver.findElement(By.xpath("//button[@data-value='Needs Analysis']")).click();
		
		
		
		
		

	}

}
