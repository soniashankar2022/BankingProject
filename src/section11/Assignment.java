package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://rahulshettyacademy.com/AutomationPractice/");

		Thread.sleep(5000);

		// to click the checkbox

		// wd.findElement(By.name("checkBoxOption1")).click();

		WebElement box = wd.findElement(By.name("checkBoxOption1"));
		box.click();

		Assert.assertTrue(wd.findElement(By.name("checkBoxOption1")).isSelected());
		// to get text of the checbox
		String check = wd.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();

		// dropdown
		WebElement dropdown = wd.findElement(By.id("dropdown-class-example"));

		Select s = new Select(dropdown);
		s.selectByVisibleText(check);

		// to handle alertbox
		
		wd.findElement(By.id("name")).sendKeys(check);
		//to click alertbtn
		
		wd.findElement(By.id("alertbtn")).click();
		String alerts=wd.switchTo().alert().getText();
		
		if(alerts.contains(check))
		{
			System.out.println("success");
		}
			else {
				System.out.println("not success");
			}
			
		}
		
		

	

}
