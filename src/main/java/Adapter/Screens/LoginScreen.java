package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class LoginScreen extends BaseMobileScreen {

    private MobileElement notNowButton = new MobileElement(By.Id, "com.imdb.mobile:id/splash_not_now", "Not now button");

    private MobileElement signInWithFacebookButton = new MobileElement(By.Id,"com.imdb.mobile:id/facebook_oauth","Sign in with Facebook button");

    private MobileElement signInWithGoogleButton = new MobileElement(By.Id,"com.imdb.mobile:id/google_oauth","Sign in with Google button");

    private MobileElement signInWithAmazonButton = new MobileElement(By.Id,"com.imdb.mobile:id/amazon_oauth","Sign in with Amazon button");

    private MobileElement signInWithImdbButton = new MobileElement(By.Id,"com.imdb.mobile:id/imdb_oauth_portal","Sign in with IMDB button");

    public LoginScreen(){ super(); }

    public void skipSignIn(){
        findMobileElement(notNowButton).click();
    }

    public void clickSignInWithGoogleButton() { findMobileElement(signInWithGoogleButton).click(); }

}
