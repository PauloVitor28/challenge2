package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.WebJumpPage;

import java.util.ResourceBundle;


public class AccessPageStep extends BaseClass {




    @Given("User access page")
    public void userAccessPage() {
        logger.info("Accessing search page");
    }

    @And("User click on login button")
    public void userClickOnLoginButton(){
        LoginPage lp = new LoginPage(driver);
        lp.loginBtnClick();
    }

    @And("User click on singUp button")
    public void userClickOnSingUpButton(){
        LoginPage lp = new LoginPage(driver);
        lp.singUpBtnClick();
    }

    @And("User fill out name field")
    public void userFillOutNameField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillNameField(rb.getString("name"));

    }

    @And("User fill out email field")
    public void userFillOutEmailField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillEmailField(rb.getString("email"));

    }

    @And("User click on gender button")
    public void userClickOnGenderButton(){
        LoginPage lp = new LoginPage(driver);
        lp.genderBtnClick();
    }

    @And("User fill out password field")
    public void userFillOutPasswordField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillPasswordField(rb.getString("password"));
    }

    @And ("user select date of birth {string} {string} {string}")
    public  void userSelectDateOfBirth(String s, String s1, String s2){
        LoginPage lp = new LoginPage(driver);
        lp.selectDayValue(s);
        lp.selectMonthValue(s1);
        lp.selectYearValue(s2);
    }

    @And("User fill out first name field")
    public void userFillOutFirstNameField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillFirstNameField(rb.getString("firstName"));
    }

    @And("User fill out last name field")
    public void userFillOutLastNameField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillLastNameField(rb.getString("lastName"));
    }

    @And("User fill out company field")
    public void userFillOutCompanyField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillCompanyField(rb.getString("company"));
    }

    @And("User fill out address field")
    public void userFillOutAddressField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillAddressField(rb.getString("address"));
    }

    @And ("User select country {string}")
    public  void userSelectCountry(String s){
        LoginPage lp = new LoginPage(driver);
        lp.selectCountryValue(s);
    }

    @And("User fill out state field")
    public void userFillOutStateField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillStateField(rb.getString("state"));
    }

    @And("User fill out city field")
    public void userFillOutCityField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillCityField(rb.getString("city"));
    }

    @And("User fill out zipcode field")
    public void userFillOutZipCodeField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillZipCodeField(rb.getString("zipcode"));
    }

    @And("User fill out mobile number field")
    public void userFillOutMobileNumberField(){
        ResourceBundle rb = ResourceBundle.getBundle("config");
        LoginPage lp = new LoginPage(driver);
        lp.fillMobileNumberField(rb.getString("mobileNumber"));
    }

    @And("User click on create account button")
    public void userClickOnCreateAccountBtn() {
        LoginPage lp = new LoginPage(driver);
        lp.createAccountBtnClick();
    }

    @And("check if")
    public void userTryToCreateAnAccountWithAnExistingEmail(){
        LoginPage lp = new LoginPage(driver);
        lp.showEmailErrorMessage();
    }
}
//    @When("I fill in the login form with the data email {string} and password {string}")
//    public void iFillInTheLoginFormWithTheDataEmailAndPassword(String email, String password) {
//        logger.info("Filling out the form");
//        lp.btnOneClick(email, password);
//    }

