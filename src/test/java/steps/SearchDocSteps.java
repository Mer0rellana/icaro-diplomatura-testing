package steps;

import actividadDos.SeleniumPage.DownloadPage;
import actividadDos.SeleniumPage.MavenPage;
import actividadDos.SeleniumPage.SeleniumPage;
import driverFactory.driverFactory;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchDocSteps {

    private WebDriver driver = driverFactory.getDriver();
    private SeleniumPage seleniumPage;
    private MavenPage mavenPage;
    private DownloadPage downloadPage;

    @Given("the user access the web page")
    public void theUserAccessTheWebPage() {
        driver.get("https://www.selenium.dev/");
        seleniumPage = new SeleniumPage(driver);
        Assert.assertTrue(seleniumPage.getLogoSelenium().isDisplayed(), "Selenium logo is not visible");
    }

    @When("the user clicks on the search bar")
    public void theUserClicksOnTheSearchBar() {
        seleniumPage.clickSearchBar();
    }

    @And("writes {string} and click on the result")
    public void writesAndClickOnTheResult(String query) {
        seleniumPage.fillSearch("Maven");
        mavenPage = seleniumPage.clickSearchMaven();
    }

    @Then("visualize the title of the desired documentation")
    public void visualizeTheTitleOfTheDesiredDocumentation() {
        Assert.assertEquals(mavenPage.getTitle(), "Install a Selenium library");
    }

    @When("the user clicks on the navbar option Downloads")
    public void theUserClicksOnTheNavbarOptionDownloads() {
        downloadPage = seleniumPage.clickDownloadPage();
    }

    @And("visualize the selenium client")
    public void visualizeTheSeleniumClientJava() {
        Assert.assertEquals(downloadPage.getJavaTitle(), "Selenium Clients and WebDriver Language Bindings");
    }

    @Then("clicks on other languages exist")
    public void clicksOnOtherLanguagesExist() {
        downloadPage.clickLanguages();
    }
}
