package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InputPage;

public class InputTest extends BaseTest {

    @Test(dataProvider = "testData")
    public void changeValueWithArrowsTest(int arrowUp, int arrowDown, String result) {
        InputPage inputPage = new InputPage(driver);
        inputPage.openInputPage();

        for (int i = 0; i < arrowUp + 1; i++) {
            inputPage.fieldArrowUp();
        }

        for (int i = 0; i < arrowDown + 1; i++) {
            inputPage.fieldArrowDown();
        }
        Assert.assertEquals(inputPage.getFieldValue(), result, "Incorrect field value");
    }

    @DataProvider(name = "testData")
    public Object[][] inputValues() {
        return new Object[][]{
                {5, 0, "5"},
                {0, 5, "-5"},
                {5, 3, "2"}
        };
    }
}
