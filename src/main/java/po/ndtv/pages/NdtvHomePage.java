package po.ndtv.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.Logger;

public class NdtvHomePage {
	
	Logger logger = Logger.getLogger("po.ndtv.pages.NdtvHomePage.class");
	
	
	
	
	@FindBy(xpath = "//a[@id=\"h_sub_menu\"]")
	private WebElement subMenu;
	
	@FindBy(xpath = "//a[.=\"WEATHER\"]")
	private WebElement weather;
	
	
	public NdtvHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	public void clickSubMenu() throws Exception
	{
		
		this.subMenu.click();
	}
	
	public void clickWeatherButton () throws Exception
	{
		
		this.weather.click();
	}
	

}
