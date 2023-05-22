package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {
    @Test
    public void dragAndDropTest() {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.openDragAndDropPage();
        dragAndDropPage.dragAndDrop();
        System.out.println(dragAndDropPage.getDroppableMessage());
        Assert.assertEquals(dragAndDropPage.getDroppableMessage(),
                dragAndDropPage.getSuccessMessage(),
                "Element not dropped");
    }

}
