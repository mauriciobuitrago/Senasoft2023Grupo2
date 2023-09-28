Feature: Accommodation
  I need to perform actions in the Accommodation module
#Hecho
  Background:
    Given the user Enter the website

  @Reservationbysearch
  Scenario Outline: Book a successful accommodation
    When he clicks on the Accommodations option
      | city   |
      | <city> |
    And the search and select one of the results
    Then he will have reserved a place of accommodation
    Examples:
      | city    |
      | Popayan |
      | Cali    |
      | Bogota  |

#Hecho
  @Incompletereservation
  Scenario: Book a failed accommodation
    When he clicks on the "Accommodations" option and writes the incomplete specifications
    Then he will see an incomplete field message
#Hecho
  @ReservationbyFiltres
  Scenario: Search Accommodations Filters successful
    When the is in the Results module and select several filters
      | city    |
      | popayan |
    Then He will see the new results obtained by applying the filters




