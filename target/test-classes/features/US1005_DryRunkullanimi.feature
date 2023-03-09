Feature: US1005 Kullanici amazonda urun aratip 2. urun detaylarini test eder


  Scenario: TC09 Kullanici arama sonuclarinda istedigi urunu test edebilmeli

    Given kullanici "amazonUrl" ansayfaya gider
    When Amazonda "Nutella" icin arama yapar
    And 5 saniye bekler
    And 2.urune gider
    Then urun isminin "Nutella" icerdigini test eder
    And sayfayi kapatir
