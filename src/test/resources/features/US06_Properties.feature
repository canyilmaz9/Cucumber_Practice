Feature: Properties islemleri yapilir

  Scenario: TC01 Ziyaretci arama sonucunda toplam sayiyi görebilmeli

    Given Go to Hauseheaven Home Page
    Then Click on "Listing"
    Then Validate Current Title
    Then Validate number of Found result at least 1
    And Close page

  Scenario: TC02 kullanici cesitli aramalar yapar

    Given Go to Hauseheaven Home Page