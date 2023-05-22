package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {
    @Test
    public void uploadImageTest() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        String uploadedFileName = fileUploadPage
                .openFileUploadPage()
                .uploadImage()
                .clickUploadButton()
                .getUploadFileName();
        Assert.assertEquals(uploadedFileName,fileUploadPage.getFileName(),"File don't upload");
    }
}
