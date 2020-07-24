package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\lhunn\\IdeaProjects\\TAU-Practice-Tests\\src\\main\\resources\\adrian cat.PNG");
        uploadPage.clickUploadBtn();
    }
}
