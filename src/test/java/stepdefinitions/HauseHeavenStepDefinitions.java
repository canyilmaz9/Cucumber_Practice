package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.Listing;
import pages.WebsiteMain;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class HauseHeavenStepDefinitions {

    WebsiteMain websiteMain = new WebsiteMain();
    Listing listing = new Listing();

    @Given("Go to Hauseheaven Home Page")
    public void go_to_hauseheaven_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
    }
    @Then("Click on {string}")
    public void click_on(String string) {
            websiteMain.listingButton.click();
    }
    @Then("Validate Current Title")
    public void validate_current_title() {
        String expectedCurrentTitle = "Properties";
        String actualCurrentTitle = driver.getTitle();
    }
    @Then("Validate number of Found result at least {int}")
    public void validate_number_of_found_result_at_least(Integer int1) {
        String expectedMinResult = "1";
        String actualResultinString = Listing.numberOfResult.getText().substring(6,7);

        Assertions.assertEquals(expectedMinResult,actualResultinString);

        String totalResultinString = Listing.numberOfResult.getText().substring(16,18);

        int totalResult = Integer.parseInt(totalResultinString);

        System.out.println("Total number of Result: " + totalResult);
        //new commit 3
        //deneme

    }
    @Then("Close page")
    public void close_page() {
        Driver.quitDriver();

    }

}
