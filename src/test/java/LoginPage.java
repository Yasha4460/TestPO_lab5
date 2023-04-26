import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.appium.SelenideAppium;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.appium.AppiumScrollOptions.*;
import static com.codeborne.selenide.appium.ScrollDirection.DOWN;
import static com.codeborne.selenide.appium.ScrollDirection.UP;
import static com.codeborne.selenide.appium.SelenideAppium.$;

public class LoginPage {

    private static SelenideElement inputLogin = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).setValue("79876144517");;
    private static SelenideElement inputPass = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).setValue("Yasha4460");
    private static SelenideElement buttonLogin = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button"));
    private static SelenideElement messages = $(By.xpath("//android.view.ViewGroup[@content-desc=\"Сообщения\"]"));
    public void LogIn() {
        inputLogin.should(Condition.exist).click();
    }
    public void LogPass() {
        inputPass.should(Condition.exist).click();
    }
    public void LogButton() {
        buttonLogin.should(Condition.exist).click();
    }
    public void clickMes(){
        messages.should(Condition.exist).click();
        swipeUpMes();
    }
    public void swipeDownLenta()
    {
        SelenideAppium.$x(".//*[@text='Добавьте друзей из контактов в Вашем телефоне']").shouldBe(visible);
        SelenideAppium.$x(".//*[@text='Группы для вас']")
                .scroll(with(DOWN, 1));
        SelenideAppium.$x(".//*[@text='Популярные поиски']")
                .scroll(down())
                .shouldHave(visible);
    }

    public void swipeUpLenta()
    {
        SelenideAppium.$x(".//*[@text='Популярные поиски']").shouldBe(visible);
        SelenideAppium.$x(".//*[@text='Группы для вас']")
                .scroll(with(UP, 1));
        SelenideAppium.$x(".//*[@text='Добавьте друзей из контактов в Вашем телефоне']")
                .scroll(up())
                .shouldHave(visible);
    }
    public void swipeUpMes()
    {
        SelenideAppium.$x(".//*[@text='Спутник']");
        SelenideAppium.$x(".//*[@text='Розалия Ахтямова-Акбашева']")
                .scroll(with(UP, 1));
        SelenideAppium.$x(".//*[@text='Спутник']")
                .scroll(up())
                .shouldHave(visible);
    }
}
