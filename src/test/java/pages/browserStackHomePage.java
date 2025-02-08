package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class browserStackHomePage {
	WebDriver driver;
	@FindBy(xpath = "//h1")
	WebElement Header;
	@FindBy(xpath = "//*[@id='signupModalButton']")
	WebElement getStarted;
    @FindBy(tagName = "a") 
    List<WebElement> links;
    
	public browserStackHomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public void veryHeader() {
	String getheadertext = Header.getText();
	assertEquals("App & Browser Testing Made Easy", getheadertext);
	}
	public void clickOnGetStarted() {
	getStarted.click();
	}
}
