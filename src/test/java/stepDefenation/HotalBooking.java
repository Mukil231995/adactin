package stepDefenation;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.BookingPage;
import pageObject.LogIn;
import pageObject.SearchHotelPage;
import pageObject.SelectHotelPage;

public class HotalBooking extends BaseClass{
	
	@Given("Enter the url for Adactin")
	public void enter_the_url_for_Adactin() {
		
		getUrl("https://adactinhotelapp.com/");
	}

	@When("user enter the {string} and {string}")
	public void user_enter_the_and(String arg1, String arg2) {
		LogIn log=new LogIn();
		
		entryText(log.getUsername(), arg1);
		entryText(log.getPassword(), arg2);
	}

	@When("Click the login button")
	public void click_the_login_button() {
		
		LogIn log=new LogIn();
		
		click(log.getLogInButton());
	}
	@When("user go to search hotel page")
	public void user_go_to_search_hotel_page() {
		System.out.println("Search Hotel page");
	}

	@When("select the location")
	public void select_the_location() {
		SearchHotelPage hotel=new SearchHotelPage();
		dropDown( hotel.getSelectLocation(), 5);
	}

	@When("select the hotel")
	public void select_the_hotel() {
		SearchHotelPage hotel=new SearchHotelPage();
		dropDown(hotel.getSelectHotels(), 2);
		
	}
	@When("select the room type")
	public void select_the_room_type() {
		SearchHotelPage hotel=new SearchHotelPage();
		dropDown(hotel.getRoomType(), 1);
		
	}

	@When("select Number of room")
	public void select_Number_of_room() {
		SearchHotelPage hotel=new SearchHotelPage();
		dropDown(hotel.getNumberOfRoom(), 1);
	}

	@When("enter the check in and check out date")
	public void enter_the_check_in_and_check_out_date() {
		SearchHotelPage hotel=new SearchHotelPage();
        hotel.getCheckInDate().clear();
		entryText(hotel.getCheckInDate(),"23/12/2021");
		hotel.getCheckOutDate().clear();
		entryText(hotel.getCheckOutDate(),"26/12/2021");
	}
	@When("select the number of adult per room")
	public void select_the_number_of_adult_per_room() {
		SearchHotelPage hotel=new SearchHotelPage();
		dropDown(hotel.getAdult(), 1);
	}

	@When("select the number of child per room")
	public void select_the_number_of_child_per_room() {
		SearchHotelPage hotel=new SearchHotelPage();
		dropDown(hotel.getChild(), 1);
	}

	@Then("click the search button")
	public void click_the_search_button() {
		SearchHotelPage hotel=new SearchHotelPage();
		click(hotel.getSearchButton());
	}
	@When("user go to the select hotel page")
	public void user_go_to_the_select_hotel_page() {
		
		System.out.println("Select Hotel Page");
	}

	@When("click radio button of the hotel")
	public void click_radio_button_of_the_hotel() {
		SelectHotelPage select=new SelectHotelPage();
		click(select.getRadioButton());
	}

	@When("click continue button")
	public void click_continue_button() {
		SelectHotelPage select=new SelectHotelPage();
		click(select.getContinueButton());
	}

	@Then("User go to the booking page")
	public void user_go_to_the_booking_page() {
		
		System.out.println("Booking Page");
	}
	@When("user enter the first and last name")
	public void user_enter_the_first_and_last_name() throws IOException {
		
		BookingPage book=new BookingPage();
		entryText(book.getFirstName(), readFromExcel(0, 0));
		entryText(book.getLastName(), readFromExcel(1, 0));
	}

	@Then("User enter the address")
	public void user_enter_the_address() throws IOException {
		BookingPage book=new BookingPage();
		entryText(book.getBillingAddress(), readFromExcel(2, 0));
	}

	@Then("enter the card number and card type")
	public void enter_the_card_number_and_card_type() throws IOException {
		BookingPage book=new BookingPage();
		entryText(book.getCardNo(), readFromExcel(4, 0));
		dropDown(book.getCardType(), 2);
	}

	@Then("select month and year of card expiry")
	public void select_month_and_year_of_card_expiry() {
		BookingPage book=new BookingPage();
		dropDown(book.getExpiryMonth(), 12);
		dropDown(book.getExpiryYear(), 12);
	}

	@Then("enter cvv number")
	public void enter_cvv_number() throws IOException {
		BookingPage book=new BookingPage();
		entryText(book.getCvv(), readFromExcel(3, 0));
	}

	@Then("Click the booknow button")
	public void click_the_booknow_button() {
		BookingPage book=new BookingPage();
		click(book.getBookButton());
	}





}
