package sel2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yt {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("start-maximized");
		WebDriver d = new ChromeDriver(c);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.manage().deleteAllCookies();
		d.get("https://www.youtube.com/watch?v=peQJdVAi0_k");
	}

}
