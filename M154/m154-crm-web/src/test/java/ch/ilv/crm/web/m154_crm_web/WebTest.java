package ch.ilv.crm.web.m154_crm_web;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTest {

	@Test
	public void testGoogle() {
	System.setProperty("webdriver.chrome.driver", "C:/DEV/M154/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    WebDriver driver=new ChromeDriver(options);
    
    driver.get("http://localhost:7070/");
    
    driver.findElement(By.xpath("//a[contains(text(),'Manage Products')]")).click();
    
    driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Orange");
    driver.findElement(By.xpath("//input[@value='Save']")).click();
    
    driver.findElement(By.xpath("//input[@name='id']")).sendKeys("0");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
 
    boolean ProductID = driver.getPageSource().contains("Id 0");
    boolean Product = driver.getPageSource().contains("Description: Banane");
        
    Assert.assertTrue(ProductID);
    Assert.assertFalse(Product);
    
    driver.close();

	}
}