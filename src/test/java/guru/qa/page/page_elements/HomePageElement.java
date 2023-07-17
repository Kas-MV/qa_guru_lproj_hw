package guru.qa.page.page_elements;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class HomePageElement {

    /**
     * Название категории
     */
    public final ElementsCollection category = $$(".category");

    /**
     * Главное меню категорий
     */
    public final ElementsCollection menuButton = $$(".root-item");

}
