package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guru99 {
   public Guru99(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//*[.='Accept All']")
    public WebElement cookies;

    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    public WebElement iframe;
}
