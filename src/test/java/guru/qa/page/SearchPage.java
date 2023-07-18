package guru.qa.page;

import guru.qa.page.page_elements.SearchPageElements;
import org.junit.jupiter.api.Assertions;

public class SearchPage {

    SearchPageElements searchPageElements = new SearchPageElements();

    public void checkSearchList() {
        Assertions.assertTrue(searchPageElements.searchList.isDisplayed());
    }
}
