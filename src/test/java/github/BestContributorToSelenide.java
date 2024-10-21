package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class BestContributorToSelenide {
    @Test
    void solntsevShoudBeTheTopContributor() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "2400*2800";
        Configuration.browserVersion = "79";
        // открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому аватару из блока Contributor
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-cell")
                .$$("ul li").first().hover();
    // проверить, что
        $(".Popover").shouldHave(text("Andrei Solntsev"));
    }
}
