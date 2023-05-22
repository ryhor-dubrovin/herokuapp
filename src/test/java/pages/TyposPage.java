package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static constants.Urls.TYPOS_PAGE;

public class TyposPage extends BasePage {
    @FindBy(xpath = "//div[2]")
    private WebElement field;
    public static final String GOOD_TEXT = "Typos\n" +
            "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
            "Sometimes you'll see a typo, other times you won't.";

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(TYPOS_PAGE);
    }

    public String getFieldText() {
        return field.getText();
    }
}
