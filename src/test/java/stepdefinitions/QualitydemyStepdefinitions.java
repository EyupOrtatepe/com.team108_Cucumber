package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualitydemyStepdefinitions {

    QdPage qdPage = new QdPage();

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String qdUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(qdUrl));
    }
    @Then("login linkine tiklar")
    public void login_linkine_tiklar() {
        qdPage.ilkLoginLinki.click();
    }
    @Then("username olarak {string} girer")
    public void username_olarak_girer(String username) {
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty(username));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
    qdPage.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
    }


    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
       qdPage.ilkLoginLinki.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
      Assert.assertTrue(qdPage.ilkLoginLinki.isDisplayed());
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
    Driver.closeDriver();
    }

    @And("username olarak examples dan {string} girer")
    public void usernameOlarakExamplesDanGirer(String username) {
        qdPage.emailKutusu.sendKeys(username);
    }

    @And("password olarak examples dan{string} girer")
    public void passwordOlarakExamplesDanGirer(String password) {
        qdPage.passwordKutusu.sendKeys(password);
    }
}
