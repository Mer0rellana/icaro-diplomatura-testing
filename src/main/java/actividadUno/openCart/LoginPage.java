package actividadUno.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By inputEmail = By.name("email");
    private By inputPassword = By.name("password");
    private By btnLogin = By.xpath("//input[@value=\"Login\"]");

    public LoginPage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getInputEmail(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
    }

    public WebElement getInputPassword(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassword));
    }

    public WebElement getBtnLogin(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogin));
    }

    public void fillInputEmail(String email){
        getInputEmail().sendKeys(email);
    }
    public void fillInputPassword(String pass){
        getInputPassword().sendKeys(pass);
    }

    public void clickBtnLogin(){
        getBtnLogin().click();
    }
}
