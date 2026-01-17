package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class PvkAruRzaSupportFormsTest {

    @BeforeEach
    void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.arurza.ru/index.php";
    }

    static Stream<Arguments> aruRzaDataProvider() {
        return Stream.of(
                Arguments.of("/support", List.of(
                        "Контактное лицо (Ф.И.О) *",
                        "Организация *",
                        "Город",
                        "Эл.почта *",
                        "Телефон *",
                        "В чем состоит вопрос",
                        "Принимаю условия пользовательского соглашения (см. «Поддержка») *")),
                Arguments.of("/support/demoversion", List.of(
                        "Название организации *",
                        "Сфера деятельности *",
                        "Город *",
                        "Адрес",
                        "Контактное лицо (Ф.И.О) *",
                        "Должность", "Эл.почта *",
                        "Телефон *",
                        "Дополнительная информация",
                        "Принимаю условия пользовательского соглашения (см. «Поддержка») *"))
        );
    }

    @MethodSource("aruRzaDataProvider")
    @ParameterizedTest(name = "Для страницы {0} отображаются названия полей {1}")
    @Tags({@Tag("CRITICAL"), @Tag("UI_TEST")})
    void pvkAruRzaSupportFormShouldHaveLabels( String relativeUrl, List<String> labels) {
        open(relativeUrl);
        $$(".item-page .qf2label")
                .filter(visible)
                .shouldHave(texts(labels));

    }

    @CsvFileSource(resources = "/testData.csv")
    @ParameterizedTest(name = "Для страницы {0} количество названий полей равно {1}")
    @Tags({@Tag("CRITICAL"), @Tag("UI_TEST")})
    void pvkAruRzaSupportFormShouldHaveTextsSize( String relativeUrl, int size) {
        open(relativeUrl);
        $$(".item-page .qf2label")
                .filter(visible)
                .shouldHave(size(size));

    }

    @CsvSource({
            "/support, 5",
            "/support/demoversion, 8"
    })
    @ParameterizedTest(name = "Для страницы {0} количество полей ввода текста равно {1}")
    @Tags({@Tag("CRITICAL"), @Tag("UI_TEST")})
    void pvkAruRzaSupportFormShouldHaveInputsSize( String relativeUrl, int size) {
        open(relativeUrl);
        $$(".item-page input[type=text]")
                .filter(visible)
                .shouldHave(size(size));

    }


}