package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class WebAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.findElement(By.name("firstName")).sendKeys("Sank");
		driver.findElement(By.name("lastName")).sendKeys("Sank");
		driver.findElement(By.name("phone")).sendKeys("212222");
		driver.findElement(By.name("userName")).sendKeys("s.g@bt.com");
		driver.findElement(By.name("address1")).sendKeys("pune");
		driver.findElement(By.name("address2")).sendKeys("pune");
		driver.findElement(By.name("city")).sendKeys("pune");
		driver.findElement(By.name("state")).sendKeys("pune");
		driver.findElement(By.name("postalCode")).sendKeys("411019");
		driver.findElement(By.id("email")).sendKeys("sgaru");
		driver.findElement(By.name("password")).sendKeys("sgaru");
		driver.findElement(By.name("confirmPassword")).sendKeys("sgaru");
		driver.findElement(By.name("register")).click();
		String title = driver.getTitle();
		Assert.assertEquals("Register: Mercury Tours", title);
		
	}

}
