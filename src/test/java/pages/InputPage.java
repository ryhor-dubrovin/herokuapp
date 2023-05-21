package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.INPUTS_PAGE;

public class InputPage extends BasePage {

    @FindBy(tagName = "input")
    private WebElement inputField;

    public InputPage(WebDriver driver) {
        super(driver);
    }

    public void openInputPage() {
        driver.get(INPUTS_PAGE);
    }

    public void fieldArrowUp() {
        inputField.sendKeys(Keys.ARROW_UP);
    }

    public void fieldArrowDown() {
        inputField.sendKeys(Keys.ARROW_DOWN);
    }

    public String getFieldValue() {
        return inputField.getAttribute("value");
    }
}