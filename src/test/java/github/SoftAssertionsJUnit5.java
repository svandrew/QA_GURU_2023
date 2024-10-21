package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class SoftAssertionsJUnit5
{
    @Test
    void jUnit5ShoudBeOnThePage() {
        holdBrowserOpen = true;
        baseUrl = "https://github.com";
     
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("Softassertions");
        $("[data-filterable-for=wiki-pages-filter]").shouldHave(text("Softassertions"));
        $(byText("SoftAssertions")).click();
      $$("h4.heading-element").shouldHave(containExactTextsCaseSensitive ("3. Using JUnit5 extend test class:"));
     




    }
}
