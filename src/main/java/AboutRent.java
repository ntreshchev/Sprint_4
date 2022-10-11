import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutRent {
    WebDriver driver;
    //Заголовок "Про аренду"
    private By aboutRentHeader = By.xpath("html/body/div/div/div[2]/div[1][text()='Про аренду']");
    // Форма данных по аренде, когда привезти самокат
    private By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Форма данных по аренде, выбор даты в раскрывшемся календаре, 13 октября
    private By dateChooseThirteenButton = By.xpath(".//div[text()='13']");
    // Форма данных по аренде, список когда привезти самокат
    private By durationField = By.className("Dropdown-control");
    // Форма данных по аренде, выбор трое суток в раскрывающемся списке
    private By threeDaysField = By.xpath(".//div[text()='трое суток']");
    // Форма данных по аренде, черный жемчуг
    private By blackColorCheckbox = By.id("black");
    // Форма данных по аренде, когда привезти самокат
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // кнопка "Заказать"
    private By orderButtonInForm = By.xpath("html/body/div/div/div[2]/div[3]/button[2][@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");

    public AboutRent(WebDriver driver) {
        this.driver = driver;
    }
    //Ждем, когда загрузится страница
    public void waitForLoadHeaderAboutRent() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(aboutRentHeader));
    }
    //Выбираем дату 7
    public void setDateSeven(){
        driver.findElement(dateField).click();
        driver.findElement(dateChooseThirteenButton).click();
    }
    //Выбираем длительность 3 дня
    public void setDurationThree(){
        driver.findElement(durationField).click();
        driver.findElement(threeDaysField).click();
    }
    //Выбираем цвет "Черный жемчуг"
    public void setBlackColor(){
        driver.findElement(blackColorCheckbox).click();
    }
    //Добавляем комментарий для курьера
    public void setComment(String comment){
        driver.findElement(commentField).sendKeys(comment);
    }
    //Нажимаем на кнопку "Заказать"
    public void clickButtonOrderInForm(){
        driver.findElement(orderButtonInForm).click();
    }
    //Заполняем форму целиком
    public void fillAboutRentFormOptionOne(String comment){
        waitForLoadHeaderAboutRent();
        setDateSeven();
        setDurationThree();
        setBlackColor();
        setComment(comment);
        clickButtonOrderInForm();
    }
}