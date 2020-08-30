package po.ndtv.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.Logger;


public class WeatherPage {
	
	Logger logger = Logger.getLogger("po.ndtv.pages.WeatherPage.class");
	
	
	@FindBy(xpath = "//input[@id=\"Ahmedabad\"]")
	private WebElement cityCheckbox; // for Ahmedabad city
	
	@FindBy(xpath = "//*[@id=\"map_canvas\"]//div[@title=\"Ahmedabad\"]")
	private WebElement mapCity; // city marking on the map
	
	
	@FindBy(xpath = "//*[@id=\"map_canvas\"]//b[contains (text(),'Temp in Degrees:')]")
	private WebElement mapCityDialog; //temperature in the dialog box

	
	
	public WeatherPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	public void clickCityCheckbox() throws Exception
	{
		this.cityCheckbox.click();
	}
	
	public void clickMapCity() throws Exception
	{
		
		this.mapCity.click();
	}
	
	public int getTemperature() throws Exception
	{
		int temp = Integer.parseInt(this.mapCityDialog.getText().substring(16));
		return temp;
		
	}
	
}
