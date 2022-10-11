import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WantToOrder {
    private WebDriver driver;

    //Заголовок "Хотите оформить заказ?"
    private By WantToOrderHeader = By.xpath(".//div[text()='Хотите оформить заказ?']");
    // Кнопка "Да"
    private By YesButton = By.xpath(".//button[text()='Да']");

    public WantToOrder(WebDriver driver){
        this.driver = driver;
    }
    //Ждем, когда загрузится страница
    public void waitForLoadWantToOrder() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(WantToOrderHeader));
    }
    //Нажимаем кнопку "Да"
    public void clickButtonYes(){
        driver.findElement(YesButton).click();
    }
    //Нажимаем кнопку после загрузки страницы
    public void clickWantToOrderWIndow(){
        waitForLoadWantToOrder();
        clickButtonYes();
    }
}