package pages;

import org.openqa.selenium.WebDriver;

import static constants.Urls.DROPDOWN_PAGE;

public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(DROPDOWN_PAGE);
    }
}
