package guru.qa.page;

import guru.qa.page.page_elements.HomePageElements;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    HomePageElements homePageElements = new HomePageElements();

    public void openPage() {
        open(baseUrl);
    }

    public void clickSearchField() {
        homePageElements.searchField.click();
    }

    public void clickCatalogName(String catalogName) {
        homePageElements.menuButton.find(text(catalogName)).click();
    }

    public void checkNameCatalog(String namePlates) {
        homePageElements.menuButton.findBy(text(namePlates)).shouldHave(text(namePlates));
    }

    public void checkCategoryList(List<String> catalogName) {
        homePageElements.category.shouldHave(texts(catalogName));
    }

    public void setTextEndPressEnter(String text) {
        homePageElements.searchField.setValue(text).pressEnter();
    }
}