package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class YouScreen extends BaseMobileScreen {

    private MobileElement seeAllButton = new MobileElement(By.Id, "com.imdb.mobile:id/see_all","See All watchlist button.");

    public YouScreen() { super(); }

    public void clickSeeAllWatchlist() { findMobileElement(seeAllButton).click(); }
}
