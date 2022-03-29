package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class SearchScreen extends BaseMobileScreen {

    public SearchScreen() { super(); }

    private MobileElement searchInput = new MobileElement(By.Id,"com.imdb.mobile:id/search_src_text","Search input");

    private MobileElement firstMovie = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/holder\").index(0)","First movie");

    public void searchMovie(String movie) {
        findMobileElement(searchInput).click()
                .clear()
                .sendKeys(movie);
        findMobileElement(firstMovie).click();
    }
}
