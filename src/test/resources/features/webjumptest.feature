@register
Feature: WebJumpTest

  Background: 
    Given User access page

  @login-CT001 @smoke @regression
  Scenario Outline: Register user
    And User click on login button
    And User fill out name field
    And User fill out email field
    And User click on singUp button
    And User click on gender button
    And User fill out password field
    And user select date of birth "28" "November" "2005"
    And User fill out first name field
    And User fill out last name field
    And User fill out company field
    And User fill out address field
    And User select country "Israel"
    And User fill out state field
    And User fill out city field
    And User fill out zipcode field
    And User fill out mobile number field
    And User click on create account button


    Examples:
      | firstName | midName | lastName | age | email        | job          | gender |
      | Paulo     | Vitot   | Calil    | 18  | pv@email.com | unemployment | male   |

  Scenario Outline: Regist
    And User click on login button
    And User fill out name field
    And User fill out email field
    And User click on singUp button
    And check if