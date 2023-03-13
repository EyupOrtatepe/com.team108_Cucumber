

Feature: US1013 Kullanici Scenario outline ile birden fazla kelime aratir

  Scenario Outline: TC14 Amazon coklu testi

    Given kullanici "amazonUrl" anasayfaya gider
    Then  amazonda "<kelimeler>" icin arama yapar
    And  sonuclarin "<kelimeler>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      |kelimeler  |
      |Nutella    |
      |Apple      |
      |Samsung    |