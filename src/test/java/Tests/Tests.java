package Tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests extends BaseTest {

    @Test
    public void radioButtonTest(){
        String expected = "Radio button is checked and it's value is Yes";
        Assertions.assertEquals(expected, homePage.findAndClickRadioButton());
    }

    @Test
    public void findRadioButtonsTextTest(){
        List<String> expected = homePage.findTextOfRadioButtons();
        List<String> result = new ArrayList<>();
        result.add("Yes");
        result.add("No");
        Assertions.assertEquals(expected, result);
    }
}
