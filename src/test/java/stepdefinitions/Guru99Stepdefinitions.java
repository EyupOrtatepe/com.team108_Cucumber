package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Guru99;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Guru99Stepdefinitions {
Actions actions =new Actions(Driver.getDriver());
    Guru99 guru99 = new Guru99();

    @Then("sayfayi yeniler")
    public void sayfayi_yeniler() {
       Driver.getDriver().navigate().refresh();
        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }


    @And("cookies i kapat")
    public void cookiesIKapat() {

        Driver.getDriver().switchTo().frame(guru99.iframe);
        guru99.cookies.click();
    }
}
