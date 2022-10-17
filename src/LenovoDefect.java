import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LenovoDefect {
	
	
	 @Test
	public void lenovo() {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.a\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qualicoach.org/mwapp/index.html");
		 driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Lenovo']")).click();
	     try {
	    	 String lenovo=driver.getCurrentUrl();
	    	    Assert.assertEquals("https://qualicoach.org/mwapp/index.html#lenovo", lenovo);
	     }finally{
	    	 driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
	     }
//       driver.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
//	     String apple=driver.getCurrentUrl();
// 	    Assert.assertEquals("https://qualicoach.org/mwapp/index.html#apple", apple);
 	   driver.close();

	}
	@Test
	public void apple() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.a\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qualicoach.org/mwapp/index.html");
    
    driver.findElement(By.xpath("(//a[normalize-space()='Latest'])[1]")).click();
     
     driver.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
     String apple=driver.getCurrentUrl();
	    Assert.assertEquals("https://qualicoach.org/mwapp/index.html#apple", apple);
	    //driver.quit();
	}
	
	 }
