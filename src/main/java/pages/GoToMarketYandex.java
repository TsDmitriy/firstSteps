package pages;

import org.openqa.selenium.By;

public class GoToMarketYandex {

    private String url = "https://market.yandex.ru/";
    private By logoPartMarket = By.xpath("//*[@id=\"logoPartMarket\"]");


    public YandexTvPage getpage() {
        Driver.getInstance().get(url);
        Helpers.presenceOfElementLocated(logoPartMarket);
        return new YandexTvPage();
    }
}
