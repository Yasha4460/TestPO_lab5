import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.appium.AppiumScrollOptions;
import com.codeborne.selenide.appium.ScrollDirection;
import com.codeborne.selenide.appium.SelenideAppium;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.appium.AppiumScrollOptions.*;
import static com.codeborne.selenide.appium.ScrollDirection.DOWN;
import static com.codeborne.selenide.appium.ScrollDirection.UP;

public class Ok {
    private static LoginPage loginPage;
    private static LogoutPage logoutPage;
    private static ChangeTemaPage changeTemaPage;
    static AndroidDriver driver;

    @BeforeAll
    public static void setUp() throws MalformedURLException {
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "android");
        capabilities.setCapability("VERSION", "11.0");
        capabilities.setCapability("deviceName","TestOk");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "ru.ok.android");
        capabilities.setCapability("appActivity","ru.ok.android.ui.activity.main.OdklActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        WebDriverRunner.setWebDriver(driver);
        Configuration.timeout=20000;
        open();

        loginPage = new LoginPage();
        logoutPage = new LogoutPage();
        changeTemaPage = new ChangeTemaPage();
    }

    @org.junit.jupiter.api.Test
    public void testOk() throws Exception {
        //********вход
        logIn();
        mes();
        //*******смена темы
        changeTema();
        //*************выход из акка
        logOut();
        //logOut2();
    }

    public void logIn(){
        loginPage.LogIn();
        loginPage.LogPass();
        loginPage.LogButton();
        loginPage.swipeDownLenta();
        loginPage.swipeUpLenta();
    }
    public void mes(){
        loginPage.clickMes();
    }
    public void changeTema(){
        changeTemaPage.clickMenu();
        changeTemaPage.clickMore();
        changeTemaPage.swipeDownLogOut();
        changeTemaPage.clickInst1();
        changeTemaPage.clickInst2();
        changeTemaPage.clickInst3();
        changeTemaPage.clickInst4();
        changeTemaPage.clickBlack();
        changeTemaPage.clickInst5();
        changeTemaPage.clickWhite();
    }
    public void logOut(){
        logoutPage.clickUp1();
        logoutPage.clickUp2();
        logoutPage.clickUp3();
        logoutPage.clickMenu();
        logoutPage.clickLogOut();
        logoutPage.clickLogOut1();
        logoutPage.clickLogOut2();
    }
}
