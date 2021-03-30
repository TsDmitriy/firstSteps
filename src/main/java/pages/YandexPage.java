package pages;

import org.openqa.selenium.By;

public class YandexPage {

    private By fieldSearch = By.xpath("//*[@id=\"header-search\"]");
    private String tv= "телевизор";
    private By buttonSearch = By.xpath("//*[@type=\"submit\"]");

    public YandexPage searchTV() {
        Helpers.sendKeys(fieldSearch, tv);
        Helpers.click(buttonSearch);
        return this;
    }
}
