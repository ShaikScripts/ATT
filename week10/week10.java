package week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HI\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com/");
		Thread.sleep(2000);
		WebElement createAccount = driver.findElement(By.xpath("(//span[normalize-space()='Create account'])[1]"));
		createAccount.click();
		Thread.sleep(2000);
		WebElement mySelf = driver.findElement(By.xpath("(//span[normalize-space()='for my personal use'])[1]"));
		mySelf.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Shaik");
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Nasreen");
		Thread.sleep(2000);
		WebElement bn1 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		bn1.click();
		Thread.sleep(3000);
		Select month = new Select(driver.findElement(By.xpath("(//select[@id='month'])[1]")));
		month.selectByValue("8");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("(//input[@id='day'])[1]"));
		day.sendKeys("06");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("(//input[@id='year'])[1]"));
		year.sendKeys("2004");
		Select gender = new Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
		gender.selectByValue("1");
		Thread.sleep(2000);
		WebElement bn2 = driver.findElement(By.xpath("()//span[normalize-space()='Next']"));
		bn2.click();
		Thread.sleep(2000);
		WebElement uid = driver.findElement(By.name("Username"));
		uid.sendKeys("hyder001");
		WebElement bn3 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		bn3.click();
		Thread.sleep(2000);
		WebElement pswd = driver.findElement(By.name("Password"));
		pswd.sendKeys("Cmrit123@");
		WebElement cpswd = driver.findElement(By.name("PasswordAgain"));
		cpswd.sendKeys("Cmrit123@");
		WebElement bn4 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
		bn4.click();
		

	}

}
