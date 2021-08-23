package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddressesPage {
    private final WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/a")
    WebElement createNewAddresses;

    public YourAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createNewAddresses() {
        createNewAddresses.click();
    }
}