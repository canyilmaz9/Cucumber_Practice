package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Listing;
import pages.WebsiteMain;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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
        switch (string){
            case "Listing":
                websiteMain.listingButton.click();
                break;
            case "Sort By":
                listing.sortByButton.click();
                break;
            case "Share":
                utilities.ReusableMethods.bekle(2);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,500)");
                Actions actions = new Actions(Driver.getDriver());
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                listing.shareButton.click();
                utilities.ReusableMethods.bekle(2);
                break;
        }
    }
    @Then("Validate Current Title of Listing")
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
    }
    @Then("Click on the first property of the page with {string} Button And Validate Current Title After Clicking on View")
    public void click_on_the_first_property_of_the_page_with_button_and_validate_current_title_after_clicking_on_view(String string) {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        String expectedTitleOfAProperty = listing.titleOfAProperty.get(0).getText();
        String expectedPreciseOfAProperty = listing.preiseOfAProperty.get(0).getText();

        listing.viewButton.get(0).click();
    }

    @Then("Click on the first property of the page with {string} Button And Validate Current Title After Clicking on View And Validate preise of the property with preise in listing page")
    public void click_on_the_first_property_of_the_page_with_button_and_validate_current_title_after_clicking_on_view_and_validate_preise_of_the_property_with_preise_in_listing_page(String string) {
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(1);
            String expectedTitleOfAProperty = listing.titleOfAProperty.get(0).getText();
            String expectedPreciseOfAProperty = listing.preiseOfAProperty.get(0).getText();

            listing.viewButton.get(0).click();
            ReusableMethods.bekle(1);

            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(1);
            String actualTitleOfAProperty = listing.titleAfterClickingOnView.getText();

            Assertions.assertEquals(expectedTitleOfAProperty, actualTitleOfAProperty);

            String actualPreiseOfAProperty = listing.preiseAfterClickingOnView.getText();

            Assertions.assertEquals(expectedPreciseOfAProperty, actualPreiseOfAProperty);
        }

    @Then("Fill the form")
    public void fill_the_form() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);

        //Type: For Sale
        listing.typeDropDown.click();
        utilities.ReusableMethods.bekle(1);
        listing.dropDownYazmaYeri.sendKeys("For Sale");
        utilities.ReusableMethods.bekle(1);
        listing.dropDownYazmaYeri.sendKeys(Keys.ENTER);

        utilities.ReusableMethods.bekle(1);
        //No Min: 500
        listing.searchBoxMinPriceDropDownMenu.click();
        listing.dropDownYazmaYeri.sendKeys(("500" + Keys.ENTER));

        //No Max: 1000
        listing.searchBoxMaxPriceDropDownMenu.click();
        listing.dropDownYazmaYeri.sendKeys("1000" + Keys.ENTER);

        //Checkbox: Wifi and Swimming Pool
        utilities.ReusableMethods.bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        utilities.ReusableMethods.bekle(1);
        listing.wifi.click();
        listing.swimmingpool.click();
        utilities.ReusableMethods.bekle(1);
        //Searching by clicking on button

        js.executeScript("arguments[0].scrollIntoView(true);", listing.findNewHomeButton);
        listing.findNewHomeButton.submit();
    }
    @Then("Validate the Result")
    public void validate_the_result() {
        Actions actions = new Actions(Driver.getDriver());
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String expectedResult = "0 Results";
        String actualResult = listing.numberOfResultHome.getText();

       Assertions.assertEquals(expectedResult, actualResult);
    }
    @Then("Choose Name: A-Z")
    public void choose_name_a_z() {
        Actions actions = new Actions(Driver.getDriver());
        listing.sortByButtonInput.sendKeys("Name: A-Z");
        utilities.ReusableMethods.bekle(1);
        listing.sortByButtonInput.sendKeys(Keys.ENTER);

        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String expectedTitle = "002SerS";
        String actualTitle = listing.headOfFirstProperty.getText();

        Assertions.assertEquals(expectedTitle, actualTitle);
    }
    @Then("Choose {string}")
    public void choose(String string) {
       switch(string) {
           case "Facebook":
               utilities.ReusableMethods.bekle(1);
               listing.facebookButton.click();
               break;
       }
    }

    @Then("Close page")
    public void close_page() {
        Driver.quitDriver();

    }

}
