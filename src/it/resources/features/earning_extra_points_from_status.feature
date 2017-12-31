@earning-points
Feature: Earning extra points from Frequent Flyer status
  Background:
    Given Some Frequent Flyer Members:
    | ID | firstName  | lastName  | status    |
    | 1  | John       | DOE       | Standard  |
    | 2  | Jill       | DARK      | Silver    |
    | 3  | Arthur     | SMITH     | Gold      |
    | 4  | Eric       | TARGET    | Platinum  |

  Scenario Outline: Earning points on flights by Frequent Flyer status
    Given I am authentified as "<first_name>"
    And I am a "<status>" Frequent Flyer member
    When I fly on a flight that is worth "<base>" base points
    Then I should earn a status bonus of "<bonus>"
    And I should have guaranteed minimum earned points per trip of "<minimum>"
    And I should earn "<total>" points in all
    Examples:
      | first_name | status   | base | bonus | minimum | total | notes               |
      | John       | Standard | 439  | 0     | 0       | 439   |                     |
      | Jill       | Silver   | 439  | 220   | 500     | 659   | minimum points      |
      | Jill       | Silver   | 148  | 111   | 500     | 500   | 50% bonus           |
      | Arthur     | Gold     | 474  | 400   | 1000    | 1000  | minimum points      |
      | Arthur     | Gold     | 2041 | 1531  | 1000    | 3572  | 75% bonus           |