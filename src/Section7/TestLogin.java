package Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/* Register with mail id */
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("/html/body/div[4]/ol/li[1]/a")).click();
		driver.findElement(By.name("emailid")).sendKeys("soniajnaidu1011@gmail.com");
		driver.findElement(By.name("btnLogin")).click();

		/* Get the generated user id and password */
		WebElement usertext = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]"));
		String user_str = usertext.getText();
		WebElement pswd = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]"));
		String pwd_str = pswd.getText();

		/* Login using generated user id and password */
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys(user_str);
		driver.findElement(By.name("password")).sendKeys(pwd_str);
		driver.findElement(By.name("btnLogin")).click();
	}

}
