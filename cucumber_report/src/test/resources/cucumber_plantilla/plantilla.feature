Feature: Find food

  Scenario: Finding some cheese
    Given I am on the Google search page
    When I search for "Cheese!"
    Then the page title should start with "cheese"



Feature : Get data

  Scenario Outline: Getting
    Given <patientID> <paymentMethodType> <issuer> <holderName> <paymentMethodType> <cardNumber> <billingAddressSequence> <isDefault> <usageType> <mexPayment> <addDate> <Comments><ValidThis><useCard>
    When I enter  <patientID> <paymentMethodType> <issuer> <holderName> <paymentMethodType> <cardNumber> <billingAddressSequence> <isDefault> <usageType> <mexPayment> <addDate> <Comments><ValidThis><useCard>
    Then I display  <patientID> <paymentMethodType> <issuer> <holderName> <paymentMethodType> <cardNumber> <billingAddressSequence> <isDefault> <usageType> <mexPayment> <addDate> <Comments><ValidThis><useCard>
    Examples:
      | patientID | paymentMethodType | issuer | holderName | paymentMethodType | cardNumber | billingAddressSequence | isDefault | usageType | mexPayment | addDate | Comments | ValidThis | useCard |
      | 0         | 0                 | 0      | 0          | 0                 | 0          | 0                      | 0         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 0                 | 0      | 0          | 0                 | 0          | 0                      | 0         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 0      | 0          | 0                 | 0          | 0                      | 0         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 0          | 0                 | 0          | 0                      | 0         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 0                 | 0          | 0                      | 0         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 0          | 0                      | 0         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 0                      | 0         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 0         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 0         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 1         | 0          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 1         | 1          | 0       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 1         | 1          | 1       | 0        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 1         | 1          | 1       | 1        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 1         | 1          | 1       | 0        | 0         | 1       |
      | 0         | 0                 | 0      | 0          | 0                 | 0          | 0                      | 0         | 0         | 0          | 0       | 0        | 1         | 1       |
      | 0         | 0                 | 0      | 0          | 0                 | 0          | 0                      | 0         | 0         | 0          | 0       | 1        | 1         | 1       |
      | 0         | 0                 | 0      | 0          | 0                 | 0          | 0                      | 0         | 0         | 0          | 1       | 1        | 1         | 1       |
      | 0         | 0                 | 0      | 0          | 0                 | 0          | 0                      | 0         | 0         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 0                 | 0      | 0          | 0                 | 0          | 0                      | 0         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 0                 | 0      | 0          | 0                 | 0          | 0                      | 1         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 0                 | 0      | 0          | 0                 | 0          | 1                      | 1         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 0                 | 0      | 0          | 0                 | 1          | 1                      | 1         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 0                 | 0      | 0          | 1                 | 1          | 1                      | 1         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 0                 | 0      | 1          | 1                 | 1          | 1                      | 1         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 0                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 1         | 1         | 1          | 1       | 1        | 1         | 1       |
      | 0         | 1                 | 0      | 1          | 0                 | 1          | 0                      | 1         | 0         | 1          | 0       | 1        | 0         | 1       |
      | 1         | 0                 | 1      | 0          | 1                 | 0          | 1                      | 0         | 1         | 0          | 1       | 0        | 1         | 0       |
      | 1         | 1                 | 0      | 0          | 1                 | 1          | 0                      | 0         | 1         | 1          | 0       | 0        | 1         | 1       |
      | 0         | 0                 | 1      | 1          | 0                 | 0          | 1                      | 1         | 0         | 0          | 1       | 1        | 0         | 0       |
      | 1         | 1                 | 1      | 0          | 0                 | 0          | 1                      | 1         | 1         | 0          | 0       | 0        | 1         | 1       |
      | 1         | 1                 | 1      | 1          | 0                 | 0          | 0                      | 0         | 1         | 1          | 1       | 1        | 0         | 0       |
      | 1         | 1                 | 1      | 1          | 1                 | 0          | 0                      | 0         | 0         | 0          | 1       | 1        | 1         | 1       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 0                      | 0         | 0         | 0          | 0       | 0        | 1         | 1       |
      | 1         | 1                 | 1      | 1          | 1                 | 1          | 1                      | 0         | 0         | 0          | 0       | 0        | 0         | 1       |
      | 1         | 0                 | 0      | 1          | 0                 | 0          | 1                      | 0         | 0         | 1          | 0       | 0        | 1         | 0       |
      | 1         | 0                 | 0      | 0          | 1                 | 0          | 0                      | 0         | 1         | 0          | 0       | 0        | 1         | 0       |