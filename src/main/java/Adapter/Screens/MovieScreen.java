package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MovieScreen extends BaseMobileScreen {

    private MobileElement movieOverview = new MobileElement(By.Id,"com.imdb.mobile:id/plot_overview","Movie overview");

    private MobileElement addToWatchlistButton = new MobileElement(By.Id,"com.imdb.mobile:id/state_off","Add to watchlist button");

    private MobileElement mainPage = new MobileElement(By.Id,"com.imdb.mobile:id/main_content","Movie main page");

    private MobileElement scrollToReview = new MobileElement(By.AndroidUiSelector,"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"User reviews\"))","Rate movie star button.");

    private MobileElement rateStarButton = new MobileElement(By.Id,"com.imdb.mobile:id/empty_rating_star","Rate movie star button.");


    public MovieScreen(){ super(); }

    public String getOverview() {
        return findMobileElement(movieOverview).getText();}

    public void clickAddToWatchlistButton() { findMobileElement(addToWatchlistButton).click(); }

    public void scrollPage() {
        findMobileElement(scrollToReview);
    }

    public void clickRateButton () { findMobileElement(rateStarButton).click(); }
}
