package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.FileUploadPage;

public class FileUploadSteps {
    private static FileUploadPage fileUploadPage;

    @Step("User upload image and click button")
    public static String uploadFile(WebDriver driver) {
        fileUploadPage = new FileUploadPage(driver);
        return fileUploadPage
                .openFileUploadPage()
                .uploadImage()
                .clickUploadButton()
                .getUploadFileName();
    }
}
