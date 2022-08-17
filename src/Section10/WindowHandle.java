package Section10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://rahulshettyacademy.com/loginpagePractise/");
		wd.findElement(By.className("blinkingText")).click();

		Set<String> window = wd.getWindowHandles();
		Iterator<String> it = window.iterator();

		String parentwindow = it.next();
		String childwindow = it.next();

		wd.switchTo().window(childwindow);
		
		String text=wd.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(text);
		wd.switchTo().window(parentwindow);
		wd.findElement(By.id("username")).sendKeys(text);
}
}