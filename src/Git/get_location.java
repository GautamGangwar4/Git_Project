package Git;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class get_location {

	public static void main(String[] args) throws Exception{
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maangal.com/");
		Thread.sleep(5000);
		WebElement abc=driver.findElement(By.className("login-btn"));
		Point loc=abc.getLocation();
		System.out.println(loc);

	}

}
