import org.example.api.BaseMethods;
import org.example.pages.LoginPage;
import org.example.pages.MainPage;
import org.example.pages.RegistrationPage;
import org.junit.Assert;
import org.junit.Test;


public class RegistrationUserTest extends BaseMethods {

    @Test
    public void registerUserSuccess(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickOnPersonalAccount();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnRegisterLink();
        RegistrationPage registerPage = new RegistrationPage(getDriver());
        registerPage.registrationNewUser(getName(), getEmail(), getPassword());
        Assert.assertTrue(getDriver().findElement(loginPage.getEnterHeader()).isDisplayed());
    }

    @Test
    public void registerUserWithIncorrectPassword(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickOnPersonalAccount();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnRegisterLink();
        RegistrationPage registerPage = new RegistrationPage(getDriver());
        registerPage.registrationNewUser(getName(), getEmail(), getIncorrectPassword());
        Assert.assertTrue(getDriver().findElement(registerPage.getIncorrectPassword()).isDisplayed());
    }

}
