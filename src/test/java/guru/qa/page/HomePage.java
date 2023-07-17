package guru.qa.page;

import guru.qa.page.page_elements.HomePageElement;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;

public class HomePage {

    HomePageElement homePageElement = new HomePageElement();

    public void clickCatalogName(String catalogName) {
        homePageElement.menuButton.find(text(catalogName)).click();
    }

    public void checkNameCatalog(String namePlates) {
        homePageElement.menuButton.findBy(text(namePlates)).shouldHave(text(namePlates));
    }

    public void checkCategoryList(List<String> catalogName) {
        homePageElement.category.shouldHave(texts(catalogName));
    }
}