package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginPageMap extends BasePage {
    public LoginPageMap(WebDriver driver) {
        super(driver);


    }
    @FindBy(css = "a[href=\"/login\"]")
    WebElement loginBtn;

    @FindBy (css = "[name='name']")
    WebElement nameField;

    @FindBy (css = "[data-qa='signup-email']")
    WebElement emailField;

    @FindBy (css = "[data-qa='signup-button']")
    WebElement singUpBtn;

    @FindBy(id="id_gender1")
    WebElement genderBtn;

    @FindBy (id="password")
    WebElement passwordField;

    @FindBy(id="first_name")
    WebElement firstNameField;

    @FindBy(id="last_name")
    WebElement lastNameField;

    @FindBy(id="company")
    WebElement companyField;

    @FindBy(id="address1")
    WebElement addressField;

    @FindBy(id="state")
    WebElement stateField;

    @FindBy(id="city")
    WebElement cityField;

    @FindBy(id="zipcode")
    WebElement zipcodeField;

    @FindBy(id="mobile_number")
    WebElement mobileNumberField;

    @FindBy (css = "[data-qa='create-account']")
    WebElement createAccountBtn;

    @FindBy(xpath = "//*[@id='form']//form/p")
    WebElement emailErrorMessage;


    public WebElement getloginBtn() {
        return loginBtn;
    }

    public WebElement getSingUpBtn() {
        return singUpBtn;
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getGenderBtn() {
        return genderBtn;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getCompanyField() {
        return companyField;
    }

    public WebElement getAddressField() {
        return addressField;
    }

    public WebElement getStateField() {
        return stateField;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getZipCodeField() {
        return zipcodeField;
    }

    public WebElement getMobileNumberField() {
        return mobileNumberField;
    }

    public WebElement getCreateAccountBtn() {
        return createAccountBtn;
    }

    public WebElement getemailErrorMessage() {
        return emailErrorMessage;
    }
}
