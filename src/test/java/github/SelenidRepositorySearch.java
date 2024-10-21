package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenidRepositorySearch {
    @Test
    void shoudFinedSelinidRepositoryAtTop() {
        Configuration.holdBrowserOpen = true;
//        Configuration.timeout=10000;
        open("https://github.com/");
        $(".search-input-container").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("div[data-testid=results-list] div").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide"));
        System.out.println("5 шаг успешен");
    }

}
