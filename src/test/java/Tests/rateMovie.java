package Tests;

import Adapter.Bases.BaseMobileTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class rateMovie extends BaseMobileTest {

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
