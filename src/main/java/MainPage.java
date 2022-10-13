import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private WebDriver driver;

    //Кнопка согласия с куками
   private By cookiesOkayButton = By.className("App_CookieButton__3cvqF");

    //Кнопка "Заказать" сверху
    private By orderUpButton = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    //Кнопка "Заказать" в середине страницы
    private By orderMiddleButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonCookiesOkay(){
        driver.findElement(cookiesOkayButton).click();
    }
    //Проверка активности кнопки "Эаказать" сверху
    public boolean checkButtonOrderUpIsEnabled() {
        return driver.findElement(orderUpButton).isEnabled();
    }
    //Проверка активности кнопки "Эаказать" в середине страницы
    public boolean checkButtonOrderMiddleIsEnabled() {
        return driver.findElement(orderMiddleButton).isEnabled();
    }
    // Клик по кнопке "Эаказать" сверху
    public void clickButtonOrderUp() {
        driver.findElement(orderUpButton).click();
    }
    // Клик по кнопке "Эаказать" в середине страницы
    public void clickButtonOrderMiddle() {
        driver.findElement(orderMiddleButton).click();
    }

    public void clickButtonOrderUpActive(){
        checkButtonOrderUpIsEnabled();
        clickButtonOrderUp();
    }

    public void clickButtonOrderMiddleActive(){
        checkButtonOrderMiddleIsEnabled();
        clickButtonOrderMiddle();
    }
}