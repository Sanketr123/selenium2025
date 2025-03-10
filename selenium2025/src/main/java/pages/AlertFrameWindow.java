package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertFrameWindow {

	protected WebDriver driver;

	private By openBrowserWindow = By.xpath("//a[@href='browser-windows.php']");

	private By newTabButton = By.xpath("//button[@title='New Tab']");

	public void browserwindow() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(openBrowserWindow).click();
		Thread.sleep(5000);
	}

	public void newTabOpen() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(newTabButton).click();
		Thread.sleep(5000);
	}

	public AlertFrameWindow(WebDriver driver) {

		this.driver = driver;
	}

}
