package steps;

import actividadUno.openCart.HomePage;
import actividadUno.openCart.LoginPage;
import driverFactory.driverFactory;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginSteps {

    private WebDriver driver = driverFactory.getDriver();
    private LoginPage loginPage;
    private HomePage homePage;

    @Given("Access the webpage and go to the login section")
    public void accessTheWebpageAndGoToTheLoginSection() {

        driver.get("https://opencart.abstracta.us/");
        homePage = new HomePage(driver);

        new Actions(driver)
                .sendKeys("thisisunsafe")
                .perform();

        homePage.clickBtnMyAccount();
        loginPage = homePage.clickBtnLogin();
    }

    @When("Enter my email {string} and password {string}")
    public void enterMyEmailAndPassword(String email, String password) {
        loginPage.fillInputEmail(email);
        loginPage.fillInputPassword(password);
    }

    @And("Press the login button")
    public void pressTheLoginButton() {
        loginPage.clickBtnLogin();
    }

    @Then("Logout")
    public void logout() {
        homePage.clickBtnMyAccount();
        homePage.clickBtnLogout();
    }
}
