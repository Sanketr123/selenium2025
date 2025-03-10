package test;

import org.testng.annotations.Test;

import base.DriverSetup;
import pages.AlertFrameWindow;

public class Alertframewindowtest extends DriverSetup{
	
	@Test
	public void Alerttest() throws InterruptedException {
	AlertFrameWindow AFW = new AlertFrameWindow(driver);
	
	AFW.browserwindow();
	
	AFW.newTabOpen();
	
	}
}
