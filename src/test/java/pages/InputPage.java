package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static constants.Urls.CHECKBOXES_PAGE;
import static constants.Urls.INPUTS_PAGE;

public class InputPage extends BasePage {
    private final By FIELD = By.tagName("input");

    public InputPage(WebDriver driver) {
        super(driver);
    }

    public void openInputPage() {
        driver.get(INPUTS_PAGE);
    }

    public void fieldArrowUp() {
        driver.findElement(FIELD).sendKeys(Keys.ARROW_UP);
    }

    public void fieldArrowDown() {
        driver.findElement(FIELD).sendKeys(Keys.ARROW_DOWN);
    }

    public String getFieldValue() {
        return driver.findElement(FIELD).getAttribute("value");
    }
}