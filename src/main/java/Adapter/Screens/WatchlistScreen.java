package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class WatchlistScreen extends BaseMobileScreen {

    private MobileElement addedMovieTitle = new MobileElement(By.Id, "com.imdb.mobile:id/primaryText","Title of the movie added to watchlist.");

    public WatchlistScreen() { super(); }

    public String verifyMovieTitle() { return findMobileElement(addedMovieTitle).getText(); }
}
