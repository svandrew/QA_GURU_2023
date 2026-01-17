package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.netty.handler.codec.http.cookie.Cookie;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JUnitSimpleTest {

    @DisplayName("Демонстрационный тест")  // Allure вычитвает эту анотацию
    @Test
    void simpleTest (){

    }

    @BeforeEach
    void setUp(){
//        Cookie cookie = apiClient.loginUser(User.ADMIN);
//        Selenide.addCookie(cookie);
//        Selenide.refresh();
//        ProfilePage.openProfile();

        Configuration.holdBrowserOpen=true;
        Configuration.timeout=10000;
        open("https://www.google.com/");

    }
    //@Disabled
    @DisplayName("Адрес https://selenide.org должен быть в ввыдаче гугла по запросу 'selenide")
    @Test
    @Tags({@Tag("Blocker")})
    void selenidSiturlShouldBePresentInResultOfSearchInGoogleBySelenidQuery() {

        $("textarea").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("selenide.org"));
    }

    @Disabled
    @DisplayName("Адрес https://gameta.io должен быть в ввыдаче гугла по запросу 'allure")
    @Test
    @Tags({@Tag("Blocker")})
    void allureSiturlShouldBePresentInResultOfSearchInGoogleByAllureQuery() {

        $("[name=q]").setValue("allure").pressEnter();
        $("[id=search]").shouldHave(text("selenide.org"));
    }
}
