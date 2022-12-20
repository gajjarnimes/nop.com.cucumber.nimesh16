Feature: Computer Test
  As a use I want to go on computer page

  @smoke
  Scenario:Verify user should navigate to computer page successfully
    Given I am on homepage
    When I click on Computer Tab
    Then I Verify Computer text

  @sanity
  Scenario: Verify user should navigate to Desktops page successfully
    Given I am on homepage
    When I click on Computer Tab
    And I Click on Desktops link
    And I verify Desktops text

  @regression
  Scenario Outline: verify That User Should Build Your Own Computer And Add To Cart Successfully
    Given   I am on homepage
    When    I click on Computer Tab
    And     I Click on Desktops link
    And     I select product "Build your own computer"
    And     I select processor"<processor>"
    And     I select RAM "<ram>"
    And     I select HDD "<hdd>"
    And     I select OS "<os>"
    And     I select Software "<software>"
    And     I click on Add to Cart Button
    Then    I can add product to cart successfully
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista  Home [+$50.00]   | Total Commander [+$5.00]   |