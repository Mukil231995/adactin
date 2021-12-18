package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefenation.BaseClass;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement selectLocation;
	@FindBy(id="hotels")
	private WebElement selectHotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement numberOfRoom;
	@FindBy(name="datepick_in")
	private WebElement checkInDate;
	@FindBy(name="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement searchButton;
	
	public WebElement getSelectLocation() {
		return selectLocation;
	}
	public WebElement getSelectHotels() {
		return selectHotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNumberOfRoom() {
		return numberOfRoom;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}

}
