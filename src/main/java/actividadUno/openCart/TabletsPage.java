package actividadUno.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabletsPage {

    private By aProductTitleBY = By.xpath("//h4/a[text()=\"Samsung Galaxy Tab 10.1\"]");
    private By btnWishListBY = By.xpath("(//button/i[@class=\"fa fa-heart\"])[1]");
    private By btnAddCartBY = By.xpath("//button/span[text()=\"Add to Cart\"]");
    private By btnCartBY = By.xpath("//span[text()=\"Shopping Cart\"]");
    private By iconSuccessBY = By.xpath("//div[contains(@class,'alert-success') and contains(.,'Success')]//i\n");

    private WebDriver driver;
    private WebDriverWait wait;

    public TabletsPage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    public WebElement getBtnWishListBY(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnWishListBY));
    }

    public WebElement getBtnCartBY(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnCartBY));
    }

    public WebElement getBtnAddCartBY(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(btnAddCartBY));
    }

    public WebElement getProductTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(aProductTitleBY));
    }

    public WebElement getIconSuccessBY(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(iconSuccessBY));
    }

    public void clickBtnWishList(){
        getBtnWishListBY().click();
    }

    public void clickBtnAddCart(){
        getBtnAddCartBY().click();
    }

    public String getStringProductTitle(){
        return getProductTitle().getText();
    }

    public CartPage clickBtnCart (){
        getBtnCartBY().click();
        return new CartPage(driver);
    }

}
