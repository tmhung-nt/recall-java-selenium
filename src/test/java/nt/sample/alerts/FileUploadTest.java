package nt.sample.alerts;

import utils.CommonUtils;
import nt.sample.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {
    @Test
    public void testUploadFile(){
        var fileUploadPage = homePage.clickFileUpload();
        String filename = "README.md";
        String fileToUploadPath = CommonUtils.getProjectAbsolutePath() + "/" + filename;
        fileUploadPage.setInputField(fileToUploadPath);
        fileUploadPage.uploadFile();
        assertEquals(fileUploadPage.getUploadResult(), filename, "Uploaded filename is incorrect!");
    }
}
