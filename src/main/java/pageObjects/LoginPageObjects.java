package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPageObjects extends TestBase {
	//only page objects + respective methods
	
	@FindBy(xpath = "//a[@class='sign-in-btn']")
	WebElement sign_in;
	
	@FindBy(id="showDetails")
	WebElement show_details;
	
	@FindBy(xpath ="//a[@class ='link-foreground']")
	WebElement wish;
	
	
	@FindBy(id ="details-button")
	WebElement Advanced;
	
	@FindBy(id = "proceed-link" )
	WebElement Proceed;
	
	
	
	//constructor - to use initElement method
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	//for click on motorcycle link on homepage
	public void clickOnSignIn() throws InterruptedException {
		System.out.println(driver);
		Advanced.click();
	    Proceed.click();	
	    Thread.sleep(5000);
	    sign_in.click();
	    
	}
}
