package Section10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhandleAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://the-internet.herokuapp.com/");

		wd.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		wd.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> windows = wd.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentwindow = it.next();
		String childwindow = it.next();
		wd.switchTo().window(childwindow);

		System.out.println(wd.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		wd.switchTo().window(parentwindow);

		System.out.println(wd.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());

	}
}