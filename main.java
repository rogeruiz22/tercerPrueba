import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstTest {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/rogerruiz/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

	public static void main(String[] args) {
		SeleniumFirstTest prueba = new SeleniumFirstTest();
		prueba.launchBrowser();
	}

}
