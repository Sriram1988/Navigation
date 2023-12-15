package firefox_nav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_navigatecommands {

	public static void main(String[] args) {
		System.out.println("firefox browser");
		
		System.setProperty("sriram","\"C:\\Users\\jesus\\Downloads\\Firefox Installer.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/automation-testing");
		//write the navigate commands
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
		
		System.out.println("firefox browser was opened");

	}

}
