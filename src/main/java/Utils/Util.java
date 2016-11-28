package Utils;

import Entities.PokerPlayer;
import Exceptions.InapropriatePokerPlayerException;
import Exceptions.WrongTitleException;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.text.StrBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Data.InsertEditUserPageData.*;
import static Data.InsertEditUserPageData.ADDRESS_TEXTAREA_XPATH_INSERT_EDIT_PAGE;
import static Data.InsertEditUserPageData.PHONE_INPUT_XPATH_INSERT_EDIT_PAGE;

public class Util {
    public static void assertTitle(String expectedTitle, String currentTitle, String messageErr) {
        if (!expectedTitle.equals(currentTitle)) {
            throw new WrongTitleException(messageErr);
        }
    }


    public static void assertPokerPlayers(PokerPlayer actual, WebDriver webDriver, String messageErr) {
        PokerPlayer expected = new PokerPlayer();
        expected.setEmail(webDriver.findElement(By.xpath(EMAIL_INPUT_XPATH_INSERT_EDIT_PAGE)).getText(), "@gmail.com");
        expected.setFirstName(webDriver.findElement(By.xpath(FIRST_NAME_INPUT_XPATH_INSERT_EDIT_PAGE)).getText());
        expected.setLastName(webDriver.findElement(By.xpath(LAST_NAME_INPUT_XPATH_INSERT_EDIT_PAGE)).getText());
        expected.setCity(webDriver.findElement(By.xpath(CITY_INPUT_XPATH_INSERT_EDIT_PAGE)).getText());
        expected.setAddress(webDriver.findElement(By.xpath(ADDRESS_TEXTAREA_XPATH_INSERT_EDIT_PAGE)).getText());
        expected.setPhone(webDriver.findElement(By.xpath(PHONE_INPUT_XPATH_INSERT_EDIT_PAGE)).getText());

        if (!expected.equals(actual)) {
            throw new InapropriatePokerPlayerException(messageErr);
        }
    }


    public static PokerPlayer createPlayer(){
        PokerPlayer pokerPlayer = new PokerPlayer();
        pokerPlayer.setUserName(new StringBuilder(RandomStringUtils.randomAlphabetic(9)).append(new StrBuilder(RandomStringUtils.randomNumeric(3))).toString());
        pokerPlayer.setPassword(RandomStringUtils.randomNumeric(6));
        pokerPlayer.setEmail(pokerPlayer.getUserName(), "@gmail.com");
        pokerPlayer.setFirstName("FirstName");
        pokerPlayer.setLastName("LastName");
        pokerPlayer.setCountry("UK");
        pokerPlayer.setCity("Kharkov");
        pokerPlayer.setAddress("Address");
        pokerPlayer.setPhone("+1234567890");
        return pokerPlayer;
    }
}
