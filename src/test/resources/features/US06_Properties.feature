Feature: Properties islemleri yapilir

  Scenario: TC01 Ziyaretci arama sonucunda toplam sayiyi görebilmeli

    Given Go to Hauseheaven Home Page
    Then Click on "Listing"
    Then Validate Current Title of "Listing"
    Then Validate number of Found result at least 1
    And Close page

  Scenario: TC02 kullanici aramasi sonucu iki sayfa arasi karsilastirma

    Given Go to Hauseheaven Home Page
    Then Click on "Listing"
    Then Validate Current Title of "Listing"
    Then Click on the first property of the page with "View" Button And Validate Current Title After Clicking on View And Validate preise of the property with preise in listing page
    And Close page

  Scenario: TC03 kullanici arama yapar

    Given Go to Hauseheaven Home Page
    Then Click on "Listing"
    And Validate Current Title of "Listing"
    Then Fill the form
    Then Validate the Result
    And Close page

  Scenario: TC04 Siralama
    Given Go to Hauseheaven Home Page
    Then Click on "Listing"
    Then Click on "Sort By"
    And Choose Name: A-Z
    Then Close page