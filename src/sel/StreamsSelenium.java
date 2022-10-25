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

public class StreamsSelenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Java\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito", "start-maximized");
		WebDriver d = new ChromeDriver(c);
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column

		d.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into list

		List<WebElement> elementsList = d.findElements(By.xpath("//tr/td[1]"));

		// capture text of all webelements into new(original) list

		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on the original list of step 3 -> sorted list

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list

		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;

		// scan the name column with getText ->Beans->print the price of the Rice
		do {
			List<WebElement> rows = d.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());

			price.forEach(a -> System.out.println("price of rice is " + a));
			if (price.size() < 1) {
				d.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getPriceVeggie(WebElement s) {

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return pricevalue;

	}

}
