@PruebasLogin
Feature: Pruebas Login
  @CPLA001
  Scenario Outline: CPLA001 Login Exitoso
    Given Ingresar al portal
    When Login exitoso <tipoDeEntidad> <usuario> <clave>
    Then Valido login exitoso

    Examples:
      | tipoDeEntidad | usuario                                | clave          |
    ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@CPL001
|"EF"|"useradminapprover1@gmail.com"|"Ach.2022*$AU"|

  @CPLA002
  Scenario Outline: CPLA002 Login Fallido Credenciales Incorrectas
    Given Ingresar al portal
    When Login fallido con credenciales incorrectas <tipoDeEntidad> <usuario> <clave>
    Then Valido login fallido con credenciales incorrectas

    Examples:
      | tipoDeEntidad | usuario                                | clave          |
    ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@CPL002
|"EF"|"adminapproverfo@achcolombia.com.co"|"Colombia@13581"|
  
  @CPLA003
  Scenario Outline: CPLA003 Login Fallido Usuario Bloqueado
    Given Ingresar al portal
    When Login fallido con usuario bloqueado <tipoDeEntidad> <usuario> <clave>
    Then Valido login fallido con usuario bloqueado

    Examples:
      | tipoDeEntidad | usuario                                | clave          |
    ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@CPL003
|"EF"|"consultasfo/citibank"|"Colombia@13581"|

  @CPLA004
  Scenario Outline: CPLA004 Login Fallido Usuario No Registrado
    Given Ingresar al portal
    When Login fallido usuario no registrado <tipoDeEntidad> <usuario> <clave>
    Then Valido login fallido con usuario no registrado

    Examples:
      | tipoDeEntidad | usuario                                | clave          |
    ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@CPL004
|"EF"|"adminuser02@achcolombia.com.co"|"Colombia@13579"|
