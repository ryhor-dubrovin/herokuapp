package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.Urls.DRAG_AND_DROP_PAGE;

public class DragAndDropPage extends BasePage {
    private By IFRAME = By.xpath("//iframe[@class='demo-frame']");

//    WebElement iframe = driver.findElement(IFRAME);
//    driver.switchTo().frame(iframe);

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(DRAG_AND_DROP_PAGE);
    }
}
