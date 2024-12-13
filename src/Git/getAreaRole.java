package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class getAreaRole {

	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com/v1/");
		   driver.manage().window().maximize();
			String areaRole=   driver.findElement(By.xpath("(//input[@autocorrect='off'][2])")).getAriaRole();
			System.out.println(areaRole);
			String areaRole2= driver.findElement(By.id("login-button")).getAriaRole();
            System.out.println(areaRole2);
			driver.close();

	}

}
