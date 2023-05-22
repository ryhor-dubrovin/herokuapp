package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.DRAG_AND_DROP_PAGE;

public class DragAndDropPage extends BasePage {
    @FindBy(className = "demo-frame")
    private WebElement frame;
    @FindBy(id = "draggable")
    private WebElement draggable;
    @FindBy(id = "droppable")
    private WebElement droppable;
    private final String successMessage = "Dropped!";
    public String getSuccessMessage() {
        return getSuccessMessage();
    }
    public String getDroppableMessage() {
        driver.switchTo().frame(frame);
        return driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
        //return droppable.getText();
    }

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }
    public void openDragAndDropPage() {
        driver.get(DRAG_AND_DROP_PAGE);
    }
    public void dragAndDrop() {
        driver.switchTo().frame(frame);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable,droppable).build().perform();
    }
}
