package pages;

import java.util.PrimitiveIterator;

public class GoToMarketYandex {

    private String url = "https://market.yandex.ru/";
    private String logoPartMarket = "//*[@id=\"logoPartMarket\"]";


    public YandexPage getpage() {
        Driver.getInstance().get(url);
        return new YandexPage();
    }
}
