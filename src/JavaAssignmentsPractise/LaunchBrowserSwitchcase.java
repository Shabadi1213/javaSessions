package JavaAssignmentsPractise;

public class LaunchBrowserSwitchcase {

	public static void main(String[] args) {

     String Browser = "Safari";
     switch (Browser.toLowerCase().trim()) {
     case "chrome":
    	 System.out.println(""+ Browser + " " + "browser is launched");
    	 break;
     case "firefox":
    	 System.out.println(""+ Browser + " " + "browser is launched");
         break;
     case "ie":
    	 System.out.println(""+ Browser + " " + "browser is launched");
    	 break;
     case "safari":
    	 System.out.println(""+ Browser + " " + "browser is launched");
    	 break;
     default:
    	 System.out.println("Please pass the correct browser name :"+ Browser);
     }

	}

}
