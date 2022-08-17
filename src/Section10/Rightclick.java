package Section10;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
	WebDriver wd	=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.amazon.com/");
	
	Actions a=new Actions(wd);
	
	WebElement action=wd.findElement(By.id("nav-link-accountList"));
	
	
	a.moveToElement(wd.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick(). build().perform();	
	a.moveToElement(action).contextClick().  build(). perform();	
	}

}
