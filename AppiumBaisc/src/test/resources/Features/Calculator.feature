Feature: Calculator Functionality

  Background: Check Basic operations
    Given Application is Open
    When User Clicks on clear screen button
    When Enters the First Number

  Scenario: Addition
    And Enters the Addition Operation
    And Enters the Second Number
    And Clicks on Equal Operator
    Then Verify The Answer

  Scenario: Subtraction
    And Enters the Subtraction Operation
    And Enters the Second Number
    And Clicks on Equal Operator
    Then Verify The Answer

  Scenario: Multiplication
    And Enters the Multiplication Operation
    And Enters the Second Number
    And Clicks on Equal Operator
    Then Verify The Answer

  Scenario: Division
    And Enters the Division Operation
    And Enters the Second Number
    And Clicks on Equal Operator
    Then Verify The Answer