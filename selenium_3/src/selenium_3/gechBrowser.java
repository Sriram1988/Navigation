package selenium_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gechBrowser {

	public static void main(String[] args) {
		System.out.println("welcome to gechoBrowser");
		System.setProperty("sriram","\"C:\\Users\\jesus\\Downloads\\Firefox Installer.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/dowloads/");
		
		System.out.println("Mozila browser was opened");
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.close();
	}

}
