package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	

		public static void enterUserName(WebDriver wd,String username) {

			wd.findElement(By.name("email")).sendKeys(username);
		}

		public static void enterPassword(WebDriver wd, String password) {
			wd.findElement(By.name("pass")).sendKeys(password);
		}

		public static void clickLogin(WebDriver wd) {
			wd.findElement(By.name("login")).submit();

		}
	}


