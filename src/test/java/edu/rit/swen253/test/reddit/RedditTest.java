package edu.rit.swen253.test.reddit;

import edu.rit.swen253.page.SimplePage;
import edu.rit.swen253.page.reddit.RedditHomePage;
import edu.rit.swen253.page.reddit.RedditSearchResult;
import edu.rit.swen253.page.reddit.RedditSearchResultsPage;
import edu.rit.swen253.test.AbstractWebTest;
import edu.rit.swen253.utils.SeleniumUtils;
import edu.rit.swen253.utils.TimingUtils;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RedditTest extends AbstractWebTest {

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
        Logger logger = Logger.getLogger("Reddit");
        // search for 'page object model'
        homePage.submitSearch(searchQuery);
        RedditSearchResultsPage resultsPage = new RedditSearchResultsPage();
        List<RedditSearchResult> searchResults = resultsPage.getSearchResults();
        assertNotNull(searchResults);
        // prepare for the next test
        firstResult = searchResults.getFirst();

        // Log all results
        for (RedditSearchResult result : searchResults) {
            logger.info("Have search result Title: " + result.getTitle() + " - Url: " + result.getUrl());
        }
    }

    @Test
    @Order(3)
    @DisplayName("Third, testing navigation to the first search result")
    void navigateToFirstSearchResult() {
        firstResult.clickLink();
        // expect navigation to the area of study page
        final SimplePage page = assertNewPage(SimplePage::new);
        // validate simple page content
        assertAll("Post validation"
                , () -> assertEquals("https://www.reddit.com/r/QualityAssurance/comments/1cafgny/page_component_object_model/", page.getURL())
        );
        TimingUtils.sleep(2);
    }



}
