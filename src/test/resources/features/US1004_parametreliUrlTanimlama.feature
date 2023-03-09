Feature: US1004 kullanici parametreli olarak girdigi Url e gider

  Scenario: TC08 Kullanici url i parametre olarak girebilmeli

    Given kullanici "amazonUrl" ansayfaya gider
    Then "amazonUrl" sayfasina gittigini test eder
    And 3 saniye bekler
    And sayfayi kapatir