package seleniumass.pkg;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	public class IeBrowser 
	{
	public static void main(String args[]) throws InterruptedException
					{
				System.setProperty("webdriver.ie.driver","C:\\Users\\DELL\\Downloads\\IEDriverServer_x64_3.141.59\\IEDriverServer.exe");
				WebDriver driver= new InternetExplorerDriver();
				driver.get("https://the-internet.herokuapp.com/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("[//input[@type='submit']")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@class='radius']")).click();
		driver.findElement(By.linkText("Logout")).click();

					}

}

	//input[@type='submit']