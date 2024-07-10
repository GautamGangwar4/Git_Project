package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class get_Text {

	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement search =driver.findElement(By.xpath("(//a[@class='_1krdK5 _3jeYYh'])[1]"));
		String text=search.getText();
		System.out.println(text);

	}

}
