package pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Zadanie1Steps {

    WebDriver driver;

    @Given("jako zarejestrowany użytkownik loguję się na stronę sklepu")
    public void openWebSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");

        MainPage mainPage = new MainPage(driver);
        mainPage.signInBtn();

        LogInToYourAccountPage logInToYourAccountPage = new LogInToYourAccountPage(driver);
        logInToYourAccountPage.login("qtvfczcdxwwmrnpitf@tbbyt.net", "Hasło123");

    }

    @When("Kiedy jestem na stronie z moimi koncie, dodaję nowy adres do konta")
    public void createNewAddressBtn() {

        YourAccountPage yourAccount = new YourAccountPage(driver);
        yourAccount.adresses.click();


        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.createNewAddresses();

    }

    @And("wypełniam formularz danymi: alias (.*) adres (.*) city (.*) zip/postal code (.*) country (.*) phone (.*)")
    public void alias(String alias, String address, String city, String zipCode, String country, String phone) {

        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.newAddress(alias, address, city, zipCode, country, phone);

    }

    @Then("sprawdzam czy informacje są dodane")
    public void checkData() {

        List<WebElement> addresses = driver.findElements(By.xpath("//*[text()='One']"));
        Assert.assertTrue(addresses.size() > 0);

        driver.quit();

    }
}