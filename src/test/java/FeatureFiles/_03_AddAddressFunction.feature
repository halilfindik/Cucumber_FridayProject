Feature:  Add Address Functionality

  Background:
    Given Navigate to Luma
    When User logins with valid credentials
    Then User should login successfully

  Scenario Outline: Add Address and Verify
    And Go to My Account Page -> Manage Addresses -> Add New Address Page

    And Add a new address - Select Country
      | countrySelect | <CountryList> |

    And Add a new address
      | telephone     | <TelephoneList> |
      | street1       | <StreetList>    |
      | city          | <CityList>      |
      | zipCode       | <ZipList>       |

    Then User should add a new address successfully

    Examples:
      | TelephoneList | StreetList | CityList   | ZipList  | CountryList    |
      | 879437899843  | Degirmenci | Istanbul   | 34212    | Turkey         |
      | 899480780754  | Ayrancilar | Ankara     | 06452    | Turkey         |
      | 783478343421  | Coventry   | Birmingham | A12BC    | United Kingdom |
