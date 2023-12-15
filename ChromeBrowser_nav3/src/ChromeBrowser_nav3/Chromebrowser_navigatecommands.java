package ChromeBrowser_nav3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser_navigatecommands {

	public static void main(String[] args) {
		System.out.println("navigate commands");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		
	//	System.out.println(driver.findElement(By.id("checkbox2")).isSelected());
	//	driver.quit();
		driver.navigate().to("https://nxtgenaiacademy.com/demo-site/");
		driver.close();

	}

	
	}


