Feature: Rediff registration

  Background: 
    Given Open rediff registration page

  Scenario: Test rediff registration process
    When User enter data as follows
      | kavita | jadhav    | kavita@gmail.com | 3214569870 |
      | kajal  | prajapati | kajal@gmail.com  | 9874563217 |
    Then registration should successfull

  Scenario: Test rediff registration process with invalid data
    When User enter following data
      | FirstName | LastName  | MailID           | PhNo       |
      | kavita    | jadhav    | kavita@gmail.com | 3214569870 |
      | kajal     | prajapati | kajal@gmail.com  | 9874563217 |
    Then registration should not successfull
