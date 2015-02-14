/**
 * An example of the code in the htmlunit scraper program
 * This is what the code looks like in blueJ
 * Lennon Shitara 2CS
 */
public class Htmlunitscraper { 
    private static String s = "website";
    public static HtmlPage scrapeWebsite() throws IOException {
        final WebClient webClient = new WebClient();
        final HtmlPage page = webClient.getPage(s);
        return page.asXml();
    }
}