Feature: Functionalities of Property Page

  Scenario: TC01 Sharing a property on a social media platform

    Given Go to Hauseheaven Home Page
    Then Click on "Listing"
    And Validate Current Title of "Listing"
    Then Click on the first property of the page with "View" Button And Validate Current Title After Clicking on View
    Then Click on "Share"
    And Choose "Facebook"
    And Close page

  Scenario: TC02 Adding the property to Wishlist

    Given Go to Hauseheaven Home Page
    Then Click on "Listing"
    And Validate Current Title of "Listing"
    Then Click on the first property of the page with "View" Button And Validate Current Title After Clicking on View
    And Click on "Wishlist"
    Then Close page

  Scenario: TC03 Comment on a property

    Given Go to Hauseheaven Login Page
    And Enter "invalid" username and password
    Then Enter "valid" username and password
    And Click on "Listing"
    And Validate Current Title of "Listing"
    Then Click on the first property of the page with "View" Button And Validate Current Title After Clicking on View
    Then Scroll Down
    And Comment it and Submit Review
    Then Close page

  Scenario: TC04 Filling up the form with fake data

    Given Go to Hauseheaven Home Page
    And Click on "Listing"
    Then Validate Current Title of "Listing"
    Then Click on the first property of the page with "View" Button And Validate Current Title After Clicking on View
    And Fill the form with fake data up
    Then Send Message
    And Close page



