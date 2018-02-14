package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	WebDriver driver ; 	
	public final WebElement sportsLink = driver.findElement(By.xpath("//a[contains(text(),'SPORTS')]"));
	public final WebElement moviesLink = driver.findElement(By.xpath("//a[contains(text(),'MOVIES')]"));
	
	public void clickSports() {
			sportsLink.click();
	}
	
	public void clickMovies() {
		moviesLink.click();
}
}
