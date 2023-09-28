Feature:car rental

  That the user can search for a car
  Background:
    Given he user enters the website
#Hecho
  @caerrental
  Scenario Outline:
    When you click on car rental and in the search session fill out the required data
      | city    |
      | <city> |
    Then you make a successful search

    Examples:
    |city|
    |pereira|
