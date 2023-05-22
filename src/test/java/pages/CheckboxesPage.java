package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.Urls.CHECKBOXES_PAGE;

public class CheckboxesPage extends BasePage {
    private final By FIRST_CHECKBOX = By.xpath("//input[1]");
    private final By SECOND_CHECKBOX = By.xpath("//input[2]");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(CHECKBOXES_PAGE);
    }

    public void clickFirstCheckbox() {
        driver.findElement(FIRST_CHECKBOX).click();
    }

    public void clickSecondCheckbox() {
        driver.findElement(SECOND_CHECKBOX).click();
    }

    public boolean isFirstCheckboxSelected() {
        WebElement checkbox = driver.findElement(FIRST_CHECKBOX);
        return checkbox.isSelected();
    }

    public boolean isSecondCheckboxSelected() {
        WebElement checkbox = driver.findElement(SECOND_CHECKBOX);
        return checkbox.isSelected();
    }
}