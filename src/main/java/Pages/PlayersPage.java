package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static Data.PlayersPageData.*;

public class PlayersPage extends Page {

    public PlayersPage() {
        super();
    }

    public PlayersPage(WebDriver webDriver){super(webDriver);}

    public PlayersPage(WebDriver webDriver, long time, TimeUnit timeUnit) {
        super(webDriver, time, timeUnit);
    }

    public void openInsertPlayerPage() {
        webDriver.findElement(By.xpath(INSERT_LINK_XPATH_PLAYERS_PAGE)).click();
    }

    public void searchPlayerByEmail(String email) {
        webDriver.findElement(By.xpath(EMAIL_INPUT_XPATH_PLAYERS_PAGE)).clear();
        webDriver.findElement(By.xpath(EMAIL_INPUT_XPATH_PLAYERS_PAGE)).sendKeys(email);
        webDriver.findElement(By.xpath(SEARCH_BUTTON_INPUT_XPATH_PLAYERS_PAGE)).click();
    }

        public void openEditPlayerPage(String email) {
        webDriver.findElement(By.xpath(EDIT_LINK_XPATH_PLAYERS_PAGE.replaceFirst("email", email))).click();
    }
}
