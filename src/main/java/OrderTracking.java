import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderTracking {

    WebDriver driver;
    //Кнопка Отменить заказ
    private By cancelButton = By.xpath(".//button[@text()='Отменить заказ']");
    public OrderTracking(WebDriver driver) {
        this.driver = driver;
    }
    //Ждем, когда загрузится страница
    public void waitForLoadCancelButton() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(cancelButton));
    }
    //Проверяем, загружается ли кнопка
    public boolean checkIsCancelButtonDisplayed() {
        return driver.findElement(cancelButton).isDisplayed();
    }
    //Проверяем, грузится ли страница
    public boolean checkIsOrderTrackingPageLoaded() {
        waitForLoadCancelButton();
        return checkIsCancelButtonDisplayed();
    }
}