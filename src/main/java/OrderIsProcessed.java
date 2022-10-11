import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderIsProcessed {
    WebDriver driver;

    //Заголовок "Заказ оформлен"
    private By orderIsProcessedHeader = By.xpath(".//div[text()='Заказ оформлен']");
    //Кнопка "Посмотреть статус"
    private By checkOrderStatusButton = By.xpath(".//button[text()='Посмотреть статус']");

    public OrderIsProcessed(WebDriver driver){
        this.driver = driver;
    }

    //Ждем, когда загрузится страница
    public void waitForLoadHeaderOrderIsProcessed() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(orderIsProcessedHeader));
    }
    //Жмем на кнопку
    public void clickButtonCheckOrderStatus(){
        driver.findElement(checkOrderStatusButton).click();
    }
    //Жмем на кнопку, когда загрузится страница
    public void clickOrderIsProcessedWIndow(){
        waitForLoadHeaderOrderIsProcessed();
        clickButtonCheckOrderStatus();
    }
}


