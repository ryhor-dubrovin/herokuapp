package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AllureTool {
    @Attachment(value = "screenshot", type = "image/png")
    public byte[] makeScreenshot(WebDriver driver) {
        TakesScreenshot screenShot = ((TakesScreenshot) driver);
        return screenShot.getScreenshotAs(OutputType.BYTES);
    }

    @Attachment
    public String getSystemName() {
        return System.getProperty("os.name");
    }
}
