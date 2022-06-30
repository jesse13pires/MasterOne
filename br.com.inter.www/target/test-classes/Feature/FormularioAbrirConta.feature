
@tag
Feature: Abrir Conta

  @tag1
  Scenario: Preenhcer formaulario de abertura de conta
 
  Given que acesse a url "https://www.bancointer.com.br/"
  And selecione o botao abrir conta
  When preenhcer o formulario de abertura de conta
  Then Valido se formulario foi enviado