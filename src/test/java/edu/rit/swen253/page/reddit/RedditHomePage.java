package edu.rit.swen253.page.reddit;

import edu.rit.swen253.page.AbstractPage;
import edu.rit.swen253.page.sample.RitAreaOfStudyLink;
import edu.rit.swen253.utils.BrowserType;
import edu.rit.swen253.utils.DomElement;
import edu.rit.swen253.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static edu.rit.swen253.utils.SeleniumUtils.getLongWait;
import static edu.rit.swen253.utils.SeleniumUtils.makeWait;
import static org.junit.jupiter.api.Assertions.fail;

public class RedditHomePage extends AbstractPage {

    public RedditHomePage() {
        super();
    }

    public DomElement getSearchInput() {
        switch (BrowserType.discover()) {
            case CHROME:
                return findOnPage(By.tagName("reddit-search-large"));
            case EDGE:
                return findOnPage(By.tagName("reddit-search-large"));
            case FIREFOX:
                return findOnPage(By.tagName("reddit-search-bar"));
        }
        return findOnPage(By.tagName("reddit-search-large"));
    }

    public void submitSearch(String search) {
        DomElement searchInput = getSearchInput();
        searchInput.click();
        searchInput.sendKeys(search);
        searchInput.sendKeys(Keys.ENTER);
    }
}
