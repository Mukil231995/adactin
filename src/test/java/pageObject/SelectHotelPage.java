package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefenation.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy(name="continue")
	private WebElement continueButton;
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}

}
