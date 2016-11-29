package Data;

public interface InsertEditUserPageData {
    String USER_NAME_INPUT_XPATH_INSERT_EDIT_PAGE = ".//input[contains(@id,'us_login')]";
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

    String NEW_USER_EMAIL_DOMEN_INPUT_VALUE_INSERT_EDIT_PAGE = "@gmail.com";
    String NEW_USER_FIRST_NAME_INPUT_VALUE_INSERT_EDIT_PAGE = "FN";
    String NEW_USER_LAST_NAME_INPUT_VALUE_INSERT_EDIT_PAGE = "LN";
    String NEW_USER_COUNTRY_INPUT_VALUE_INSERT_EDIT_PAGE = "UK";
    String NEW_USER_CITY_INPUT_VALUE_INSERT_EDIT_PAGE = "Kharkov";
    String NEW_USER_ADDRESS_INPUT_VALUE_INSERT_EDIT_PAGE = "address";
    String NEW_USER_PHONE_INPUT_VALUE_INSERT_EDIT_PAGE = "+1234567890";

    String EDIT_USER_FIRST_NAME_INPUT_VALUE_INSERT_EDIT_PAGE = "First Name";
    String EDIT_USER_LAST_NAME_INPUT_VALUE_INSERT_EDIT_PAGE = "Last name";
    String EDIT_USER_CITY_INPUT_VALUE_INSERT_EDIT_PAGE = "Kiev";
    String EDIT_USER_ADDRESS_INPUT_VALUE_INSERT_EDIT_PAGE = "New";
    String EDIT_USER_PHONE_INPUT_VALUE_INSERT_EDIT_PAGE = "no phone";
}
