package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepDefinitons {

    HerokuappPage herokuappPage = new HerokuappPage();

    @When("{string} butona basin")
    public void butona_basin(String string) {
        herokuappPage.addElementButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("{string} butonu gorunur oluncaya kadar bekleyin")
    public void butonu_gorunur_oluncaya_kadar_bekleyin(String string) {
        ReusableMethods.waitForVisibility(herokuappPage.deleteButton,5);
    }
    @Then("{string} butonunun gorunur oldugunu test edin")
    public void butonunun_gorunur_oldugunu_test_edin(String string) {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("{string} butonuna basarak butonu silin")
    public void butonuna_basarak_butonu_silin(String string) {
        herokuappPage.deleteButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("{string} butonunun gorunmedigini test edin")
    public void butonunun_gorunmedigini_test_edin(String string) {

        try {
            Assert.assertFalse(herokuappPage.deleteButton.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }
    }
}
