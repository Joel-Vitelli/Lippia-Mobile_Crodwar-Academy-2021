Feature: El usuario realiza una reserva


  Scenario: Realizar Reserva en PHP Travels
    Given el usuario se encuentra en la home de la app
    When el usuario tapea el icono VISA
    And el usuario completa los datos desde "<salida>" hasta "<llegada>"
    And el usuario completa el campo nombre: "<nombre>", apellido <apellido>, email <email>, celular <celular>, notas <notas>
    And el usuario tapea el boton "SUMBIT"
    Then el usuario verifica que se realizo correctamente la reserva

  @PHPContactUS
  Scenario Outline: El usuario se pone en contacto con PHP Travels
    Given el usuario se encuentra en la home de la app
    When el usuario tapea el menu
    And el usuario tapea el boton Contact Us
    And el usuario ingresa los datos: Name <name>, Email <email>, Subject <subject> y Message <msj>
    And el usuario tapea el boton final Contact Us
    Then el usuario verifica mensaje de confirmacion
    Examples:
      | name  | email             | subject             | msj                                                   |
      | Joel  | joel@crowdar.com  | Abandono de persona | Ayuda, mis amigos me abandonan                        |
      | Pedro | pedro@crowdar.com | Borraron botón VISA | Pongan otra vez el botón VISA, me arruinaron la clase |
