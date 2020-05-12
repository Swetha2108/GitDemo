package seleniumass.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeBrowser {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
driver.findElement(By.name("username")).sendKeys("tomsmith");
driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
driver.findElement(By.xpath("//button[@class='radius']")).click();
driver.findElement(By.linkText("Logout")).click();

	}

}
