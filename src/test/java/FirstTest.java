import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;



public class FirstTest {
    WebDriver driver; // Переменная обьявляется внутри класса. Когда обьявляем внутри класса, ее видят все, когда внутри метода, ее видят только метод
    //WebDriver driver - это переменная;
    @BeforeClass // Данный атрибут TestNG  - используется как предварительное условие. Осуществл. 1 раз

    public void preCondition(){
        driver = new FirefoxDriver(); // Запускается фаерфокс
        driver.get("http://192.168.197.61:8080"); // Заходит на страницу
    }

    @AfterClass
    public void afterCl(){
        driver.quit();
    }

    @BeforeMethod // осуществляется перед каждым тестом
    public void before(){
        driver.manage().deleteAllCookies();
    }

    @Test(priority = 0) // Тест №2
    public void loginTest() {
        // WebDriver driver = new FirefoxDriver();
        // driver.get("http://192.168.197.61:8080");

        WebElement loginInput = driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
        // WebElement loginInput = driver.findElement(By.id("j_username")); // Search elements by Id
        /*
        Поиск лучше осуществлять по id, это наименее динамическая часть кода по сравнение с xpath или поиском
        по классу
        Но часто бывает что Id не используется у элементов
         */
        loginInput.sendKeys("admin");
        WebElement passInput = driver.findElement(By.xpath("//*[@id=\"j_password\"]"));
        passInput.sendKeys("admin");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/form/input"));
        loginButton.click();
        WebElement welcome = driver.findElement(By.xpath("/html/body/div[1]/div[1]"));
        welcome.isDisplayed();
        WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[2]"));
        logout.click();

    }

    /* @Test(priority = 1) //Тест №2
     public void login_Page() {
         WebElement loginInput = driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
         loginInput.sendKeys("admin");
         WebElement passInput = driver.findElement(By.xpath("//*[@id=\"j_password\"]"));
         passInput.sendKeys("admin");
         WebElement loginButton = driver.findElement(By.xpath("/html/body/div/form/input"));
         loginButton.click();
         WebElement welcome = driver.findElement(By.xpath("/html/body/div[1]/div[1]"));
         welcome.isDisplayed();
     }
     */
    @Test(priority = 2) // Тест №3
    public void invalidLogin() {
        // WebDriver driver = new FirefoxDriver();
        // driver.get("http://192.168.197.61:8080");

        WebElement loginInput = driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
        // WebElement loginInput = driver.findElement(By.id("j_username")); // Search elements by Id
        /*
        Поиск лучше осуществлять по id, это наименее динамическая часть кода по сравнение с xpath или поиском
        по классу
        Но часто бывает что Id не используется у элементов
         */
        loginInput.sendKeys("admin");
        WebElement passInput = driver.findElement(By.xpath("//*[@id=\"j_password\"]"));
        passInput.sendKeys("asdasdasd");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/form/input"));
        loginButton.click();
        WebElement errorText = driver.findElement(By.className("flash"));
        errorText.isDisplayed();
        Assert.assertEquals("You have entered an invalid username or password!", "You have entered an invalid username or password!"); // Проверка что текст присутствует


        /*WebElement loginInput1 = driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
        loginInput1.sendKeys("asadsadasd");
        WebElement passInput1 = driver.findElement(By.xpath("//*[@id=\"j_password\"]"));
        passInput1.sendKeys("admin");
        WebElement errorText1 = driver.findElement(By.className("flash"));
        errorText1.isDisplayed();
        ТАк лучше не делать
         */
    }
}


/*
Before class он осуществляетс 1 перед всеми тестами
Before method осуществляется перед каждым тестом
Затем осуществляется каждый тест
Затем осуществляется  еще after method  (выполняется после каждого метода)
Затем после after method опять запускает before method
итд
В самом конце выполнится after class


Тесты если заданы без приоритета исполняются по алфавиту (во всяком случае в IDEA)
Если приоритет задан, то самый первый тест будет исполнен с самой наименьшей цифрой в приоритете
 */
