Feature: login

  he user cannot log in satisfactorily
  Background:
    Given he user enters the website
#HECHO
    @login_correct
      Scenario Outline: Login Successfully
      When he user enters the website with correct credential
        | email   | password   |
        | <email> | <password> |
      Then he entry succesfully

      Examples:
        | email                   | password   |
        | lenovo.esucre@gmail.com | 3Felipe180 |

#HECHO

  @wronglogin
  Scenario:Wrong Login
    When he clicks on the login type your credentials incorrectly
      | email                    | password   |
      | lenovo.esucre@gmail.com. | Rosa324567 |
    Then So it's a failed login
#HECHO

  @incompletelogin
  Scenario:Incomplete Login
    When he clicks on the login and don't fill out a field
      | email                    |
      | lenovo.esucre@gmail.com. |
    Then Then not a successful record.


