package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;


    BasePage (WebDriver driver)
    {
        this.driver=driver;
        webDriverWait = new WebDriverWait(driver,5);
        actions = new Actions(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//nav[contains(@class,'mm')]/a[.='Кинотеатры']")
    private WebElement cinemaNavbarButton;

    public void cinemaNavbarButtonClick()
    {
        cinemaNavbarButton.click();
    }

}
