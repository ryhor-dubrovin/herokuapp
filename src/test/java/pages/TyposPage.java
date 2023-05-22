package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.TYPOS_PAGE;

public class TyposPage extends BasePage {
    @FindBy(xpath = "//div[2]")
    private WebElement field;
    private final String GOOD_TEXT = "Typos\n" +
            "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
            "Sometimes you'll see a typo, other times you won't.";

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public TyposPage openTyposPage() {
        driver.get(TYPOS_PAGE);
        return this;
    }

    public String getGoodText() {
        return GOOD_TEXT;
    }

    public String getFieldText() {
        return field.getText();
    }
}
