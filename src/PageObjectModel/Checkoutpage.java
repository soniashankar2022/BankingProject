package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Checkoutpage {

	public static void main(String[] args) {
		//Readable, Reusable, Maintanable...
		// webdriver init
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		wd.get("https://www.facebook.com/");
		//Login Page
		LoginPage.enterUserName(wd,"Sonia Jayashankar");
		LoginPage.enterPassword(wd,"Zomato@247");
		LoginPage.clickLogin(wd);

	}	
}
