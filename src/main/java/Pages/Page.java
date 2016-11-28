package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static Data.PathsData.LOGIN_PAGE;
import static Data.PathsData.URL;

public class Page {
    protected WebDriver webDriver;

    public Page() {
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public Page(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public Page(WebDriver webDriver, long time, TimeUnit timeUnit) {
        this.webDriver = webDriver;
        webDriver.manage().timeouts().implicitlyWait(time, timeUnit);
    }

    public void openHomePage() {
        webDriver.get(URL + LOGIN_PAGE);
    }
}
