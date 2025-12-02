package actividadDos.SeleniumPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By LogoBY = By.cssSelector("svg#Layer_1");
    private By SearchBarBY = By.cssSelector("button.DocSearch-Button");
    private By SearchInputBY = By.cssSelector("input.DocSearch-Input");
    private By SearchMavenBY = By.xpath("//mark[text()=\"Maven\"]");
    private By DownloadBY = By.xpath("//a/span[text()=\"Downloads\"]");

    public SeleniumPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getLogoSelenium(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(LogoBY));
    }

    public void clickSearchBar(){
        wait.until(ExpectedConditions.elementToBeClickable(SearchBarBY)).click();
    }

    public void fillSearch(String query){
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(SearchInputBY));
        input.sendKeys(query);
    }

    public WebElement getSearchMaven(){
        return wait.until(ExpectedConditions.elementToBeClickable(SearchMavenBY));
    }

    public WebElement getDownloads(){
        return wait.until(ExpectedConditions.elementToBeClickable(DownloadBY));
    }


    public MavenPage clickSearchMaven(){
        getSearchMaven().click();
        return new MavenPage(driver);
    }

    public DownloadPage clickDownloadPage(){
        getDownloads().click();
        return new DownloadPage(driver);
    }

}
