package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MobileElement;
import Core.By;

public class PopUps extends BaseMobileScreen {

    private MobileElement denyButton = new MobileElement(By.Id, "com.android.permissioncontroller:id/permission_deny_button", "Deny button for location");

    private MobileElement okButton = new MobileElement(By.Id, "android:id/button2", "OK Button for notification popup");

    private MobileElement googleAccountRadioButton = new MobileElement(By.Xpath, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]","Google account radiobutton.");

    private MobileElement okButtonAccount = new MobileElement(By.Id, "android:id/button1","Button OK to confirm Google account.");

    private MobileElement rateNineStarsButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_9","Rate with 9 stars button.");

    private MobileElement rateButton = new MobileElement(By.Id, "com.imdb.mobile:id/rate_title_button","Rate button.");

    private MobileElement savedRatingNav = new MobileElement(By.IdVisible,"com.imdb.mobile:id/title","Bottom nav with saved rating confirmation");

    public PopUps() { super(); }

    public void denyLocation() {
        findMobileElement(denyButton).click();
    }

    public void acceptIMDBNotification() {
        findMobileElement(okButton).click();
    }

    public void chooseGoogleAccount() { findMobileElement(googleAccountRadioButton).click(); }

    public void selectOkAccount() { findMobileElement(okButtonAccount).click(); }

    public void rateNineStars() {
        findMobileElement(rateNineStarsButton).click();
        findMobileElement(rateButton).click();
    }

    public String verifySavedRating() {
        return findMobileElement(savedRatingNav).getText();
    }


}
