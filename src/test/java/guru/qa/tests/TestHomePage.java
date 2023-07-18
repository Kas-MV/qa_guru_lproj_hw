package guru.qa.tests;

import guru.qa.state.BaseState;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.step;


@DisplayName("Smock тесты для главной страницы банка")
@Tag("smoke")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestHomePage extends BaseState {

    @Owner("Kasimov.MV")
    @Severity(SeverityLevel.NORMAL)
    @CsvSource(value = {"Кредиты, Потребительские кредиты", "Карты, Банковские карты",
            "Ипотека, Ипотека", "Автокредиты, Автокредиты", "Вклады и счета, Вклады и счета", "Инвестиции, Инвестиции"})
    @ParameterizedTest(name = "Проверка отображения названия каталога {0}")
    void checkCreditInfo(String product, String label) {
        step("1. Открыть главную страницу", () ->
                homePage.openPage());
        step("2. Выбрать продукт", () ->
                homePage.clickCategoryButton(product));
        step("3. Проверить отображение продукта", () ->
                homePage.checkLabel(label));
    }
}
