import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestOrderMiddleButton {
    private WebDriver driver;
    private final String testName;
    private final String testSurname;
    private final String testAdress;
    private final String testPhoneNumber;
    private final String testComment;

    public TestOrderMiddleButton(String testName, String testSurname, String testAdress, String testPhoneNumber, String testComment) {
        this.testName = testName;
        this.testSurname = testSurname;
        this.testAdress = testAdress;
        this.testPhoneNumber = testPhoneNumber;
        this.testComment = testComment;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getOrderDetails() {
        return new Object[][]{
                {"Иван", "Иванов", "Ленинский проспект, 6", "+79001234567", "Привезите в ближайшие три часа"},
                {"Петр", "Петров", "Хамовнический вал, 17", "+79997654321", "Do you have scooter with english interface?"},
        };
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void checkHowOrderWorks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage objMainPage = new MainPage(driver);
        //Нажимаем на верхнюю кнопку
        objMainPage.clickButtonCookiesOkay();
        objMainPage.clickButtonOrderMiddleActive();

        ForWhomSamokat objForWhomSamokat = new ForWhomSamokat(driver);
        //Заполняем форму "Для кого самокат"
        objForWhomSamokat.fillInForWhomSamokatForm(testName, testSurname, testAdress, testPhoneNumber);

        AboutRent objAboutRent = new AboutRent(driver);
        //Заполняем форму "Об аренде"
        objAboutRent.fillAboutRentFormOptionOne(testComment);

        WantToOrder objWantToOrder = new WantToOrder(driver);
        //Подтверждаем бронирование
        objWantToOrder.clickWantToOrderWIndow();

        OrderIsProcessed objOrderIsProcessed = new OrderIsProcessed(driver);
        //Нажимаем "Посмотреть статус"
        objOrderIsProcessed.clickOrderIsProcessedWIndow();

        OrderTracking objOrderTracking = new OrderTracking(driver);
        //Убеждаемся, что страница заказа грузится
        objOrderTracking.checkIsOrderTrackingPageLoaded();

        assertEquals(true, objOrderTracking.checkIsOrderTrackingPageLoaded());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}