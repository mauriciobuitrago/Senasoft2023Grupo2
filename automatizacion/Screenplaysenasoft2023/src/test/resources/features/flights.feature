Feature: flights

  Background:
    Given he user enters the website
#HECHO
  @makeareservation
  Scenario:
    When the user selects a stopover in the “Flights” module and makes the reservation
      | email                   | phone      | name | lastname | dayT | year | nametarget | nambertarget     | day   | cvc |
      | lenovo.esucre@gmail.com | 3164706984 | rosa | ledezma  | 27   | 1995 | rosamaria  | 4666533000000031 | 12/24 | 123 |
    Then the user will be able to see a message about their reservation.
