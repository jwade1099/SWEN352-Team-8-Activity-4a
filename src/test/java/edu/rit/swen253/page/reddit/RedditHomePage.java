package edu.rit.swen253.page.reddit;

import edu.rit.swen253.page.AbstractPage;
import edu.rit.swen253.page.sample.RitAreaOfStudyLink;
import edu.rit.swen253.utils.DomElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class RedditHomePage extends AbstractPage {

    public RedditHomePage() {
        super();
    }

    public DomElement getSearchInput() {
        // <input type="text" enterkeyhint="search" name="q" maxlength="128" placeholder="Search Reddit" autocomplete="off" inputmode="">
        return findOnPage(By.cssSelector("input[@placeholder='Search Reddit']"));
    }

    public void submitSearch(String search) {
        DomElement searchInput = getSearchInput();
        getSearchInput().sendKeys(search);
        getSearchInput().submit();
    }


    /**
     * Method to get a list of Reddit Search Results within the main-content container that reddit serves
     * containing all posts. This code is kinda fragile as the main-content container will be on home page or a search
     * page. Ensure searching was done
     * @return List of reddit search results
     */
    public List<RedditSearchResult> getSearchResults() {
        DomElement mainContent = findOnPage(By.id("main-content"));
        return findAllOnPage(By.tagName("search-telemetry-tracker")).stream().map(RedditSearchResult::new).toList();
    }


}
