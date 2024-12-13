package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class getCssValue {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement abc= driver.findElement(By.cssSelector("#container > div > div.q8WwEU > div > div > div > div > div:nth-child(1) > div > div.css-175oi2r.r-13awgt0.r-1iqfa7g.r-60vfwk > div > div.yAlKeh > div._2L0uxW > div > div:nth-child(1) > div > div > div > div > div._3sdu8W.emupdz > div:nth-child(3) > div > div > div > div > img"));
		String ab=abc.getCssValue("width");
		System.out.println(ab);

	}

}
