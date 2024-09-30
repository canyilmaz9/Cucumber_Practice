package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Listing;
import pages.Projects;
import pages.UserDashboard;
import pages.WebsiteMain;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class HauseHeavenStepDefinitions {

    WebsiteMain websiteMain = new WebsiteMain();
    UserDashboard userDashboard = new UserDashboard();
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
            case "WishList":
                utilities.ReusableMethods.bekle(5);
                JavascriptExecutor js1 = (JavascriptExecutor) driver;
                js1.executeScript("window.scrollBy(0,300)");
                utilities.ReusableMethods.bekle(1);
                listing.wishList.click();
                utilities.ReusableMethods.bekle(3);
                break;
            case "Projects":
                //UserDashboard userDashboard = new UserDashboard();
                websiteMain.projectsButton.click();
                break;

        }
    }
    @Then("Validate Current Title of {string}")
    public void validate_current_title(String string) {
        switch (string){

            case "Listing":
                String expectedCurrentTitle = "Properties";
                String actualCurrentTitle = driver.getTitle();
                Assertions.assertEquals(actualCurrentTitle,expectedCurrentTitle);
                break;
            case "Projects":
                String expectedTitle = "Projects";
                String actualTitle = Driver.getDriver().getTitle();
                Assertions.assertEquals(actualTitle,expectedTitle);
                break;
        }

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
        utilities.ReusableMethods.bekle(3);
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


    @Given("Go to Hauseheaven Login Page")
    public void goToHauseheavenLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("UserLoginPageUrl"));
    }

    @And("Enter {string} username and password")
    public void enterUsernameAndPassword(String string) {

        if (string.equalsIgnoreCase("invalid")){
            Actions actions = new Actions(Driver.getDriver());
            userDashboard.userEmailUsernameForm.sendKeys("invalidmail@gmail.com");
            userDashboard.userPasswordForm.sendKeys("invalidpassword");
            JavascriptExecutor js = (JavascriptExecutor) driver;

            utilities.ReusableMethods.bekle(1);
            //js.executeScript("window.scrollBy(0,100)");
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            userDashboard.userLogInButton.click();
        } else {
            Actions actions = new Actions(Driver.getDriver());
            JavascriptExecutor js = (JavascriptExecutor) driver;

            utilities.ReusableMethods.bekle(1);
            js.executeScript("window.scrollBy(0, -200)");
            userDashboard.userEmailUsernameForm.clear();
            userDashboard.userPasswordForm.clear();
            userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("WebsiteGecerliEmail"));
            userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("WebsiteGecerliPassword"));
           js.executeScript("window.scrollBy(0,200)");
            //actions.sendKeys(Keys.PAGE_DOWN).perform();
            utilities.ReusableMethods.bekle(2);
            userDashboard.userLogInButton.click();
        }

    }

    @Then("Scroll Down")
    public void scrollDown() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
    }

    @And("Comment it and Submit Review")
    public void commentItAndSubmitReview() {
        listing.commentTextArea.sendKeys("Comment");
        utilities.ReusableMethods.bekle(2);
    }

    @And("Fill the form with fake data up")
    public void fillTheFormWithFakeDataUp() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        listing.nameForm.sendKeys("Can");
        listing.phoneForm.sendKeys("0521 4789 7878");
        listing.emailForm.sendKeys("can@gmail.com");
        listing.contentForm.sendKeys("I am interested in this flat");
    }

    @Then("Send Message")
    public void sendMessage() {
        Actions actions = new Actions(Driver.getDriver());
        utilities.ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        listing.sendForm.click();
    }
    Projects projects = new Projects();
    @Then("Validate number of Project Results")
    public void validateNumberOfProjectResults() {
        utilities.ReusableMethods.bekle(2);
        String expectedNumberOfFoundResult = "Found 1 - 9 Of 9 Results";
        String actualNumberOfFoundResult = projects.resultText.getText();

        Assertions.assertEquals(actualNumberOfFoundResult, expectedNumberOfFoundResult);
    }

    @And("Get total number of Result")
    public void getTotalNumberOfResult() {
        utilities.ReusableMethods.bekle(2);
        String actualNumberOfFoundResult = projects.resultText.getText();
        String totalNumber = actualNumberOfFoundResult.substring(10,11);
        System.out.println("Total Number of Projects: " + totalNumber);
    }

    @Then("Click on the first project of the page")
    public void clickOnTheFirstProjectOfThePage() {
        Projects projects = new Projects();
        utilities.ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
       actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        projects.firstProject.click();
    }

    @And("Validate Current Title of the Project")
    public void validateCurrentTitleOfTheProject() {
        String expectedTitleOfAProject = "Palm Paradise Residences";
        String actualTitleOfAProject = driver.findElement(By.xpath("//h1")).getText();

        Assertions.assertEquals(actualTitleOfAProject, expectedTitleOfAProject);
    }

    @And("Validate current type of project with type in the project page")
    public void validateCurrentTypeOfProjectWithTypeInTheProjectPage() {
        Actions actions = new Actions(Driver.getDriver());
        Projects projects1 = new Projects();

        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String expectedTypeOfProject = projects1.typeOfProjectinProjectPage.getText();

        String actualTypeOfProject = projects1.typeOfProjectinDetails.getText();

        Assertions.assertEquals(actualTypeOfProject, expectedTypeOfProject);
    }

    @Then("Choose determined search boxes then click on Search")
    public void chooseDeterminedSearchBoxesThenClickOnSearch() {
        Projects projects = new Projects();
        projects.country.click();
        projects.countryInput.sendKeys("USA" + Keys.ENTER);

        projects.category.click();
        projects.categoryInput.sendKeys("Villa" + Keys.ENTER);

        projects.searchButton.click();
        utilities.ReusableMethods.bekle(2);
    }

    @And("Validate the Result and get all Projects in the page")
    public void validateTheResultAndGetAllProjectsInThePage() {
        for (int number = 1; number <= 9; number++) {
            // XPath ile number değişkenine göre elementleri buluyoruz
            List<WebElement> elements = driver.findElements(By.xpath("(//a[@class='prt-link-detail text-uppercase'])[" + (number) + "]"));

            // Eğer elements boş değilse, her bir eleman için kontrol yap
            if (!elements.isEmpty()) {
                for (WebElement element : elements) {
                    // Elementin metnini al
                    String elementText = element.getText();

                    // Eğer elementin metni "villa" içeriyorsa
                    if (elementText.toLowerCase().contains("villa")) {
                        System.out.println("Bulunan element: " + elementText);

                    }
                }
            } else {
                System.out.println("No element found for index: " + (number + 1));
            }
        }


    }

    @Then("Enter test data in body section")
    public void enterTestDataInBodySection() {
        Actions actions = new Actions(Driver.getDriver());
        utilities.ReusableMethods.bekle(3);
        userDashboard.searchForALocation.click();
        utilities.ReusableMethods.bekle(1);
        userDashboard.searchForALocation.sendKeys("Konya");
        utilities.ReusableMethods.bekle(3);

        Listing listing = new Listing();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        //No Min: 500
        utilities.ReusableMethods.bekle(2);
        listing.searchBoxMinPriceDropDownMenu.click();
        listing.dropDownYazmaYeri.sendKeys(("500" + Keys.ENTER));

        //No Max: 1000
        listing.searchBoxMaxPriceDropDownMenu.click();
        listing.dropDownYazmaYeri.sendKeys("1000" + Keys.ENTER);

        utilities.ReusableMethods.bekle(3);
        userDashboard.category.click();
        //userDashboard.categoryInput.sendKeys("Villa" + Keys.ENTER);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.searchResult.click();

        //Search Result

        String expectedTitle = "0 Results";
        utilities.ReusableMethods.bekle(2);
        String actualTitle = userDashboard.numberOfResultBodySearch.getText();

        Assertions.assertEquals(actualTitle, expectedTitle);
    }
}
