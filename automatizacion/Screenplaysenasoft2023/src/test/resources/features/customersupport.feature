Feature: Customer Support
  i need to use the module Customer Support

  Background:
    Given the user Enter the website

  @SeeInformatioAboutAProblem
  Scenario: get information
    When the user enters the Customer Service module and selects the service to consult
    Then the user will find information about his problem
