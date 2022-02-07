package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CinemaPage extends BasePage {
    CinemaPage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//input[contains(@placeholder,'Поиск кинотеатра')]")
    private WebElement cinemaSearchButton;

}
