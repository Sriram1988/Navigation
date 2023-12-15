package chromebrowser_nav2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_browsernavigatecommands {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("Chrome browser navigate commands");
	System.setProperty("sriram", "\"C:\\Users\\jesus\\Downloads\\chromedriver-win32\\chromedriver-win32\"");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	Thread.sleep(3000);
	
	String text =driver.findElement(By.id("Hobbies")).getText();
	
	System.out.println(text);

	

	}

}
