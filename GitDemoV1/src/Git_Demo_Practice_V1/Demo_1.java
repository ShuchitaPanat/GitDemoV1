package Git_Demo_Practice_V1;

public class Demo_1 {

	public static void  main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.github.com/");
	}
}
