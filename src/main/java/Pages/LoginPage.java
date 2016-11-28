package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static Data.LogInPageData.*;
import static Data.LogInPageData.LOGIN_BUTTON_INPUT_ID_LOGIN_PAGE;

public class LoginPage extends Page{

    public LoginPage() {
        super();
    }

    public LoginPage(WebDriver webDriver){super(webDriver);}

    public LoginPage(WebDriver webDriver, long time, TimeUnit timeUnit) {
        super(webDriver, time, timeUnit);
    }

    public void login(String userName, String password) {
        webDriver.findElement(By.id(USER_NAME_INPUT_ID_LOGIN_PAGE)).sendKeys(userName);
        webDriver.findElement(By.id(PASSWORD_INPUT_ID_LOGIN_PAGE)).sendKeys(password);
        webDriver.findElement(By.id(LOGIN_BUTTON_INPUT_ID_LOGIN_PAGE)).click();
    }

}
