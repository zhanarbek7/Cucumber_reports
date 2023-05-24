Feature: Youtube page
  Scenario: Make a search in Youtube
    Given User is on "https://www.youtube.com"
    When User is clicking and searching for "Bugs Bunny"
    Then User must be on another page with videos