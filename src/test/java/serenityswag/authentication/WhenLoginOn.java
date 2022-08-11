package serenityswag.authentication;


import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoginOn extends UIInteractionSteps {

    final String USER_NAME = "standard_user";
    final String PASSWORD = "secret_sauce";


    @Managed
    WebDriver driver;


    @Test
     public void userCanLogOnViaTheHomePage(){
//        driver.get("https://www.saucedemo.com/");
        openUrl("https://www.saucedemo.com/");


//        locator as a standard user

//        driver.findElement(By.id("user-name")).sendKeys(USER_NAME);
//        driver.findElement(By.id("password")).sendKeys(PASSWORD);
//        driver.findElement(By.id("login-button")).click();

//          when we extend the UIInteractionSteps class to look for the elements directly without calling the webDriver

//        find("#user-name").sendKeys(USER_NAME);
//        find("#password").sendKeys(PASSWORD);
//        find("#login-button").click();

        // to simplify the code we can replace the "find" with $ <- JQuery notation

        $("#user-name").sendKeys(USER_NAME);
        $("#password").sendKeys(PASSWORD);
        $("#login-button").click();


//       Should see product catalog

//        assertThat(driver.findElement(By.cssSelector(".title")).getText())
//                .isEqualToIgnoringCase("Products");

        assertThat($(".title").getText())
                .isEqualToIgnoringCase("Products");
    }

}
