package mobileworld1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class mobileworld 
{
	 private static final Object True = null;
	 private static final String ActualTitle = null;
	 
	@Test
	 public void test() throws InterruptedException
	 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.a\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://nam12.safelinks.protection.outlook.com/?url=https%3A%2F%2Fqualicoach.org%2Fmwapp%2Findex.html&data=05%7C01%7Cpranesh.dixit%40qualitestgroup.com%7C2e8bd422c86a439ba82608da99487e0c%7C6be5b754cbd243939dc2d7050d353c69%7C0%7C0%7C637990833884990354%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C3000%7C%7C%7C&sdata=O%2B3pGWwXN0QDqqL2YcyEOBDnZTqVGluKxJtF1n9xEE0%3D&reserved=0");
	 driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
     driver.findElement(By.xpath("//a[normalize-space()='Samsung']")).click();
     Thread.sleep(1000);
     driver.get("https://qualicoach.org/mwapp/index.html");
     String ActualTitle = driver.getTitle();
     System.out.println(ActualTitle);
     String ExpectedTitle = "Mobile";
     Assert.assertEquals(ExpectedTitle,ActualTitle );
     Thread.sleep(1000);
     driver.get("https://qualicoach.org/mwapp/index.html#apple");
     String ActualTitle1 = driver.getTitle();
     String ExpectedTitle1 = "Mobile";
     Assert.assertEquals(ActualTitle1, ExpectedTitle1);
     driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Lenovo']")).click();
     try {
     checkLenovo(driver);
     }finally{
    	 driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
     }
     
       Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
     checkapple(driver);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[@class='btn btn-primary '][normalize-space()='More Details'])[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[2]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[3]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[4]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[5]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[6]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[7]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[8]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')][normalize-space()='More Details'])[9]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.className("my-sm-0")).click();
     driver.findElement(By.id("username")).sendKeys("Shalini17101999@gmail.com");
     driver.findElement(By.id("password")).sendKeys("shalma");
     Thread.sleep(1000);
     driver.findElement(By.className("btn")).click();
     driver.findElement(By.xpath("//a[normalize-space()='Terms & Conditions']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[normalize-space()='Support'])[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Order']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[normalize-space()='Support'])[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Contact Us']")).click();
     Thread.sleep(1000);
	 
     }
	@Test
	public void checkLenovo(WebDriver driver) {
	
    String lenovo=driver.getCurrentUrl();
    Assert.assertNotEquals("https://qualicoach.org/mwapp/index.html#lenovo", lenovo);
	}
	@Test
	public void checkapple(WebDriver driver) {
    String apple=driver.getCurrentUrl();
    System.out.println(apple);
    Assert.assertEquals("https://qualicoach.org/mwapp/index.html#apple", apple);  
	}
}


