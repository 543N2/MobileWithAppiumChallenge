package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class GlobalNavigationScreen extends BaseMobileScreen {

    private MobileElement homeIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_home", "Home button");
    private MobileElement searchIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_search_browse", "Search button");
    private MobileElement videoIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_video", "video_button");
    private MobileElement youIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_you", "You button");

    public GlobalNavigationScreen(){ super(); }

    public void goToHomeOption() { findMobileElement(homeIcon).click(); }

    public void goToSearchOption() { findMobileElement(searchIcon).click(); }

    public void goToVideoOption() { findMobileElement(videoIcon).click(); }

    public void goToYouOption() { findMobileElement(youIcon).click(); }
}
