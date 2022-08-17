package sction9;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentforwait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver wd =new ChromeDriver();
	    wd.manage().window().maximize();
	  
	    wd.get("https://rahulshettyacademy.com/loginpagePractise/");
	    
	    wd.findElement(By.name("username")).sendKeys("rahulshettyacademy");
	    wd.findElement(By.id("password")).sendKeys("learning");
	    wd.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
	    WebDriverWait wait = new WebDriverWait(wd, Duration.ofMillis(7000));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

	    wd.findElement(By.id("okayBtn")).click();
	    
	    
	  WebElement dropdown=  wd.findElement(By.xpath("//select[@class='form-control']"));
	    Select s=new Select(dropdown);
	    s.selectByVisibleText("Consultant");
		
     wd.findElement(By.id("terms")).click();
     wd.findElement(By.name("signin")).click();  
     
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
     
    List <WebElement> product=wd.findElements(By.cssSelector(".card-footer .btn-info"));
    for(int i=0;i>product.size();i++) {
    	
    	String items=product.get(i).getText();
    	product.get(i).click();

    }

wd.findElement(By.partialLinkText("Checkout")).click();}






		
    }
    
   
