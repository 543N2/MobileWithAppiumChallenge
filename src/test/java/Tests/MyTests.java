package Tests;

import Adapter.Bases.BaseMobileTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTests extends BaseMobileTest {

    @Test(priority = 1)
    public void searchMovieTest(){
        String movieTitle = "Melancholia";
        String overview = "Two sisters find their already strained relationship challenged as a mysterious new planet threatens to collide with Earth.";
        loginScreen.skipSignIn();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie(movieTitle);
        Assert.assertEquals(overview, movieScreen.getOverview());
    }

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

    @Test(priority = 1)
    public void rateMovie(){
        String movieTitle = "Jurassic park";
        loginScreen.clickSignInWithGoogleButton();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie(movieTitle);
        movieScreen.scrollPage();
        movieScreen.clickRateButton();
        popUps.rateNineStars();
        String message = popUps.verifySavedRating();
        Assert.assertEquals(message,"Rating saved");
    }


}


