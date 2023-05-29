package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {
    @Test(description = "Upload image")
    @Description("Upload image")
    public void uploadImageTest() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        String uploadedFileName = fileUploadPage
                .openFileUploadPage()
                .uploadImage()
                .clickUploadButton()
                .getUploadFileName();
        String fileName = fileUploadPage.getFileName();
        Assert.assertEquals(uploadedFileName, fileName, "File don't upload");
    }
}
