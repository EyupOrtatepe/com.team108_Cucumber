
Feature: US1011 herokuapp imlpilicitly wait
  @wip
  Scenario: TC12 kullanici imlpilicitly wait ile gorevleri yapabilmeli

  https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

  When  kullanici "herokuappUrl" ansayfaya gider
  When "Add Element" butona basin
  Then "Delete" butonu gorunur oluncaya kadar bekleyin
  And "Delete" butonunun gorunur oldugunu test edin
  Then "Delete" butonuna basarak butonu silin
  And "Delete" butonunun gorunmedigini test edin
  And sayfayi kapatir