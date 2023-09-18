Feature: Crear una nota de texto enriquecido con letra en negrita

  Scenario: Crear una nota con letra en negrita
    Given que estoy en la página de notas
    When creo una nueva nota con texto en negrita
    Then la nota se crea correctamente con texto en negrita
