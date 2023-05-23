Feature: Log in

  Scenario: User Try to log in with valid credentials
    Given User use Login Link
    When User send his credentials with username "prueba@accenture.com" and password "123456"
    Then User see Profile Button

  Scenario: User Try to log in with invalid credentials
    Given User use Login Link
    When User send his credentials with username "prueba@accenture.com" and password "password123"
    Then User not see Profile Button
