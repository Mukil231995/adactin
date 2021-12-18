package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefenation.BaseClass;

public class BookingPage extends BaseClass{
	
	public BookingPage() {
     PageFactory.initElements(driver, this);
	}
    @FindBy(name="first_name")
	private WebElement firstName;
    @FindBy(name="last_name")
    private WebElement lastName;
    @FindBy(name="address")
    private WebElement billingAddress;
    @FindBy(name="cc_num")
    private WebElement cardNo;
    @FindBy(id="cc_type")
    private WebElement cardType;
    @FindBy(id="cc_exp_month")
    private WebElement expiryMonth;
    @FindBy(id="cc_exp_year")
    private WebElement expiryYear;
    @FindBy(id="cc_cvv")
    private WebElement cvv;
    @FindBy(id="book_now")
    
    private WebElement bookButton;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookButton() {
		return bookButton;
	}
}
