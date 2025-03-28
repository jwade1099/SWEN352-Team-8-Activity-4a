package edu.rit.swen253.test.reddit;

import edu.rit.swen253.page.reddit.RedditHomePage;
import edu.rit.swen253.page.reddit.RedditSearchResult;
import edu.rit.swen253.page.sample.RatingInfoView;
import edu.rit.swen253.page.sample.RitHomePage;
import edu.rit.swen253.test.AbstractWebTest;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


/**
 * A simple test that explores RIT's ratings on their home page.
 *
 * @author <a href='mailto:bdbvse@rit.edu'>Bryan Basham</a>
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RedditHomePageTest extends AbstractWebTest {

    private RedditHomePage homePage;
    private RedditSearchResult firstResult;


    //
    // Test sequence
    //

    @Test
    @Order(1)
    @DisplayName("First, open reddit")
    void navigateToHomePage() {
        homePage = navigateToPage("https://www.reddit.com", RedditHomePage::new);
    }

    @Test
    @Order(2)
    @DisplayName("Second, find search bar & execute a search.")
    void executeSearch() {

        String searchQuery = "page object model";
        // ensure that the search bar is found
        assertNotNull(homePage.getSearchInput());

        // search for 'page object model'
        homePage.submitSearch(searchQuery);
        List<RedditSearchResult> searchResults = homePage.getSearchResults();
        // prepare for the next test
        firstResult = searchResults.getFirst();

        // Log all results
        for (RedditSearchResult result : searchResults) {
            Logger logger = Logger.getLogger("Search Log");
            logger.info("Have search result Title: " + result.getTitle() + " - Url: " + result.getUrl());
        }
    }

}
