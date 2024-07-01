Feature: Registration process of RediffMail

  Scenario Outline: To validate registration process on RediffMail
    Given Open Rediffmail
    When I Enter "<FullName>" "<RediffId>" and "<Password>"
    Then Approprite message should display

    Examples: 
      | FullName     | RediffId          | Password  |
      | Anu Swathi   | anuswati          | swati123  |
      | Tushar Pawar | tusharpawar987456 | tushar123 |
      | Banti Nayak  | bantinayak        | banti123  |
