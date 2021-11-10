import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class Test_1 extends ChromeRunner {

    @Test

    public void test_five() {


        Selenide.open("/checkout");
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        //Assert.


        Selenide.open("/saved-product-list");

        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);


        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);

        $("#search_list").val("კომპიუტერი").pressEnter();

        element(".add_to_cart", 0).click();
        $(".btn-cart").click();
        $(".redButton").click();
        $(byText("შენახული ნივთები")).click();

        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);

        sleep(3000);


        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        element(".cross_icon", 0).click();
        sleep(3000);
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);


    }

    @Test

    public void test_six() {


        Selenide.open("/checkout");

        Assert.assertEquals("#FF1E38", Color.fromString($(".search-btn").getCssValue("background-color")).asHex().toUpperCase());
        Assert.assertEquals("#FF1E38", Color.fromString($(byText("ავტორიზაცია")).getCssValue("background-color")).asHex().toUpperCase());


    }
}
