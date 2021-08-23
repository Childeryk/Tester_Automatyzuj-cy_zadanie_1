package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPage {

    private final WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input")
    WebElement aliasF;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input")
    WebElement addressF;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input")
    WebElement cityF;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input")
    WebElement zipCodeF;

    @FindBy(className = "form-control-select")
    WebElement countryF;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select/option[2]")
    WebElement choseCountry;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input")
    WebElement phoneF;

    @FindBy (css = "button.btn-primary")
    WebElement saveBtn;


    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void newAddress(String alias, String address, String city, String zipCode, String country, String phone) {
        aliasF.sendKeys(alias);
        addressF.sendKeys(address);
        cityF.sendKeys(city);
        zipCodeF.sendKeys(zipCode);
        countryF.click();
        choseCountry.click();
        phoneF.sendKeys(phone);
        saveBtn.click();
    }
}