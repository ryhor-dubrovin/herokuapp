package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static constants.Urls.DROPDOWN_PAGE;

public class DropdownPage extends BasePage {
    @FindBy(id = "dropdown")
    private WebElement dropdownList;
    private final String optionOneText = "Option 1";
    private final String optionTwoText = "Option 2";

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public String getOptionOneText() {
        return optionOneText;
    }

    public String getOptionTwoText() {
        return optionTwoText;
    }

    public void openDropdownPage() {
        driver.get(DROPDOWN_PAGE);
    }

    public String selectOptionOne() {
        Select select = new Select(dropdownList);
        select.selectByValue("1");
        return select.getFirstSelectedOption().getText();
    }

    public String selectOptionTwo() {
        Select select = new Select(dropdownList);
        select.selectByVisibleText("Option 2");
        return select.getFirstSelectedOption().getText();
    }
}
