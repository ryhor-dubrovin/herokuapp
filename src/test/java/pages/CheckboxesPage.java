package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
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

    public void openCheckboxesPage() {
        driver.get(CHECKBOXES_PAGE);
    }

    public void clickFirstCheckbox() {
        firstCheckbox.click();
    }

    public void clickSecondCheckbox() {
        secondCheckbox.click();
    }

    public boolean isFirstCheckboxSelected() {
        return firstCheckbox.isSelected();
    }

    public boolean isSecondCheckboxSelected() {
        return secondCheckbox.isSelected();
    }
}