package Pages;

import Entities.PokerPlayer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static Data.InsertEditUserPageData.*;
import static Data.InsertEditUserPageData.SAVE_BUTTON_INPUT_XPATH_INSERT_EDIT_PAGE;

public class InsertEditPage extends Page {


    public InsertEditPage() {
        super();
    }

    public InsertEditPage(WebDriver webDriver){super(webDriver);}

    public InsertEditPage(WebDriver webDriver, long time, TimeUnit timeUnit) {
        super(webDriver, time, timeUnit);
    }

    public void editPlayer(PokerPlayer player) {
        addPlayer(player);
    }

    public void addPlayer(PokerPlayer player) {
        webDriver.findElement(By.xpath(USER_NAME_INPUT_XPATH_INSERT_EDIT_USER_PAGE)).sendKeys(player.getUserName());
        webDriver.findElement(By.xpath(EMAIL_INPUT_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getEmail());
        webDriver.findElement(By.xpath(PASSWORD_INPUT_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getPassword());
        webDriver.findElement(By.xpath(CONFIRM_PASSWORD_INPUT_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getPassword());
        webDriver.findElement(By.xpath(FIRST_NAME_INPUT_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getFirstName());
        webDriver.findElement(By.xpath(LAST_NAME_INPUT_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getLastName());
        webDriver.findElement(By.xpath(CITY_INPUT_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getCity());
        webDriver.findElement(By.xpath(COUNTRY_SELCT_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getCountry());
        webDriver.findElement(By.xpath(ADDRESS_TEXTAREA_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getAddress());
        webDriver.findElement(By.xpath(PHONE_INPUT_XPATH_INSERT_EDIT_PAGE)).sendKeys(player.getPhone());
        webDriver.findElement(By.xpath(SAVE_BUTTON_INPUT_XPATH_INSERT_EDIT_PAGE)).click();
    }
}
