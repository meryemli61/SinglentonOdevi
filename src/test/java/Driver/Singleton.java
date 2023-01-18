package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private static WebDriver driver;

    private Singleton(){

        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.amazon.com");
        driver.close();

    }

    public static Singleton getSingleton(){

        return singleton;
    }

    public static WebDriver getDriver(){

        return driver;
    }


}
