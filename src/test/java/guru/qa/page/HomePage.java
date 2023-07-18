package guru.qa.page;

import guru.qa.page.page_elements.HomePageElements;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    HomePageElements homePageElements = new HomePageElements();

    public void openPage() {
        open(baseUrl);
    }

    public void clickCategoryButton(String nameButton) {
        homePageElements.category.find(text(nameButton)).click();
    }

    public void checkLabel(String name) {
        Assertions.assertTrue(homePageElements.productLabel.find(text(name)).isDisplayed());
    }
}