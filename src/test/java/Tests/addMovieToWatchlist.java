package Tests;

import Adapter.Bases.BaseMobileScreen;
import Adapter.Bases.BaseMobileTest;
import Adapter.Screens.MovieScreen;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addMovieToWatchlist extends BaseMobileTest {

    @Test(priority = 1)
    public void addMovieToWatchlist(){
        String movieTitle = "Space Jam";
        loginScreen.clickSignInWithGoogleButton();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie(movieTitle);
        movieScreen.clickAddToWatchlistButton();
        globalNavigationScreen.goToYouOption();
        youScreen.clickSeeAllWatchlist();
        String readMovieTitle = watchlistScreen.verifyMovieTitle();
        Assert.assertEquals(movieTitle,readMovieTitle);
    }

}
