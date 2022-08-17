package section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://rahulshettyacademy.com/AutomationPractice/");

		// to get links in the wholepage

		System.out.println(wd.findElements(By.tagName("a")).size());

		// now to get links only in the footer section

		WebElement footersection = wd.findElement(By.id("gf-BIG"));
		System.out.println(footersection.findElements(By.tagName("a")).size());

		// only to get specific column link in the footer section.
		WebElement columnlink = wd.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
		System.out.println(columnlink.findElements(By.tagName("a")).size());

		// to click on each link in the column to see if the page is opening

		for (int i = 1; i < columnlink.findElements(By.tagName("a")).size(); i++) {
			String ops = Keys.chord(Keys.ENTER.CONTROL, Keys.ENTER);
			columnlink.findElements(By.tagName("a")).get(i).sendKeys(ops);
		}

		Set<String> abcd = wd.getWindowHandles();
		Iterator it = abcd.iterator();

		// to check whteher the idex link is present or not
		while (it.hasNext()) {
			// to switch to another window

			wd.switchTo().window((String) it.next());
			System.out.println(wd.getTitle());

		}
	}

}
