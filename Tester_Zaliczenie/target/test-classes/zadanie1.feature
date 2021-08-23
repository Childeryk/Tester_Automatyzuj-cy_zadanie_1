Feature:Zadanie1

  Scenario Outline: dodawanie adresu do zarejestrowanego konta

    Given jako zarejestrowany użytkownik loguję się na stronę sklepu
    When Kiedy jestem na stronie z moimi koncie, dodaję nowy adres do konta
    And wypełniam formularz danymi: alias <alias> adres <adres> city <city> zip/postal code <zip/postal code> country <country> phone <phone>
    Then sprawdzam czy informacje są dodane

    Examples:
      | alias | adres           | city   | zip/postal code | country        | phone     |
      | One   | Some Street  13 | London | 12345           | United Kingdom | 123123123 |
