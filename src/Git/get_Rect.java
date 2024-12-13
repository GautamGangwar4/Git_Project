package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

public class get_Rect {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maangal.com/");
		Thread.sleep(5000);
		WebElement abc=driver.findElement(By.className("login-btn"));
		Rectangle rect=abc.getRect();
		System.out.println(rect);
		 System.out.println("X: " + rect.getX());
	        System.out.println("Y: " + rect.getY());
	        System.out.println("Width: " + rect.getWidth());
	        System.out.println("Height: " + rect.getHeight());
	}

}
