package amazontest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import amazonpages.Amazoncart;
import amazonpages.Amazonserch;
import basepakge.Amazonbase;

public class Amazonpagetest extends Amazonbase{
	
	WebDriver driver;
	
	
	@Test
	public void test()
	{
		Amazonserch ob=new Amazonserch(driver);
		ob.search("mobiles");
		driver.navigate().to(" https://www.amazon.ae/cart/smart-wagon?newItems=6bce67af-4020-4806-a1d3-7ad7b757bbf9,4&ref_=sw_refresh");
		Amazoncart ac=new Amazoncart(driver);
		ac.cart();
	}

}
