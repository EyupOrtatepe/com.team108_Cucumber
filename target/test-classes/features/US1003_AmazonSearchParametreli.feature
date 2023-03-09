Feature: US1003 Kullanici Amazonda parametre olarak yazdigi kelimeyi aratir

  Scenario: TC07 Kullanici parametre ile arama yapabilmeli

    Given kullanici Amazon anasayfaya gider
    Then Amazonda "Samsung" icin arama yapar
    And sonuclarin "Samsung" icerdigini test eder
    And 3 saniye bekler
    And sayfayi kapatir
