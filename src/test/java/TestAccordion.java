import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAccordion {
    private WebDriver driver;

    @Before
    public void startUp() {
        // Создаем драйвер для браузера Chrome и заходим на сайт
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void checkHowAccordionOneWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Accordion ObjAccordion = new Accordion(driver);
        ObjAccordion.checkAccordionOneIsWorking();
    }

    @Test
    public void checkHowAccordionTwoWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Accordion ObjAccordion = new Accordion(driver);
        ObjAccordion.checkAccordionTwoIsWorking();
    }

    @Test
    public void checkHowAccordionThreeWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Accordion ObjAccordion = new Accordion(driver);
        ObjAccordion.checkAccordionThreeIsWorking();
    }

    @Test
    public void checkHowAccordionFourWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Accordion ObjAccordion = new Accordion(driver);
        ObjAccordion.checkAccordionFourIsWorking();
    }

    @Test
    public void checkHowAccordionFiveWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Accordion ObjAccordion = new Accordion(driver);
        ObjAccordion.checkAccordionFiveIsWorking();
    }

    @Test
    public void checkHowAccordionSixWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Accordion ObjAccordion = new Accordion(driver);
        ObjAccordion.checkAccordionSixIsWorking();
    }

    @Test
    public void checkHowAccordionSevenWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Accordion ObjAccordion = new Accordion(driver);
        ObjAccordion.checkAccordionSevenIsWorking();
    }

    @Test
    public void checkHowAccordionEightWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Accordion ObjAccordion = new Accordion(driver);
        ObjAccordion.checkAccordionEightIsWorking();
    }

    @AfterAll
    public void tearDown() {
        // Закрой браузер
        driver.quit();
    }
}



