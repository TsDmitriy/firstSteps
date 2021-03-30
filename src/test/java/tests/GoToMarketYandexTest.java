package tests;

import pages.Driver;
import pages.GoToMarketYandex;
import org.junit.*;
import pages.YandexTvPage;


public class GoToMarketYandexTest {

    @BeforeClass
    public static void startDriver() {
        new GoToMarketYandex().getpage();

    }

    @Test
    public void test() {
        new YandexTvPage()
                .searchTV();
    }

    @AfterClass
    public static void stopDriver() {
        Driver.stopDriver();

    }

}