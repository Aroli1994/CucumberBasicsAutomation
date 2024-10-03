Feature: Application Login

Background: 
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
  Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When User login into application with username "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  #Reusable
 @MobileTest
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with uname "user" and pwd 0953
    Then Home Page is displayed
    And Cards are displayed

@SmokeTest @RegressionTest
  Scenario Outline: Mortgage User Page default login
    Given User is on NetBanking landing page
    When User login into application with username "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | Username   | Password |
      | debituser  | hello123 |
      | credituser | lop123   |

@SmokeTest
  Scenario: User Page default Sign Up
    Given User is on Practice Page
    When User SignUp into application
      | rahul             |
      | shetty            |
      | contact@email.com |
      |        6361093232 |
    Then Home Page is displayed
    And Cards are displayed
