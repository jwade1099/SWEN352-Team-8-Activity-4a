package edu.rit.swen253.page.reddit;

import edu.rit.swen253.utils.DomElement;
import edu.rit.swen253.utils.SeleniumUtils;
import org.openqa.selenium.By;

import java.time.Duration;

/**
 * Representation of a Reddit Search Result
 *
 * Example first element when searching selenium on reddit:
 * <search-telemetry-tracker data-faceplate-tracking-context="{&quot;action_info&quot;:{&quot;pane_name&quot;:&quot;posts&quot;,&quot;position&quot;:0,&quot;relative_position&quot;:0},&quot;post&quot;:{&quot;id&quot;:&quot;t3_l9ob2n&quot;,&quot;nsfw&quot;:false,&quot;spoiler&quot;:false,&quot;title&quot;:&quot;To Selenium or not to Selenium?&quot;},&quot;search&quot;:{&quot;query&quot;:&quot;selenium&quot;,&quot;scope_path&quot;:&quot;/&quot;,&quot;scope_type&quot;:&quot;GLOBAL&quot;},&quot;subreddit&quot;:{&quot;id&quot;:&quot;t5_2qhb8&quot;,&quot;name&quot;:&quot;Supplements&quot;,&quot;nsfw&quot;:false,&quot;quarantined&quot;:false}}" view-events="search/view/post" leave-events="post/leave/post" consume-events="post/consume/post" data-testid="search-sdui-post" data-thingid="t3_l9ob2n"><div class="flex justify-between items-center p-md hover:bg-neutral-background-hover xs:rounded-[16px] my-2xs relative" data-testid="search-post-unit">
 *
 *     <search-telemetry-tracker data-faceplate-tracking-context="{&quot;action_info&quot;:{&quot;pane_name&quot;:&quot;posts&quot;,&quot;position&quot;:0,&quot;relative_position&quot;:0,&quot;type&quot;:&quot;post&quot;},&quot;post&quot;:{&quot;id&quot;:&quot;t3_l9ob2n&quot;,&quot;nsfw&quot;:false,&quot;spoiler&quot;:false,&quot;title&quot;:&quot;To Selenium or not to Selenium?&quot;},&quot;search&quot;:{&quot;query&quot;:&quot;selenium&quot;,&quot;scope_path&quot;:&quot;/&quot;,&quot;scope_type&quot;:&quot;GLOBAL&quot;},&quot;subreddit&quot;:{&quot;id&quot;:&quot;t5_2qhb8&quot;,&quot;name&quot;:&quot;Supplements&quot;,&quot;nsfw&quot;:false,&quot;quarantined&quot;:false}}" click-events="search/click/post"><h2 class="m-0">
 *     <a data-testid="post-title" href="/r/Supplements/comments/l9ob2n/to_selenium_or_not_to_selenium/" class="absolute inset-0" aria-label="To Selenium or not to Selenium?">
 *       <faceplate-screen-reader-content>To Selenium or not to Selenium?</faceplate-screen-reader-content>
 *     </a>
 *   </h2><!----></search-telemetry-tracker>
 *
 *     <div class="w-full flex flex-col items-start min-w-0 ">
 *       <div class="flex items-center mb-xs relative overflow-hidden whitespace-nowrap w-auto">
 *     <span class="flex items-center text-neutral-content-weak text-12 overflow-hidden">
 *     <shreddit-async-loader class="" bundlename="faceplate_hovercard">
 *       <faceplate-hovercard class="nd:visible" position="bottom-start" data-id="community-hover-card" aria-label="r/Supplements" mouse-only="" appearance="neutral" trigger="mouse">
 *
 *     <search-telemetry-tracker data-faceplate-tracking-context="{&quot;action_info&quot;:{&quot;pane_name&quot;:&quot;posts&quot;,&quot;position&quot;:0,&quot;relative_position&quot;:0,&quot;type&quot;:&quot;community&quot;},&quot;post&quot;:{&quot;id&quot;:&quot;t3_l9ob2n&quot;,&quot;nsfw&quot;:false,&quot;spoiler&quot;:false,&quot;title&quot;:&quot;To Selenium or not to Selenium?&quot;},&quot;search&quot;:{&quot;query&quot;:&quot;selenium&quot;,&quot;scope_path&quot;:&quot;/&quot;,&quot;scope_type&quot;:&quot;GLOBAL&quot;},&quot;subreddit&quot;:{&quot;id&quot;:&quot;t5_2qhb8&quot;,&quot;name&quot;:&quot;Supplements&quot;,&quot;nsfw&quot;:false,&quot;quarantined&quot;:false}}" click-events="search/click/post"><a class="flex items-center text-neutral-content-weak font-semibold" href="/r/Supplements/" aria-haspopup="dialog" aria-expanded="false">
 *     <span class="inline-flex items-center justify-center w-[1.5rem] h-[1.5rem] mr-xs" rpl="" avatar="">
 *
 *     <span rpl="" class="inline-block rounded-full relative [&amp;>:first-child]:h-full [&amp;>:first-child]:w-full [&amp;>:first-child]:mb-0 [&amp;>:first-child]:rounded-[inherit] h-full w-full  [&amp;>:first-child]:overflow-hidden [&amp;>:first-child]:max-h-full">
 *     <img src="https://styles.redditmedia.com/t5_2qhb8/styles/communityIcon_bjk4ywjohjqd1.png" alt="r/Supplements icon" class="mb-0   w-full h-full" width="24" style="width: 24px;" loading="lazy">
 *   </span></span>
 *     r/Supplements</a><!----></search-telemetry-tracker>
 *
 *         <div slot="content" class="max-w-[360px] w-[90vw] overflow-hidden p-0 -m-[0.5rem]" hidden="">
 *           <div class="flex flex-col">
 *             <div class="h-[80px] w-auto overflow-hidden relative rounded-t-[16px]">
 *                   <img src="https://styles.redditmedia.com/t5_2qhb8/styles/bannerBackgroundImage_cok676w5g5rd1.jpg?format=pjpg&amp;s=ff8e0f4f828df032a706025c66fa76929d65e97b" alt="A banner for the subreddit" class="mb-0 w-full h-full object-cover absolute" loading="lazy">
 *                 </div>
 *             <div class="px-sm pt-sm flex items-center">
 *               <span class="w-[48px] h-[48px] text-24 shrink-0">
 *                 <span class="inline-flex items-center justify-center w-[3rem] h-[3rem] " rpl="" avatar="">
 *
 *     <span rpl="" class="inline-block rounded-full relative [&amp;>:first-child]:h-full [&amp;>:first-child]:w-full [&amp;>:first-child]:mb-0 [&amp;>:first-child]:rounded-[inherit] h-full w-full  [&amp;>:first-child]:overflow-hidden [&amp;>:first-child]:max-h-full">
 *     <img src="https://styles.redditmedia.com/t5_2qhb8/styles/communityIcon_bjk4ywjohjqd1.png" alt="r/Supplements icon" class="mb-0 shreddit-subreddit-icon__icon rounded-full overflow-hidden nd:visible nd:bg-secondary-background  w-full h-full" width="48" style="width: 48px;" loading="lazy">
 *   </span></span>
 *               </span>
 *               <span class="flex ml-xs grow-0 w-100">
 *                 <faceplate-tracker source="subreddit_hovercard" action="click" noun="title">
 *                   <a rpl="" class="text-18 font-bold text-neutral-content-strong leading-6 a cursor-pointer
 *
 *   text-14
 *
 *   no-visited
 *   hover:underline
 *   " href="/r/Supplements/">r/Supplements</a>
 *                 <!----></faceplate-tracker>
 *
 *               </span>
 *               <faceplate-tracker class="ml-auto" source="subreddit_hovercard" action="click" noun="join_signup_cta">
 *                     <shreddit-join-button subreddit-id="t5_2qhb8" name="Supplements" buttonsize="x-small" button-type="secondary"></shreddit-join-button>
 *                   <!----></faceplate-tracker>
 *             </div>
 *             <p class="px-md pt-md m-0 whitespace-normal text-14 leading-5 font-normal">
 *               A subreddit designed for discussion of supplements and nutraceuticals; for health, performance, or any intended (or not intended) purpose. Not a place for discussion of illicit and illegal compounds.
 *             </p>
 *             <hr class="mx-md mt-md border-neutral-border-weak">
 *             <div class="px-md py-md flex items-center">
 *               <span class="flex flex-col">
 *                 <span class="text-14 text-neutral-content leading-5 font-semibold">
 *                   <faceplate-number number="417587" pretty=""><!---->418K</faceplate-number>
 *                 </span>
 *                 <span class="text-12 leading-4 text-neutral-content-weak">Members</span>
 *               </span>
 *               <span data-testid="community-hover-card:active-count" class="ml-xl flex flex-col">
 *                 <span class="text-14 text-neutral-content leading-5 font-semibold">
 *                   <faceplate-number number="150" pretty=""><!---->150</faceplate-number>
 *                 </span>
 *                 <span class="flex items-center">
 *                   <span class="bg-kiwigreen-400 rounded-full w-xs h-xs"></span>
 *                   <span class="text-12 leading-4 text-neutral-content-weak ml-2xs">Online</span>
 *                 </span>
 *               </span>
 *             </div>
 *           </div>
 *         </div>
 *       </faceplate-hovercard>
 *     </shreddit-async-loader>
 *   <span class="mx-2xs">·</span><faceplate-timeago format="narrow" ts="2021-01-31T22:53:20.585000+0000"><!----> <time datetime="2021-01-31T22:53:20.585Z" title="Sunday, January 31, 2021 at 5:53:20 PM EST"><!--?lit$89421385$-->4y ago</time> </faceplate-timeago></span>
 *   </div>
 *
 *       <a data-testid="post-title-text" id="search-post-title-t3_l9ob2n" href="/r/Supplements/comments/l9ob2n/to_selenium_or_not_to_selenium/" class="text-16 xs:text-18 text-neutral-content-strong no-underline hover:no-underline visited:text-neutral-content-weak hover:no line-clamp-3 text-ellipsis font-semibold mb-xs">
 *     To <span data-testid="post-title-query" class="font-bold visited:text-neutral-content-weak">Selenium</span> or not to <span data-testid="post-title-query" class="font-bold visited:text-neutral-content-weak">Selenium</span>?
 *   </a>
 *
 *        <div class="text-neutral-content-weak text-12" data-testid="search-counter-row">
 *     <span>
 *       <faceplate-number number="10" pretty=""><!---->10</faceplate-number>
 *       votes
 *     </span><span class="mx-2xs">·</span><span>
 *       <faceplate-number number="21" pretty=""><!---->21</faceplate-number>
 *       <span>comments</span>
 *     </span>
 *   </div>
 *     </div>
 *
 *     </div><!----></search-telemetry-tracker>
 *
 * Main areas of interest:
 *
 * <a data-testid="post-title" href="/r/Supplements/comments/l9ob2n/to_selenium_or_not_to_selenium/" class="absolute inset-0" aria-label="To Selenium or not to Selenium?">
 *       <faceplate-screen-reader-content>To Selenium or not to Selenium?</faceplate-screen-reader-content>
 *     </a>
 *
 */
public class RedditSearchResult {
    private final DomElement viewContainer;
    private final String resultTitle;
    private final DomElement link;

    public RedditSearchResult(final DomElement viewContainer) {
        this.viewContainer = viewContainer;
        this.link = this.viewContainer.findChildBy(By.tagName("a"));
        // posts have title within aria-label="Title"
        this.resultTitle = this.link.getAttribute("aria-label");
    }

     public void clickLink() {
        DomElement test = this.viewContainer.getParent();
        test = test.getParent();
        System.out.println(test.getTagName());
        test.click();
     }

     public String getUrl() {
        return link.getAttribute("href");
     }

     public String getTitle() {
        return resultTitle;
     }
}
