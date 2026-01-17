package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest_A {

    @BeforeEach
    void setUp(){

        open("https://ru.selenide.org/");

    }

    @MethodSource("selenideLocklGriverProvider")
    @DisplayName("Адрес https://selenide.org должен быть в ввыдаче гугла по запросу 'selenide")
    @ParameterizedTest(name = "для локали {0} отображаются кнопки {1}")
    @Tag("Blocker")
    void selenidShouldControlButtons(
            Locale locale,
            List<String> buttons)
    {
        open("http://selenide.org");
        $$("#languages a").find(text(locale.name())).click();
        $$(".main-menu-pages a")
                .filter(visible)
                .shouldHave(texts(buttons));
    }

    static Stream<Arguments> selenideLocklGriverProvider() {
        return Stream.of(
                Arguments.of(Locale.EN, List.of("Quick start", "Docs", "FAQ", "Blog", "Javadoc", "Users", "Quotes")),
                Arguments.of(Locale.RU, List.of("С чего начать?", "Док", "ЧАВО", "Блог", "Javadoc", "Пользователи", "Отзывы"))
        );
    }


}
