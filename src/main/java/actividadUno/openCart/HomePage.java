package actividadUno.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private By btnMyAccountBY = By.xpath("//span[text()=\"My Account\"]");
    private By btnLoginBY = By.xpath("//a[text()=\"Login\"]");
    private By btnTabletsBY = By.xpath("//a[text()=\"Tablets\"]");
    private By btnLogoutBY = By.xpath("//a[text()=\"Logout\"]");

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getBtnMyAccount(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnMyAccountBY));
    }

    public WebElement getBtnLogin(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnLoginBY));
    }

    public WebElement getBtnTablets(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnTabletsBY));
    }

    public WebElement getBtnLogoutBY(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogoutBY));
    }

    public void clickBtnMyAccount(){

        getBtnMyAccount().click();
    }

    public LoginPage clickBtnLogin(){
        getBtnLogin().click();
        return new LoginPage(driver);
    }

    public TabletsPage clickBtnTablets(){
        getBtnTablets().click();
        return new TabletsPage(driver);
    }

    public void clickBtnLogout(){
        getBtnLogoutBY().click();
    }

}
