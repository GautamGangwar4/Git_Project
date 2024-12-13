package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class getAttribute {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement abc= driver.findElement(By.xpath("(//div[@class='_1ch8e_'])[1]"));
		String ab=abc.getAttribute("class");
		System.out.println(ab);
		
	}

}
