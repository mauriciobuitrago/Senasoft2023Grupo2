Feature:Login


  @loginsuccesfully
  Scenario Outline: Login Succesfully
    Given he user enters in the website
    When he user enters the website with correct credential
      | email   | password   |
      | <email> | <password> |
    Then he entry succesfully

    Examples:
      | email                   | password   |
      | lenovo.esucre@gmail.com | 3Felipe180 |
