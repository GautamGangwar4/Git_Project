package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetAccessibleName {

	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com/v1/");
		   driver.manage().window().maximize();
		//String accessibleName=   driver.findElement(By.xpath("(//input[@autocorrect='off'][2])")).getAccessibleName();
		String accessibleName1=   driver.findElement(By.xpath("//input[@class='btn_action']")).getAccessibleName();

		System.out.println(accessibleName1);
		driver.close();
	}

}
