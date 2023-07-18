package guru.qa.page.page_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageElements {

    /**
     * Список поиска
     */
    public final SelenideElement searchList = $(".bx_catalog_list_home");
}
