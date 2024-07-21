
@Cnx_Automation 
Feature: AutoAuthentification 
en tant que utilisateur je veux me connecter sur le site

  @Autoauthentification
  Scenario: connect_in
    Given Naviguer url "https://automationexercise.com/"
    When Cliquer SignupLogin button
    And Saisir mail "testers83@gmail.com"
    And Saisir mot de passe "123456!"
    Then Cliquer bouton login
    And verifier l affichage de nom de compte "Test"

 
