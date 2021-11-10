package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {

    @BeforeTest

    public  static void setup( ){

        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Configuration.baseUrl="https://ee.ge";


    }

    @AfterTest

    public static void tearDown (){


        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();


    }



}
