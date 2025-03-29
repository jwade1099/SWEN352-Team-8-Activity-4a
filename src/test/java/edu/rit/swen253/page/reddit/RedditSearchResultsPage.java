package edu.rit.swen253.page.reddit;

import edu.rit.swen253.page.AbstractPage;
import edu.rit.swen253.utils.DomElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class RedditSearchResultsPage extends AbstractPage {
    public RedditSearchResultsPage() {
        super();
    }

    /**
     * Method to get a list of Reddit Search Results within the main-content container that reddit serves
     * containing all posts. This code is kinda fragile as the main-content container will be on home page or a search
     * page. Ensure searching was done
     * @return List of reddit search results
     */
    public List<RedditSearchResult> getSearchResults() {
        DomElement mainContent = findOnPage(By.id("main-content"));
        return mainContent.findChildrenBy(By.tagName("h2"))
                .stream()
                .map(RedditSearchResult::new).collect(Collectors.toList());
    }
}
