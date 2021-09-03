package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    public WebDriver driver;

    private final By RADIO_BUTTON = By.id("yes");
    private final By CHECK_BUTTON = By.id("buttoncheck");
    private final By RADIO_TEXT = By.className("radiobutton");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String findAndClickRadioButton(){
        driver.get("http://demo.guru99.com/test/ajax.html");
        driver.findElement(RADIO_BUTTON).click();
        driver.findElement(CHECK_BUTTON).click();
        return driver.findElement(RADIO_TEXT).getText();
    }
    public List<String> findTextOfRadioButtons(){
        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        List<String> radioTexts = new ArrayList<>();
        for (WebElement radioButton : radioButtons) {
            System.out.println(radioButton.getAttribute("value"));
            radioTexts.add(radioButton.getAttribute("value"));
        }
        return radioTexts;

    }
}
