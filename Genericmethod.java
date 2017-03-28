package tba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Genericmethod {
	WebDriver driver;

	public Genericmethod(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement bhanu(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found with id :" + type);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("Element found with xpath :" + type);
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("tagname")) {
			System.out.println("Element found with tagname :" + type);
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("name")) {
			System.out.println("Element found with name :" + type);
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("linktext")) {
			System.out.println("Element found with linktext :" + type);
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("cssselector")) {
			System.out.println("Element found with cssSelector :" + type);
			return this.driver.findElement(By.cssSelector(locator));
		}else{
			System.out.println("once check your locator type");
			return null;
		}
	}
}