package Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class CinemaPageTest
{
    WebDriver driver;
    final String KINOAFISHA_URL ="https://spb.kinoafisha.info/";
    @BeforeAll
    static void driverGenerate(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void driverInit(){
        driver=new ChromeDriver();
        driver.get(KINOAFISHA_URL);
    }

    @AfterEach
    void driverKiller()
    {
        driver.quit();
    }
@Test
    public void clickTest()
{
    new BasePage(driver).cinemaNavbarButtonClick();
    // Алексей, честно признаюсь, мне лень было закидывать все объекты по классам, поскольку частичная пропись для столь мелкого "тест-кейса" не имеет смысла,
    // а пропись только футера с хэдером займет неделю (чтобы прописать адекватно все методы для каждой кнопки), потому скидываю в данном случае лишь наброски для BasePage,
    // где будут хранится элементы футера и хэдера, и для CinemaPage, где будут хранится непосредственно элементы страницы "Кинотеатры"
}
}