package Section8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class stepbystep2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// to create expected array

		String[] names = { "Cucumber", "Brocolli" };

		// To load url;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(8000);
		// to add items to the cart.

		int j = 0;
		// get css of the all products
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

//now we need to iterate through all  the products and find cucumber and then need to click add to cart

		for (int i = 0; i > product.size(); i++)

		{

			// to get index out of 30 and to get the text

			// now we are checking whether the name extracted is present in array list or
			// not
			// for that we need to convert array into arraylist

			{
				String[] items = product.get(i).getText().split("-");
				String formattedname = items[0].trim();

				// to get the cart of cucumber
				List itemneeded = Arrays.asList(names);

				if (itemneeded.contains(formattedname)) {
					j++;

					// now to add item to the cart

					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

					if (j == names.length) {
						break;
					}
				}

			}

		}

	}
}