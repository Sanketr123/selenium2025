package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationForm {

	private WebDriver driver;

	private By firstname = By.id("name");

	private By datOfBirth = By.cssSelector("input[id='dob']");

	private By upload = By.xpath("//input[@name='picture']");

	private By state = By.id("state");

	private By dropdownalert = By.xpath("//h2[@id='headingThree']");
	
	private By browserwindowlink = By.xpath("//a[@href='browser-windows.php']");

	public RegistrationForm(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String user) throws InterruptedException {
		driver.findElement(firstname).sendKeys(user);
		Thread.sleep(5000);
	}

	public void dateOfBirth(String date) throws InterruptedException {

		driver.findElement(datOfBirth).click();
		driver.findElement(datOfBirth).sendKeys(date);
		Thread.sleep(5000);
	}

	public void upload(String file) throws InterruptedException {

		driver.findElement(upload).sendKeys(file);
		Thread.sleep(5000);
	}

	public void selectstate(String statename) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(state).click();
		Thread.sleep(5000);

		Select states = new Select(driver.findElement(state));
		Thread.sleep(5000);
		// states.selectByVisibleText("NCR");
		states.selectByValue(statename);
		Thread.sleep(5000);
	}
	
	

	 public void openAlertDropdown() throws InterruptedException {
	        driver.findElement(dropdownalert).click();
	        // Wait for navigation to the new page
	        Thread.sleep(5000);
	        
	    }
	 
	 public AlertFrameWindow Clickonbrowserwindow() throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement element = driver.findElement(browserwindowlink);
		 js.executeScript("arguments[0].click();", element);

			//driver.findElement(browserwindowlink).click();
			Thread.sleep(5000);
			
			return new AlertFrameWindow(driver);
		}


}
