Feature: Arama Testi

  Scenario: TC01 Arama Testi
    Given Go to Hauseheaven Login Page
    Then Enter "invalid" username and password
    Then Enter "valid" username and password
    Then Enter test data in body section
    Then Close page
