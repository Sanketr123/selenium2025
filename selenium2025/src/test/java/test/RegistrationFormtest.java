package test;

import org.testng.annotations.Test;

import base.DriverSetup;
import pages.RegistrationForm;

public class RegistrationFormtest extends DriverSetup{
	
	@Test
	public void enterfirstname() throws InterruptedException {
		
		RegistrationForm register = new RegistrationForm(driver);
		
		register.enterUsername("Sanket");
		
		register.dateOfBirth("08-03-2025");
		
		register.upload("C:\\Users\\Sanket Raut\\OneDrive\\Desktop\\index.html.txt");
		
		
		register.selectstate("NCR");
		
		register.openAlertDropdown();
		
		register.Clickonbrowserwindow();
		
		
	}

} // feature branch
