package amazonpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basepakge.Amazonbase;

public class Amazonserch extends Amazonbase{
	
	WebDriver driver;
	
	By serch=By.xpath("//*[@id=\"twotabsearchtextbox\"] ");
	By  item=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[9]/div/div/div/div/div[2]/div[2]/h2/a");
	public Amazonserch(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void search(String mobiles)
	{
		driver.findElement(serch).sendKeys(mobiles);
	    
	}
	public void select()
	{
		driver.findElement(item).click();
		
	}

}
