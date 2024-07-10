package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class get_Size {

	public static void main(String[] args)throws Exception{
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement elect =driver.findElement(By.xpath("(//div[@class='_3ETuFY'])[4]"));
		Dimension size=elect.getSize();
		System.out.println(size);
		

	}

}
