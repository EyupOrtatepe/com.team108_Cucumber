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
    public void username_olarak_girer(String qdGecerliUsername) {
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty(qdGecerliUsername));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String qdGecerliPassword) {
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty(qdGecerliPassword));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
    qdPage.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
    Driver.closeDriver();
    }
}
