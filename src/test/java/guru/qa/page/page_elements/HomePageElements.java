package guru.qa.page.page_elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePageElements {

    /**
     * Название категории
     */
    public final ElementsCollection category = $$(".category");

    /**
     * Главное меню категорий
     */
    public final ElementsCollection menuButton = $$(".root-item");

    /**
     * Поле поиска
     */
    public final SelenideElement searchField = $("#title-search-input");
}
