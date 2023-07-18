package guru.qa.config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {
    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("browser_size")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("browser_version")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("baseUrl")
    @DefaultValue("https://www.vtb.ru/")
    String baseUrl();
}
