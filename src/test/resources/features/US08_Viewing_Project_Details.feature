Feature: Viewing Project Details

  Scenario: TC01 Reaching to Project Details
    Given Go to Hauseheaven Home Page
    Then Click on "Project"
    And Validate Current Title of "Projects"
    Then Validate number of Project Results
    And Get total number of Result
    Then Close page

  Scenario: TC02 Looking to detail of a project
    Given Go to Hauseheaven Home Page
    Then Click on "Projects"
    And Validate Current Title of "Projects"
    Then Click on the first project of the page
    And Validate Current Title of the Project
    And Validate current type of project with type in the project page
    Then Close page

  Scenario: TC03 Choose a project in search bar
    Given Go to Hauseheaven Home Page
    Then Click on "Projects"
    And Validate Current Title of "Projects"
    Then Choose determined search boxes then click on Search
    And Validate the Result and get all Projects in the page
    Then Close page