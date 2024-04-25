package pages;

import map.LoginPageMap;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.ResourceBundle;

public class LoginPage extends LoginPageMap {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public static ResourceBundle rb = ResourceBundle.getBundle("config");

    public void loginBtnClick(){
        getloginBtn().click();
    }

    public void singUpBtnClick(){
        getSingUpBtn().click();
    }

    public void fillNameField(String s){
        getNameField().sendKeys(s);
    }

    public void fillEmailField(String s){
        getEmailField().sendKeys(s);
    }

    public void genderBtnClick(){
        getGenderBtn().click();
    }

    public void fillPasswordField(String s){
        getPasswordField().sendKeys(s);
    }

    public void selectDayValue(String s){
        selectOption("[name="+"days"+"]", s);
    }

    public void selectMonthValue(String s) {
        selectOption("[data-qa=\"months\"]", s);
    }
    public void selectYearValue(String s) {
        selectOption("[data-qa=\"years\"]", s);
    }

    public void selectCountryValue(String s){
        selectOption("[data-qa=\"country\"]", s);
    }

    public void fillFirstNameField(String s){
        getFirstNameField().sendKeys(s);
    }

    public void fillLastNameField(String s){
        getLastNameField().sendKeys(s);
    }

    public void fillCompanyField(String s){
        getCompanyField().sendKeys(s);
    }

    public void fillAddressField(String s){
        getAddressField().sendKeys(s);
    }

    public void fillStateField(String s){
        getStateField().sendKeys(s);
    }

    public void fillCityField(String s){
        getCityField().sendKeys(s);
    }

    public void fillZipCodeField(String s){
        getZipCodeField().sendKeys(s);
    }

    public void fillMobileNumberField(String s){
        getMobileNumberField().sendKeys(s);
    }

    public void createAccountBtnClick(){
        getCreateAccountBtn().click();
    }

    public void showEmailErrorMessage(){
       String m = rb.getString("message");
       String s = getemailErrorMessage().getText();
       Assert.assertEquals("Validando menssagem", m, s);

    }
}
