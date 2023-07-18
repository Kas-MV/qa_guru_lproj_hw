package guru.qa.page.page_elements;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class HomePageElements {

    /**
     * Категории
     */
    public final ElementsCollection category = $$(".bQnwLi");

    /**
     * Название категорий
     */
    public final ElementsCollection productLabel = $$(".cYVgJq");
}
