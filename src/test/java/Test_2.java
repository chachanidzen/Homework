import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test_2 extends ChromeRunner {


@Test

    public void Registration() {


        open("/registration");
        $("#firstName").setValue("სახელი");
        Assert.assertEquals("სახელი", $("#firstName").getValue());

       $("#lastName").setValue("გვარი");
       $("#email").setValue("test@test.com");
       $("#password").setValue("123456");
       $("#confirmPassword").setValue("123456");
       $("#singup").shouldBe(Condition.enabled);



    }

 @Test
    public void checkColours(){

    open("/registration");
    $("#firstName").click();
    $("#lastName").click();
    $("#email").click();
    $("#password").click();

    Assert.assertEquals("#dc3545",Color.fromString($("#firstName").getCssValue("border-color")).asHex());
    Assert.assertEquals("#dc3545",Color.fromString($("#lastName").getCssValue("border-color")).asHex());
    Assert.assertEquals("#dc3545",Color.fromString($("#email").getCssValue("border-color")).asHex());


    Assert.assertEquals("#ff1e38",Color.fromString($("#singup").getCssValue("background-color")).asHex());






}






}
