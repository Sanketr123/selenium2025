package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

	public RegistrationForm(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String user) {
		driver.findElement(firstname).sendKeys(user);
	}

	public void dateOfBirth(String date) {

		driver.findElement(datOfBirth).click();
		driver.findElement(datOfBirth).sendKeys(date);
	}

	public void upload(String file) {

		driver.findElement(upload).sendKeys(file);
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

	 public AlertFrameWindow openAlertDropdown() {
	        driver.findElement(dropdownalert).click();
	        // Wait for navigation to the new page
	        new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.urlContains("browser-windows.php"));
	        return new AlertFrameWindow(driver);
	    }


}
