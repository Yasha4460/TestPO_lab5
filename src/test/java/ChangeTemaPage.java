import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.appium.SelenideAppium;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.AppiumScrollOptions.down;
import static com.codeborne.selenide.appium.AppiumScrollOptions.with;
import static com.codeborne.selenide.appium.ScrollDirection.DOWN;

public class ChangeTemaPage {
    private static SelenideElement menu = $(By.xpath("//android.widget.ImageButton[@content-desc=\"Открыть боковое меню\"]"));
    private static SelenideElement more = $(By.xpath("//android.view.ViewGroup[@content-desc=\"Ещё\"]"));
    private static SelenideElement inst1 = $(By.xpath(".//*[@text='Настройки']"));
    private static SelenideElement inst2 = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]"));
    private static SelenideElement inst3 = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView"));
    private static SelenideElement inst4 = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]"));
    private static SelenideElement blackTema = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
    private static SelenideElement inst5 = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]"));
    private static SelenideElement whiteTema = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"));

    public void clickMenu(){
        menu.should(Condition.exist).click();
    }
    public void clickMore(){
        more.should(Condition.exist).click();
    }
    public void clickInst1(){
        inst1.should(Condition.exist).click();
    }
    public void clickInst2(){
        inst2.should(Condition.exist).click();
    }
    public void clickInst3(){
        inst3.should(Condition.exist).click();
    }
    public void clickInst4(){
        inst4.should(Condition.exist).click();
    }
    public void clickBlack(){
        blackTema.should(Condition.exist).click();
    }
    public void clickInst5(){
        inst5.should(Condition.exist).click();
    }
    public void clickWhite(){
        whiteTema.should(Condition.exist).click();
    }
    public void swipeDownLogOut()
    {
        SelenideAppium.$x(".//*[@text='Яна Сурина']");
        SelenideAppium.$x(".//*[@text='Видео']")
                .scroll(with(DOWN, 1));
        SelenideAppium.$x(".//*[@text='Выйти']")
                .scroll(down())
                .shouldHave(visible);
    }
}
