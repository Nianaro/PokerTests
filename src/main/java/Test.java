import Entities.PokerPlayer;
import Pages.InsertEditPage;
import Pages.LoginPage;
import Pages.PlayersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static Utils.Util.*;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {

        PokerPlayer pokerPlayer = createPlayer();

        WebDriver webDriver = new FirefoxDriver();
        LoginPage loginPage = new LoginPage(webDriver, 10, TimeUnit.SECONDS);
        loginPage.openHomePage();
        loginPage.login("admin","123");

        PlayersPage playersPage = new PlayersPage(webDriver);
        playersPage.openInsertPlayerPage();

        InsertEditPage insertEditPage = new InsertEditPage(webDriver);
        insertEditPage.addPlayer(pokerPlayer);

        assertTitle("Players",webDriver.getTitle(),"Title of site is wrong");

        playersPage.searchPlayerByUserName(pokerPlayer.getUserName());
        playersPage.openEditPlayerPage();

        assertPokerPlayers(pokerPlayer, webDriver, "Accounts of poker players are not equal");

        pokerPlayer.setFirstName("FN");
        pokerPlayer.setLastName("LN");
        pokerPlayer.setCity("Kiev");
        pokerPlayer.setAddress("New");
        pokerPlayer.setPhone("no phone");
        insertEditPage.editPlayer(pokerPlayer);

        playersPage.searchPlayerByUserName(pokerPlayer.getUserName());
        playersPage.openEditPlayerPage();

        assertPokerPlayers(pokerPlayer, webDriver, "Accounts of poker players are not equal");
    }

}
