Feature: Favorites snd saved
  i need add and eliminate some
#HECHO
  @AddItems
  Scenario Outline: Add Items
    Given the user Enter the website
    When the user selects items for favorites
      | email   |password|
      | <email> |<password> |
    Then he will see these elements in his profile
    Examples:
      | email|password|
      | lenovo.esucre@gmail.com |3Felipe180|

#HECHO
  @EliminateItems
  Scenario Outline: Eliminate Items
    Given  the user Enter the website
    When the User selects the My account_Favorites module and selects the Delete from favorites option
      | email   |password|
      | <email> |<password> |
    Then the element would have been removed
    Examples:
      | email|password|
      | lenovo.esucre@gmail.com |3Felipe180|