package Data;

public interface PlayersPageData {
    String INSERT_LINK_XPATH_PLAYERS_PAGE = ".//a[contains(@href,'/players/insert')]";
    String LOGIN_INPUT_XPATH_PLAYERS_PAGE = ".//input[contains(@id, '__login')]";
    String SEARCH_BUTTON_INPUT_XPATH_PLAYERS_PAGE = ".//input[contains(@value,'Search')]";
    String EDIT_LINK_XPATH_PLAYERS_PAGE = ".//tr[.//a[text()='${username}']]";
}
