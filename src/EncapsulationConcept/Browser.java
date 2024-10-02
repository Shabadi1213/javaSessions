package EncapsulationConcept;

public class Browser {

	public void LaunchBrowser() {
		System.out.println("Launching Browser...");
		CheckRAMsize();
		checkBrowserUpdate();
		clearBrwosers();
		System.out.println("Browser launched");
		}
	
	private void CheckRAMsize() {
		System.out.println("CheckRAMsize");
	}
	
	private void checkBrowserUpdate() {
		System.out.println("CheckBrowserUpdate");
	}
	
	private void clearBrwosers() {
		System.out.println("Clear Browsers");
	}

	
		
		
		
	}


