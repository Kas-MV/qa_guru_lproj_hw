package guru.qa.tests;

import guru.qa.state.BaseState;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static io.qameta.allure.Allure.step;

public class TestHomePage extends BaseState {

    @Owner("Kasimov.MV")
    @Severity(SeverityLevel.NORMAL)
    @ValueSource(strings = {"Мототехника", "Экипировка", "Запчасти", "Расходники", "Аксессуары"})
    @ParameterizedTest(name = "Проверка отображения названия каталога {0}")
    void testCatalogDisplays(String text) {
        step("1. Проверка корректного отображения каталога на странице", () ->
                homePage.checkNameCatalog(text));
    }

    static Stream<Arguments> catalogList() {
        return Stream.of(
                Arguments.of("Расходники", List.of("Моторезина", "ГСМ", "Фильтры", "Колодки тормозные", "Аккумуляторы", "Свечи", "Цепной привод")),
                Arguments.of("Аксессуары", List.of("Мотоаксессуары", "Подарочные карты", "Товары для отдыха", "Рюкзаки и сумки", "Сувенирная продукция"))
        );
    }

    @Owner("Kasimov.MV")
    @Severity(SeverityLevel.NORMAL)
    @MethodSource()
    @ParameterizedTest(name = "Проверка отображения категорий в меню {0}")
    void catalogList(String catalog, List<String> category) {
        step("1. Перейти в каталог", () ->
                homePage.clickCatalogName(catalog));
        step("2. Проверка корректного отображения категорий на странице", () ->
                homePage.checkCategoryList(category));
    }
}
