package github;

import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Drag_and_drop {
    @BeforeAll
    static void beforeAll() {
        holdBrowserOpen = true;
        browserSize = "1920x1080";
    }

    @Test
    void changePlace() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement sqA = $("#column-a");
        SelenideElement sqB = $("#column-b");

        sqA.shouldHave(text("A"));
        sqB.shouldHave(text("B"));

        //       actions().moveToElement(sqA).clickAndHold().moveByOffset(250, 0).release().perform();
        sqA.dragAndDrop(DragAndDropOptions.to(sqB)).shouldHave(text("B"));

        sqB.shouldHave(text("A"));
//
    }
}
