package amazonpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basepakge.Amazonbase;

public class Amazoncart extends Amazonbase {
	
   public  WebDriver driver;
   
   By addtocart=By.xpath(" //*[@id=\\\"add-to-cart-button\\\"]");
   By cart=By.xpath(" //*[@id=\\\"nav-cart-count-container\\\"]");
   
   By proceedtoby=By.xpath("//*[@id=\\\"sc-buy-box-ptc-button\\\"]/span/input ");
   
   public Amazoncart(WebDriver driver)
   {
	   this.driver=driver;
   }
    
   public void cart()
   {
	   driver.findElement(addtocart).click();
	   driver.findElement(proceedtoby).click();
   }

}
