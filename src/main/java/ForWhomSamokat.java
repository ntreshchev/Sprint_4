import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ForWhomSamokat {

    private WebDriver driver;

    //Заголовок "Для кого самокат"
    private By forWhomSamokatHeader = By.xpath(".//div[text()='Для кого самокат']");
    //Форма для кого, имя
    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //Форма для кого, фамилия
    private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //Форма для кого, адрес
    private By adressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Форма для кого, станция метро
    private By metroField = By.xpath(".//input[@placeholder='* Станция метро']");
    //Форма для кого, телефон
    private By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Форма для кого, кнопка далее
    private By daleeInForWhomFormButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");

    public ForWhomSamokat(WebDriver driver) {
        this.driver = driver;
    }
    //Ждем, когда загрузится страница
    public void waitForLoadHeaderForWhomSamokat() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(forWhomSamokatHeader));
    }
    //Заполняем поля
    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public void setSurname(String surname){
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void setAdress(String adress) {
        driver.findElement(adressField).sendKeys(adress);
    }
    public void setMetro() {
        driver.findElement(metroField).click();
        driver.findElement(metroField).sendKeys(Keys.DOWN);
        driver.findElement(metroField).sendKeys(Keys.ENTER);
    }
    public void setPhoneNumber(String phoneNumber){
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }
    //Надимаем на кнопку Далее
    public void clickDaleeInForWhomFormButton(){
        driver.findElement(daleeInForWhomFormButton).click();
    }
    //Заполняем форму целиком
    public void fillInForWhomSamokatForm(String name, String surname, String adress, String phoneNumber) {
        setName(name);
        setSurname(surname);
        setAdress(adress);
        setMetro();
        setPhoneNumber(phoneNumber);
        clickDaleeInForWhomFormButton();
    }
}