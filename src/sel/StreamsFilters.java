package sel;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class StreamsFilters {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito", "start-maximized");
		WebDriver d = new ChromeDriver(c);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.manage().deleteAllCookies();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		d.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> list1= d.findElements(By.cssSelector("tr td:nth-child(1)"));
		List<WebElement> list2 = list1.stream().filter(s -> s.getText().
				contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(list1.size(), list2.size());
		
	}

}
