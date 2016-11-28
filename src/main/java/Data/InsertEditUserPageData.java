package Data;

public interface InsertEditUserPageData {
    String USER_NAME_INPUT_XPATH_INSERT_EDIT_USER_PAGE = ".//input[contains(@id,'us_login')]";
    String EMAIL_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[contains(@id,'email')]";
    String PASSWORD_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[contains(@id,'us_password')]";
    String CONFIRM_PASSWORD_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[contains(@id,'confirm_password')]";
    String FIRST_NAME_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[contains(@id, 'fname')]";
    String LAST_NAME_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[contains(@id, 'lname')]";
    String CITY_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[contains(@id, 'city')]";
    String COUNTRY_SELCT_XPATH_INSERT_EDIT_PAGE = ".//select[contains(@id,'country')]";
    String ADDRESS_TEXTAREA_XPATH_INSERT_EDIT_PAGE = ".//textarea[contains(@id, 'address')]";
    String PHONE_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[contains(@id, 'phone')]";
    String SAVE_BUTTON_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[@value='Save']";
}
