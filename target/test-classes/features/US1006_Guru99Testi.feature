Feature: US1005 Pozitif login testi

  Scenario: TC10 Gecerli kullanici adi ve sifre ile sisteme giris yapilabilmeli

    Given kullanici "Guru99Url" anasayfaya gider
    Then sayfayi yeniler
  And cookies i kapat

