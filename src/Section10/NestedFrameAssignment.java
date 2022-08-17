package Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://the-internet.herokuapp.com/");

		wd.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		wd.switchTo().frame("frame-top");

		wd.switchTo().frame("frame-middle");

		System.out.println(wd.findElement(By.id("content")).getText());

	}

}
