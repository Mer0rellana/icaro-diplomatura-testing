package steps;

import actividadUno.openCart.CartPage;
import actividadUno.openCart.HomePage;
import actividadUno.openCart.LoginPage;
import actividadUno.openCart.TabletsPage;
import driverFactory.driverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class AddProductSteps {

//    @Given("")
//    public void ejemplo(){
//    }

    private WebDriver driver = driverFactory.getDriver();
    private LoginPage loginPage;
    private HomePage homePage;
    private TabletsPage tabletsPage;
    private CartPage cartPage;


    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        driver.get("https://opencart.abstracta.us/");
        homePage = new HomePage(driver);
        new Actions(driver)
                .sendKeys("thisisunsafe")
                .perform();

        homePage.clickBtnMyAccount();
        loginPage = homePage.clickBtnLogin();

        loginPage.fillInputEmail("mer.p.orellana@gmail.com");
        loginPage.fillInputPassword("@BtvwNbWnVBx8d");
        loginPage.clickBtnLogin();
    }

    @When("the user visualizes a chosen product")
    public void theUserVisualizesAChosenProduct() {
        tabletsPage = homePage.clickBtnTablets();
        Assert.assertEquals(tabletsPage.getStringProductTitle(), "Samsung Galaxy Tab 10.1", "The title does not match.");
    }

    @And("the user adds the product to the wishlist")
    public void theUserAddsTheProductToTheWishlist() {
       tabletsPage.clickBtnWishList();
    }

    @Then("a wishlist notification should be displayed")
    public void aWishlistNotificationShouldBeDisplayed() {
        Assert.assertTrue(tabletsPage.getIconSuccessBY().isDisplayed(), "The icon is not visible.");
    }

    @And("the user adds the product to the shopping cart")
    public void theUserAddsTheProductToTheShoppingCart() {
       tabletsPage.clickBtnAddCart();
    }

    @Then("the cart should display the added product")
    public void theCartShouldDisplayTheAddedProduct() {
       cartPage = tabletsPage.clickBtnCart();
       Assert.assertEquals(cartPage.getStringProductTitle(), "Samsung Galaxy Tab 10.1", "The product title does not match.");
    }

}
