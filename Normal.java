package tba;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Normal {
	private WebDriver driver;
	private Genericmethod gg;
	public WebElement bb;

	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		gg = new Genericmethod(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letskodeit.teachable.com/");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void beforem() {
		bb = gg.bhanu("Practiceo", "linkText");
	}

	@Test
	public void main() {
		WebElement bc = gg.bhanu(".//*[@id='bmwradio']", " xpath");
		bc.click();

	}

	@AfterTest
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
