

Feature: US1005 Pozitif login testi

  Scenario: TC11 Gecerli kullanici adi ve sifre ile sisteme giris yapilabilmeli

    Given kullanici "qdUrl" anasayfaya gider
    Then login linkine tiklar
    And username olarak "qdGecerliUsername" girer
    And password olarak "qdGecerliPassword" girer
    And 10 saniye bekler
    And login butonuna basar
    Then basarili olarak giris yapildigini test eder
    And Sayfayi kapatir