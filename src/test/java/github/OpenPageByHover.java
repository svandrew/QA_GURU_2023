package github;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class OpenPageByHover {

   @Test
   void TheAIPoweredShoudBeOnThePage() {
      holdBrowserOpen=true;
      SelenideElement title = element("#hero-section-brand-heading");

      open("https://github.com/");
      $(withText("Solutions")).hover();
      $(withText("Enterprise")).click();
      title.shouldBe(visible, Duration.ofSeconds(30));
      title.shouldHave(text("The AI-powered"),
                      text("developer platform."));
   }

}
