import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen=true;
        Configuration.timeout=10000;
        open("https://www.github.com/");
        $("[data-target=qbsearch-input]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("selenide.org"));
    }

    @Test
    void dayOfWeek() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse("26.09.2024", formatter);

        System.out.println(localDate);

        assertEquals(DayOfWeek.THURSDAY, localDate.getDayOfWeek());

    }

}