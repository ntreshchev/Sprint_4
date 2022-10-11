import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accordion {
    private WebDriver driver;

    //Аккордеон с FAQ
    //Вопросы 1-8
    private By accordionQuestionOne = By.id("accordion__heading-0");
    private By accordionQuestionTwo = By.id("accordion__heading-1");
    private By accordionQuestionThree = By.id("accordion__heading-2");
    private By accordionQuestionFour = By.id("accordion__heading-3");
    private By accordionQuestionFive = By.id("accordion__heading-4");
    private By accordionQuestionSix = By.id("accordion__heading-5");
    private By accordionQuestionSeven = By.id("accordion__heading-6");
    private By accordionQuestionEight = By.id("accordion__heading-7");

    //поля с тексто 1-8
    private By accordionAnswerOne = By.id("accordion__panel-0");
    private By accordionAnswerTwo = By.id("accordion__panel-1");
    private By accordionAnswerThree = By.id("accordion__panel-2");
    private By accordionAnswerFour = By.id("accordion__panel-3");
    private By accordionAnswerFive = By.id("accordion__panel-4");
    private By accordionAnswerSix = By.id("accordion__panel-5");
    private By accordionAnswerSeven = By.id("accordion__panel-6");
    private By accordionAnswerEight = By.id("accordion__panel-7");

    public Accordion(WebDriver driver) {
        this.driver = driver;
    }

    //Проверка активности элементов аккордеона 1-8
    public boolean checkAccordionQuestionOneIsEnabled() {
        return driver.findElement(accordionQuestionOne).isEnabled();
    }
    public boolean checkAccordionQuestionTwoIsEnabled() {
        return driver.findElement(accordionQuestionTwo).isEnabled();
    }
    public boolean checkAccordionQuestionThreeIsEnabled() {
        return driver.findElement(accordionQuestionThree).isEnabled();
    }
    public boolean checkAccordionQuestionFourIsEnabled() {
        return driver.findElement(accordionQuestionFour).isEnabled();
    }
    public boolean checkAccordionQuestionFiveIsEnabled() {
        return driver.findElement(accordionQuestionFive).isEnabled();
    }
    public boolean checkAccordionQuestionSixIsEnabled() {
        return driver.findElement(accordionQuestionSix).isEnabled();
    }
    public boolean checkAccordionQuestionSevenIsEnabled() {
        return driver.findElement(accordionQuestionSeven).isEnabled();
    }
    public boolean checkAccordionQuestionEightIsEnabled() {
        return driver.findElement(accordionQuestionEight).isEnabled();
    }

    //Клик по элементам аккордеона 1-8
    public void clickAccordionQuestionOne() {
        MainPage ObjMainPage = new MainPage(driver);
        ObjMainPage.clickButtonCookiesOkay();
        driver.findElement(accordionQuestionOne).click();
    }
    public void clickAccordionQuestionTwo() {
        MainPage ObjMainPage = new MainPage(driver);
        ObjMainPage.clickButtonCookiesOkay();
        driver.findElement(accordionQuestionTwo).click();
    }
    public void clickAccordionQuestionThree() {
        MainPage ObjMainPage = new MainPage(driver);
        ObjMainPage.clickButtonCookiesOkay();
        driver.findElement(accordionQuestionThree).click();
    }
    public void clickAccordionQuestionFour() {
        MainPage ObjMainPage = new MainPage(driver);
        ObjMainPage.clickButtonCookiesOkay();
        driver.findElement(accordionQuestionFour).click();
    }
    public void clickAccordionQuestionFive() {
        MainPage ObjMainPage = new MainPage(driver);
        ObjMainPage.clickButtonCookiesOkay();
        driver.findElement(accordionQuestionFive).click();
    }
    public void clickAccordionQuestionSix() {
        MainPage ObjMainPage = new MainPage(driver);
        ObjMainPage.clickButtonCookiesOkay();
        driver.findElement(accordionQuestionSix).click();
    }
    public void clickAccordionQuestionSeven() {
        MainPage ObjMainPage = new MainPage(driver);
        ObjMainPage.clickButtonCookiesOkay();
        driver.findElement(accordionQuestionSeven).click();
    }
    public void clickAccordionQuestionEight() {
        MainPage ObjMainPage = new MainPage(driver);
        ObjMainPage.clickButtonCookiesOkay();
        driver.findElement(accordionQuestionEight).click();
    }

    //Проверка видимости элементов аккордеона 1-8
    public boolean checkAccordionAnswerOneIsDisplayed() {
        return driver.findElement(accordionAnswerOne).isDisplayed();
    }
    public boolean checkAccordionAnswerTwoIsDisplayed() {
        return driver.findElement(accordionAnswerTwo).isDisplayed();
    }
    public boolean checkAccordionAnswerThreeIsDisplayed() {
        return driver.findElement(accordionAnswerThree).isDisplayed();
    }
    public boolean checkAccordionAnswerFourIsDisplayed() {
        return driver.findElement(accordionAnswerFour).isDisplayed();
    }
    public boolean checkAccordionAnswerFiveIsDisplayed() {
        return driver.findElement(accordionAnswerFive).isDisplayed();
    }
    public boolean checkAccordionAnswerSixIsDisplayed() {
        return driver.findElement(accordionAnswerSix).isDisplayed();
    }
    public boolean checkAccordionAnswerSevenIsDisplayed() {
        return driver.findElement(accordionAnswerSeven).isDisplayed();
    }
    public boolean checkAccordionAnswerEightIsDisplayed() {
        return driver.findElement(accordionAnswerEight).isDisplayed();
    }

    //Метод для определения работоспособности элемента 1 в аккондеоне
    public boolean checkAccordionOneIsWorking() {
        checkAccordionQuestionOneIsEnabled();
        clickAccordionQuestionOne();
        return checkAccordionAnswerOneIsDisplayed();
    }

    //Метод для определения работоспособности элемента 2 в аккондеоне
    public boolean checkAccordionTwoIsWorking() {
        checkAccordionQuestionTwoIsEnabled();
        clickAccordionQuestionTwo();
        return checkAccordionAnswerTwoIsDisplayed();
    }

    //Метод для определения работоспособности элемента 3 в аккондеоне
    public boolean checkAccordionThreeIsWorking() {
        checkAccordionQuestionThreeIsEnabled();
        clickAccordionQuestionThree();
        return checkAccordionAnswerThreeIsDisplayed();
    }

    //Метод для определения работоспособности элемента 4 в аккондеоне
    public boolean checkAccordionFourIsWorking() {
        checkAccordionQuestionFourIsEnabled();
        clickAccordionQuestionFour();
        return checkAccordionAnswerFourIsDisplayed();
    }

    //Метод для определения работоспособности элемента 5 в аккондеоне
    public boolean checkAccordionFiveIsWorking() {
        checkAccordionQuestionFiveIsEnabled();
        clickAccordionQuestionFive();
        return checkAccordionAnswerFiveIsDisplayed();
    }

    //Метод для определения работоспособности элемента 6 в аккондеоне
    public boolean checkAccordionSixIsWorking() {
        checkAccordionQuestionSixIsEnabled();
        clickAccordionQuestionSix();
        return checkAccordionAnswerSixIsDisplayed();
    }

    //Метод для определения работоспособности элемента 7 в аккондеоне
    public boolean checkAccordionSevenIsWorking() {
        checkAccordionQuestionSevenIsEnabled();
        clickAccordionQuestionSeven();
        return checkAccordionAnswerSevenIsDisplayed();
    }

    //Метод для определения работоспособности элемента 7 в аккондеоне
    public boolean checkAccordionEightIsWorking() {
        checkAccordionQuestionEightIsEnabled();
        clickAccordionQuestionEight();
        return checkAccordionAnswerEightIsDisplayed();
    }
}