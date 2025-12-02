package actividadDos.SeleniumPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MavenPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By TitleBY = By.xpath("//h1[text()=\"Install a Selenium library\"]");

    public MavenPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(TitleBY)).getText();
    }

}
