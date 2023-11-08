package tests.testngtests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.actions.HomePage;
import pages.actions.AuthentificationUtils;
import utils.BaseTest;

public class RegisterNewUser extends BaseTest {

    @BeforeMethod
    public void setup(){
        //Initialize the ExtentTest instance for this test
        initTest("Register new user");
    }

    @Test
    public void registerNewUser(){

        HomePage homePage = new HomePage(driver);
        homePage.clickOnRegisterButton();

        AuthentificationUtils authentificationUtils = new AuthentificationUtils(driver);
        authentificationUtils.register("test1", "pass");


    }
}
