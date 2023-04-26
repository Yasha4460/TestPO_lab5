import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogoutPage {
    private static SelenideElement up1 = $(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
    private static SelenideElement up2 = $(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
    private static SelenideElement up3 = $(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
    private static SelenideElement menu = $(By.xpath("//android.widget.ImageButton[@content-desc=\"Открыть боковое меню\"]"));
    private static SelenideElement logOut = $(By.xpath(".//*[@text='Выйти']"));
    private  static SelenideElement logOut1 = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.CheckBox"));
    private  static SelenideElement logOut2 = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]"));

    public void clickUp1(){
        up1.should(Condition.exist).click();
    }
    public void clickUp2(){
        up2.should(Condition.exist).click();
    }
    public void clickUp3(){
        up3.should(Condition.exist).click();
    }
    public void clickMenu(){
        menu.should(Condition.exist).click();
    }
    public void clickLogOut(){
        logOut.should(Condition.exist).click();
    }
    public void clickLogOut1(){
        logOut1.should(Condition.exist).click();
    }
    public void clickLogOut2(){
        logOut1.should(Condition.exist).click();
    }
}
