package nt.sample.alerts;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTest extends BaseTest {
    @Test
    public void testHandleModal() throws Exception {
        var entryAdPage = homePage.clickEntryAd();

        entryAdPage.openModal();
        assertEquals(entryAdPage.getModalTitle(), "THIS IS A MODAL WINDOW");
        entryAdPage.closeModal();
    }
}
