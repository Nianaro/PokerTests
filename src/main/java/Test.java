import Entities.PokerPlayer;
import Pages.InsertEditPage;
import Pages.LoginPage;
import Pages.PlayersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Utils.Util.*;
import static Data.LogInPageData.*;
import static Data.InsertEditUserPageData.*;
import static Data.CommonData.*;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {

        PokerPlayer pokerPlayer = createPlayer(NEW_USER_EMAIL_DOMEN_INPUT_VALUE_INSERT_EDIT_PAGE, NEW_USER_FIRST_NAME_INPUT_VALUE_INSERT_EDIT_PAGE, NEW_USER_LAST_NAME_INPUT_VALUE_INSERT_EDIT_PAGE, NEW_USER_COUNTRY_INPUT_VALUE_INSERT_EDIT_PAGE, NEW_USER_CITY_INPUT_VALUE_INSERT_EDIT_PAGE, NEW_USER_ADDRESS_INPUT_VALUE_INSERT_EDIT_PAGE, NEW_USER_PHONE_INPUT_VALUE_INSERT_EDIT_PAGE);

        WebDriver webDriver = new FirefoxDriver();
        LoginPage loginPage = new LoginPage(webDriver, 10, TimeUnit.SECONDS);
        loginPage.openHomePage();
        loginPage.login(USER_NAME_INPUT_VALUE_LOGIN_PAGE, PASSWORD_INPUT_VALUE_LOGIN_PAGE);

        PlayersPage playersPage = new PlayersPage(webDriver);
        playersPage.openInsertPlayerPage();

        InsertEditPage insertEditPage = new InsertEditPage(webDriver);
        insertEditPage.addPlayer(pokerPlayer);

        assertTitle(TITLE, webDriver.getTitle(), "Title of site is wrong");

        playersPage.searchPlayerByEmail(pokerPlayer.getEmail());
        playersPage.openEditPlayerPage(pokerPlayer.getEmail());

        try {
            assertPokerPlayers(pokerPlayer, webDriver, "Accounts of poker players are not equal");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


        pokerPlayer.setFirstName(EDIT_USER_FIRST_NAME_INPUT_VALUE_INSERT_EDIT_PAGE);
        pokerPlayer.setLastName(EDIT_USER_LAST_NAME_INPUT_VALUE_INSERT_EDIT_PAGE);
        pokerPlayer.setCity(EDIT_USER_CITY_INPUT_VALUE_INSERT_EDIT_PAGE);
        pokerPlayer.setAddress(EDIT_USER_ADDRESS_INPUT_VALUE_INSERT_EDIT_PAGE);
        pokerPlayer.setPhone(EDIT_USER_PHONE_INPUT_VALUE_INSERT_EDIT_PAGE);
        insertEditPage.editPlayer(pokerPlayer);

        playersPage.searchPlayerByEmail(pokerPlayer.getEmail());
        playersPage.openEditPlayerPage(pokerPlayer.getEmail());

        try {
            assertPokerPlayers(pokerPlayer, webDriver, "Accounts of poker players are not equal");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
