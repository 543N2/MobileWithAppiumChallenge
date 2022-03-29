package Adapter.Bases;

import Adapter.Screens.*;
import Core.ConfigCapabilities;
import Core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;


public class BaseMobileTest {

    private AndroidDriver <AndroidElement> driver;
    public LoginScreen loginScreen;
    public GlobalNavigationScreen globalNavigationScreen;
    public SearchScreen searchScreen;
    public MovieScreen movieScreen;
    public PopUps popUps;
    public YouScreen youScreen;
    public WatchlistScreen watchlistScreen;


    @BeforeSuite(alwaysRun = true)
    public void SetUp(){
        driver = MobileAppDriver.GetMoviesAppDriver(ConfigCapabilities.GetCapabilities());
        loginScreen = new LoginScreen();
        globalNavigationScreen = new GlobalNavigationScreen();
        searchScreen = new SearchScreen();
        movieScreen = new MovieScreen();
        popUps = new PopUps();
        youScreen = new YouScreen();
        watchlistScreen = new WatchlistScreen();
        popUps.denyLocation();
        popUps.acceptIMDBNotification();

    }

    @AfterSuite(alwaysRun = true)
    public void TearDown()
    {
        if(driver != null){
            driver.quit();
        }
    }

}



