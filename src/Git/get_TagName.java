package Git;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class get_TagName {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement list =driver.findElement(By.className("_38VF5e"));
		String tagname=list.getTagName();
		System.out.println(tagname);
	}

}
