package tests;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Junit5TestLaunch {


    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        open("https://marmelab.com/react-admin-demo/#/login");
        Selenide.clearBrowserLocalStorage();
        Selenide.refresh();
    }

    @AfterEach
    public void afterEach() {
    //     WebDriverRunner.closeWebDriver(); //- эту строку НЕ вызываем
    }


    @CsvSource(
            {
                    "demo, demo",
                    "test, test"
            }
    )
    @ParameterizedTest(name = "Login {0}, password {1}")
    @Tag("UI_TEST")
    public void logIn(String name, String password) {
        $("[name=\"username\"]").setValue(name);
        $("[name = 'password']").setValue(password);
        $(byText("Sign in")).click();
    }

    @CsvFileSource(resources = "/data.csv")
    @DisplayName("Customers test")
    @ParameterizedTest(name = "On {0} should be more or equal {1} customers")
    @Tag("UI_TEST")
    public void checkCustomersSize(String page, int size) {
        $("[name=\"username\"]").setValue("demo");
        $("[name = 'password']").setValue("demo");
        $(byText("Sign in")).click();
        $(".RaSidebar-fixed").$x(".//a[@href='#/customers']").click();
        $(".MuiTableBody-root").shouldBe(Condition.visible).$$("tr").shouldBe(CollectionCondition.sizeGreaterThanOrEqual(size));
    }


    @MethodSource("dataForSideBar")
    @ParameterizedTest(name = "On page {0} should be visible {1}")
    @Tag("UI_TEST")
    public void checkSideBar(String pageName, List<String> values) {
        $("[name=\"username\"]").setValue("demo");
        $("[name = 'password']").setValue("demo");
        $(byText("Sign in")).click();

        $$(".RaSidebar-fixed a").shouldHave(texts(values));
    }

    private static Stream<Arguments> dataForSideBar() {
        return Stream.of(
                Arguments.of("Main page", List.of(
                        "Dashboard",
                        "Orders",
                        "Invoices",
                        "Posters",
                        "Categories",
                        "Customers",
                        "Segments",
                        "Reviews"
                ))
        );
    }
}