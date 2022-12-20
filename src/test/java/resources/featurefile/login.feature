Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
  @regression

  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

    @sanity
    @regression
    Scenario: Verify the error message with invalid credentials
      Given I am on homepage
      When I click on login link
      And I enter email "prime123@gmail.com"
      And I enter Password "prime123"
      And I click on Login button
      Then I am unable to login with invalid credentials

  @regression
  Scenario: Verify that user should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "viru123@gmail.com"
    And I enter Password "viru123"
    And I click on Login button
    Then I should login successfully with valid credentials

  @regression
  Scenario: Verify that user should logOut successFully
    Given I am on homepage
    When I click on login link
    And I enter email "viru123@gmail.com"
    And I enter Password "viru123"
    And I click on Login button
    And I click on logout link
    Then I should logOut successFully and i should see login link






