package Git_Demo_Practice_V1;

public class IELaunch {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	}

}
