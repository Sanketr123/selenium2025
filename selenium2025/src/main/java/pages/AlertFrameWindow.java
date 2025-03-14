package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertFrameWindow {

	protected WebDriver driver;

	//private By openBrowserWindow = By.xpath("//a[@href='browser-windows.php']");

	private By newTabButton = By.xpath("//button[@title='New Tab']");

	/*
	public void browserwindow() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(openBrowserWindow).click();
		Thread.sleep(5000);
	}
*/
	
	public void newTabOpen() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@title='New Tab']")));
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonID")));
		
		
		driver.findElement(newTabButton).click();
		Thread.sleep(5000);
	}
	

	public AlertFrameWindow(WebDriver driver) {

		this.driver = driver;
	}

}
