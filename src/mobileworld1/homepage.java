package mobileworld1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {
	   public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.a\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://nam12.safelinks.protection.outlook.com/?url=https%3A%2F%2Fqualicoach.org%2Fmwapp%2Findex.html&data=05%7C01%7Cpranesh.dixit%40qualitestgroup.com%7C2e8bd422c86a439ba82608da99487e0c%7C6be5b754cbd243939dc2d7050d353c69%7C0%7C0%7C637990833884990354%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C3000%7C%7C%7C&sdata=O%2B3pGWwXN0QDqqL2YcyEOBDnZTqVGluKxJtF1n9xEE0%3D&reserved=0");
	        System.out.println(driver.getTitle());
	        
	        driver.findElement(By.className("btn-warning")).click();
	        driver.findElement(By.xpath("/html/body/div/div/div/div/div/p/a")).click();
	   }

}
