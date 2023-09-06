package basepakge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class Amazonbase {
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("WebDriver.edge.driver","C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs");
		driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
				
	}

}
