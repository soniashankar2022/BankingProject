package Section8;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class stepbystep1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		//To load url;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		//to add items to the cart.
		
		//get css of the all  products
		List <WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

//now we need to iterate through all  the products and find cucumber and then need to click add to cart

	
	for(int i=0;i>product.size();i++)
	
	//to get index out of 30 and to get the text
	{
		String items=product.get(i).getText();
		
		//to get the cart of cucumber
		
		if(items.contains("Cucumber")) {
			
			
			//now to add item to the cart
			
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
			
		}
		
	}
	
		

		



	}

	}

