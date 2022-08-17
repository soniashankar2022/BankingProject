package Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;

public class dropdownstatic {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("Sonia");
		driver.findElement(By.name("email")).sendKeys("Sonia214@gmail.com");
		driver.findElement(By.className("form-control")).sendKeys("Sony12345");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement box = driver.findElement(By.id("exampleFormControlSelect1"));
		Select s = new Select(box);
		s.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio2")).click();

		driver.findElement(By.cssSelector("input[type='date'] ")).sendKeys("1997-11-10");

		driver.findElement(By.xpath("//input[@type='submit'] ")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	}
}
