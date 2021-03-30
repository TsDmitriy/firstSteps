package pages;

import org.openqa.selenium.By;

public class YandexTvPage {

    private By fieldSearch = By.xpath("//*[@id=\"header-search\"]");
    private String tv= "телевизор";
    private By buttonSearch = By.xpath("//*[@type=\"submit\"]");
    private By titleTv = By.xpath("//*[@title=\"Телевизоры и аксессуары\"]");


    public YandexTvPage searchTV() {
        Helpers.sendKeys(fieldSearch, tv);
        Helpers.click(buttonSearch);
        Helpers.presenceOfElementLocated(titleTv);
        return this;
    }
}
