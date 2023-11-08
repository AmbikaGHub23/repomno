Feature: Print all the sub menus of all menus
  
  Scenario: Print all the sub menus of Electronics menu
    Given user launch the flipkart application "https://www.flipkart.com/"
    When user close the login popup
    And user click on the banner
    Then user hover on electronics menu
    Then user print all sub menues

