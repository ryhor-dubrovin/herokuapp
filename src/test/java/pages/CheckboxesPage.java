package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.CHECKBOXES_PAGE;

public class CheckboxesPage extends BasePage {
    @FindBy(xpath = "//input[1]")
    private WebElement firstCheckbox;
    @FindBy(xpath = "//input[2]")
    private WebElement secondCheckbox;


    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public CheckboxesPage openCheckboxesPage() {
        driver.get(CHECKBOXES_PAGE);
        return this;
    }

    public CheckboxesPage clickFirstCheckbox() {
        firstCheckbox.click();
        return this;
    }

    public CheckboxesPage clickSecondCheckbox() {
        secondCheckbox.click();
        return this;
    }

    public boolean isFirstCheckboxSelected() {
        return firstCheckbox.isSelected();
    }

    public boolean isSecondCheckboxSelected() {
        return secondCheckbox.isSelected();
    }
}