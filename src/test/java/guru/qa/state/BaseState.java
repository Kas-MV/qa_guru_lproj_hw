package guru.qa.state;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.page.HomePage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static guru.qa.helpers.Attachments.*;
import static java.lang.System.getProperty;

public abstract class BaseState {

    public HomePage homePage = new HomePage();


    @BeforeAll
    static void init() {
        Configuration.baseUrl = System.getProperty("baseUrl", "https://www.rollingmoto.ru/");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browser = getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
        Configuration.remote = System.getProperty("selenoid");
        Configuration.pageLoadStrategy = "eager";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void quite() {
        screenshotAs("Last screenshot");
        pageSource();
        browserConsoleLogs();
        addVideo();


        closeWebDriver();
    }
}
