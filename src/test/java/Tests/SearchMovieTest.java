package Tests;

import Adapter.Bases.BaseMobileTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchMovieTest extends BaseMobileTest {

    @Test(priority = 1)
    public void searchMovieTest(){
        String movieTitle = "Melancholia";
        String overview = "Two sisters find their already strained relationship challenged as a mysterious new planet threatens to collide with Earth.";
        loginScreen.skipSignIn();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie(movieTitle);
        Assert.assertEquals(overview, movieScreen.getOverview());
    }

}
