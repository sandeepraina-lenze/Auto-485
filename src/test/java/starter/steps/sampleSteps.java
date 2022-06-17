package starter.steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class sampleSteps extends PageObject {
    public static WebDriver webDriver;

    public static boolean IsElementPresent() {
        if(webDriver.getPageSource().contains("Delete version"))
            return true;

        return false;
    }

    @Step("Sample test run")
    public void runtest() {
        System.setProperty("webdriver.chrome.driver","C:/webdriver/chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","C:/webdriver/geckodriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9015");
//
        webDriver = new ChromeDriver(options);

        System.out.println(IsElementPresent());
//        webDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//        String username = "auto@test1.org";
//        String password = "auto";
//
//        String baseURL = "https://store.staging.mosaiq-test.de/";

        //webDriver.get(baseURL);
        //webDriver.manage().window().maximize();

        //webDriver.findElement(By.id("input-field-versionNumber")).at

//        WebElement elementprice = webDriver.findElement(By.id("input-field-price"));
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("arguments[0].value='8';", elementprice);


//        WebElement element = webDriver.findElement(By.id("input-field-versionNumber"));
//        JavascriptExecutor js1 = (JavascriptExecutor) webDriver;
//        js1.executeScript("arguments[0].value='1.0';", element);
//
//
//
//        //webDriver.execute_script("document.getElementById('input-field-versionNumber').value = '';");
//        webDriver.findElement(By.id("input-field-versionNumber")).clear();
//        webDriver.findElement(By.id("input-field-versionNumber")).sendKeys("1.0");

//        webDriver.findElement(By.id("username")).sendKeys(username);
//        webDriver.findElement(By.id("password")).sendKeys(password);
//        webDriver.findElement(By.name("login")).click();
//
//        WebElement test = webDriver.findElement(By.xpath("//*[text()='App Inventory']"));
//        test.click();
//
//        WebElement app = webDriver.findElement(By.xpath("//*[text()='AutomationApp1']"));
//        app.click();
//
//        WebElement uploadFile = webDriver.findElement(By.id("image-select-field-iconUrl__input"));
//
//        upload("C:/Users/raina/Desktop/1633080559005.jpg").to(find(By.id("image-select-field-iconUrl__input")));
    }

}
