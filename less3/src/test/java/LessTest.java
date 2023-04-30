import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LessTest {
   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1920x1080";
   }

   @Test
   void gittest() {
      open("https://github.com/");
      $("[placeholder='Search GitHub']").setValue("Selenide").pressEnter();
      $("[data-search-type='Wikis']").click();
      $("#wiki_search_results").shouldHave(text("SoftAssertions"));
      $("#wiki_search_results").$(byText("SoftAssertions")).click();
      $("[start='3']").shouldHave(text("Using JUnit5 extend test class"));
   }
}