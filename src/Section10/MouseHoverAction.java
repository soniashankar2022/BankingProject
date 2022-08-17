package Section10;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
	WebDriver wd	=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.amazon.com/");
	
	Actions a=new Actions(wd);
	a.moveToElement(wd.findElement(By.id("nav-link-accountList"))).build().perform();
	
		
		
	}

}
