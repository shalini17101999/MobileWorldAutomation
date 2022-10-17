package mobileworld1;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Signup 
{
	   @Test
	   public void test() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\shalini.a\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get(" https://nam12.safelinks.protection.outlook.com/?url=https%3A%2F%2Fqualicoach.org%2Fmwapp%2Findex.html&data=05%7C01%7Cpranesh.dixit%40qualitestgroup.com%7C2e8bd422c86a439ba82608da99487e0c%7C6be5b754cbd243939dc2d7050d353c69%7C0%7C0%7C637990833884990354%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C3000%7C%7C%7C&sdata=O%2B3pGWwXN0QDqqL2YcyEOBDnZTqVGluKxJtF1n9xEE0%3D&reserved=0");
		   System.out.println(driver.getTitle());
		   driver.findElement(By.className("btn-warning")).click();
	       driver.findElement(By.cssSelector("body > div > div > div > div > div > p > a")).click();
	       driver.findElement(By.cssSelector("input[type='text']")).sendKeys("shalini");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(4) > div:nth-child(3) > input")).sendKeys("Arumugam");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(6) > div.col-md-10 > input:nth-child(1)\r\n"+ "")).sendKeys("shalini17101999@gmail.com");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(6) > div.col-md-10 > input:nth-child(3)")).sendKeys("Shalinia@");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(9) > div.col-md-5 > input\r\n")).sendKeys("05/07/1999");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(9) > div.col-md-3 > input[type=radio]")).click();
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(12) > div.col-md-10 > input")).sendKeys("9876543321");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(14) > div.col-md-10 > textarea")).sendKeys("Qualitest vision is to become the most trusted and modern quality engineering partner");
	       driver.findElement(By.className("btn-info")).click();
}
	   }
