package Section10;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/droppable/");

		wd.switchTo().frame(wd.findElement(By.className("demo-frame")));

		Actions a = new Actions(wd);
		WebElement drag = wd.findElement(By.id("draggable"));
		WebElement drop = wd.findElement(By.id("droppable"));

		a.dragAndDrop(drag, drop).build().perform();

	}

}
