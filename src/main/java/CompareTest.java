import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompareTest
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver,5);
        chromeDriver.get("https://spb.kinoafisha.info/"); // Открыть сайт https://spb.kinoafisha.info/
        chromeDriver.findElement(By.xpath("//nav[contains(@class,'mm')]/a[.='Кинотеатры']")).click(); // Нажать на "Кинотеатры" в меню заголовка
        chromeDriver.findElement(By.xpath("//input[contains(@placeholder,'Поиск кинотеатра')]")).click();// Нажать на иконку поиска в разделе Кинотеатры Петербурга
        chromeDriver.findElement(By.xpath("//input[contains(@placeholder,'Поиск кинотеатра')]")).sendKeys("Нео");// Ввести "Нео"
        chromeDriver.findElement(By.xpath("//div[contains(@data-schedulesearch-item,'Нео')]//button[contains(@class,'favBtn')]")).click();//Нажать на иконку "Добавить в избранное"
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'popup_content')]")));
        //chromeDriver.switchTo().frame(chromeDriver.findElement(By.xpath("//div[contains(@class,'popup_content')]")));

        chromeDriver.findElement(By.xpath("//a[contains(@class,'popup_close')]")).click(); // Закрыть открывшееся окно акторизации


        chromeDriver.quit();
    }
}
