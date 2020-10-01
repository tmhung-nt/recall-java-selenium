package nt.sample.dropdownList;

import nt.sample.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTest {
    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdown();
        String visibleTextOption = "Option 1";

        dropdownPage.selectFromDropdown(visibleTextOption);
        var selectedOptions = dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(visibleTextOption), "Option not selected!");
    }
}
